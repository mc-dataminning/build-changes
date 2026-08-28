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

public record edz(
   jr<dkd> h,
   dih i,
   int j,
   long k,
   long l,
   edf m,
   @Nullable ehj.d n,
   @Nullable efu o,
   edb p,
   @Nullable long[] q,
   Map<egg.a, long[]> r,
   ece.a s,
   ShortList[] t,
   boolean u,
   List<edz.b> v,
   List<tz> w,
   List<tz> x,
   tz y
) {
   private static final Codec<ecw<eah>> z = ecw.a(dmf.k, eah.a, ecw.d.d, dmh.a.m());
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
   public static edz a(djc $$0, js $$1, tz $$2) {
      if (!$$2.b("Status", 8)) {
         return null;
      } else {
         dih $$3 = new dih($$2.h("xPos"), $$2.h("zPos"));
         long $$4 = $$2.i("LastUpdate");
         long $$5 = $$2.i("InhabitedTime");
         edf $$6 = edf.a($$2.l("Status"));
         edb $$7 = $$2.b("UpgradeData", 10) ? new edb($$2.p("UpgradeData"), $$0) : edb.a;
         boolean $$8 = $$2.q("isLightOn");
         ehj.d $$9 = $$2.<ehj.d>a("blending_data", ehj.d.a).orElse(null);
         efu $$10 = $$2.<efu>a("below_zero_retrogen", efu.a).orElse(null);
         long[] $$11;
         if ($$2.b("carving_mask", 12)) {
            $$11 = $$2.o("carving_mask");
         } else {
            $$11 = null;
         }

         tz $$13 = $$2.p("Heightmaps");
         Map<egg.a, long[]> $$14 = new EnumMap<>(egg.a.class);

         for (egg.a $$15 : $$6.e()) {
            String $$16 = $$15.a();
            if ($$13.b($$16, 12)) {
               $$14.put($$15, $$13.o($$16));
            }
         }

         List<fgh<dmf>> $$17 = fgh.a($$2.c("block_ticks", 10), $$0x -> mf.e.b(alg.c($$0x)), $$3);
         List<fgh<ewn>> $$18 = fgh.a($$2.c("fluid_ticks", 10), $$0x -> mf.c.b(alg.c($$0x)), $$3);
         ece.a $$19 = new ece.a($$17, $$18);
         uf $$20 = $$2.c("PostProcessing", 9);
         ShortList[] $$21 = new ShortList[$$20.size()];

         for (int $$22 = 0; $$22 < $$20.size(); $$22++) {
            uf $$23 = $$20.b($$22);
            ShortList $$24 = new ShortArrayList($$23.size());

            for (int $$25 = 0; $$25 < $$23.size(); $$25++) {
               $$24.add($$23.d($$25));
            }

            $$21[$$22] = $$24;
         }

         List<tz> $$26 = Lists.transform($$2.c("entities", 10), $$0x -> (tz)$$0x);
         List<tz> $$27 = Lists.transform($$2.c("block_entities", 10), $$0x -> (tz)$$0x);
         tz $$28 = $$2.p("structures");
         uf $$29 = $$2.c("sections", 10);
         List<edz.b> $$30 = new ArrayList<>($$29.size());
         jr<dkd> $$31 = $$1.f(mg.aG);
         Codec<ecx<je<dkd>>> $$32 = a($$31);

         for (int $$33 = 0; $$33 < $$29.size(); $$33++) {
            tz $$34 = $$29.a($$33);
            int $$35 = $$34.f("Y");
            ecp $$40;
            if ($$35 >= $$0.aq() && $$35 <= $$0.ar()) {
               ecw<eah> $$36;
               if ($$34.b("block_states", 10)) {
                  $$36 = (ecw<eah>)z.parse(un.a, $$34.p("block_states")).promotePartial($$2x -> a($$3, $$35, $$2x)).getOrThrow(edz.a::new);
               } else {
                  $$36 = new ecw<>(dmf.k, dmh.a.m(), ecw.d.d);
               }

               ecx<je<dkd>> $$38;
               if ($$34.b("biomes", 10)) {
                  $$38 = (ecx<je<dkd>>)$$32.parse(un.a, $$34.p("biomes")).promotePartial($$2x -> a($$3, $$35, $$2x)).getOrThrow(edz.a::new);
               } else {
                  $$38 = new ecw<>($$31.t(), $$31.b(dkk.b), ecw.d.e);
               }

               $$40 = new ecp($$36, $$38);
            } else {
               $$40 = null;
            }

            ecj $$42 = $$34.b("BlockLight", 7) ? new ecj($$34.m("BlockLight")) : null;
            ecj $$43 = $$34.b("SkyLight", 7) ? new ecj($$34.m("SkyLight")) : null;
            $$30.add(new edz.b($$35, $$40, $$42, $$43));
         }

         return new edz($$31, $$3, $$0.aq(), $$4, $$5, $$6, $$9, $$10, $$7, $$11, $$14, $$19, $$21, $$8, $$30, $$26, $$27, $$28);
      }
   }

   public ecy a(arq $$0, cig $$1, edx $$2, dih $$3) {
      if (!Objects.equals($$3, this.i)) {
         A.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$3, $$3, this.i});
         $$0.p().a(this.i, $$3, $$2);
      }

      int $$4 = $$0.ap();
      ecp[] $$5 = new ecp[$$4];
      boolean $$6 = $$0.B_().g();
      eci $$7 = $$0.m();
      ewd $$8 = $$7.q();
      jr<dkd> $$9 = $$0.F_().f(mg.aG);
      boolean $$10 = false;

      for (edz.b $$11 : this.v) {
         jx $$12 = jx.a($$3, $$11.a);
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
               $$8.a(djj.b, $$12, $$11.c);
            }

            if ($$14) {
               $$8.a(djj.a, $$12, $$11.d);
            }
         }
      }

      edj $$15 = this.m.d();
      ece $$18;
      if ($$15 == edj.b) {
         fgd<dmf> $$16 = new fgd<>(this.s.a());
         fgd<ewn> $$17 = new fgd<>(this.s.b());
         $$18 = new eco($$0.a(), $$3, this.p, $$16, $$17, this.l, $$5, a($$0, this.w, this.x), ehj.a(this.n));
      } else {
         fgg<dmf> $$19 = fgg.a(this.s.a());
         fgg<ewn> $$20 = fgg.a(this.s.b());
         ecy $$21 = new ecy($$3, this.p, $$5, $$19, $$20, $$0, $$9, ehj.a(this.n));
         $$18 = $$21;
         $$21.c(this.l);
         if (this.o != null) {
            $$21.a(this.o);
         }

         $$21.a(this.m);
         if (this.m.a(edf.k)) {
            $$21.a($$8);
         }
      }

      $$18.a(this.u);
      EnumSet<egg.a> $$23 = EnumSet.noneOf(egg.a.class);

      for (egg.a $$24 : $$18.n().e()) {
         long[] $$25 = this.r.get($$24);
         if ($$25 != null) {
            $$18.a($$24, $$25);
         } else {
            $$23.add($$24);
         }
      }

      egg.a($$18, $$23);
      $$18.a(a(err.a($$0), this.y, $$0.E()));
      $$18.b(a($$0.F_(), $$3, this.y));

      for (int $$26 = 0; $$26 < this.t.length; $$26++) {
         $$18.a(this.t[$$26], $$26);
      }

      if ($$15 == edj.b) {
         return new ecn((eco)$$18, false);
      } else {
         ecy $$27 = (ecy)$$18;

         for (tz $$28 : this.w) {
            $$27.b($$28);
         }

         for (tz $$29 : this.x) {
            $$27.a($$29);
         }

         if (this.q != null) {
            $$27.a(new ecd(this.q, $$18.G_()));
         }

         return $$27;
      }
   }

   private static void a(dih $$0, int $$1, String $$2) {
      A.error("Recoverable errors when loading section [{}, {}, {}]: {}", new Object[]{$$0.h, $$1, $$0.i, $$2});
   }

   private static Codec<ecx<je<dkd>>> a(jr<dkd> $$0) {
      return ecw.b($$0.t(), $$0.r(), ecw.d.e, $$0.b(dkk.b));
   }

   public static edz a(arq $$0, ece $$1) {
      if (!$$1.s()) {
         throw new IllegalArgumentException("Chunk can't be serialized: " + $$1);
      } else {
         dih $$2 = $$1.f();
         List<edz.b> $$3 = new ArrayList<>();
         ecp[] $$4 = $$1.d();
         ewd $$5 = $$0.m().a();

         for (int $$6 = $$5.d(); $$6 < $$5.e(); $$6++) {
            int $$7 = $$1.g($$6);
            boolean $$8 = $$7 >= 0 && $$7 < $$4.length;
            ecj $$9 = $$5.a(djj.b).a(jx.a($$2, $$6));
            ecj $$10 = $$5.a(djj.a).a(jx.a($$2, $$6));
            ecj $$11 = $$9 != null && !$$9.d() ? $$9.b() : null;
            ecj $$12 = $$10 != null && !$$10.d() ? $$10.b() : null;
            if ($$8 || $$11 != null || $$12 != null) {
               ecp $$13 = $$8 ? $$4[$$7].k() : null;
               $$3.add(new edz.b($$6, $$13, $$11, $$12));
            }
         }

         List<tz> $$14 = new ArrayList<>($$1.c().size());

         for (iu $$15 : $$1.c()) {
            tz $$16 = $$1.a($$15, $$0.F_());
            if ($$16 != null) {
               $$14.add($$16);
            }
         }

         List<tz> $$17 = new ArrayList<>();
         long[] $$18 = null;
         if ($$1.n().d() == edj.a) {
            ecy $$19 = (ecy)$$1;
            $$17.addAll($$19.I());
            ecd $$20 = $$19.E();
            if ($$20 != null) {
               $$18 = $$20.a();
            }
         }

         Map<egg.a, long[]> $$21 = new EnumMap<>(egg.a.class);

         for (Entry<egg.a, egg> $$22 : $$1.e()) {
            if ($$1.n().e().contains($$22.getKey())) {
               long[] $$23 = $$22.getValue().a();
               $$21.put($$22.getKey(), (long[])$$23.clone());
            }
         }

         ece.a $$24 = $$1.a($$0.ae());
         ShortList[] $$25 = Arrays.stream($$1.p()).map($$0x -> $$0x != null ? new ShortArrayList($$0x) : null).toArray(ShortList[]::new);
         tz $$26 = a(err.a($$0), $$2, $$1.g(), $$1.h());
         return new edz(
            $$0.F_().f(mg.aG),
            $$2,
            $$1.aq(),
            $$0.ae(),
            $$1.w(),
            $$1.n(),
            x.a($$1.v(), ehj::a),
            $$1.z(),
            $$1.t().c(),
            $$18,
            $$21,
            $$24,
            $$25,
            $$1.x(),
            $$3,
            $$17,
            $$14,
            $$26
         );
      }
   }

   public tz a() {
      tz $$0 = uo.e(new tz());
      $$0.a("xPos", this.i.h);
      $$0.a("yPos", this.j);
      $$0.a("zPos", this.i.i);
      $$0.a("LastUpdate", this.k);
      $$0.a("InhabitedTime", this.l);
      $$0.a("Status", mf.l.b(this.m).toString());
      if (this.n != null) {
         $$0.a("blending_data", ehj.d.a, this.n);
      }

      if (this.o != null) {
         $$0.a("below_zero_retrogen", efu.a, this.o);
      }

      if (!this.p.a()) {
         $$0.a("UpgradeData", this.p.b());
      }

      uf $$1 = new uf();
      Codec<ecx<je<dkd>>> $$2 = a(this.h);

      for (edz.b $$3 : this.v) {
         tz $$4 = new tz();
         ecp $$5 = $$3.b;
         if ($$5 != null) {
            $$4.a("block_states", z, $$5.h());
            $$4.a("biomes", $$2, $$5.i());
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

      uf $$6 = new uf();
      $$6.addAll(this.x);
      $$0.a("block_entities", $$6);
      if (this.m.d() == edj.a) {
         uf $$7 = new uf();
         $$7.addAll(this.w);
         $$0.a("entities", $$7);
         if (this.q != null) {
            $$0.a("carving_mask", this.q);
         }
      }

      a($$0, this.s);
      $$0.a("PostProcessing", a(this.t));
      tz $$8 = new tz();
      this.r.forEach(($$1x, $$2x) -> $$8.a($$1x.a(), new ug($$2x)));
      $$0.a("Heightmaps", $$8);
      $$0.a("structures", this.y);
      return $$0;
   }

   private static void a(tz $$0, ece.a $$1) {
      uf $$2 = new uf();

      for (fgh<dmf> $$3 : $$1.a()) {
         $$2.add($$3.a($$0x -> mf.e.b($$0x).toString()));
      }

      $$0.a("block_ticks", $$2);
      uf $$4 = new uf();

      for (fgh<ewn> $$5 : $$1.b()) {
         $$4.add($$5.a($$0x -> mf.c.b($$0x).toString()));
      }

      $$0.a("fluid_ticks", $$4);
   }

   public static edj a(@Nullable tz $$0) {
      return $$0 != null ? edf.a($$0.l("Status")).d() : edj.a;
   }

   @Nullable
   private static eco.c a(arq $$0, List<tz> $$1, List<tz> $$2) {
      return $$1.isEmpty() && $$2.isEmpty() ? null : $$3 -> {
         if (!$$1.isEmpty()) {
            $$0.a(bwo.a($$1, $$0, bwn.r));
         }

         for (tz $$4 : $$2) {
            boolean $$5 = $$4.q("keepPacked");
            if ($$5) {
               $$3.a($$4);
            } else {
               iu $$6 = dxf.b($$4);
               dxf $$7 = dxf.a($$6, $$3.a_($$6), $$4, $$0.F_());
               if ($$7 != null) {
                  $$3.a($$7);
               }
            }
         }
      };
   }

   private static tz a(err $$0, dih $$1, Map<erb, erj> $$2, Map<erb, LongSet> $$3) {
      tz $$4 = new tz();
      tz $$5 = new tz();
      jr<erb> $$6 = $$0.b().f(mg.be);

      for (Entry<erb, erj> $$7 : $$2.entrySet()) {
         alg $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      tz $$9 = new tz();

      for (Entry<erb, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            alg $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new ug($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<erb, erj> a(err $$0, tz $$1, long $$2) {
      Map<erb, erj> $$3 = Maps.newHashMap();
      jr<erb> $$4 = $$0.b().f(mg.be);
      tz $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         alg $$7 = alg.c($$6);
         erb $$8 = $$4.a($$7);
         if ($$8 == null) {
            A.error("Unknown structure start: {}", $$7);
         } else {
            erj $$9 = erj.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<erb, LongSet> a(js $$0, dih $$1, tz $$2) {
      Map<erb, LongSet> $$3 = Maps.newHashMap();
      jr<erb> $$4 = $$0.f(mg.be);
      tz $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         alg $$7 = alg.c($$6);
         erb $$8 = $$4.a($$7);
         if ($$8 == null) {
            A.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  dih $$3x = new dih($$2x);
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

   private static uf a(ShortList[] $$0) {
      uf $$1 = new uf();

      for (ShortList $$2 : $$0) {
         uf $$3 = new uf();
         if ($$2 != null) {
            for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
               $$3.add(ur.a($$2.getShort($$4)));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }

   public jr<dkd> b() {
      return this.h;
   }

   public dih c() {
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

   public edf g() {
      return this.m;
   }

   @Nullable
   public ehj.d h() {
      return this.n;
   }

   @Nullable
   public efu i() {
      return this.o;
   }

   public edb j() {
      return this.p;
   }

   @Nullable
   public long[] k() {
      return this.q;
   }

   public Map<egg.a, long[]> l() {
      return this.r;
   }

   public ece.a m() {
      return this.s;
   }

   public ShortList[] n() {
      return this.t;
   }

   public boolean o() {
      return this.u;
   }

   public List<edz.b> p() {
      return this.v;
   }

   public List<tz> q() {
      return this.w;
   }

   public List<tz> r() {
      return this.x;
   }

   public tz s() {
      return this.y;
   }

   public static class a extends uk {
      public a(String $$0) {
         super($$0);
      }
   }

   public static record b(int a, @Nullable ecp b, @Nullable ecj c, @Nullable ecj d) {
   }
}
