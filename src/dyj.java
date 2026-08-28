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

public record dyj(
   kb<dfk> h,
   ddp i,
   int j,
   long k,
   long l,
   dxp m,
   @Nullable ebr.d n,
   @Nullable eac o,
   dxl p,
   @Nullable long[] q,
   Map<eao.a, long[]> r,
   dwo.a s,
   ShortList[] t,
   boolean u,
   List<dyj.b> v,
   List<ug> w,
   List<ug> x,
   ug y
) {
   private static final Codec<dxg<dus>> z = dxg.a(dhm.q, dus.a, dxg.d.d, dho.a.n());
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
   public static dyj a(del $$0, kc $$1, ug $$2) {
      if (!$$2.b("Status", 8)) {
         return null;
      } else {
         ddp $$3 = new ddp($$2.h("xPos"), $$2.h("zPos"));
         long $$4 = $$2.i("LastUpdate");
         long $$5 = $$2.i("InhabitedTime");
         dxp $$6 = dxp.a($$2.l("Status"));
         dxl $$7 = $$2.b("UpgradeData", 10) ? new dxl($$2.p("UpgradeData"), $$0) : dxl.a;
         boolean $$8 = $$2.q("isLightOn");
         ebr.d $$9;
         if ($$2.b("blending_data", 10)) {
            $$9 = (ebr.d)ebr.d.a.parse(uu.a, $$2.p("blending_data")).resultOrPartial(A::error).orElse(null);
         } else {
            $$9 = null;
         }

         eac $$11;
         if ($$2.b("below_zero_retrogen", 10)) {
            $$11 = (eac)eac.a.parse(uu.a, $$2.p("below_zero_retrogen")).resultOrPartial(A::error).orElse(null);
         } else {
            $$11 = null;
         }

         long[] $$13;
         if ($$2.b("carving_mask", 12)) {
            $$13 = $$2.o("carving_mask");
         } else {
            $$13 = null;
         }

         ug $$15 = $$2.p("Heightmaps");
         Map<eao.a, long[]> $$16 = new EnumMap<>(eao.a.class);

         for (eao.a $$17 : $$6.e()) {
            String $$18 = $$17.a();
            if ($$15.b($$18, 12)) {
               $$16.put($$17, $$15.o($$18));
            }
         }

         List<fan<dhm>> $$19 = fan.a($$2.c("block_ticks", 10), $$0x -> lv.e.b(ale.c($$0x)), $$3);
         List<fan<eqs>> $$20 = fan.a($$2.c("fluid_ticks", 10), $$0x -> lv.c.b(ale.c($$0x)), $$3);
         dwo.a $$21 = new dwo.a($$19, $$20);
         um $$22 = $$2.c("PostProcessing", 9);
         ShortList[] $$23 = new ShortList[$$22.size()];

         for (int $$24 = 0; $$24 < $$22.size(); $$24++) {
            um $$25 = $$22.b($$24);
            ShortList $$26 = new ShortArrayList($$25.size());

            for (int $$27 = 0; $$27 < $$25.size(); $$27++) {
               $$26.add($$25.d($$27));
            }

            $$23[$$24] = $$26;
         }

         List<ug> $$28 = Lists.transform($$2.c("entities", 10), $$0x -> (ug)$$0x);
         List<ug> $$29 = Lists.transform($$2.c("block_entities", 10), $$0x -> (ug)$$0x);
         ug $$30 = $$2.p("structures");
         um $$31 = $$2.c("sections", 10);
         List<dyj.b> $$32 = new ArrayList<>($$31.size());
         kb<dfk> $$33 = $$1.e(lw.aH);
         Codec<dxh<jo<dfk>>> $$34 = a($$33);

         for (int $$35 = 0; $$35 < $$31.size(); $$35++) {
            ug $$36 = $$31.a($$35);
            int $$37 = $$36.f("Y");
            dwz $$42;
            if ($$37 >= $$0.ap() && $$37 <= $$0.aq()) {
               dxg<dus> $$38;
               if ($$36.b("block_states", 10)) {
                  $$38 = (dxg<dus>)z.parse(uu.a, $$36.p("block_states")).promotePartial($$2x -> a($$3, $$37, $$2x)).getOrThrow(dyj.a::new);
               } else {
                  $$38 = new dxg<>(dhm.q, dho.a.n(), dxg.d.d);
               }

               dxh<jo<dfk>> $$40;
               if ($$36.b("biomes", 10)) {
                  $$40 = (dxh<jo<dfk>>)$$34.parse(uu.a, $$36.p("biomes")).promotePartial($$2x -> a($$3, $$37, $$2x)).getOrThrow(dyj.a::new);
               } else {
                  $$40 = new dxg<>($$33.t(), $$33.b(dfr.b), dxg.d.e);
               }

               $$42 = new dwz($$38, $$40);
            } else {
               $$42 = null;
            }

            dwt $$44 = $$36.b("BlockLight", 7) ? new dwt($$36.m("BlockLight")) : null;
            dwt $$45 = $$36.b("SkyLight", 7) ? new dwt($$36.m("SkyLight")) : null;
            $$32.add(new dyj.b($$37, $$42, $$44, $$45));
         }

         return new dyj($$33, $$3, $$0.ap(), $$4, $$5, $$6, $$9, $$11, $$7, $$13, $$16, $$21, $$23, $$8, $$32, $$28, $$29, $$30);
      }
   }

   public dxi a(arj $$0, cfq $$1, dyh $$2, ddp $$3) {
      if (!Objects.equals($$3, this.i)) {
         A.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$3, $$3, this.i});
         $$0.o().a(this.i, $$3, $$2);
      }

      int $$4 = $$0.ao();
      dwz[] $$5 = new dwz[$$4];
      boolean $$6 = $$0.C_().g();
      dws $$7 = $$0.l();
      eqi $$8 = $$7.p();
      kb<dfk> $$9 = $$0.G_().e(lw.aH);
      boolean $$10 = false;

      for (dyj.b $$11 : this.v) {
         kh $$12 = kh.a($$3, $$11.a);
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
               $$8.a(des.b, $$12, $$11.c);
            }

            if ($$14) {
               $$8.a(des.a, $$12, $$11.d);
            }
         }
      }

      dxt $$15 = this.m.d();
      dwo $$18;
      if ($$15 == dxt.b) {
         faj<dhm> $$16 = new faj<>(this.s.a());
         faj<eqs> $$17 = new faj<>(this.s.b());
         $$18 = new dwy($$0.E(), $$3, this.p, $$16, $$17, this.l, $$5, a($$0, this.w, this.x), ebr.a(this.n));
      } else {
         fam<dhm> $$19 = fam.a(this.s.a());
         fam<eqs> $$20 = fam.a(this.s.b());
         dxi $$21 = new dxi($$3, this.p, $$5, $$19, $$20, $$0, $$9, ebr.a(this.n));
         $$18 = $$21;
         $$21.c(this.l);
         if (this.o != null) {
            $$21.a(this.o);
         }

         $$21.a(this.m);
         if (this.m.a(dxp.k)) {
            $$21.a($$8);
         }
      }

      $$18.b(this.u);
      EnumSet<eao.a> $$23 = EnumSet.noneOf(eao.a.class);

      for (eao.a $$24 : $$18.j().e()) {
         long[] $$25 = this.r.get($$24);
         if ($$25 != null) {
            $$18.a($$24, $$25);
         } else {
            $$23.add($$24);
         }
      }

      eao.a($$18, $$23);
      $$18.a(a(elw.a($$0), this.y, $$0.C()));
      $$18.b(a($$0.G_(), $$3, this.y));

      for (int $$26 = 0; $$26 < this.t.length; $$26++) {
         $$18.a(this.t[$$26], $$26);
      }

      if ($$15 == dxt.b) {
         return new dwx((dwy)$$18, false);
      } else {
         dxi $$27 = (dxi)$$18;

         for (ug $$28 : this.w) {
            $$27.b($$28);
         }

         for (ug $$29 : this.x) {
            $$27.a($$29);
         }

         if (this.q != null) {
            $$27.a(new dwn(this.q, $$18.H_()));
         }

         return $$27;
      }
   }

   private static void a(ddp $$0, int $$1, String $$2) {
      A.error("Recoverable errors when loading section [{}, {}, {}]: {}", new Object[]{$$0.e, $$1, $$0.f, $$2});
   }

   private static Codec<dxh<jo<dfk>>> a(kb<dfk> $$0) {
      return dxg.b($$0.t(), $$0.r(), dxg.d.e, $$0.b(dfr.b));
   }

   public static dyj a(arj $$0, dwo $$1) {
      ddp $$2 = $$1.f();
      List<dyj.b> $$3 = new ArrayList<>();
      dwz[] $$4 = $$1.d();
      eqi $$5 = $$0.l().a();

      for (int $$6 = $$5.d(); $$6 < $$5.e(); $$6++) {
         int $$7 = $$1.g($$6);
         boolean $$8 = $$7 >= 0 && $$7 < $$4.length;
         dwt $$9 = $$5.a(des.b).a(kh.a($$2, $$6));
         dwt $$10 = $$5.a(des.a).a(kh.a($$2, $$6));
         dwt $$11 = $$9 != null && !$$9.d() ? $$9.b() : null;
         dwt $$12 = $$10 != null && !$$10.d() ? $$10.b() : null;
         if ($$8 || $$11 != null || $$12 != null) {
            dwz $$13 = $$8 ? $$4[$$7].k() : null;
            $$3.add(new dyj.b($$6, $$13, $$11, $$12));
         }
      }

      List<ug> $$14 = new ArrayList<>($$1.c().size());

      for (jf $$15 : $$1.c()) {
         ug $$16 = $$1.a($$15, $$0.G_());
         if ($$16 != null) {
            $$14.add($$16);
         }
      }

      List<ug> $$17 = new ArrayList<>();
      long[] $$18 = null;
      if ($$1.j().d() == dxt.a) {
         dxi $$19 = (dxi)$$1;
         $$17.addAll($$19.F());
         dwn $$20 = $$19.B();
         if ($$20 != null) {
            $$18 = $$20.a();
         }
      }

      Map<eao.a, long[]> $$21 = new EnumMap<>(eao.a.class);

      for (Entry<eao.a, eao> $$22 : $$1.e()) {
         if ($$1.j().e().contains($$22.getKey())) {
            long[] $$23 = $$22.getValue().a();
            $$21.put($$22.getKey(), (long[])$$23.clone());
         }
      }

      dwo.a $$24 = $$1.a($$0.aa());
      ShortList[] $$25 = Arrays.stream($$1.n()).map($$0x -> $$0x != null ? new ShortArrayList($$0x) : null).toArray(ShortList[]::new);
      ug $$26 = a(elw.a($$0), $$2, $$1.g(), $$1.h());
      return new dyj(
         $$0.G_().e(lw.aH),
         $$2,
         $$1.ap(),
         $$0.aa(),
         $$1.t(),
         $$1.j(),
         x.a($$1.s(), ebr::a),
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

   public ug a() {
      ug $$0 = uv.e(new ug());
      $$0.a("xPos", this.i.e);
      $$0.a("yPos", this.j);
      $$0.a("zPos", this.i.f);
      $$0.a("LastUpdate", this.k);
      $$0.a("InhabitedTime", this.l);
      $$0.a("Status", lv.l.b(this.m).toString());
      if (this.n != null) {
         ebr.d.a.encodeStart(uu.a, this.n).resultOrPartial(A::error).ifPresent($$1x -> $$0.a("blending_data", $$1x));
      }

      if (this.o != null) {
         eac.a.encodeStart(uu.a, this.o).resultOrPartial(A::error).ifPresent($$1x -> $$0.a("below_zero_retrogen", $$1x));
      }

      if (!this.p.a()) {
         $$0.a("UpgradeData", this.p.b());
      }

      um $$1 = new um();
      Codec<dxh<jo<dfk>>> $$2 = a(this.h);

      for (dyj.b $$3 : this.v) {
         ug $$4 = new ug();
         dwz $$5 = $$3.b;
         if ($$5 != null) {
            $$4.a("block_states", (vd)z.encodeStart(uu.a, $$5.h()).getOrThrow());
            $$4.a("biomes", (vd)$$2.encodeStart(uu.a, $$5.i()).getOrThrow());
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

      um $$6 = new um();
      $$6.addAll(this.x);
      $$0.a("block_entities", $$6);
      if (this.m.d() == dxt.a) {
         um $$7 = new um();
         $$7.addAll(this.w);
         $$0.a("entities", $$7);
         if (this.q != null) {
            $$0.a("carving_mask", this.q);
         }
      }

      a($$0, this.s);
      $$0.a("PostProcessing", a(this.t));
      ug $$8 = new ug();
      this.r.forEach(($$1x, $$2x) -> $$8.a($$1x.a(), new un($$2x)));
      $$0.a("Heightmaps", $$8);
      $$0.a("structures", this.y);
      return $$0;
   }

   private static void a(ug $$0, dwo.a $$1) {
      um $$2 = new um();

      for (fan<dhm> $$3 : $$1.a()) {
         $$2.add($$3.a($$0x -> lv.e.b($$0x).toString()));
      }

      $$0.a("block_ticks", $$2);
      um $$4 = new um();

      for (fan<eqs> $$5 : $$1.b()) {
         $$4.add($$5.a($$0x -> lv.c.b($$0x).toString()));
      }

      $$0.a("fluid_ticks", $$4);
   }

   public static dxt a(@Nullable ug $$0) {
      return $$0 != null ? dxp.a($$0.l("Status")).d() : dxt.a;
   }

   @Nullable
   private static dwy.c a(arj $$0, List<ug> $$1, List<ug> $$2) {
      return $$1.isEmpty() && $$2.isEmpty() ? null : $$3 -> {
         if (!$$1.isEmpty()) {
            $$0.a(bty.a($$1, $$0, btx.r));
         }

         for (ug $$4 : $$2) {
            boolean $$5 = $$4.q("keepPacked");
            if ($$5) {
               $$3.a($$4);
            } else {
               jf $$6 = drv.b($$4);
               drv $$7 = drv.a($$6, $$3.a_($$6), $$4, $$0.G_());
               if ($$7 != null) {
                  $$3.a($$7);
               }
            }
         }
      };
   }

   private static ug a(elw $$0, ddp $$1, Map<elg, elo> $$2, Map<elg, LongSet> $$3) {
      ug $$4 = new ug();
      ug $$5 = new ug();
      kb<elg> $$6 = $$0.b().e(lw.aT);

      for (Entry<elg, elo> $$7 : $$2.entrySet()) {
         ale $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      ug $$9 = new ug();

      for (Entry<elg, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            ale $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new un($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<elg, elo> a(elw $$0, ug $$1, long $$2) {
      Map<elg, elo> $$3 = Maps.newHashMap();
      kb<elg> $$4 = $$0.b().e(lw.aT);
      ug $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         ale $$7 = ale.c($$6);
         elg $$8 = $$4.a($$7);
         if ($$8 == null) {
            A.error("Unknown structure start: {}", $$7);
         } else {
            elo $$9 = elo.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<elg, LongSet> a(kc $$0, ddp $$1, ug $$2) {
      Map<elg, LongSet> $$3 = Maps.newHashMap();
      kb<elg> $$4 = $$0.e(lw.aT);
      ug $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         ale $$7 = ale.c($$6);
         elg $$8 = $$4.a($$7);
         if ($$8 == null) {
            A.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  ddp $$3x = new ddp($$2x);
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

   private static um a(ShortList[] $$0) {
      um $$1 = new um();

      for (ShortList $$2 : $$0) {
         um $$3 = new um();
         if ($$2 != null) {
            for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
               $$3.add(uy.a($$2.getShort($$4)));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }

   public kb<dfk> b() {
      return this.h;
   }

   public ddp c() {
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

   public dxp g() {
      return this.m;
   }

   @Nullable
   public ebr.d h() {
      return this.n;
   }

   @Nullable
   public eac i() {
      return this.o;
   }

   public dxl j() {
      return this.p;
   }

   @Nullable
   public long[] k() {
      return this.q;
   }

   public Map<eao.a, long[]> l() {
      return this.r;
   }

   public dwo.a m() {
      return this.s;
   }

   public ShortList[] n() {
      return this.t;
   }

   public boolean o() {
      return this.u;
   }

   public List<dyj.b> p() {
      return this.v;
   }

   public List<ug> q() {
      return this.w;
   }

   public List<ug> r() {
      return this.x;
   }

   public ug s() {
      return this.y;
   }

   public static class a extends ur {
      public a(String $$0) {
         super($$0);
      }
   }

   public static record b(int a, @Nullable dwz b, @Nullable dwt c, @Nullable dwt d) {
   }
}
