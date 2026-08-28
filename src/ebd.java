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

public record ebd(
   kd<dic> h,
   dgg i,
   int j,
   long k,
   long l,
   eaj m,
   @Nullable eel.d n,
   @Nullable ecw o,
   eaf p,
   @Nullable long[] q,
   Map<edi.a, long[]> r,
   dzi.a s,
   ShortList[] t,
   boolean u,
   List<ebd.b> v,
   List<ux> w,
   List<ux> x,
   ux y
) {
   private static final Codec<eaa<dxn>> z = eaa.a(dke.q, dxn.a, eaa.d.d, dkg.a.m());
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
   public static ebd a(dhc $$0, ke $$1, ux $$2) {
      if (!$$2.b("Status", 8)) {
         return null;
      } else {
         dgg $$3 = new dgg($$2.h("xPos"), $$2.h("zPos"));
         long $$4 = $$2.i("LastUpdate");
         long $$5 = $$2.i("InhabitedTime");
         eaj $$6 = eaj.a($$2.l("Status"));
         eaf $$7 = $$2.b("UpgradeData", 10) ? new eaf($$2.p("UpgradeData"), $$0) : eaf.a;
         boolean $$8 = $$2.q("isLightOn");
         eel.d $$9;
         if ($$2.b("blending_data", 10)) {
            $$9 = (eel.d)eel.d.a.parse(vl.a, $$2.p("blending_data")).resultOrPartial(A::error).orElse(null);
         } else {
            $$9 = null;
         }

         ecw $$11;
         if ($$2.b("below_zero_retrogen", 10)) {
            $$11 = (ecw)ecw.a.parse(vl.a, $$2.p("below_zero_retrogen")).resultOrPartial(A::error).orElse(null);
         } else {
            $$11 = null;
         }

         long[] $$13;
         if ($$2.b("carving_mask", 12)) {
            $$13 = $$2.o("carving_mask");
         } else {
            $$13 = null;
         }

         ux $$15 = $$2.p("Heightmaps");
         Map<edi.a, long[]> $$16 = new EnumMap<>(edi.a.class);

         for (edi.a $$17 : $$6.e()) {
            String $$18 = $$17.a();
            if ($$15.b($$18, 12)) {
               $$16.put($$17, $$15.o($$18));
            }
         }

         List<fdj<dke>> $$19 = fdj.a($$2.c("block_ticks", 10), $$0x -> ma.e.b(alz.c($$0x)), $$3);
         List<fdj<eto>> $$20 = fdj.a($$2.c("fluid_ticks", 10), $$0x -> ma.c.b(alz.c($$0x)), $$3);
         dzi.a $$21 = new dzi.a($$19, $$20);
         vd $$22 = $$2.c("PostProcessing", 9);
         ShortList[] $$23 = new ShortList[$$22.size()];

         for (int $$24 = 0; $$24 < $$22.size(); $$24++) {
            vd $$25 = $$22.b($$24);
            ShortList $$26 = new ShortArrayList($$25.size());

            for (int $$27 = 0; $$27 < $$25.size(); $$27++) {
               $$26.add($$25.d($$27));
            }

            $$23[$$24] = $$26;
         }

         List<ux> $$28 = Lists.transform($$2.c("entities", 10), $$0x -> (ux)$$0x);
         List<ux> $$29 = Lists.transform($$2.c("block_entities", 10), $$0x -> (ux)$$0x);
         ux $$30 = $$2.p("structures");
         vd $$31 = $$2.c("sections", 10);
         List<ebd.b> $$32 = new ArrayList<>($$31.size());
         kd<dic> $$33 = $$1.e(mb.aH);
         Codec<eab<jq<dic>>> $$34 = a($$33);

         for (int $$35 = 0; $$35 < $$31.size(); $$35++) {
            ux $$36 = $$31.a($$35);
            int $$37 = $$36.f("Y");
            dzt $$42;
            if ($$37 >= $$0.ao() && $$37 <= $$0.ap()) {
               eaa<dxn> $$38;
               if ($$36.b("block_states", 10)) {
                  $$38 = (eaa<dxn>)z.parse(vl.a, $$36.p("block_states")).promotePartial($$2x -> a($$3, $$37, $$2x)).getOrThrow(ebd.a::new);
               } else {
                  $$38 = new eaa<>(dke.q, dkg.a.m(), eaa.d.d);
               }

               eab<jq<dic>> $$40;
               if ($$36.b("biomes", 10)) {
                  $$40 = (eab<jq<dic>>)$$34.parse(vl.a, $$36.p("biomes")).promotePartial($$2x -> a($$3, $$37, $$2x)).getOrThrow(ebd.a::new);
               } else {
                  $$40 = new eaa<>($$33.t(), $$33.b(dij.b), eaa.d.e);
               }

               $$42 = new dzt($$38, $$40);
            } else {
               $$42 = null;
            }

            dzn $$44 = $$36.b("BlockLight", 7) ? new dzn($$36.m("BlockLight")) : null;
            dzn $$45 = $$36.b("SkyLight", 7) ? new dzn($$36.m("SkyLight")) : null;
            $$32.add(new ebd.b($$37, $$42, $$44, $$45));
         }

         return new ebd($$33, $$3, $$0.ao(), $$4, $$5, $$6, $$9, $$11, $$7, $$13, $$16, $$21, $$23, $$8, $$32, $$28, $$29, $$30);
      }
   }

   public eac a(ash $$0, chf $$1, ebb $$2, dgg $$3) {
      if (!Objects.equals($$3, this.i)) {
         A.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$3, $$3, this.i});
         $$0.p().a(this.i, $$3, $$2);
      }

      int $$4 = $$0.an();
      dzt[] $$5 = new dzt[$$4];
      boolean $$6 = $$0.G_().g();
      dzm $$7 = $$0.m();
      ete $$8 = $$7.p();
      kd<dic> $$9 = $$0.K_().e(mb.aH);
      boolean $$10 = false;

      for (ebd.b $$11 : this.v) {
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
               $$8.a(dhj.b, $$12, $$11.c);
            }

            if ($$14) {
               $$8.a(dhj.a, $$12, $$11.d);
            }
         }
      }

      ean $$15 = this.m.d();
      dzi $$18;
      if ($$15 == ean.b) {
         fdf<dke> $$16 = new fdf<>(this.s.a());
         fdf<eto> $$17 = new fdf<>(this.s.b());
         $$18 = new dzs($$0.a(), $$3, this.p, $$16, $$17, this.l, $$5, a($$0, this.w, this.x), eel.a(this.n));
      } else {
         fdi<dke> $$19 = fdi.a(this.s.a());
         fdi<eto> $$20 = fdi.a(this.s.b());
         eac $$21 = new eac($$3, this.p, $$5, $$19, $$20, $$0, $$9, eel.a(this.n));
         $$18 = $$21;
         $$21.c(this.l);
         if (this.o != null) {
            $$21.a(this.o);
         }

         $$21.a(this.m);
         if (this.m.a(eaj.k)) {
            $$21.a($$8);
         }
      }

      $$18.b(this.u);
      EnumSet<edi.a> $$23 = EnumSet.noneOf(edi.a.class);

      for (edi.a $$24 : $$18.j().e()) {
         long[] $$25 = this.r.get($$24);
         if ($$25 != null) {
            $$18.a($$24, $$25);
         } else {
            $$23.add($$24);
         }
      }

      edi.a($$18, $$23);
      $$18.a(a(eos.a($$0), this.y, $$0.D()));
      $$18.b(a($$0.K_(), $$3, this.y));

      for (int $$26 = 0; $$26 < this.t.length; $$26++) {
         $$18.a(this.t[$$26], $$26);
      }

      if ($$15 == ean.b) {
         return new dzr((dzs)$$18, false);
      } else {
         eac $$27 = (eac)$$18;

         for (ux $$28 : this.w) {
            $$27.b($$28);
         }

         for (ux $$29 : this.x) {
            $$27.a($$29);
         }

         if (this.q != null) {
            $$27.a(new dzh(this.q, $$18.L_()));
         }

         return $$27;
      }
   }

   private static void a(dgg $$0, int $$1, String $$2) {
      A.error("Recoverable errors when loading section [{}, {}, {}]: {}", new Object[]{$$0.g, $$1, $$0.h, $$2});
   }

   private static Codec<eab<jq<dic>>> a(kd<dic> $$0) {
      return eaa.b($$0.t(), $$0.r(), eaa.d.e, $$0.b(dij.b));
   }

   public static ebd a(ash $$0, dzi $$1) {
      dgg $$2 = $$1.f();
      List<ebd.b> $$3 = new ArrayList<>();
      dzt[] $$4 = $$1.d();
      ete $$5 = $$0.m().a();

      for (int $$6 = $$5.d(); $$6 < $$5.e(); $$6++) {
         int $$7 = $$1.g($$6);
         boolean $$8 = $$7 >= 0 && $$7 < $$4.length;
         dzn $$9 = $$5.a(dhj.b).a(kj.a($$2, $$6));
         dzn $$10 = $$5.a(dhj.a).a(kj.a($$2, $$6));
         dzn $$11 = $$9 != null && !$$9.d() ? $$9.b() : null;
         dzn $$12 = $$10 != null && !$$10.d() ? $$10.b() : null;
         if ($$8 || $$11 != null || $$12 != null) {
            dzt $$13 = $$8 ? $$4[$$7].k() : null;
            $$3.add(new ebd.b($$6, $$13, $$11, $$12));
         }
      }

      List<ux> $$14 = new ArrayList<>($$1.c().size());

      for (jh $$15 : $$1.c()) {
         ux $$16 = $$1.a($$15, $$0.K_());
         if ($$16 != null) {
            $$14.add($$16);
         }
      }

      List<ux> $$17 = new ArrayList<>();
      long[] $$18 = null;
      if ($$1.j().d() == ean.a) {
         eac $$19 = (eac)$$1;
         $$17.addAll($$19.F());
         dzh $$20 = $$19.B();
         if ($$20 != null) {
            $$18 = $$20.a();
         }
      }

      Map<edi.a, long[]> $$21 = new EnumMap<>(edi.a.class);

      for (Entry<edi.a, edi> $$22 : $$1.e()) {
         if ($$1.j().e().contains($$22.getKey())) {
            long[] $$23 = $$22.getValue().a();
            $$21.put($$22.getKey(), (long[])$$23.clone());
         }
      }

      dzi.a $$24 = $$1.a($$0.ac());
      ShortList[] $$25 = Arrays.stream($$1.n()).map($$0x -> $$0x != null ? new ShortArrayList($$0x) : null).toArray(ShortList[]::new);
      ux $$26 = a(eos.a($$0), $$2, $$1.g(), $$1.h());
      return new ebd(
         $$0.K_().e(mb.aH),
         $$2,
         $$1.ao(),
         $$0.ac(),
         $$1.t(),
         $$1.j(),
         x.a($$1.s(), eel::a),
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

   public ux a() {
      ux $$0 = vm.e(new ux());
      $$0.a("xPos", this.i.g);
      $$0.a("yPos", this.j);
      $$0.a("zPos", this.i.h);
      $$0.a("LastUpdate", this.k);
      $$0.a("InhabitedTime", this.l);
      $$0.a("Status", ma.l.b(this.m).toString());
      if (this.n != null) {
         eel.d.a.encodeStart(vl.a, this.n).resultOrPartial(A::error).ifPresent($$1x -> $$0.a("blending_data", $$1x));
      }

      if (this.o != null) {
         ecw.a.encodeStart(vl.a, this.o).resultOrPartial(A::error).ifPresent($$1x -> $$0.a("below_zero_retrogen", $$1x));
      }

      if (!this.p.a()) {
         $$0.a("UpgradeData", this.p.b());
      }

      vd $$1 = new vd();
      Codec<eab<jq<dic>>> $$2 = a(this.h);

      for (ebd.b $$3 : this.v) {
         ux $$4 = new ux();
         dzt $$5 = $$3.b;
         if ($$5 != null) {
            $$4.a("block_states", (vu)z.encodeStart(vl.a, $$5.h()).getOrThrow());
            $$4.a("biomes", (vu)$$2.encodeStart(vl.a, $$5.i()).getOrThrow());
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

      vd $$6 = new vd();
      $$6.addAll(this.x);
      $$0.a("block_entities", $$6);
      if (this.m.d() == ean.a) {
         vd $$7 = new vd();
         $$7.addAll(this.w);
         $$0.a("entities", $$7);
         if (this.q != null) {
            $$0.a("carving_mask", this.q);
         }
      }

      a($$0, this.s);
      $$0.a("PostProcessing", a(this.t));
      ux $$8 = new ux();
      this.r.forEach(($$1x, $$2x) -> $$8.a($$1x.a(), new ve($$2x)));
      $$0.a("Heightmaps", $$8);
      $$0.a("structures", this.y);
      return $$0;
   }

   private static void a(ux $$0, dzi.a $$1) {
      vd $$2 = new vd();

      for (fdj<dke> $$3 : $$1.a()) {
         $$2.add($$3.a($$0x -> ma.e.b($$0x).toString()));
      }

      $$0.a("block_ticks", $$2);
      vd $$4 = new vd();

      for (fdj<eto> $$5 : $$1.b()) {
         $$4.add($$5.a($$0x -> ma.c.b($$0x).toString()));
      }

      $$0.a("fluid_ticks", $$4);
   }

   public static ean a(@Nullable ux $$0) {
      return $$0 != null ? eaj.a($$0.l("Status")).d() : ean.a;
   }

   @Nullable
   private static dzs.c a(ash $$0, List<ux> $$1, List<ux> $$2) {
      return $$1.isEmpty() && $$2.isEmpty() ? null : $$3 -> {
         if (!$$1.isEmpty()) {
            $$0.a(bvm.a($$1, $$0, bvl.r));
         }

         for (ux $$4 : $$2) {
            boolean $$5 = $$4.q("keepPacked");
            if ($$5) {
               $$3.a($$4);
            } else {
               jh $$6 = dup.b($$4);
               dup $$7 = dup.a($$6, $$3.a_($$6), $$4, $$0.K_());
               if ($$7 != null) {
                  $$3.a($$7);
               }
            }
         }
      };
   }

   private static ux a(eos $$0, dgg $$1, Map<eoc, eok> $$2, Map<eoc, LongSet> $$3) {
      ux $$4 = new ux();
      ux $$5 = new ux();
      kd<eoc> $$6 = $$0.b().e(mb.aT);

      for (Entry<eoc, eok> $$7 : $$2.entrySet()) {
         alz $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      ux $$9 = new ux();

      for (Entry<eoc, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            alz $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new ve($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<eoc, eok> a(eos $$0, ux $$1, long $$2) {
      Map<eoc, eok> $$3 = Maps.newHashMap();
      kd<eoc> $$4 = $$0.b().e(mb.aT);
      ux $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         alz $$7 = alz.c($$6);
         eoc $$8 = $$4.a($$7);
         if ($$8 == null) {
            A.error("Unknown structure start: {}", $$7);
         } else {
            eok $$9 = eok.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<eoc, LongSet> a(ke $$0, dgg $$1, ux $$2) {
      Map<eoc, LongSet> $$3 = Maps.newHashMap();
      kd<eoc> $$4 = $$0.e(mb.aT);
      ux $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         alz $$7 = alz.c($$6);
         eoc $$8 = $$4.a($$7);
         if ($$8 == null) {
            A.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  dgg $$3x = new dgg($$2x);
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

   private static vd a(ShortList[] $$0) {
      vd $$1 = new vd();

      for (ShortList $$2 : $$0) {
         vd $$3 = new vd();
         if ($$2 != null) {
            for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
               $$3.add(vp.a($$2.getShort($$4)));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }

   public kd<dic> b() {
      return this.h;
   }

   public dgg c() {
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

   public eaj g() {
      return this.m;
   }

   @Nullable
   public eel.d h() {
      return this.n;
   }

   @Nullable
   public ecw i() {
      return this.o;
   }

   public eaf j() {
      return this.p;
   }

   @Nullable
   public long[] k() {
      return this.q;
   }

   public Map<edi.a, long[]> l() {
      return this.r;
   }

   public dzi.a m() {
      return this.s;
   }

   public ShortList[] n() {
      return this.t;
   }

   public boolean o() {
      return this.u;
   }

   public List<ebd.b> p() {
      return this.v;
   }

   public List<ux> q() {
      return this.w;
   }

   public List<ux> r() {
      return this.x;
   }

   public ux s() {
      return this.y;
   }

   public static class a extends vi {
      public a(String $$0) {
         super($$0);
      }
   }

   public static record b(int a, @Nullable dzt b, @Nullable dzn c, @Nullable dzn d) {
   }
}
