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

public record dyu(
   kc<dfw> h,
   deb i,
   int j,
   long k,
   long l,
   dya m,
   @Nullable ecc.d n,
   @Nullable ean o,
   dxw p,
   @Nullable long[] q,
   Map<eaz.a, long[]> r,
   dwz.a s,
   ShortList[] t,
   boolean u,
   List<dyu.b> v,
   List<uj> w,
   List<uj> x,
   uj y
) {
   private static final Codec<dxr<dvd>> z = dxr.a(dhy.q, dvd.a, dxr.d.d, dia.a.m());
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
   public static dyu a(dex $$0, kd $$1, uj $$2) {
      if (!$$2.b("Status", 8)) {
         return null;
      } else {
         deb $$3 = new deb($$2.h("xPos"), $$2.h("zPos"));
         long $$4 = $$2.i("LastUpdate");
         long $$5 = $$2.i("InhabitedTime");
         dya $$6 = dya.a($$2.l("Status"));
         dxw $$7 = $$2.b("UpgradeData", 10) ? new dxw($$2.p("UpgradeData"), $$0) : dxw.a;
         boolean $$8 = $$2.q("isLightOn");
         ecc.d $$9;
         if ($$2.b("blending_data", 10)) {
            $$9 = (ecc.d)ecc.d.a.parse(ux.a, $$2.p("blending_data")).resultOrPartial(A::error).orElse(null);
         } else {
            $$9 = null;
         }

         ean $$11;
         if ($$2.b("below_zero_retrogen", 10)) {
            $$11 = (ean)ean.a.parse(ux.a, $$2.p("below_zero_retrogen")).resultOrPartial(A::error).orElse(null);
         } else {
            $$11 = null;
         }

         long[] $$13;
         if ($$2.b("carving_mask", 12)) {
            $$13 = $$2.o("carving_mask");
         } else {
            $$13 = null;
         }

         uj $$15 = $$2.p("Heightmaps");
         Map<eaz.a, long[]> $$16 = new EnumMap<>(eaz.a.class);

         for (eaz.a $$17 : $$6.e()) {
            String $$18 = $$17.a();
            if ($$15.b($$18, 12)) {
               $$16.put($$17, $$15.o($$18));
            }
         }

         List<fay<dhy>> $$19 = fay.a($$2.c("block_ticks", 10), $$0x -> lx.e.b(alh.c($$0x)), $$3);
         List<fay<erd>> $$20 = fay.a($$2.c("fluid_ticks", 10), $$0x -> lx.c.b(alh.c($$0x)), $$3);
         dwz.a $$21 = new dwz.a($$19, $$20);
         up $$22 = $$2.c("PostProcessing", 9);
         ShortList[] $$23 = new ShortList[$$22.size()];

         for (int $$24 = 0; $$24 < $$22.size(); $$24++) {
            up $$25 = $$22.b($$24);
            ShortList $$26 = new ShortArrayList($$25.size());

            for (int $$27 = 0; $$27 < $$25.size(); $$27++) {
               $$26.add($$25.d($$27));
            }

            $$23[$$24] = $$26;
         }

         List<uj> $$28 = Lists.transform($$2.c("entities", 10), $$0x -> (uj)$$0x);
         List<uj> $$29 = Lists.transform($$2.c("block_entities", 10), $$0x -> (uj)$$0x);
         uj $$30 = $$2.p("structures");
         up $$31 = $$2.c("sections", 10);
         List<dyu.b> $$32 = new ArrayList<>($$31.size());
         kc<dfw> $$33 = $$1.e(ly.aG);
         Codec<dxs<jp<dfw>>> $$34 = a($$33);

         for (int $$35 = 0; $$35 < $$31.size(); $$35++) {
            uj $$36 = $$31.a($$35);
            int $$37 = $$36.f("Y");
            dxk $$42;
            if ($$37 >= $$0.ap() && $$37 <= $$0.aq()) {
               dxr<dvd> $$38;
               if ($$36.b("block_states", 10)) {
                  $$38 = (dxr<dvd>)z.parse(ux.a, $$36.p("block_states")).promotePartial($$2x -> a($$3, $$37, $$2x)).getOrThrow(dyu.a::new);
               } else {
                  $$38 = new dxr<>(dhy.q, dia.a.m(), dxr.d.d);
               }

               dxs<jp<dfw>> $$40;
               if ($$36.b("biomes", 10)) {
                  $$40 = (dxs<jp<dfw>>)$$34.parse(ux.a, $$36.p("biomes")).promotePartial($$2x -> a($$3, $$37, $$2x)).getOrThrow(dyu.a::new);
               } else {
                  $$40 = new dxr<>($$33.t(), $$33.b(dgd.b), dxr.d.e);
               }

               $$42 = new dxk($$38, $$40);
            } else {
               $$42 = null;
            }

            dxe $$44 = $$36.b("BlockLight", 7) ? new dxe($$36.m("BlockLight")) : null;
            dxe $$45 = $$36.b("SkyLight", 7) ? new dxe($$36.m("SkyLight")) : null;
            $$32.add(new dyu.b($$37, $$42, $$44, $$45));
         }

         return new dyu($$33, $$3, $$0.ap(), $$4, $$5, $$6, $$9, $$11, $$7, $$13, $$16, $$21, $$23, $$8, $$32, $$28, $$29, $$30);
      }
   }

   public dxt a(arm $$0, cfz $$1, dys $$2, deb $$3) {
      if (!Objects.equals($$3, this.i)) {
         A.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$3, $$3, this.i});
         $$0.o().a(this.i, $$3, $$2);
      }

      int $$4 = $$0.ao();
      dxk[] $$5 = new dxk[$$4];
      boolean $$6 = $$0.D_().g();
      dxd $$7 = $$0.l();
      eqt $$8 = $$7.p();
      kc<dfw> $$9 = $$0.H_().e(ly.aG);
      boolean $$10 = false;

      for (dyu.b $$11 : this.v) {
         ki $$12 = ki.a($$3, $$11.a);
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
               $$8.a(dfe.b, $$12, $$11.c);
            }

            if ($$14) {
               $$8.a(dfe.a, $$12, $$11.d);
            }
         }
      }

      dye $$15 = this.m.d();
      dwz $$18;
      if ($$15 == dye.b) {
         fau<dhy> $$16 = new fau<>(this.s.a());
         fau<erd> $$17 = new fau<>(this.s.b());
         $$18 = new dxj($$0.E(), $$3, this.p, $$16, $$17, this.l, $$5, a($$0, this.w, this.x), ecc.a(this.n));
      } else {
         fax<dhy> $$19 = fax.a(this.s.a());
         fax<erd> $$20 = fax.a(this.s.b());
         dxt $$21 = new dxt($$3, this.p, $$5, $$19, $$20, $$0, $$9, ecc.a(this.n));
         $$18 = $$21;
         $$21.c(this.l);
         if (this.o != null) {
            $$21.a(this.o);
         }

         $$21.a(this.m);
         if (this.m.a(dya.k)) {
            $$21.a($$8);
         }
      }

      $$18.b(this.u);
      EnumSet<eaz.a> $$23 = EnumSet.noneOf(eaz.a.class);

      for (eaz.a $$24 : $$18.j().e()) {
         long[] $$25 = this.r.get($$24);
         if ($$25 != null) {
            $$18.a($$24, $$25);
         } else {
            $$23.add($$24);
         }
      }

      eaz.a($$18, $$23);
      $$18.a(a(emh.a($$0), this.y, $$0.C()));
      $$18.b(a($$0.H_(), $$3, this.y));

      for (int $$26 = 0; $$26 < this.t.length; $$26++) {
         $$18.a(this.t[$$26], $$26);
      }

      if ($$15 == dye.b) {
         return new dxi((dxj)$$18, false);
      } else {
         dxt $$27 = (dxt)$$18;

         for (uj $$28 : this.w) {
            $$27.b($$28);
         }

         for (uj $$29 : this.x) {
            $$27.a($$29);
         }

         if (this.q != null) {
            $$27.a(new dwy(this.q, $$18.I_()));
         }

         return $$27;
      }
   }

   private static void a(deb $$0, int $$1, String $$2) {
      A.error("Recoverable errors when loading section [{}, {}, {}]: {}", new Object[]{$$0.e, $$1, $$0.f, $$2});
   }

   private static Codec<dxs<jp<dfw>>> a(kc<dfw> $$0) {
      return dxr.b($$0.t(), $$0.r(), dxr.d.e, $$0.b(dgd.b));
   }

   public static dyu a(arm $$0, dwz $$1) {
      deb $$2 = $$1.f();
      List<dyu.b> $$3 = new ArrayList<>();
      dxk[] $$4 = $$1.d();
      eqt $$5 = $$0.l().a();

      for (int $$6 = $$5.d(); $$6 < $$5.e(); $$6++) {
         int $$7 = $$1.g($$6);
         boolean $$8 = $$7 >= 0 && $$7 < $$4.length;
         dxe $$9 = $$5.a(dfe.b).a(ki.a($$2, $$6));
         dxe $$10 = $$5.a(dfe.a).a(ki.a($$2, $$6));
         dxe $$11 = $$9 != null && !$$9.d() ? $$9.b() : null;
         dxe $$12 = $$10 != null && !$$10.d() ? $$10.b() : null;
         if ($$8 || $$11 != null || $$12 != null) {
            dxk $$13 = $$8 ? $$4[$$7].k() : null;
            $$3.add(new dyu.b($$6, $$13, $$11, $$12));
         }
      }

      List<uj> $$14 = new ArrayList<>($$1.c().size());

      for (jg $$15 : $$1.c()) {
         uj $$16 = $$1.a($$15, $$0.H_());
         if ($$16 != null) {
            $$14.add($$16);
         }
      }

      List<uj> $$17 = new ArrayList<>();
      long[] $$18 = null;
      if ($$1.j().d() == dye.a) {
         dxt $$19 = (dxt)$$1;
         $$17.addAll($$19.F());
         dwy $$20 = $$19.B();
         if ($$20 != null) {
            $$18 = $$20.a();
         }
      }

      Map<eaz.a, long[]> $$21 = new EnumMap<>(eaz.a.class);

      for (Entry<eaz.a, eaz> $$22 : $$1.e()) {
         if ($$1.j().e().contains($$22.getKey())) {
            long[] $$23 = $$22.getValue().a();
            $$21.put($$22.getKey(), (long[])$$23.clone());
         }
      }

      dwz.a $$24 = $$1.a($$0.aa());
      ShortList[] $$25 = Arrays.stream($$1.n()).map($$0x -> $$0x != null ? new ShortArrayList($$0x) : null).toArray(ShortList[]::new);
      uj $$26 = a(emh.a($$0), $$2, $$1.g(), $$1.h());
      return new dyu(
         $$0.H_().e(ly.aG),
         $$2,
         $$1.ap(),
         $$0.aa(),
         $$1.t(),
         $$1.j(),
         x.a($$1.s(), ecc::a),
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

   public uj a() {
      uj $$0 = uy.e(new uj());
      $$0.a("xPos", this.i.e);
      $$0.a("yPos", this.j);
      $$0.a("zPos", this.i.f);
      $$0.a("LastUpdate", this.k);
      $$0.a("InhabitedTime", this.l);
      $$0.a("Status", lx.l.b(this.m).toString());
      if (this.n != null) {
         ecc.d.a.encodeStart(ux.a, this.n).resultOrPartial(A::error).ifPresent($$1x -> $$0.a("blending_data", $$1x));
      }

      if (this.o != null) {
         ean.a.encodeStart(ux.a, this.o).resultOrPartial(A::error).ifPresent($$1x -> $$0.a("below_zero_retrogen", $$1x));
      }

      if (!this.p.a()) {
         $$0.a("UpgradeData", this.p.b());
      }

      up $$1 = new up();
      Codec<dxs<jp<dfw>>> $$2 = a(this.h);

      for (dyu.b $$3 : this.v) {
         uj $$4 = new uj();
         dxk $$5 = $$3.b;
         if ($$5 != null) {
            $$4.a("block_states", (vg)z.encodeStart(ux.a, $$5.h()).getOrThrow());
            $$4.a("biomes", (vg)$$2.encodeStart(ux.a, $$5.i()).getOrThrow());
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

      up $$6 = new up();
      $$6.addAll(this.x);
      $$0.a("block_entities", $$6);
      if (this.m.d() == dye.a) {
         up $$7 = new up();
         $$7.addAll(this.w);
         $$0.a("entities", $$7);
         if (this.q != null) {
            $$0.a("carving_mask", this.q);
         }
      }

      a($$0, this.s);
      $$0.a("PostProcessing", a(this.t));
      uj $$8 = new uj();
      this.r.forEach(($$1x, $$2x) -> $$8.a($$1x.a(), new uq($$2x)));
      $$0.a("Heightmaps", $$8);
      $$0.a("structures", this.y);
      return $$0;
   }

   private static void a(uj $$0, dwz.a $$1) {
      up $$2 = new up();

      for (fay<dhy> $$3 : $$1.a()) {
         $$2.add($$3.a($$0x -> lx.e.b($$0x).toString()));
      }

      $$0.a("block_ticks", $$2);
      up $$4 = new up();

      for (fay<erd> $$5 : $$1.b()) {
         $$4.add($$5.a($$0x -> lx.c.b($$0x).toString()));
      }

      $$0.a("fluid_ticks", $$4);
   }

   public static dye a(@Nullable uj $$0) {
      return $$0 != null ? dya.a($$0.l("Status")).d() : dye.a;
   }

   @Nullable
   private static dxj.c a(arm $$0, List<uj> $$1, List<uj> $$2) {
      return $$1.isEmpty() && $$2.isEmpty() ? null : $$3 -> {
         if (!$$1.isEmpty()) {
            $$0.a(bug.a($$1, $$0, buf.r));
         }

         for (uj $$4 : $$2) {
            boolean $$5 = $$4.q("keepPacked");
            if ($$5) {
               $$3.a($$4);
            } else {
               jg $$6 = dsg.b($$4);
               dsg $$7 = dsg.a($$6, $$3.a_($$6), $$4, $$0.H_());
               if ($$7 != null) {
                  $$3.a($$7);
               }
            }
         }
      };
   }

   private static uj a(emh $$0, deb $$1, Map<elr, elz> $$2, Map<elr, LongSet> $$3) {
      uj $$4 = new uj();
      uj $$5 = new uj();
      kc<elr> $$6 = $$0.b().e(ly.aS);

      for (Entry<elr, elz> $$7 : $$2.entrySet()) {
         alh $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      uj $$9 = new uj();

      for (Entry<elr, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            alh $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new uq($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<elr, elz> a(emh $$0, uj $$1, long $$2) {
      Map<elr, elz> $$3 = Maps.newHashMap();
      kc<elr> $$4 = $$0.b().e(ly.aS);
      uj $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         alh $$7 = alh.c($$6);
         elr $$8 = $$4.a($$7);
         if ($$8 == null) {
            A.error("Unknown structure start: {}", $$7);
         } else {
            elz $$9 = elz.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<elr, LongSet> a(kd $$0, deb $$1, uj $$2) {
      Map<elr, LongSet> $$3 = Maps.newHashMap();
      kc<elr> $$4 = $$0.e(ly.aS);
      uj $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         alh $$7 = alh.c($$6);
         elr $$8 = $$4.a($$7);
         if ($$8 == null) {
            A.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  deb $$3x = new deb($$2x);
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

   private static up a(ShortList[] $$0) {
      up $$1 = new up();

      for (ShortList $$2 : $$0) {
         up $$3 = new up();
         if ($$2 != null) {
            for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
               $$3.add(vb.a($$2.getShort($$4)));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }

   public kc<dfw> b() {
      return this.h;
   }

   public deb c() {
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

   public dya g() {
      return this.m;
   }

   @Nullable
   public ecc.d h() {
      return this.n;
   }

   @Nullable
   public ean i() {
      return this.o;
   }

   public dxw j() {
      return this.p;
   }

   @Nullable
   public long[] k() {
      return this.q;
   }

   public Map<eaz.a, long[]> l() {
      return this.r;
   }

   public dwz.a m() {
      return this.s;
   }

   public ShortList[] n() {
      return this.t;
   }

   public boolean o() {
      return this.u;
   }

   public List<dyu.b> p() {
      return this.v;
   }

   public List<uj> q() {
      return this.w;
   }

   public List<uj> r() {
      return this.x;
   }

   public uj s() {
      return this.y;
   }

   public static class a extends uu {
      public a(String $$0) {
         super($$0);
      }
   }

   public static record b(int a, @Nullable dxk b, @Nullable dxe c, @Nullable dxe d) {
   }
}
