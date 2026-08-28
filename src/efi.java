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
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public record efi(
   jt<dlm> h,
   djo i,
   int j,
   long k,
   long l,
   eeo m,
   @Nullable eis.d n,
   @Nullable ehd o,
   eek p,
   @Nullable long[] q,
   Map<ehp.a, long[]> r,
   edn.a s,
   ShortList[] t,
   boolean u,
   List<efi.b> v,
   List<ua> w,
   List<ua> x,
   ua y
) {
   private static final Codec<eef<ebq>> z = eef.a(dno.k, ebq.a, eef.d.d, dnq.a.m());
   private static final Codec<List<fht<dno>>> A = fht.a(mh.e.q()).listOf();
   private static final Codec<List<fht<exz>>> B = fht.a(mh.c.q()).listOf();
   private static final Logger C = LogUtils.getLogger();
   private static final String D = "UpgradeData";
   private static final String E = "block_ticks";
   private static final String F = "fluid_ticks";
   public static final String a = "xPos";
   public static final String b = "zPos";
   public static final String c = "Heightmaps";
   public static final String d = "isLightOn";
   public static final String e = "sections";
   public static final String f = "BlockLight";
   public static final String g = "SkyLight";

   @Nullable
   public static efi a(dkl $$0, ju $$1, ua $$2) {
      if ($$2.i("Status").isEmpty()) {
         return null;
      } else {
         djo $$3 = new djo($$2.b("xPos", 0), $$2.b("zPos", 0));
         long $$4 = $$2.b("LastUpdate", 0L);
         long $$5 = $$2.b("InhabitedTime", 0L);
         eeo $$6 = $$2.<eeo>a("Status", eeo.o).orElse(eeo.c);
         eek $$7 = $$2.m("UpgradeData").map($$1x -> new eek($$1x, $$0)).orElse(eek.a);
         boolean $$8 = $$2.b("isLightOn", false);
         eis.d $$9 = $$2.<eis.d>a("blending_data", eis.d.a).orElse(null);
         ehd $$10 = $$2.<ehd>a("below_zero_retrogen", ehd.a).orElse(null);
         long[] $$11 = $$2.l("carving_mask").orElse(null);
         Map<ehp.a, long[]> $$12 = new EnumMap<>(ehp.a.class);
         $$2.m("Heightmaps").ifPresent($$2x -> {
            for (ehp.a $$3x : $$6.e()) {
               $$2x.l($$3x.a()).ifPresent($$2xx -> $$12.put($$3x, $$2xx));
            }
         });
         List<fht<dno>> $$13 = fht.a($$2.<List<fht<dno>>>a("block_ticks", A).orElse(List.of()), $$3);
         List<fht<exz>> $$14 = fht.a($$2.<List<fht<exz>>>a("fluid_ticks", B).orElse(List.of()), $$3);
         edn.a $$15 = new edn.a($$13, $$14);
         ug $$16 = $$2.p("PostProcessing");
         ShortList[] $$17 = new ShortList[$$16.size()];

         for (int $$18 = 0; $$18 < $$16.size(); $$18++) {
            ug $$19 = $$16.f($$18);
            ShortList $$20 = new ShortArrayList($$19.size());

            for (int $$21 = 0; $$21 < $$19.size(); $$21++) {
               $$20.add($$19.a($$21, (short)0));
            }

            $$17[$$18] = $$20;
         }

         List<ua> $$22 = $$2.o("entities").stream().flatMap(ug::j).toList();
         List<ua> $$23 = $$2.o("block_entities").stream().flatMap(ug::j).toList();
         ua $$24 = $$2.n("structures");
         ug $$25 = $$2.p("sections");
         List<efi.b> $$26 = new ArrayList<>($$25.size());
         jt<dlm> $$27 = $$1.f(mi.aG);
         Codec<eeg<jg<dlm>>> $$28 = a($$27);

         for (int $$29 = 0; $$29 < $$25.size(); $$29++) {
            Optional<ua> $$30 = $$25.a($$29);
            if (!$$30.isEmpty()) {
               ua $$31 = $$30.get();
               int $$32 = $$31.b("Y", (byte)0);
               edy $$35;
               if ($$32 >= $$0.aq() && $$32 <= $$0.ar()) {
                  eef<ebq> $$33 = $$31.m("block_states")
                     .map($$2x -> (eef<ebq>)z.parse(uo.a, $$2x).promotePartial($$2xx -> a($$3, $$32, $$2xx)).getOrThrow(efi.a::new))
                     .orElseGet(() -> new eef<>(dno.k, dnq.a.m(), eef.d.d));
                  eeg<jg<dlm>> $$34 = $$31.m("biomes")
                     .map($$3x -> (eeg<jg<dlm>>)$$28.parse(uo.a, $$3x).promotePartial($$2xx -> a($$3, $$32, $$2xx)).getOrThrow(efi.a::new))
                     .orElseGet(() -> new eef<>($$27.t(), $$27.b(dlt.b), eef.d.e));
                  $$35 = new edy($$33, $$34);
               } else {
                  $$35 = null;
               }

               eds $$37 = $$31.j("BlockLight").map(eds::new).orElse(null);
               eds $$38 = $$31.j("SkyLight").map(eds::new).orElse(null);
               $$26.add(new efi.b($$32, $$35, $$37, $$38));
            }
         }

         return new efi($$27, $$3, $$0.aq(), $$4, $$5, $$6, $$9, $$10, $$7, $$11, $$12, $$15, $$17, $$8, $$26, $$22, $$23, $$24);
      }
   }

   public eeh a(asb $$0, cjh $$1, efg $$2, djo $$3) {
      if (!Objects.equals($$3, this.i)) {
         C.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$3, $$3, this.i});
         $$0.p().a(this.i, $$3, $$2);
      }

      int $$4 = $$0.ap();
      edy[] $$5 = new edy[$$4];
      boolean $$6 = $$0.F_().g();
      edr $$7 = $$0.m();
      exp $$8 = $$7.q();
      jt<dlm> $$9 = $$0.J_().f(mi.aG);
      boolean $$10 = false;

      for (efi.b $$11 : this.v) {
         jz $$12 = jz.a($$3, $$11.a);
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
               $$8.a(dks.b, $$12, $$11.c);
            }

            if ($$14) {
               $$8.a(dks.a, $$12, $$11.d);
            }
         }
      }

      ees $$15 = this.m.d();
      edn $$18;
      if ($$15 == ees.b) {
         fhp<dno> $$16 = new fhp<>(this.s.a());
         fhp<exz> $$17 = new fhp<>(this.s.b());
         $$18 = new edx($$0.a(), $$3, this.p, $$16, $$17, this.l, $$5, a($$0, this.w, this.x), eis.a(this.n));
      } else {
         fhs<dno> $$19 = fhs.a(this.s.a());
         fhs<exz> $$20 = fhs.a(this.s.b());
         eeh $$21 = new eeh($$3, this.p, $$5, $$19, $$20, $$0, $$9, eis.a(this.n));
         $$18 = $$21;
         $$21.c(this.l);
         if (this.o != null) {
            $$21.a(this.o);
         }

         $$21.a(this.m);
         if (this.m.a(eeo.k)) {
            $$21.a($$8);
         }
      }

      $$18.a(this.u);
      EnumSet<ehp.a> $$23 = EnumSet.noneOf(ehp.a.class);

      for (ehp.a $$24 : $$18.n().e()) {
         long[] $$25 = this.r.get($$24);
         if ($$25 != null) {
            $$18.a($$24, $$25);
         } else {
            $$23.add($$24);
         }
      }

      ehp.a($$18, $$23);
      $$18.a(a(etd.a($$0), this.y, $$0.E()));
      $$18.b(a($$0.J_(), $$3, this.y));

      for (int $$26 = 0; $$26 < this.t.length; $$26++) {
         $$18.a(this.t[$$26], $$26);
      }

      if ($$15 == ees.b) {
         return new edw((edx)$$18, false);
      } else {
         eeh $$27 = (eeh)$$18;

         for (ua $$28 : this.w) {
            $$27.b($$28);
         }

         for (ua $$29 : this.x) {
            $$27.a($$29);
         }

         if (this.q != null) {
            $$27.a(new edm(this.q, $$18.K_()));
         }

         return $$27;
      }
   }

   private static void a(djo $$0, int $$1, String $$2) {
      C.error("Recoverable errors when loading section [{}, {}, {}]: {}", new Object[]{$$0.h, $$1, $$0.i, $$2});
   }

   private static Codec<eeg<jg<dlm>>> a(jt<dlm> $$0) {
      return eef.b($$0.t(), $$0.r(), eef.d.e, $$0.b(dlt.b));
   }

   public static efi a(asb $$0, edn $$1) {
      if (!$$1.s()) {
         throw new IllegalArgumentException("Chunk can't be serialized: " + $$1);
      } else {
         djo $$2 = $$1.f();
         List<efi.b> $$3 = new ArrayList<>();
         edy[] $$4 = $$1.d();
         exp $$5 = $$0.m().a();

         for (int $$6 = $$5.d(); $$6 < $$5.e(); $$6++) {
            int $$7 = $$1.g($$6);
            boolean $$8 = $$7 >= 0 && $$7 < $$4.length;
            eds $$9 = $$5.a(dks.b).a(jz.a($$2, $$6));
            eds $$10 = $$5.a(dks.a).a(jz.a($$2, $$6));
            eds $$11 = $$9 != null && !$$9.d() ? $$9.b() : null;
            eds $$12 = $$10 != null && !$$10.d() ? $$10.b() : null;
            if ($$8 || $$11 != null || $$12 != null) {
               edy $$13 = $$8 ? $$4[$$7].k() : null;
               $$3.add(new efi.b($$6, $$13, $$11, $$12));
            }
         }

         List<ua> $$14 = new ArrayList<>($$1.c().size());

         for (iw $$15 : $$1.c()) {
            ua $$16 = $$1.a($$15, $$0.J_());
            if ($$16 != null) {
               $$14.add($$16);
            }
         }

         List<ua> $$17 = new ArrayList<>();
         long[] $$18 = null;
         if ($$1.n().d() == ees.a) {
            eeh $$19 = (eeh)$$1;
            $$17.addAll($$19.I());
            edm $$20 = $$19.E();
            if ($$20 != null) {
               $$18 = $$20.a();
            }
         }

         Map<ehp.a, long[]> $$21 = new EnumMap<>(ehp.a.class);

         for (Entry<ehp.a, ehp> $$22 : $$1.e()) {
            if ($$1.n().e().contains($$22.getKey())) {
               long[] $$23 = $$22.getValue().a();
               $$21.put($$22.getKey(), (long[])$$23.clone());
            }
         }

         edn.a $$24 = $$1.a($$0.ae());
         ShortList[] $$25 = Arrays.stream($$1.p()).map($$0x -> $$0x != null ? new ShortArrayList($$0x) : null).toArray(ShortList[]::new);
         ua $$26 = a(etd.a($$0), $$2, $$1.g(), $$1.h());
         return new efi(
            $$0.J_().f(mi.aG),
            $$2,
            $$1.aq(),
            $$0.ae(),
            $$1.w(),
            $$1.n(),
            y.a($$1.v(), eis::a),
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

   public ua a() {
      ua $$0 = up.e(new ua());
      $$0.a("xPos", this.i.h);
      $$0.a("yPos", this.j);
      $$0.a("zPos", this.i.i);
      $$0.a("LastUpdate", this.k);
      $$0.a("InhabitedTime", this.l);
      $$0.a("Status", mh.l.b(this.m).toString());
      $$0.b("blending_data", eis.d.a, this.n);
      $$0.b("below_zero_retrogen", ehd.a, this.o);
      if (!this.p.a()) {
         $$0.a("UpgradeData", this.p.b());
      }

      ug $$1 = new ug();
      Codec<eeg<jg<dlm>>> $$2 = a(this.h);

      for (efi.b $$3 : this.v) {
         ua $$4 = new ua();
         edy $$5 = $$3.b;
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

         if (!$$4.j()) {
            $$4.a("Y", (byte)$$3.a);
            $$1.add($$4);
         }
      }

      $$0.a("sections", $$1);
      if (this.u) {
         $$0.a("isLightOn", true);
      }

      ug $$6 = new ug();
      $$6.addAll(this.x);
      $$0.a("block_entities", $$6);
      if (this.m.d() == ees.a) {
         ug $$7 = new ug();
         $$7.addAll(this.w);
         $$0.a("entities", $$7);
         if (this.q != null) {
            $$0.a("carving_mask", this.q);
         }
      }

      a($$0, this.s);
      $$0.a("PostProcessing", a(this.t));
      ua $$8 = new ua();
      this.r.forEach(($$1x, $$2x) -> $$8.a($$1x.a(), new uh($$2x)));
      $$0.a("Heightmaps", $$8);
      $$0.a("structures", this.y);
      return $$0;
   }

   private static void a(ua $$0, edn.a $$1) {
      $$0.a("block_ticks", A, $$1.a());
      $$0.a("fluid_ticks", B, $$1.b());
   }

   public static eeo a(@Nullable ua $$0) {
      return $$0 != null ? $$0.<eeo>a("Status", eeo.o).orElse(eeo.c) : eeo.c;
   }

   @Nullable
   private static edx.c a(asb $$0, List<ua> $$1, List<ua> $$2) {
      return $$1.isEmpty() && $$2.isEmpty() ? null : $$3 -> {
         if (!$$1.isEmpty()) {
            $$0.a(bxn.a($$1, $$0, bxm.r));
         }

         for (ua $$4 : $$2) {
            boolean $$5 = $$4.b("keepPacked", false);
            if ($$5) {
               $$3.a($$4);
            } else {
               iw $$6 = dyo.a($$3.f(), $$4);
               dyo $$7 = dyo.a($$6, $$3.a_($$6), $$4, $$0.J_());
               if ($$7 != null) {
                  $$3.a($$7);
               }
            }
         }
      };
   }

   private static ua a(etd $$0, djo $$1, Map<esn, esv> $$2, Map<esn, LongSet> $$3) {
      ua $$4 = new ua();
      ua $$5 = new ua();
      jt<esn> $$6 = $$0.b().f(mi.be);

      for (Entry<esn, esv> $$7 : $$2.entrySet()) {
         alr $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      ua $$9 = new ua();

      for (Entry<esn, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            alr $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), $$10.getValue().toLongArray());
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<esn, esv> a(etd $$0, ua $$1, long $$2) {
      Map<esn, esv> $$3 = Maps.newHashMap();
      jt<esn> $$4 = $$0.b().f(mi.be);
      ua $$5 = $$1.n("starts");

      for (String $$6 : $$5.e()) {
         alr $$7 = alr.c($$6);
         esn $$8 = $$4.a($$7);
         if ($$8 == null) {
            C.error("Unknown structure start: {}", $$7);
         } else {
            esv $$9 = esv.a($$0, $$5.n($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<esn, LongSet> a(ju $$0, djo $$1, ua $$2) {
      Map<esn, LongSet> $$3 = Maps.newHashMap();
      jt<esn> $$4 = $$0.f(mi.be);
      ua $$5 = $$2.n("References");
      $$5.a((BiConsumer<String, va>)(($$3x, $$4x) -> {
         alr $$5x = alr.c($$3x);
         esn $$6 = $$4.a($$5x);
         if ($$6 == null) {
            C.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$5x, $$1);
         } else {
            Optional<long[]> $$7 = $$4x.r_();
            if (!$$7.isEmpty()) {
               $$3.put($$6, new LongOpenHashSet(Arrays.stream($$7.get()).filter($$2xx -> {
                  djo $$3xx = new djo($$2xx);
                  if ($$3xx.a($$1) > 8) {
                     C.warn("Found invalid structure reference [ {} @ {} ] for chunk {}.", new Object[]{$$5x, $$3xx, $$1});
                     return false;
                  } else {
                     return true;
                  }
               }).toArray()));
            }
         }
      }));
      return $$3;
   }

   private static ug a(ShortList[] $$0) {
      ug $$1 = new ug();

      for (ShortList $$2 : $$0) {
         ug $$3 = new ug();
         if ($$2 != null) {
            for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
               $$3.add(ut.a($$2.getShort($$4)));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }

   public jt<dlm> b() {
      return this.h;
   }

   public djo c() {
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

   public eeo g() {
      return this.m;
   }

   @Nullable
   public eis.d h() {
      return this.n;
   }

   @Nullable
   public ehd i() {
      return this.o;
   }

   public eek j() {
      return this.p;
   }

   @Nullable
   public long[] k() {
      return this.q;
   }

   public Map<ehp.a, long[]> l() {
      return this.r;
   }

   public edn.a m() {
      return this.s;
   }

   public ShortList[] n() {
      return this.t;
   }

   public boolean o() {
      return this.u;
   }

   public List<efi.b> p() {
      return this.v;
   }

   public List<ua> q() {
      return this.w;
   }

   public List<ua> r() {
      return this.x;
   }

   public ua s() {
      return this.y;
   }

   public static class a extends ul {
      public a(String $$0) {
         super($$0);
      }
   }

   public static record b(int a, @Nullable edy b, @Nullable eds c, @Nullable eds d) {
   }
}
