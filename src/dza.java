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

public record dza(
   kd<dgc> h,
   deh i,
   int j,
   long k,
   long l,
   dyg m,
   @Nullable eci.d n,
   @Nullable eat o,
   dyc p,
   @Nullable long[] q,
   Map<ebf.a, long[]> r,
   dxf.a s,
   ShortList[] t,
   boolean u,
   List<dza.b> v,
   List<uk> w,
   List<uk> x,
   uk y
) {
   private static final Codec<dxx<dvj>> z = dxx.a(die.q, dvj.a, dxx.d.d, dig.a.m());
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
   public static dza a(dfd $$0, ke $$1, uk $$2) {
      if (!$$2.b("Status", 8)) {
         return null;
      } else {
         deh $$3 = new deh($$2.h("xPos"), $$2.h("zPos"));
         long $$4 = $$2.i("LastUpdate");
         long $$5 = $$2.i("InhabitedTime");
         dyg $$6 = dyg.a($$2.l("Status"));
         dyc $$7 = $$2.b("UpgradeData", 10) ? new dyc($$2.p("UpgradeData"), $$0) : dyc.a;
         boolean $$8 = $$2.q("isLightOn");
         eci.d $$9;
         if ($$2.b("blending_data", 10)) {
            $$9 = (eci.d)eci.d.a.parse(uy.a, $$2.p("blending_data")).resultOrPartial(A::error).orElse(null);
         } else {
            $$9 = null;
         }

         eat $$11;
         if ($$2.b("below_zero_retrogen", 10)) {
            $$11 = (eat)eat.a.parse(uy.a, $$2.p("below_zero_retrogen")).resultOrPartial(A::error).orElse(null);
         } else {
            $$11 = null;
         }

         long[] $$13;
         if ($$2.b("carving_mask", 12)) {
            $$13 = $$2.o("carving_mask");
         } else {
            $$13 = null;
         }

         uk $$15 = $$2.p("Heightmaps");
         Map<ebf.a, long[]> $$16 = new EnumMap<>(ebf.a.class);

         for (ebf.a $$17 : $$6.e()) {
            String $$18 = $$17.a();
            if ($$15.b($$18, 12)) {
               $$16.put($$17, $$15.o($$18));
            }
         }

         List<fbe<die>> $$19 = fbe.a($$2.c("block_ticks", 10), $$0x -> ly.e.b(ali.c($$0x)), $$3);
         List<fbe<erj>> $$20 = fbe.a($$2.c("fluid_ticks", 10), $$0x -> ly.c.b(ali.c($$0x)), $$3);
         dxf.a $$21 = new dxf.a($$19, $$20);
         uq $$22 = $$2.c("PostProcessing", 9);
         ShortList[] $$23 = new ShortList[$$22.size()];

         for (int $$24 = 0; $$24 < $$22.size(); $$24++) {
            uq $$25 = $$22.b($$24);
            ShortList $$26 = new ShortArrayList($$25.size());

            for (int $$27 = 0; $$27 < $$25.size(); $$27++) {
               $$26.add($$25.d($$27));
            }

            $$23[$$24] = $$26;
         }

         List<uk> $$28 = Lists.transform($$2.c("entities", 10), $$0x -> (uk)$$0x);
         List<uk> $$29 = Lists.transform($$2.c("block_entities", 10), $$0x -> (uk)$$0x);
         uk $$30 = $$2.p("structures");
         uq $$31 = $$2.c("sections", 10);
         List<dza.b> $$32 = new ArrayList<>($$31.size());
         kd<dgc> $$33 = $$1.e(lz.aG);
         Codec<dxy<jq<dgc>>> $$34 = a($$33);

         for (int $$35 = 0; $$35 < $$31.size(); $$35++) {
            uk $$36 = $$31.a($$35);
            int $$37 = $$36.f("Y");
            dxq $$42;
            if ($$37 >= $$0.an() && $$37 <= $$0.ao()) {
               dxx<dvj> $$38;
               if ($$36.b("block_states", 10)) {
                  $$38 = (dxx<dvj>)z.parse(uy.a, $$36.p("block_states")).promotePartial($$2x -> a($$3, $$37, $$2x)).getOrThrow(dza.a::new);
               } else {
                  $$38 = new dxx<>(die.q, dig.a.m(), dxx.d.d);
               }

               dxy<jq<dgc>> $$40;
               if ($$36.b("biomes", 10)) {
                  $$40 = (dxy<jq<dgc>>)$$34.parse(uy.a, $$36.p("biomes")).promotePartial($$2x -> a($$3, $$37, $$2x)).getOrThrow(dza.a::new);
               } else {
                  $$40 = new dxx<>($$33.t(), $$33.b(dgj.b), dxx.d.e);
               }

               $$42 = new dxq($$38, $$40);
            } else {
               $$42 = null;
            }

            dxk $$44 = $$36.b("BlockLight", 7) ? new dxk($$36.m("BlockLight")) : null;
            dxk $$45 = $$36.b("SkyLight", 7) ? new dxk($$36.m("SkyLight")) : null;
            $$32.add(new dza.b($$37, $$42, $$44, $$45));
         }

         return new dza($$33, $$3, $$0.an(), $$4, $$5, $$6, $$9, $$11, $$7, $$13, $$16, $$21, $$23, $$8, $$32, $$28, $$29, $$30);
      }
   }

   public dxz a(arn $$0, cge $$1, dyy $$2, deh $$3) {
      if (!Objects.equals($$3, this.i)) {
         A.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$3, $$3, this.i});
         $$0.o().a(this.i, $$3, $$2);
      }

      int $$4 = $$0.am();
      dxq[] $$5 = new dxq[$$4];
      boolean $$6 = $$0.D_().g();
      dxj $$7 = $$0.l();
      eqz $$8 = $$7.p();
      kd<dgc> $$9 = $$0.H_().e(lz.aG);
      boolean $$10 = false;

      for (dza.b $$11 : this.v) {
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
               $$8.a(dfk.b, $$12, $$11.c);
            }

            if ($$14) {
               $$8.a(dfk.a, $$12, $$11.d);
            }
         }
      }

      dyk $$15 = this.m.d();
      dxf $$18;
      if ($$15 == dyk.b) {
         fba<die> $$16 = new fba<>(this.s.a());
         fba<erj> $$17 = new fba<>(this.s.b());
         $$18 = new dxp($$0.E(), $$3, this.p, $$16, $$17, this.l, $$5, a($$0, this.w, this.x), eci.a(this.n));
      } else {
         fbd<die> $$19 = fbd.a(this.s.a());
         fbd<erj> $$20 = fbd.a(this.s.b());
         dxz $$21 = new dxz($$3, this.p, $$5, $$19, $$20, $$0, $$9, eci.a(this.n));
         $$18 = $$21;
         $$21.c(this.l);
         if (this.o != null) {
            $$21.a(this.o);
         }

         $$21.a(this.m);
         if (this.m.a(dyg.k)) {
            $$21.a($$8);
         }
      }

      $$18.b(this.u);
      EnumSet<ebf.a> $$23 = EnumSet.noneOf(ebf.a.class);

      for (ebf.a $$24 : $$18.j().e()) {
         long[] $$25 = this.r.get($$24);
         if ($$25 != null) {
            $$18.a($$24, $$25);
         } else {
            $$23.add($$24);
         }
      }

      ebf.a($$18, $$23);
      $$18.a(a(emn.a($$0), this.y, $$0.C()));
      $$18.b(a($$0.H_(), $$3, this.y));

      for (int $$26 = 0; $$26 < this.t.length; $$26++) {
         $$18.a(this.t[$$26], $$26);
      }

      if ($$15 == dyk.b) {
         return new dxo((dxp)$$18, false);
      } else {
         dxz $$27 = (dxz)$$18;

         for (uk $$28 : this.w) {
            $$27.b($$28);
         }

         for (uk $$29 : this.x) {
            $$27.a($$29);
         }

         if (this.q != null) {
            $$27.a(new dxe(this.q, $$18.I_()));
         }

         return $$27;
      }
   }

   private static void a(deh $$0, int $$1, String $$2) {
      A.error("Recoverable errors when loading section [{}, {}, {}]: {}", new Object[]{$$0.g, $$1, $$0.h, $$2});
   }

   private static Codec<dxy<jq<dgc>>> a(kd<dgc> $$0) {
      return dxx.b($$0.t(), $$0.r(), dxx.d.e, $$0.b(dgj.b));
   }

   public static dza a(arn $$0, dxf $$1) {
      deh $$2 = $$1.f();
      List<dza.b> $$3 = new ArrayList<>();
      dxq[] $$4 = $$1.d();
      eqz $$5 = $$0.l().a();

      for (int $$6 = $$5.d(); $$6 < $$5.e(); $$6++) {
         int $$7 = $$1.g($$6);
         boolean $$8 = $$7 >= 0 && $$7 < $$4.length;
         dxk $$9 = $$5.a(dfk.b).a(kj.a($$2, $$6));
         dxk $$10 = $$5.a(dfk.a).a(kj.a($$2, $$6));
         dxk $$11 = $$9 != null && !$$9.d() ? $$9.b() : null;
         dxk $$12 = $$10 != null && !$$10.d() ? $$10.b() : null;
         if ($$8 || $$11 != null || $$12 != null) {
            dxq $$13 = $$8 ? $$4[$$7].k() : null;
            $$3.add(new dza.b($$6, $$13, $$11, $$12));
         }
      }

      List<uk> $$14 = new ArrayList<>($$1.c().size());

      for (jh $$15 : $$1.c()) {
         uk $$16 = $$1.a($$15, $$0.H_());
         if ($$16 != null) {
            $$14.add($$16);
         }
      }

      List<uk> $$17 = new ArrayList<>();
      long[] $$18 = null;
      if ($$1.j().d() == dyk.a) {
         dxz $$19 = (dxz)$$1;
         $$17.addAll($$19.F());
         dxe $$20 = $$19.B();
         if ($$20 != null) {
            $$18 = $$20.a();
         }
      }

      Map<ebf.a, long[]> $$21 = new EnumMap<>(ebf.a.class);

      for (Entry<ebf.a, ebf> $$22 : $$1.e()) {
         if ($$1.j().e().contains($$22.getKey())) {
            long[] $$23 = $$22.getValue().a();
            $$21.put($$22.getKey(), (long[])$$23.clone());
         }
      }

      dxf.a $$24 = $$1.a($$0.aa());
      ShortList[] $$25 = Arrays.stream($$1.n()).map($$0x -> $$0x != null ? new ShortArrayList($$0x) : null).toArray(ShortList[]::new);
      uk $$26 = a(emn.a($$0), $$2, $$1.g(), $$1.h());
      return new dza(
         $$0.H_().e(lz.aG),
         $$2,
         $$1.an(),
         $$0.aa(),
         $$1.t(),
         $$1.j(),
         x.a($$1.s(), eci::a),
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

   public uk a() {
      uk $$0 = uz.e(new uk());
      $$0.a("xPos", this.i.g);
      $$0.a("yPos", this.j);
      $$0.a("zPos", this.i.h);
      $$0.a("LastUpdate", this.k);
      $$0.a("InhabitedTime", this.l);
      $$0.a("Status", ly.l.b(this.m).toString());
      if (this.n != null) {
         eci.d.a.encodeStart(uy.a, this.n).resultOrPartial(A::error).ifPresent($$1x -> $$0.a("blending_data", $$1x));
      }

      if (this.o != null) {
         eat.a.encodeStart(uy.a, this.o).resultOrPartial(A::error).ifPresent($$1x -> $$0.a("below_zero_retrogen", $$1x));
      }

      if (!this.p.a()) {
         $$0.a("UpgradeData", this.p.b());
      }

      uq $$1 = new uq();
      Codec<dxy<jq<dgc>>> $$2 = a(this.h);

      for (dza.b $$3 : this.v) {
         uk $$4 = new uk();
         dxq $$5 = $$3.b;
         if ($$5 != null) {
            $$4.a("block_states", (vh)z.encodeStart(uy.a, $$5.h()).getOrThrow());
            $$4.a("biomes", (vh)$$2.encodeStart(uy.a, $$5.i()).getOrThrow());
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

      uq $$6 = new uq();
      $$6.addAll(this.x);
      $$0.a("block_entities", $$6);
      if (this.m.d() == dyk.a) {
         uq $$7 = new uq();
         $$7.addAll(this.w);
         $$0.a("entities", $$7);
         if (this.q != null) {
            $$0.a("carving_mask", this.q);
         }
      }

      a($$0, this.s);
      $$0.a("PostProcessing", a(this.t));
      uk $$8 = new uk();
      this.r.forEach(($$1x, $$2x) -> $$8.a($$1x.a(), new ur($$2x)));
      $$0.a("Heightmaps", $$8);
      $$0.a("structures", this.y);
      return $$0;
   }

   private static void a(uk $$0, dxf.a $$1) {
      uq $$2 = new uq();

      for (fbe<die> $$3 : $$1.a()) {
         $$2.add($$3.a($$0x -> ly.e.b($$0x).toString()));
      }

      $$0.a("block_ticks", $$2);
      uq $$4 = new uq();

      for (fbe<erj> $$5 : $$1.b()) {
         $$4.add($$5.a($$0x -> ly.c.b($$0x).toString()));
      }

      $$0.a("fluid_ticks", $$4);
   }

   public static dyk a(@Nullable uk $$0) {
      return $$0 != null ? dyg.a($$0.l("Status")).d() : dyk.a;
   }

   @Nullable
   private static dxp.c a(arn $$0, List<uk> $$1, List<uk> $$2) {
      return $$1.isEmpty() && $$2.isEmpty() ? null : $$3 -> {
         if (!$$1.isEmpty()) {
            $$0.a(bul.a($$1, $$0, buk.r));
         }

         for (uk $$4 : $$2) {
            boolean $$5 = $$4.q("keepPacked");
            if ($$5) {
               $$3.a($$4);
            } else {
               jh $$6 = dsm.b($$4);
               dsm $$7 = dsm.a($$6, $$3.a_($$6), $$4, $$0.H_());
               if ($$7 != null) {
                  $$3.a($$7);
               }
            }
         }
      };
   }

   private static uk a(emn $$0, deh $$1, Map<elx, emf> $$2, Map<elx, LongSet> $$3) {
      uk $$4 = new uk();
      uk $$5 = new uk();
      kd<elx> $$6 = $$0.b().e(lz.aS);

      for (Entry<elx, emf> $$7 : $$2.entrySet()) {
         ali $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      uk $$9 = new uk();

      for (Entry<elx, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            ali $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new ur($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<elx, emf> a(emn $$0, uk $$1, long $$2) {
      Map<elx, emf> $$3 = Maps.newHashMap();
      kd<elx> $$4 = $$0.b().e(lz.aS);
      uk $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         ali $$7 = ali.c($$6);
         elx $$8 = $$4.a($$7);
         if ($$8 == null) {
            A.error("Unknown structure start: {}", $$7);
         } else {
            emf $$9 = emf.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<elx, LongSet> a(ke $$0, deh $$1, uk $$2) {
      Map<elx, LongSet> $$3 = Maps.newHashMap();
      kd<elx> $$4 = $$0.e(lz.aS);
      uk $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         ali $$7 = ali.c($$6);
         elx $$8 = $$4.a($$7);
         if ($$8 == null) {
            A.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  deh $$3x = new deh($$2x);
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

   private static uq a(ShortList[] $$0) {
      uq $$1 = new uq();

      for (ShortList $$2 : $$0) {
         uq $$3 = new uq();
         if ($$2 != null) {
            for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
               $$3.add(vc.a($$2.getShort($$4)));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }

   public kd<dgc> b() {
      return this.h;
   }

   public deh c() {
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

   public dyg g() {
      return this.m;
   }

   @Nullable
   public eci.d h() {
      return this.n;
   }

   @Nullable
   public eat i() {
      return this.o;
   }

   public dyc j() {
      return this.p;
   }

   @Nullable
   public long[] k() {
      return this.q;
   }

   public Map<ebf.a, long[]> l() {
      return this.r;
   }

   public dxf.a m() {
      return this.s;
   }

   public ShortList[] n() {
      return this.t;
   }

   public boolean o() {
      return this.u;
   }

   public List<dza.b> p() {
      return this.v;
   }

   public List<uk> q() {
      return this.w;
   }

   public List<uk> r() {
      return this.x;
   }

   public uk s() {
      return this.y;
   }

   public static class a extends uv {
      public a(String $$0) {
         super($$0);
      }
   }

   public static record b(int a, @Nullable dxq b, @Nullable dxk c, @Nullable dxk d) {
   }
}
