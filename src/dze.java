import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.shorts.ShortArrayList;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public record dze(
   kd<dgh> h,
   del i,
   int j,
   long k,
   long l,
   dyk m,
   @Nullable ecm.d n,
   @Nullable eax o,
   dyg p,
   @Nullable long[] q,
   Map<ebj.a, long[]> r,
   dxj.a s,
   ShortList[] t,
   boolean u,
   List<dze.b> v,
   List<un> w,
   List<un> x,
   un y
) {
   private static final Codec<dyb<dvo>> z = dyb.a(dij.q, dvo.a, dyb.d.d, dil.a.m());
   private static final Logger A = LogUtils.getLogger();
   private static final String B = "UpgradeData";
   private static final String C = "block_ticks";
   private static final String D = "fluid_ticks";
   public static final String a = "xPos";
   public static final String b = "zPos";
   public static final String c = "Heightmaps";
   public static final String d = "isLightOn";
   public static final String e = "sections";
   public static final String f = "BlockLight";
   public static final String g = "SkyLight";

   @Nullable
   public static dze a(dfh $$0, ke $$1, un $$2) {
      if (!$$2.b("Status", 8)) {
         return null;
      } else {
         del $$3 = new del($$2.h("xPos"), $$2.h("zPos"));
         long $$4 = $$2.i("LastUpdate");
         long $$5 = $$2.i("InhabitedTime");
         dyk $$6 = dyk.a($$2.l("Status"));
         dyg $$7 = $$2.b("UpgradeData", 10) ? new dyg($$2.p("UpgradeData"), $$0) : dyg.a;
         boolean $$8 = $$2.q("isLightOn");
         ecm.d $$9;
         if ($$2.b("blending_data", 10)) {
            $$9 = (ecm.d)ecm.d.a.parse(vb.a, $$2.p("blending_data")).resultOrPartial(A::error).orElse(null);
         } else {
            $$9 = null;
         }

         eax $$11;
         if ($$2.b("below_zero_retrogen", 10)) {
            $$11 = (eax)eax.a.parse(vb.a, $$2.p("below_zero_retrogen")).resultOrPartial(A::error).orElse(null);
         } else {
            $$11 = null;
         }

         long[] $$13;
         if ($$2.b("carving_mask", 12)) {
            $$13 = $$2.o("carving_mask");
         } else {
            $$13 = null;
         }

         un $$15 = $$2.p("Heightmaps");
         Map<ebj.a, long[]> $$16 = new EnumMap<>(ebj.a.class);

         for (ebj.a $$17 : $$6.e()) {
            String $$18 = $$17.a();
            if ($$15.b($$18, 12)) {
               $$16.put($$17, $$15.o($$18));
            }
         }

         List<fbi<dij>> $$19 = fbi.a($$2.c("block_ticks", 10), $$0x -> lz.e.b(all.c($$0x)), $$3);
         List<fbi<ern>> $$20 = fbi.a($$2.c("fluid_ticks", 10), $$0x -> lz.c.b(all.c($$0x)), $$3);
         dxj.a $$21 = new dxj.a($$19, $$20);
         ut $$22 = $$2.c("PostProcessing", 9);
         ShortList[] $$23 = new ShortList[$$22.size()];

         for (int $$24 = 0; $$24 < $$22.size(); $$24++) {
            ut $$25 = $$22.b($$24);
            ShortList $$26 = new ShortArrayList($$25.size());

            for (int $$27 = 0; $$27 < $$25.size(); $$27++) {
               $$26.add($$25.d($$27));
            }

            $$23[$$24] = $$26;
         }

         List<un> $$28 = Lists.transform($$2.c("entities", 10), $$0x -> (un)$$0x);
         List<un> $$29 = Lists.transform($$2.c("block_entities", 10), $$0x -> (un)$$0x);
         un $$30 = $$2.p("structures");
         ut $$31 = $$2.c("sections", 10);
         List<dze.b> $$32 = new ArrayList<>($$31.size());
         kd<dgh> $$33 = $$1.e(ma.aG);
         Codec<dyc<jq<dgh>>> $$34 = a($$33);

         for (int $$35 = 0; $$35 < $$31.size(); $$35++) {
            un $$36 = $$31.a($$35);
            int $$37 = $$36.f("Y");
            dxu $$42;
            if ($$37 >= $$0.an() && $$37 <= $$0.ao()) {
               dyb<dvo> $$38;
               if ($$36.b("block_states", 10)) {
                  $$38 = (dyb<dvo>)z.parse(vb.a, $$36.p("block_states")).promotePartial($$2x -> a($$3, $$37, $$2x)).getOrThrow(dze.a::new);
               } else {
                  $$38 = new dyb<>(dij.q, dil.a.m(), dyb.d.d);
               }

               dyc<jq<dgh>> $$40;
               if ($$36.b("biomes", 10)) {
                  $$40 = (dyc<jq<dgh>>)$$34.parse(vb.a, $$36.p("biomes")).promotePartial($$2x -> a($$3, $$37, $$2x)).getOrThrow(dze.a::new);
               } else {
                  $$40 = new dyb<>($$33.t(), $$33.b(dgo.b), dyb.d.e);
               }

               $$42 = new dxu($$38, $$40);
            } else {
               $$42 = null;
            }

            dxo $$44 = $$36.b("BlockLight", 7) ? new dxo($$36.m("BlockLight")) : null;
            dxo $$45 = $$36.b("SkyLight", 7) ? new dxo($$36.m("SkyLight")) : null;
            $$32.add(new dze.b($$37, $$42, $$44, $$45));
         }

         return new dze($$33, $$3, $$0.an(), $$4, $$5, $$6, $$9, $$11, $$7, $$13, $$16, $$21, $$23, $$8, $$32, $$28, $$29, $$30);
      }
   }

   public dyd a(arq $$0, cgi $$1, dzc $$2, del $$3) {
      if (!Objects.equals($$3, this.i)) {
         A.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$3, $$3, this.i});
         $$0.o().a(this.i, $$3, $$2);
      }

      int $$4 = $$0.am();
      dxu[] $$5 = new dxu[$$4];
      boolean $$6 = $$0.D_().g();
      dxn $$7 = $$0.l();
      erd $$8 = $$7.p();
      kd<dgh> $$9 = $$0.H_().e(ma.aG);
      boolean $$10 = false;

      for (dze.b $$11 : this.v) {
         kj $$12 = kj.a($$3, $$11.a);
         if ($$11.b != null) {
            $$5[$$0.g($$11.a)] = $$11.b;
            $$1.a($$12, $$11.b);
         }

         boolean $$13 = $$11.c != null;
         boolean $$14 = $$6 && $$11.d != null;
         if ($$13 || $$14) {
            if (!$$10) {
               $$8.b($$3, true);
               $$10 = true;
            }

            if ($$13) {
               $$8.a(dfo.b, $$12, $$11.c);
            }

            if ($$14) {
               $$8.a(dfo.a, $$12, $$11.d);
            }
         }
      }

      dyo $$15 = this.m.d();
      dxj $$18;
      if ($$15 == dyo.b) {
         fbe<dij> $$16 = new fbe<>(this.s.a());
         fbe<ern> $$17 = new fbe<>(this.s.b());
         $$18 = new dxt($$0.E(), $$3, this.p, $$16, $$17, this.l, $$5, a($$0, this.w, this.x), ecm.a(this.n));
      } else {
         fbh<dij> $$19 = fbh.a(this.s.a());
         fbh<ern> $$20 = fbh.a(this.s.b());
         dyd $$21 = new dyd($$3, this.p, $$5, $$19, $$20, $$0, $$9, ecm.a(this.n));
         $$18 = $$21;
         $$21.c(this.l);
         if (this.o != null) {
            $$21.a(this.o);
         }

         $$21.a(this.m);
         if (this.m.a(dyk.k)) {
            $$21.a($$8);
         }
      }

      $$18.b(this.u);
      EnumSet<ebj.a> $$23 = EnumSet.noneOf(ebj.a.class);

      for (ebj.a $$24 : $$18.j().e()) {
         long[] $$25 = this.r.get($$24);
         if ($$25 != null) {
            $$18.a($$24, $$25);
         } else {
            $$23.add($$24);
         }
      }

      ebj.a($$18, $$23);
      $$18.a(a(emr.a($$0), this.y, $$0.C()));
      $$18.b(a($$0.H_(), $$3, this.y));

      for (int $$26 = 0; $$26 < this.t.length; $$26++) {
         $$18.a(this.t[$$26], $$26);
      }

      if ($$15 == dyo.b) {
         return new dxs((dxt)$$18, false);
      } else {
         dyd $$27 = (dyd)$$18;

         for (un $$28 : this.w) {
            $$27.b($$28);
         }

         for (un $$29 : this.x) {
            $$27.a($$29);
         }

         if (this.q != null) {
            $$27.a(new dxi(this.q, $$18.I_()));
         }

         return $$27;
      }
   }

   private static void a(del $$0, int $$1, String $$2) {
      A.error("Recoverable errors when loading section [{}, {}, {}]: {}", new Object[]{$$0.g, $$1, $$0.h, $$2});
   }

   private static Codec<dyc<jq<dgh>>> a(kd<dgh> $$0) {
      return dyb.b($$0.t(), $$0.r(), dyb.d.e, $$0.b(dgo.b));
   }

   public static dze a(arq $$0, dxj $$1) {
      del $$2 = $$1.f();
      List<dze.b> $$3 = new ArrayList<>();
      dxu[] $$4 = $$1.d();
      erd $$5 = $$0.l().a();

      for (int $$6 = $$5.d(); $$6 < $$5.e(); $$6++) {
         int $$7 = $$1.g($$6);
         boolean $$8 = $$7 >= 0 && $$7 < $$4.length;
         dxo $$9 = $$5.a(dfo.b).a(kj.a($$2, $$6));
         dxo $$10 = $$5.a(dfo.a).a(kj.a($$2, $$6));
         dxo $$11 = $$9 != null && !$$9.d() ? $$9.b() : null;
         dxo $$12 = $$10 != null && !$$10.d() ? $$10.b() : null;
         if ($$8 || $$11 != null || $$12 != null) {
            dxu $$13 = $$8 ? $$4[$$7].k() : null;
            $$3.add(new dze.b($$6, $$13, $$11, $$12));
         }
      }

      List<un> $$14 = new ArrayList<>($$1.c().size());

      for (jh $$15 : $$1.c()) {
         un $$16 = $$1.a($$15, $$0.H_());
         if ($$16 != null) {
            $$14.add($$16);
         }
      }

      List<un> $$17 = new ArrayList<>();
      long[] $$18 = null;
      if ($$1.j().d() == dyo.a) {
         dyd $$19 = (dyd)$$1;
         $$17.addAll($$19.F());
         dxi $$20 = $$19.B();
         if ($$20 != null) {
            $$18 = $$20.a();
         }
      }

      Map<ebj.a, long[]> $$21 = new EnumMap<>(ebj.a.class);

      for (Entry<ebj.a, ebj> $$22 : $$1.e()) {
         if ($$1.j().e().contains($$22.getKey())) {
            long[] $$23 = $$22.getValue().a();
            $$21.put($$22.getKey(), (long[])$$23.clone());
         }
      }

      dxj.a $$24 = $$1.a($$0.aa());
      ShortList[] $$25 = Arrays.stream($$1.n()).map($$0x -> $$0x != null ? new ShortArrayList($$0x) : null).toArray(ShortList[]::new);
      un $$26 = a(emr.a($$0), $$2, $$1.g(), $$1.h());
      return new dze(
         $$0.H_().e(ma.aG),
         $$2,
         $$1.an(),
         $$0.aa(),
         $$1.t(),
         $$1.j(),
         x.a($$1.s(), ecm::a),
         $$1.w(),
         $$1.q().c(),
         $$18,
         $$21,
         $$24,
         $$25,
         $$1.u(),
         $$3,
         $$17,
         $$14,
         $$26
      );
   }

   public un a() {
      un $$0 = vc.e(new un());
      $$0.a("xPos", this.i.g);
      $$0.a("yPos", this.j);
      $$0.a("zPos", this.i.h);
      $$0.a("LastUpdate", this.k);
      $$0.a("InhabitedTime", this.l);
      $$0.a("Status", lz.l.b(this.m).toString());
      if (this.n != null) {
         ecm.d.a.encodeStart(vb.a, this.n).resultOrPartial(A::error).ifPresent($$1x -> $$0.a("blending_data", $$1x));
      }

      if (this.o != null) {
         eax.a.encodeStart(vb.a, this.o).resultOrPartial(A::error).ifPresent($$1x -> $$0.a("below_zero_retrogen", $$1x));
      }

      if (!this.p.a()) {
         $$0.a("UpgradeData", this.p.b());
      }

      ut $$1 = new ut();
      Codec<dyc<jq<dgh>>> $$2 = a(this.h);

      for (dze.b $$3 : this.v) {
         un $$4 = new un();
         dxu $$5 = $$3.b;
         if ($$5 != null) {
            $$4.a("block_states", (vk)z.encodeStart(vb.a, $$5.h()).getOrThrow());
            $$4.a("biomes", (vk)$$2.encodeStart(vb.a, $$5.i()).getOrThrow());
         }

         if ($$3.c != null) {
            $$4.a("BlockLight", $$3.c.a());
         }

         if ($$3.d != null) {
            $$4.a("SkyLight", $$3.d.a());
         }

         if (!$$4.g()) {
            $$4.a("Y", (byte)$$3.a);
            $$1.add($$4);
         }
      }

      $$0.a("sections", $$1);
      if (this.u) {
         $$0.a("isLightOn", true);
      }

      ut $$6 = new ut();
      $$6.addAll(this.x);
      $$0.a("block_entities", $$6);
      if (this.m.d() == dyo.a) {
         ut $$7 = new ut();
         $$7.addAll(this.w);
         $$0.a("entities", $$7);
         if (this.q != null) {
            $$0.a("carving_mask", this.q);
         }
      }

      a($$0, this.s);
      $$0.a("PostProcessing", a(this.t));
      un $$8 = new un();
      this.r.forEach(($$1x, $$2x) -> $$8.a($$1x.a(), new uu($$2x)));
      $$0.a("Heightmaps", $$8);
      $$0.a("structures", this.y);
      return $$0;
   }

   private static void a(un $$0, dxj.a $$1) {
      ut $$2 = new ut();

      for (fbi<dij> $$3 : $$1.a()) {
         $$2.add($$3.a($$0x -> lz.e.b($$0x).toString()));
      }

      $$0.a("block_ticks", $$2);
      ut $$4 = new ut();

      for (fbi<ern> $$5 : $$1.b()) {
         $$4.add($$5.a($$0x -> lz.c.b($$0x).toString()));
      }

      $$0.a("fluid_ticks", $$4);
   }

   public static dyo a(@Nullable un $$0) {
      return $$0 != null ? dyk.a($$0.l("Status")).d() : dyo.a;
   }

   @Nullable
   private static dxt.c a(arq $$0, List<un> $$1, List<un> $$2) {
      return $$1.isEmpty() && $$2.isEmpty() ? null : $$3 -> {
         if (!$$1.isEmpty()) {
            $$0.a(bup.a($$1, $$0, buo.r));
         }

         for (un $$4 : $$2) {
            boolean $$5 = $$4.q("keepPacked");
            if ($$5) {
               $$3.a($$4);
            } else {
               jh $$6 = dsr.b($$4);
               dsr $$7 = dsr.a($$6, $$3.a_($$6), $$4, $$0.H_());
               if ($$7 != null) {
                  $$3.a($$7);
               }
            }
         }
      };
   }

   private static un a(emr $$0, del $$1, Map<emb, emj> $$2, Map<emb, LongSet> $$3) {
      un $$4 = new un();
      un $$5 = new un();
      kd<emb> $$6 = $$0.b().e(ma.aS);

      for (Entry<emb, emj> $$7 : $$2.entrySet()) {
         all $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      un $$9 = new un();

      for (Entry<emb, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            all $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new uu($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<emb, emj> a(emr $$0, un $$1, long $$2) {
      Map<emb, emj> $$3 = Maps.newHashMap();
      kd<emb> $$4 = $$0.b().e(ma.aS);
      un $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         all $$7 = all.c($$6);
         emb $$8 = $$4.a($$7);
         if ($$8 == null) {
            A.error("Unknown structure start: {}", $$7);
         } else {
            emj $$9 = emj.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<emb, LongSet> a(ke $$0, del $$1, un $$2) {
      Map<emb, LongSet> $$3 = Maps.newHashMap();
      kd<emb> $$4 = $$0.e(ma.aS);
      un $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         all $$7 = all.c($$6);
         emb $$8 = $$4.a($$7);
         if ($$8 == null) {
            A.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  del $$3x = new del($$2x);
                  if ($$3x.a($$1) > 8) {
                     A.warn("Found invalid structure reference [ {} @ {} ] for chunk {}.", new Object[]{$$7, $$3x, $$1});
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

   private static ut a(ShortList[] $$0) {
      ut $$1 = new ut();

      for (ShortList $$2 : $$0) {
         ut $$3 = new ut();
         if ($$2 != null) {
            for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
               $$3.add(vf.a($$2.getShort($$4)));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }

   public kd<dgh> b() {
      return this.h;
   }

   public del c() {
      return this.i;
   }

   public int d() {
      return this.j;
   }

   public long e() {
      return this.k;
   }

   public long f() {
      return this.l;
   }

   public dyk g() {
      return this.m;
   }

   @Nullable
   public ecm.d h() {
      return this.n;
   }

   @Nullable
   public eax i() {
      return this.o;
   }

   public dyg j() {
      return this.p;
   }

   @Nullable
   public long[] k() {
      return this.q;
   }

   public Map<ebj.a, long[]> l() {
      return this.r;
   }

   public dxj.a m() {
      return this.s;
   }

   public ShortList[] n() {
      return this.t;
   }

   public boolean o() {
      return this.u;
   }

   public List<dze.b> p() {
      return this.v;
   }

   public List<un> q() {
      return this.w;
   }

   public List<un> r() {
      return this.x;
   }

   public un s() {
      return this.y;
   }

   public static class a extends uy {
      public a(String $$0) {
         super($$0);
      }
   }

   public static record b(int a, @Nullable dxu b, @Nullable dxo c, @Nullable dxo d) {
   }
}
