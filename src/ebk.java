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

public record ebk(
   kd<dij> h,
   dgn i,
   int j,
   long k,
   long l,
   eaq m,
   @Nullable ees.d n,
   @Nullable edd o,
   eam p,
   @Nullable long[] q,
   Map<edp.a, long[]> r,
   dzp.a s,
   ShortList[] t,
   boolean u,
   List<ebk.b> v,
   List<ux> w,
   List<ux> x,
   ux y
) {
   private static final Codec<eah<dxu>> z = eah.a(dkl.q, dxu.a, eah.d.d, dkn.a.m());
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
   public static ebk a(dhj $$0, ke $$1, ux $$2) {
      if (!$$2.b("Status", 8)) {
         return null;
      } else {
         dgn $$3 = new dgn($$2.h("xPos"), $$2.h("zPos"));
         long $$4 = $$2.i("LastUpdate");
         long $$5 = $$2.i("InhabitedTime");
         eaq $$6 = eaq.a($$2.l("Status"));
         eam $$7 = $$2.b("UpgradeData", 10) ? new eam($$2.p("UpgradeData"), $$0) : eam.a;
         boolean $$8 = $$2.q("isLightOn");
         ees.d $$9;
         if ($$2.b("blending_data", 10)) {
            $$9 = (ees.d)ees.d.a.parse(vl.a, $$2.p("blending_data")).resultOrPartial(A::error).orElse(null);
         } else {
            $$9 = null;
         }

         edd $$11;
         if ($$2.b("below_zero_retrogen", 10)) {
            $$11 = (edd)edd.a.parse(vl.a, $$2.p("below_zero_retrogen")).resultOrPartial(A::error).orElse(null);
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
         Map<edp.a, long[]> $$16 = new EnumMap<>(edp.a.class);

         for (edp.a $$17 : $$6.e()) {
            String $$18 = $$17.a();
            if ($$15.b($$18, 12)) {
               $$16.put($$17, $$15.o($$18));
            }
         }

         List<fdo<dkl>> $$19 = fdo.a($$2.c("block_ticks", 10), $$0x -> ma.e.b(alz.c($$0x)), $$3);
         List<fdo<etv>> $$20 = fdo.a($$2.c("fluid_ticks", 10), $$0x -> ma.c.b(alz.c($$0x)), $$3);
         dzp.a $$21 = new dzp.a($$19, $$20);
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
         List<ebk.b> $$32 = new ArrayList<>($$31.size());
         kd<dij> $$33 = $$1.e(mb.aI);
         Codec<eai<jq<dij>>> $$34 = a($$33);

         for (int $$35 = 0; $$35 < $$31.size(); $$35++) {
            ux $$36 = $$31.a($$35);
            int $$37 = $$36.f("Y");
            eaa $$42;
            if ($$37 >= $$0.ao() && $$37 <= $$0.ap()) {
               eah<dxu> $$38;
               if ($$36.b("block_states", 10)) {
                  $$38 = (eah<dxu>)z.parse(vl.a, $$36.p("block_states")).promotePartial($$2x -> a($$3, $$37, $$2x)).getOrThrow(ebk.a::new);
               } else {
                  $$38 = new eah<>(dkl.q, dkn.a.m(), eah.d.d);
               }

               eai<jq<dij>> $$40;
               if ($$36.b("biomes", 10)) {
                  $$40 = (eai<jq<dij>>)$$34.parse(vl.a, $$36.p("biomes")).promotePartial($$2x -> a($$3, $$37, $$2x)).getOrThrow(ebk.a::new);
               } else {
                  $$40 = new eah<>($$33.t(), $$33.b(diq.b), eah.d.e);
               }

               $$42 = new eaa($$38, $$40);
            } else {
               $$42 = null;
            }

            dzu $$44 = $$36.b("BlockLight", 7) ? new dzu($$36.m("BlockLight")) : null;
            dzu $$45 = $$36.b("SkyLight", 7) ? new dzu($$36.m("SkyLight")) : null;
            $$32.add(new ebk.b($$37, $$42, $$44, $$45));
         }

         return new ebk($$33, $$3, $$0.ao(), $$4, $$5, $$6, $$9, $$11, $$7, $$13, $$16, $$21, $$23, $$8, $$32, $$28, $$29, $$30);
      }
   }

   public eaj a(ash $$0, chj $$1, ebi $$2, dgn $$3) {
      if (!Objects.equals($$3, this.i)) {
         A.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$3, $$3, this.i});
         $$0.p().a(this.i, $$3, $$2);
      }

      int $$4 = $$0.an();
      eaa[] $$5 = new eaa[$$4];
      boolean $$6 = $$0.G_().g();
      dzt $$7 = $$0.m();
      etl $$8 = $$7.p();
      kd<dij> $$9 = $$0.K_().e(mb.aI);
      boolean $$10 = false;

      for (ebk.b $$11 : this.v) {
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
               $$8.a(dhq.b, $$12, $$11.c);
            }

            if ($$14) {
               $$8.a(dhq.a, $$12, $$11.d);
            }
         }
      }

      eau $$15 = this.m.d();
      dzp $$18;
      if ($$15 == eau.b) {
         fdk<dkl> $$16 = new fdk<>(this.s.a());
         fdk<etv> $$17 = new fdk<>(this.s.b());
         $$18 = new dzz($$0.a(), $$3, this.p, $$16, $$17, this.l, $$5, a($$0, this.w, this.x), ees.a(this.n));
      } else {
         fdn<dkl> $$19 = fdn.a(this.s.a());
         fdn<etv> $$20 = fdn.a(this.s.b());
         eaj $$21 = new eaj($$3, this.p, $$5, $$19, $$20, $$0, $$9, ees.a(this.n));
         $$18 = $$21;
         $$21.c(this.l);
         if (this.o != null) {
            $$21.a(this.o);
         }

         $$21.a(this.m);
         if (this.m.a(eaq.k)) {
            $$21.a($$8);
         }
      }

      $$18.a(this.u);
      EnumSet<edp.a> $$23 = EnumSet.noneOf(edp.a.class);

      for (edp.a $$24 : $$18.n().e()) {
         long[] $$25 = this.r.get($$24);
         if ($$25 != null) {
            $$18.a($$24, $$25);
         } else {
            $$23.add($$24);
         }
      }

      edp.a($$18, $$23);
      $$18.a(a(eoz.a($$0), this.y, $$0.D()));
      $$18.b(a($$0.K_(), $$3, this.y));

      for (int $$26 = 0; $$26 < this.t.length; $$26++) {
         $$18.a(this.t[$$26], $$26);
      }

      if ($$15 == eau.b) {
         return new dzy((dzz)$$18, false);
      } else {
         eaj $$27 = (eaj)$$18;

         for (ux $$28 : this.w) {
            $$27.b($$28);
         }

         for (ux $$29 : this.x) {
            $$27.a($$29);
         }

         if (this.q != null) {
            $$27.a(new dzo(this.q, $$18.L_()));
         }

         return $$27;
      }
   }

   private static void a(dgn $$0, int $$1, String $$2) {
      A.error("Recoverable errors when loading section [{}, {}, {}]: {}", new Object[]{$$0.g, $$1, $$0.h, $$2});
   }

   private static Codec<eai<jq<dij>>> a(kd<dij> $$0) {
      return eah.b($$0.t(), $$0.r(), eah.d.e, $$0.b(diq.b));
   }

   public static ebk a(ash $$0, dzp $$1) {
      if (!$$1.s()) {
         throw new IllegalArgumentException("Chunk can't be serialized: " + $$1);
      } else {
         dgn $$2 = $$1.f();
         List<ebk.b> $$3 = new ArrayList<>();
         eaa[] $$4 = $$1.d();
         etl $$5 = $$0.m().a();

         for (int $$6 = $$5.d(); $$6 < $$5.e(); $$6++) {
            int $$7 = $$1.g($$6);
            boolean $$8 = $$7 >= 0 && $$7 < $$4.length;
            dzu $$9 = $$5.a(dhq.b).a(kj.a($$2, $$6));
            dzu $$10 = $$5.a(dhq.a).a(kj.a($$2, $$6));
            dzu $$11 = $$9 != null && !$$9.d() ? $$9.b() : null;
            dzu $$12 = $$10 != null && !$$10.d() ? $$10.b() : null;
            if ($$8 || $$11 != null || $$12 != null) {
               eaa $$13 = $$8 ? $$4[$$7].k() : null;
               $$3.add(new ebk.b($$6, $$13, $$11, $$12));
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
         if ($$1.n().d() == eau.a) {
            eaj $$19 = (eaj)$$1;
            $$17.addAll($$19.I());
            dzo $$20 = $$19.E();
            if ($$20 != null) {
               $$18 = $$20.a();
            }
         }

         Map<edp.a, long[]> $$21 = new EnumMap<>(edp.a.class);

         for (Entry<edp.a, edp> $$22 : $$1.e()) {
            if ($$1.n().e().contains($$22.getKey())) {
               long[] $$23 = $$22.getValue().a();
               $$21.put($$22.getKey(), (long[])$$23.clone());
            }
         }

         dzp.a $$24 = $$1.a($$0.ac());
         ShortList[] $$25 = Arrays.stream($$1.p()).map($$0x -> $$0x != null ? new ShortArrayList($$0x) : null).toArray(ShortList[]::new);
         ux $$26 = a(eoz.a($$0), $$2, $$1.g(), $$1.h());
         return new ebk(
            $$0.K_().e(mb.aI),
            $$2,
            $$1.ao(),
            $$0.ac(),
            $$1.w(),
            $$1.n(),
            x.a($$1.v(), ees::a),
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

   public ux a() {
      ux $$0 = vm.e(new ux());
      $$0.a("xPos", this.i.g);
      $$0.a("yPos", this.j);
      $$0.a("zPos", this.i.h);
      $$0.a("LastUpdate", this.k);
      $$0.a("InhabitedTime", this.l);
      $$0.a("Status", ma.l.b(this.m).toString());
      if (this.n != null) {
         ees.d.a.encodeStart(vl.a, this.n).resultOrPartial(A::error).ifPresent($$1x -> $$0.a("blending_data", $$1x));
      }

      if (this.o != null) {
         edd.a.encodeStart(vl.a, this.o).resultOrPartial(A::error).ifPresent($$1x -> $$0.a("below_zero_retrogen", $$1x));
      }

      if (!this.p.a()) {
         $$0.a("UpgradeData", this.p.b());
      }

      vd $$1 = new vd();
      Codec<eai<jq<dij>>> $$2 = a(this.h);

      for (ebk.b $$3 : this.v) {
         ux $$4 = new ux();
         eaa $$5 = $$3.b;
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
      if (this.m.d() == eau.a) {
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

   private static void a(ux $$0, dzp.a $$1) {
      vd $$2 = new vd();

      for (fdo<dkl> $$3 : $$1.a()) {
         $$2.add($$3.a($$0x -> ma.e.b($$0x).toString()));
      }

      $$0.a("block_ticks", $$2);
      vd $$4 = new vd();

      for (fdo<etv> $$5 : $$1.b()) {
         $$4.add($$5.a($$0x -> ma.c.b($$0x).toString()));
      }

      $$0.a("fluid_ticks", $$4);
   }

   public static eau a(@Nullable ux $$0) {
      return $$0 != null ? eaq.a($$0.l("Status")).d() : eau.a;
   }

   @Nullable
   private static dzz.c a(ash $$0, List<ux> $$1, List<ux> $$2) {
      return $$1.isEmpty() && $$2.isEmpty() ? null : $$3 -> {
         if (!$$1.isEmpty()) {
            $$0.a(bvq.a($$1, $$0, bvp.r));
         }

         for (ux $$4 : $$2) {
            boolean $$5 = $$4.q("keepPacked");
            if ($$5) {
               $$3.a($$4);
            } else {
               jh $$6 = duw.b($$4);
               duw $$7 = duw.a($$6, $$3.a_($$6), $$4, $$0.K_());
               if ($$7 != null) {
                  $$3.a($$7);
               }
            }
         }
      };
   }

   private static ux a(eoz $$0, dgn $$1, Map<eoj, eor> $$2, Map<eoj, LongSet> $$3) {
      ux $$4 = new ux();
      ux $$5 = new ux();
      kd<eoj> $$6 = $$0.b().e(mb.aU);

      for (Entry<eoj, eor> $$7 : $$2.entrySet()) {
         alz $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      ux $$9 = new ux();

      for (Entry<eoj, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            alz $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new ve($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<eoj, eor> a(eoz $$0, ux $$1, long $$2) {
      Map<eoj, eor> $$3 = Maps.newHashMap();
      kd<eoj> $$4 = $$0.b().e(mb.aU);
      ux $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         alz $$7 = alz.c($$6);
         eoj $$8 = $$4.a($$7);
         if ($$8 == null) {
            A.error("Unknown structure start: {}", $$7);
         } else {
            eor $$9 = eor.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<eoj, LongSet> a(ke $$0, dgn $$1, ux $$2) {
      Map<eoj, LongSet> $$3 = Maps.newHashMap();
      kd<eoj> $$4 = $$0.e(mb.aU);
      ux $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         alz $$7 = alz.c($$6);
         eoj $$8 = $$4.a($$7);
         if ($$8 == null) {
            A.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  dgn $$3x = new dgn($$2x);
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

   public kd<dij> b() {
      return this.h;
   }

   public dgn c() {
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

   public eaq g() {
      return this.m;
   }

   @Nullable
   public ees.d h() {
      return this.n;
   }

   @Nullable
   public edd i() {
      return this.o;
   }

   public eam j() {
      return this.p;
   }

   @Nullable
   public long[] k() {
      return this.q;
   }

   public Map<edp.a, long[]> l() {
      return this.r;
   }

   public dzp.a m() {
      return this.s;
   }

   public ShortList[] n() {
      return this.t;
   }

   public boolean o() {
      return this.u;
   }

   public List<ebk.b> p() {
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

   public static record b(int a, @Nullable eaa b, @Nullable dzu c, @Nullable dzu d) {
   }
}
