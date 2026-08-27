import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.shorts.ShortList;
import it.unimi.dsi.fastutil.shorts.ShortListIterator;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class diy {
   private static final Codec<diq<dgb>> h = diq.a(cua.q, dgb.b, diq.d.d, cuc.a.o());
   private static final Logger i = LogUtils.getLogger();
   private static final String j = "UpgradeData";
   private static final String k = "block_ticks";
   private static final String l = "fluid_ticks";
   public static final String a = "xPos";
   public static final String b = "zPos";
   public static final String c = "Heightmaps";
   public static final String d = "isLightOn";
   public static final String e = "sections";
   public static final String f = "BlockLight";
   public static final String g = "SkyLight";

   public static dis a(alq $$0, bvi $$1, cqg $$2, rt $$3) {
      cqg $$4 = new cqg($$3.h("xPos"), $$3.h("zPos"));
      if (!Objects.equals($$2, $$4)) {
         i.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$2, $$2, $$4});
      }

      div $$5 = $$3.b("UpgradeData", 10) ? new div($$3.p("UpgradeData"), $$0) : div.a;
      boolean $$6 = $$3.q("isLightOn");
      rz $$7 = $$3.c("sections", 10);
      int $$8 = $$0.ak();
      dij[] $$9 = new dij[$$8];
      boolean $$10 = $$0.D_().g();
      dib $$11 = $$0.k();
      eat $$12 = $$11.p();
      io<crx> $$13 = $$0.H_().d(jz.aq);
      Codec<dir<ib<crx>>> $$14 = a($$13);
      boolean $$15 = false;

      for (int $$16 = 0; $$16 < $$7.size(); $$16++) {
         rt $$17 = $$7.a($$16);
         int $$18 = $$17.f("Y");
         int $$19 = $$0.f($$18);
         if ($$19 >= 0 && $$19 < $$9.length) {
            diq<dgb> $$20;
            if ($$17.b("block_states", 10)) {
               $$20 = (diq<dgb>)h.parse(sf.a, $$17.p("block_states")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(false, i::error);
            } else {
               $$20 = new diq<>(cua.q, cuc.a.o(), diq.d.d);
            }

            dir<ib<crx>> $$22;
            if ($$17.b("biomes", 10)) {
               $$22 = (dir<ib<crx>>)$$14.parse(sf.a, $$17.p("biomes")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(false, i::error);
            } else {
               $$22 = new diq<>($$13.t(), $$13.f(cse.b), diq.d.e);
            }

            dij $$24 = new dij($$20, $$22);
            $$9[$$19] = $$24;
            iu $$25 = iu.a($$2, $$18);
            $$1.a($$25, $$24);
         }

         boolean $$26 = $$17.b("BlockLight", 7);
         boolean $$27 = $$10 && $$17.b("SkyLight", 7);
         if ($$26 || $$27) {
            if (!$$15) {
               $$12.b($$2, true);
               $$15 = true;
            }

            if ($$26) {
               $$12.a(cri.b, iu.a($$2, $$18), new did($$17.m("BlockLight")));
            }

            if ($$27) {
               $$12.a(cri.a, iu.a($$2, $$18), new did($$17.m("SkyLight")));
            }
         }
      }

      long $$28 = $$3.i("InhabitedTime");
      dic.a $$29 = a($$3);
      dmn $$30;
      if ($$3.b("blending_data", 10)) {
         $$30 = (dmn)dmn.e.parse(new Dynamic(sf.a, $$3.p("blending_data"))).resultOrPartial(i::error).orElse(null);
      } else {
         $$30 = null;
      }

      dhx $$34;
      if ($$29 == dic.a.b) {
         ejm<cua> $$32 = ejm.a($$3.c("block_ticks", 10), $$0x -> jy.f.b(afw.a($$0x)), $$2);
         ejm<ebd> $$33 = ejm.a($$3.c("fluid_ticks", 10), $$0x -> jy.d.b(afw.a($$0x)), $$2);
         $$34 = new dii($$0.C(), $$2, $$5, $$32, $$33, $$28, $$9, a($$0, $$3), $$30);
      } else {
         ejp<cua> $$35 = ejp.a($$3.c("block_ticks", 10), $$0x -> jy.f.b(afw.a($$0x)), $$2);
         ejp<ebd> $$36 = ejp.a($$3.c("fluid_ticks", 10), $$0x -> jy.d.b(afw.a($$0x)), $$2);
         dis $$37 = new dis($$2, $$5, $$9, $$35, $$36, $$0, $$13, $$30);
         $$34 = $$37;
         $$37.b($$28);
         if ($$3.b("below_zero_retrogen", 10)) {
            dky.a.parse(new Dynamic(sf.a, $$3.p("below_zero_retrogen"))).resultOrPartial(i::error).ifPresent($$37::a);
         }

         dic $$39 = dic.a($$3.l("Status"));
         $$37.a($$39);
         if ($$39.b(dic.k)) {
            $$37.a($$12);
         }
      }

      $$34.b($$6);
      rt $$40 = $$3.p("Heightmaps");
      EnumSet<dlk.a> $$41 = EnumSet.noneOf(dlk.a.class);

      for (dlk.a $$42 : $$34.j().h()) {
         String $$43 = $$42.a();
         if ($$40.b($$43, 12)) {
            $$34.a($$42, $$40.o($$43));
         } else {
            $$41.add($$42);
         }
      }

      dlk.a($$34, $$41);
      rt $$44 = $$3.p("structures");
      $$34.a(a(dwq.a($$0), $$44, $$0.A()));
      $$34.b(a($$0.H_(), $$2, $$44));
      if ($$3.q("shouldSave")) {
         $$34.a(true);
      }

      rz $$45 = $$3.c("PostProcessing", 9);

      for (int $$46 = 0; $$46 < $$45.size(); $$46++) {
         rz $$47 = $$45.b($$46);

         for (int $$48 = 0; $$48 < $$47.size(); $$48++) {
            $$34.a($$47.d($$48), $$46);
         }
      }

      if ($$29 == dic.a.b) {
         return new dih((dii)$$34, false);
      } else {
         dis $$49 = (dis)$$34;
         rz $$50 = $$3.c("entities", 10);

         for (int $$51 = 0; $$51 < $$50.size(); $$51++) {
            $$49.b($$50.a($$51));
         }

         rz $$52 = $$3.c("block_entities", 10);

         for (int $$53 = 0; $$53 < $$52.size(); $$53++) {
            rt $$54 = $$52.a($$53);
            $$34.a($$54);
         }

         rt $$55 = $$3.p("CarvingMasks");

         for (String $$56 : $$55.e()) {
            dlg.a $$57 = dlg.a.valueOf($$56);
            $$49.a($$57, new dhw($$55.o($$56), $$34.I_()));
         }

         return $$49;
      }
   }

   private static void a(cqg $$0, int $$1, String $$2) {
      i.error("Recoverable errors when loading section [" + $$0.e + ", " + $$1 + ", " + $$0.f + "]: " + $$2);
   }

   private static Codec<dir<ib<crx>>> a(io<crx> $$0) {
      return diq.b($$0.t(), $$0.r(), diq.d.e, $$0.f(cse.b));
   }

   public static rt a(alq $$0, dhx $$1) {
      cqg $$2 = $$1.f();
      rt $$3 = sg.g(new rt());
      $$3.a("xPos", $$2.e);
      $$3.a("yPos", $$1.al());
      $$3.a("zPos", $$2.f);
      $$3.a("LastUpdate", $$0.V());
      $$3.a("InhabitedTime", $$1.u());
      $$3.a("Status", jy.o.b($$1.j()).toString());
      dmn $$4 = $$1.t();
      if ($$4 != null) {
         dmn.e.encodeStart(sf.a, $$4).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("blending_data", $$1x));
      }

      dky $$5 = $$1.x();
      if ($$5 != null) {
         dky.a.encodeStart(sf.a, $$5).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("below_zero_retrogen", $$1x));
      }

      div $$6 = $$1.r();
      if (!$$6.a()) {
         $$3.a("UpgradeData", $$6.b());
      }

      dij[] $$7 = $$1.d();
      rz $$8 = new rz();
      eat $$9 = $$0.k().a();
      io<crx> $$10 = $$0.H_().d(jz.aq);
      Codec<dir<ib<crx>>> $$11 = a($$10);
      boolean $$12 = $$1.v();

      for (int $$13 = $$9.d(); $$13 < $$9.e(); $$13++) {
         int $$14 = $$1.f($$13);
         boolean $$15 = $$14 >= 0 && $$14 < $$7.length;
         did $$16 = $$9.a(cri.b).a(iu.a($$2, $$13));
         did $$17 = $$9.a(cri.a).a(iu.a($$2, $$13));
         if ($$15 || $$16 != null || $$17 != null) {
            rt $$18 = new rt();
            if ($$15) {
               dij $$19 = $$7[$$14];
               $$18.a("block_states", (sn)h.encodeStart(sf.a, $$19.h()).getOrThrow(false, i::error));
               $$18.a("biomes", (sn)$$11.encodeStart(sf.a, $$19.i()).getOrThrow(false, i::error));
            }

            if ($$16 != null && !$$16.d()) {
               $$18.a("BlockLight", $$16.a());
            }

            if ($$17 != null && !$$17.d()) {
               $$18.a("SkyLight", $$17.a());
            }

            if (!$$18.g()) {
               $$18.a("Y", (byte)$$13);
               $$8.add($$18);
            }
         }
      }

      $$3.a("sections", $$8);
      if ($$12) {
         $$3.a("isLightOn", true);
      }

      rz $$20 = new rz();

      for (ht $$21 : $$1.c()) {
         rt $$22 = $$1.g($$21);
         if ($$22 != null) {
            $$20.add($$22);
         }
      }

      $$3.a("block_entities", $$20);
      if ($$1.j().g() == dic.a.a) {
         dis $$23 = (dis)$$1;
         rz $$24 = new rz();
         $$24.addAll($$23.E());
         $$3.a("entities", $$24);
         rt $$25 = new rt();

         for (dlg.a $$26 : dlg.a.values()) {
            dhw $$27 = $$23.a($$26);
            if ($$27 != null) {
               $$25.a($$26.toString(), $$27.a());
            }
         }

         $$3.a("CarvingMasks", $$25);
      }

      a($$0, $$3, $$1.q());
      $$3.a("PostProcessing", a($$1.n()));
      rt $$28 = new rt();

      for (Entry<dlk.a, dlk> $$29 : $$1.e()) {
         if ($$1.j().h().contains($$29.getKey())) {
            $$28.a($$29.getKey().a(), new sa($$29.getValue().a()));
         }
      }

      $$3.a("Heightmaps", $$28);
      $$3.a("structures", a(dwq.a($$0), $$2, $$1.g(), $$1.h()));
      return $$3;
   }

   private static void a(alq $$0, rt $$1, dhx.a $$2) {
      long $$3 = $$0.A_().e();
      $$1.a("block_ticks", $$2.a().b($$3, $$0x -> jy.f.b($$0x).toString()));
      $$1.a("fluid_ticks", $$2.b().b($$3, $$0x -> jy.d.b($$0x).toString()));
   }

   public static dic.a a(@Nullable rt $$0) {
      return $$0 != null ? dic.a($$0.l("Status")).g() : dic.a.a;
   }

   @Nullable
   private static dii.c a(alq $$0, rt $$1) {
      rz $$2 = a($$1, "entities");
      rz $$3 = a($$1, "block_entities");
      return $$2 == null && $$3 == null ? null : $$3x -> {
         if ($$2 != null) {
            $$0.a(bjx.a($$2, $$0));
         }

         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               rt $$5 = $$3.a($$4);
               boolean $$6 = $$5.q("keepPacked");
               if ($$6) {
                  $$3x.a($$5);
               } else {
                  ht $$7 = ddx.c($$5);
                  ddx $$8 = ddx.a($$7, $$3x.a_($$7), $$5);
                  if ($$8 != null) {
                     $$3x.a($$8);
                  }
               }
            }
         }
      };
   }

   @Nullable
   private static rz a(rt $$0, String $$1) {
      rz $$2 = $$0.c($$1, 10);
      return $$2.isEmpty() ? null : $$2;
   }

   private static rt a(dwq $$0, cqg $$1, Map<dwa, dwi> $$2, Map<dwa, LongSet> $$3) {
      rt $$4 = new rt();
      rt $$5 = new rt();
      io<dwa> $$6 = $$0.b().d(jz.aA);

      for (Entry<dwa, dwi> $$7 : $$2.entrySet()) {
         afw $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      rt $$9 = new rt();

      for (Entry<dwa, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            afw $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new sa($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<dwa, dwi> a(dwq $$0, rt $$1, long $$2) {
      Map<dwa, dwi> $$3 = Maps.newHashMap();
      io<dwa> $$4 = $$0.b().d(jz.aA);
      rt $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         afw $$7 = afw.a($$6);
         dwa $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.error("Unknown structure start: {}", $$7);
         } else {
            dwi $$9 = dwi.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<dwa, LongSet> a(ip $$0, cqg $$1, rt $$2) {
      Map<dwa, LongSet> $$3 = Maps.newHashMap();
      io<dwa> $$4 = $$0.d(jz.aA);
      rt $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         afw $$7 = afw.a($$6);
         dwa $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  cqg $$3x = new cqg($$2x);
                  if ($$3x.a($$1) > 8) {
                     i.warn("Found invalid structure reference [ {} @ {} ] for chunk {}.", new Object[]{$$7, $$3x, $$1});
                     return false;
                  } else {
                     return true;
                  }
               }).toArray()));
            }
         }
      }

      return $$3;
   }

   public static rz a(ShortList[] $$0) {
      rz $$1 = new rz();

      for (ShortList $$2 : $$0) {
         rz $$3 = new rz();
         if ($$2 != null) {
            ShortListIterator var7 = $$2.iterator();

            while (var7.hasNext()) {
               Short $$4 = (Short)var7.next();
               $$3.add(si.a($$4));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }
}
