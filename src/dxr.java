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

public record dxr(
   ka<det> h,
   dcy i,
   int j,
   long k,
   long l,
   dwx m,
   @Nullable eaz.d n,
   @Nullable dzk o,
   dwt p,
   @Nullable long[] q,
   Map<dzw.a, long[]> r,
   dvw.a s,
   ShortList[] t,
   boolean u,
   List<dxr.b> v,
   List<uf> w,
   List<uf> x,
   uf y
) {
   private static final Codec<dwo<dua>> z = dwo.a(dgv.q, dua.a, dwo.d.d, dgx.a.o());
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
   public static dxr a(ddu $$0, kb $$1, uf $$2) {
      if (!$$2.b("Status", 8)) {
         return null;
      } else {
         dcy $$3 = new dcy($$2.h("xPos"), $$2.h("zPos"));
         long $$4 = $$2.i("LastUpdate");
         long $$5 = $$2.i("InhabitedTime");
         dwx $$6 = dwx.a($$2.l("Status"));
         dwt $$7 = $$2.b("UpgradeData", 10) ? new dwt($$2.p("UpgradeData"), $$0) : dwt.a;
         boolean $$8 = $$2.q("isLightOn");
         eaz.d $$9;
         if ($$2.b("blending_data", 10)) {
            $$9 = (eaz.d)eaz.d.a.parse(ut.a, $$2.p("blending_data")).resultOrPartial(A::error).orElse(null);
         } else {
            $$9 = null;
         }

         dzk $$11;
         if ($$2.b("below_zero_retrogen", 10)) {
            $$11 = (dzk)dzk.a.parse(ut.a, $$2.p("below_zero_retrogen")).resultOrPartial(A::error).orElse(null);
         } else {
            $$11 = null;
         }

         long[] $$13;
         if ($$2.b("carving_mask", 12)) {
            $$13 = $$2.o("carving_mask");
         } else {
            $$13 = null;
         }

         uf $$15 = $$2.p("Heightmaps");
         Map<dzw.a, long[]> $$16 = new EnumMap<>(dzw.a.class);

         for (dzw.a $$17 : $$6.e()) {
            String $$18 = $$17.a();
            if ($$15.b($$18, 12)) {
               $$16.put($$17, $$15.o($$18));
            }
         }

         List<ezu<dgv>> $$19 = ezu.a($$2.c("block_ticks", 10), $$0x -> lu.e.b(alb.c($$0x)), $$3);
         List<ezu<eqa>> $$20 = ezu.a($$2.c("fluid_ticks", 10), $$0x -> lu.c.b(alb.c($$0x)), $$3);
         dvw.a $$21 = new dvw.a($$19, $$20);
         ul $$22 = $$2.c("PostProcessing", 9);
         ShortList[] $$23 = new ShortList[$$22.size()];

         for (int $$24 = 0; $$24 < $$22.size(); $$24++) {
            ul $$25 = $$22.b($$24);
            ShortList $$26 = new ShortArrayList($$25.size());

            for (int $$27 = 0; $$27 < $$25.size(); $$27++) {
               $$26.add($$25.d($$27));
            }

            $$23[$$24] = $$26;
         }

         List<uf> $$28 = Lists.transform($$2.c("entities", 10), $$0x -> (uf)$$0x);
         List<uf> $$29 = Lists.transform($$2.c("block_entities", 10), $$0x -> (uf)$$0x);
         uf $$30 = $$2.p("structures");
         ul $$31 = $$2.c("sections", 10);
         List<dxr.b> $$32 = new ArrayList<>($$31.size());
         ka<det> $$33 = $$1.d(lv.aF);
         Codec<dwp<jn<det>>> $$34 = a($$33);

         for (int $$35 = 0; $$35 < $$31.size(); $$35++) {
            uf $$36 = $$31.a($$35);
            int $$37 = $$36.f("Y");
            dwh $$42;
            if ($$37 >= $$0.ap() && $$37 < $$0.aq()) {
               dwo<dua> $$38;
               if ($$36.b("block_states", 10)) {
                  $$38 = (dwo<dua>)z.parse(ut.a, $$36.p("block_states")).promotePartial($$2x -> a($$3, $$37, $$2x)).getOrThrow(dxr.a::new);
               } else {
                  $$38 = new dwo<>(dgv.q, dgx.a.o(), dwo.d.d);
               }

               dwp<jn<det>> $$40;
               if ($$36.b("biomes", 10)) {
                  $$40 = (dwp<jn<det>>)$$34.parse(ut.a, $$36.p("biomes")).promotePartial($$2x -> a($$3, $$37, $$2x)).getOrThrow(dxr.a::new);
               } else {
                  $$40 = new dwo<>($$33.t(), $$33.g(dfa.b), dwo.d.e);
               }

               $$42 = new dwh($$38, $$40);
            } else {
               $$42 = null;
            }

            dwb $$44 = $$36.b("BlockLight", 7) ? new dwb($$36.m("BlockLight")) : null;
            dwb $$45 = $$36.b("SkyLight", 7) ? new dwb($$36.m("SkyLight")) : null;
            $$32.add(new dxr.b($$37, $$42, $$44, $$45));
         }

         return new dxr($$33, $$3, $$0.ap(), $$4, $$5, $$6, $$9, $$11, $$7, $$13, $$16, $$21, $$23, $$8, $$32, $$28, $$29, $$30);
      }
   }

   public dwq a(arg $$0, cfi $$1, dxp $$2, dcy $$3) {
      if (!Objects.equals($$3, this.i)) {
         A.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$3, $$3, this.i});
         $$0.o().a(this.i, $$3, $$2);
      }

      int $$4 = $$0.ao();
      dwh[] $$5 = new dwh[$$4];
      boolean $$6 = $$0.B_().g();
      dwa $$7 = $$0.l();
      epq $$8 = $$7.p();
      ka<det> $$9 = $$0.F_().d(lv.aF);
      boolean $$10 = false;

      for (dxr.b $$11 : this.v) {
         kg $$12 = kg.a($$3, $$11.a);
         if ($$11.b != null) {
            $$5[$$0.f($$11.a)] = $$11.b;
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
               $$8.a(deb.b, $$12, $$11.c);
            }

            if ($$14) {
               $$8.a(deb.a, $$12, $$11.d);
            }
         }
      }

      dxb $$15 = this.m.d();
      dvw $$18;
      if ($$15 == dxb.b) {
         ezq<dgv> $$16 = new ezq<>(this.s.a());
         ezq<eqa> $$17 = new ezq<>(this.s.b());
         $$18 = new dwg($$0.E(), $$3, this.p, $$16, $$17, this.l, $$5, a($$0, this.w, this.x), eaz.a(this.n));
      } else {
         ezt<dgv> $$19 = ezt.a(this.s.a());
         ezt<eqa> $$20 = ezt.a(this.s.b());
         dwq $$21 = new dwq($$3, this.p, $$5, $$19, $$20, $$0, $$9, eaz.a(this.n));
         $$18 = $$21;
         $$21.c(this.l);
         if (this.o != null) {
            $$21.a(this.o);
         }

         $$21.a(this.m);
         if (this.m.a(dwx.k)) {
            $$21.a($$8);
         }
      }

      $$18.b(this.u);
      EnumSet<dzw.a> $$23 = EnumSet.noneOf(dzw.a.class);

      for (dzw.a $$24 : $$18.j().e()) {
         long[] $$25 = this.r.get($$24);
         if ($$25 != null) {
            $$18.a($$24, $$25);
         } else {
            $$23.add($$24);
         }
      }

      dzw.a($$18, $$23);
      $$18.a(a(ele.a($$0), this.y, $$0.C()));
      $$18.b(a($$0.F_(), $$3, this.y));

      for (int $$26 = 0; $$26 < this.t.length; $$26++) {
         $$18.a(this.t[$$26], $$26);
      }

      if ($$15 == dxb.b) {
         return new dwf((dwg)$$18, false);
      } else {
         dwq $$27 = (dwq)$$18;

         for (uf $$28 : this.w) {
            $$27.b($$28);
         }

         for (uf $$29 : this.x) {
            $$27.a($$29);
         }

         if (this.q != null) {
            $$27.a(new dvv(this.q, $$18.G_()));
         }

         return $$27;
      }
   }

   private static void a(dcy $$0, int $$1, String $$2) {
      A.error("Recoverable errors when loading section [{}, {}, {}]: {}", new Object[]{$$0.e, $$1, $$0.f, $$2});
   }

   private static Codec<dwp<jn<det>>> a(ka<det> $$0) {
      return dwo.b($$0.t(), $$0.r(), dwo.d.e, $$0.g(dfa.b));
   }

   public static dxr a(arg $$0, dvw $$1) {
      dcy $$2 = $$1.f();
      List<dxr.b> $$3 = new ArrayList<>();
      dwh[] $$4 = $$1.d();
      epq $$5 = $$0.l().a();

      for (int $$6 = $$5.d(); $$6 < $$5.e(); $$6++) {
         int $$7 = $$1.f($$6);
         boolean $$8 = $$7 >= 0 && $$7 < $$4.length;
         dwb $$9 = $$5.a(deb.b).a(kg.a($$2, $$6));
         dwb $$10 = $$5.a(deb.a).a(kg.a($$2, $$6));
         dwb $$11 = $$9 != null && !$$9.d() ? $$9.b() : null;
         dwb $$12 = $$10 != null && !$$10.d() ? $$10.b() : null;
         if ($$8 || $$11 != null || $$12 != null) {
            dwh $$13 = $$8 ? $$4[$$7].k() : null;
            $$3.add(new dxr.b($$6, $$13, $$11, $$12));
         }
      }

      List<uf> $$14 = new ArrayList<>($$1.c().size());

      for (je $$15 : $$1.c()) {
         uf $$16 = $$1.a($$15, $$0.F_());
         if ($$16 != null) {
            $$14.add($$16);
         }
      }

      List<uf> $$17 = new ArrayList<>();
      long[] $$18 = null;
      if ($$1.j().d() == dxb.a) {
         dwq $$19 = (dwq)$$1;
         $$17.addAll($$19.F());
         dvv $$20 = $$19.B();
         if ($$20 != null) {
            $$18 = $$20.a();
         }
      }

      Map<dzw.a, long[]> $$21 = new EnumMap<>(dzw.a.class);

      for (Entry<dzw.a, dzw> $$22 : $$1.e()) {
         if ($$1.j().e().contains($$22.getKey())) {
            long[] $$23 = $$22.getValue().a();
            $$21.put($$22.getKey(), (long[])$$23.clone());
         }
      }

      dvw.a $$24 = $$1.a($$0.aa());
      ShortList[] $$25 = Arrays.stream($$1.n()).map($$0x -> $$0x != null ? new ShortArrayList($$0x) : null).toArray(ShortList[]::new);
      uf $$26 = a(ele.a($$0), $$2, $$1.g(), $$1.h());
      return new dxr(
         $$0.F_().d(lv.aF),
         $$2,
         $$1.ap(),
         $$0.aa(),
         $$1.t(),
         $$1.j(),
         x.a($$1.s(), eaz::a),
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

   public uf a() {
      uf $$0 = uu.e(new uf());
      $$0.a("xPos", this.i.e);
      $$0.a("yPos", this.j);
      $$0.a("zPos", this.i.f);
      $$0.a("LastUpdate", this.k);
      $$0.a("InhabitedTime", this.l);
      $$0.a("Status", lu.l.b(this.m).toString());
      if (this.n != null) {
         eaz.d.a.encodeStart(ut.a, this.n).resultOrPartial(A::error).ifPresent($$1x -> $$0.a("blending_data", $$1x));
      }

      if (this.o != null) {
         dzk.a.encodeStart(ut.a, this.o).resultOrPartial(A::error).ifPresent($$1x -> $$0.a("below_zero_retrogen", $$1x));
      }

      if (!this.p.a()) {
         $$0.a("UpgradeData", this.p.b());
      }

      ul $$1 = new ul();
      Codec<dwp<jn<det>>> $$2 = a(this.h);

      for (dxr.b $$3 : this.v) {
         uf $$4 = new uf();
         dwh $$5 = $$3.b;
         if ($$5 != null) {
            $$4.a("block_states", (vc)z.encodeStart(ut.a, $$5.h()).getOrThrow());
            $$4.a("biomes", (vc)$$2.encodeStart(ut.a, $$5.i()).getOrThrow());
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

      ul $$6 = new ul();
      $$6.addAll(this.x);
      $$0.a("block_entities", $$6);
      if (this.m.d() == dxb.a) {
         ul $$7 = new ul();
         $$7.addAll(this.w);
         $$0.a("entities", $$7);
         if (this.q != null) {
            $$0.a("carving_mask", this.q);
         }
      }

      a($$0, this.s);
      $$0.a("PostProcessing", a(this.t));
      uf $$8 = new uf();
      this.r.forEach(($$1x, $$2x) -> $$8.a($$1x.a(), new um($$2x)));
      $$0.a("Heightmaps", $$8);
      $$0.a("structures", this.y);
      return $$0;
   }

   private static void a(uf $$0, dvw.a $$1) {
      ul $$2 = new ul();

      for (ezu<dgv> $$3 : $$1.a()) {
         $$2.add($$3.a($$0x -> lu.e.b($$0x).toString()));
      }

      $$0.a("block_ticks", $$2);
      ul $$4 = new ul();

      for (ezu<eqa> $$5 : $$1.b()) {
         $$4.add($$5.a($$0x -> lu.c.b($$0x).toString()));
      }

      $$0.a("fluid_ticks", $$4);
   }

   public static dxb a(@Nullable uf $$0) {
      return $$0 != null ? dwx.a($$0.l("Status")).d() : dxb.a;
   }

   @Nullable
   private static dwg.c a(arg $$0, List<uf> $$1, List<uf> $$2) {
      return $$1.isEmpty() && $$2.isEmpty() ? null : $$3 -> {
         if (!$$1.isEmpty()) {
            $$0.a(btq.a($$1, $$0, btp.r));
         }

         for (uf $$4 : $$2) {
            boolean $$5 = $$4.q("keepPacked");
            if ($$5) {
               $$3.a($$4);
            } else {
               je $$6 = dre.b($$4);
               dre $$7 = dre.a($$6, $$3.a_($$6), $$4, $$0.F_());
               if ($$7 != null) {
                  $$3.a($$7);
               }
            }
         }
      };
   }

   private static uf a(ele $$0, dcy $$1, Map<eko, ekw> $$2, Map<eko, LongSet> $$3) {
      uf $$4 = new uf();
      uf $$5 = new uf();
      ka<eko> $$6 = $$0.b().d(lv.aR);

      for (Entry<eko, ekw> $$7 : $$2.entrySet()) {
         alb $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      uf $$9 = new uf();

      for (Entry<eko, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            alb $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new um($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<eko, ekw> a(ele $$0, uf $$1, long $$2) {
      Map<eko, ekw> $$3 = Maps.newHashMap();
      ka<eko> $$4 = $$0.b().d(lv.aR);
      uf $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         alb $$7 = alb.c($$6);
         eko $$8 = $$4.a($$7);
         if ($$8 == null) {
            A.error("Unknown structure start: {}", $$7);
         } else {
            ekw $$9 = ekw.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<eko, LongSet> a(kb $$0, dcy $$1, uf $$2) {
      Map<eko, LongSet> $$3 = Maps.newHashMap();
      ka<eko> $$4 = $$0.d(lv.aR);
      uf $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         alb $$7 = alb.c($$6);
         eko $$8 = $$4.a($$7);
         if ($$8 == null) {
            A.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  dcy $$3x = new dcy($$2x);
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

   private static ul a(ShortList[] $$0) {
      ul $$1 = new ul();

      for (ShortList $$2 : $$0) {
         ul $$3 = new ul();
         if ($$2 != null) {
            for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
               $$3.add(ux.a($$2.getShort($$4)));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }

   public ka<det> b() {
      return this.h;
   }

   public dcy c() {
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

   public dwx g() {
      return this.m;
   }

   @Nullable
   public eaz.d h() {
      return this.n;
   }

   @Nullable
   public dzk i() {
      return this.o;
   }

   public dwt j() {
      return this.p;
   }

   @Nullable
   public long[] k() {
      return this.q;
   }

   public Map<dzw.a, long[]> l() {
      return this.r;
   }

   public dvw.a m() {
      return this.s;
   }

   public ShortList[] n() {
      return this.t;
   }

   public boolean o() {
      return this.u;
   }

   public List<dxr.b> p() {
      return this.v;
   }

   public List<uf> q() {
      return this.w;
   }

   public List<uf> r() {
      return this.x;
   }

   public uf s() {
      return this.y;
   }

   public static class a extends uq {
      public a(String $$0) {
         super($$0);
      }
   }

   public static record b(int a, @Nullable dwh b, @Nullable dwb c, @Nullable dwb d) {
   }
}
