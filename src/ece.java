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

public record ece(
   kf<dis> h,
   dgw i,
   int j,
   long k,
   long l,
   ebk m,
   @Nullable efo.d n,
   @Nullable edz o,
   ebg p,
   @Nullable long[] q,
   Map<eel.a, long[]> r,
   eaj.a s,
   ShortList[] t,
   boolean u,
   List<ece.b> v,
   List<tw> w,
   List<tw> x,
   tw y
) {
   private static final Codec<ebb<dym>> z = ebb.a(dku.k, dym.a, ebb.d.d, dkw.a.m());
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
   public static ece a(dhr $$0, kg $$1, tw $$2) {
      if (!$$2.b("Status", 8)) {
         return null;
      } else {
         dgw $$3 = new dgw($$2.h("xPos"), $$2.h("zPos"));
         long $$4 = $$2.i("LastUpdate");
         long $$5 = $$2.i("InhabitedTime");
         ebk $$6 = ebk.a($$2.l("Status"));
         ebg $$7 = $$2.b("UpgradeData", 10) ? new ebg($$2.p("UpgradeData"), $$0) : ebg.a;
         boolean $$8 = $$2.q("isLightOn");
         efo.d $$9;
         if ($$2.b("blending_data", 10)) {
            $$9 = (efo.d)efo.d.a.parse(uk.a, $$2.p("blending_data")).resultOrPartial(A::error).orElse(null);
         } else {
            $$9 = null;
         }

         edz $$11;
         if ($$2.b("below_zero_retrogen", 10)) {
            $$11 = (edz)edz.a.parse(uk.a, $$2.p("below_zero_retrogen")).resultOrPartial(A::error).orElse(null);
         } else {
            $$11 = null;
         }

         long[] $$13;
         if ($$2.b("carving_mask", 12)) {
            $$13 = $$2.o("carving_mask");
         } else {
            $$13 = null;
         }

         tw $$15 = $$2.p("Heightmaps");
         Map<eel.a, long[]> $$16 = new EnumMap<>(eel.a.class);

         for (eel.a $$17 : $$6.e()) {
            String $$18 = $$17.a();
            if ($$15.b($$18, 12)) {
               $$16.put($$17, $$15.o($$18));
            }
         }

         List<fel<dku>> $$19 = fel.a($$2.c("block_ticks", 10), $$0x -> md.e.b(ald.c($$0x)), $$3);
         List<fel<eus>> $$20 = fel.a($$2.c("fluid_ticks", 10), $$0x -> md.c.b(ald.c($$0x)), $$3);
         eaj.a $$21 = new eaj.a($$19, $$20);
         uc $$22 = $$2.c("PostProcessing", 9);
         ShortList[] $$23 = new ShortList[$$22.size()];

         for (int $$24 = 0; $$24 < $$22.size(); $$24++) {
            uc $$25 = $$22.b($$24);
            ShortList $$26 = new ShortArrayList($$25.size());

            for (int $$27 = 0; $$27 < $$25.size(); $$27++) {
               $$26.add($$25.d($$27));
            }

            $$23[$$24] = $$26;
         }

         List<tw> $$28 = Lists.transform($$2.c("entities", 10), $$0x -> (tw)$$0x);
         List<tw> $$29 = Lists.transform($$2.c("block_entities", 10), $$0x -> (tw)$$0x);
         tw $$30 = $$2.p("structures");
         uc $$31 = $$2.c("sections", 10);
         List<ece.b> $$32 = new ArrayList<>($$31.size());
         kf<dis> $$33 = $$1.f(me.aM);
         Codec<ebc<js<dis>>> $$34 = a($$33);

         for (int $$35 = 0; $$35 < $$31.size(); $$35++) {
            tw $$36 = $$31.a($$35);
            int $$37 = $$36.f("Y");
            eau $$42;
            if ($$37 >= $$0.aq() && $$37 <= $$0.ar()) {
               ebb<dym> $$38;
               if ($$36.b("block_states", 10)) {
                  $$38 = (ebb<dym>)z.parse(uk.a, $$36.p("block_states")).promotePartial($$2x -> a($$3, $$37, $$2x)).getOrThrow(ece.a::new);
               } else {
                  $$38 = new ebb<>(dku.k, dkw.a.m(), ebb.d.d);
               }

               ebc<js<dis>> $$40;
               if ($$36.b("biomes", 10)) {
                  $$40 = (ebc<js<dis>>)$$34.parse(uk.a, $$36.p("biomes")).promotePartial($$2x -> a($$3, $$37, $$2x)).getOrThrow(ece.a::new);
               } else {
                  $$40 = new ebb<>($$33.t(), $$33.b(diz.b), ebb.d.e);
               }

               $$42 = new eau($$38, $$40);
            } else {
               $$42 = null;
            }

            eao $$44 = $$36.b("BlockLight", 7) ? new eao($$36.m("BlockLight")) : null;
            eao $$45 = $$36.b("SkyLight", 7) ? new eao($$36.m("SkyLight")) : null;
            $$32.add(new ece.b($$37, $$42, $$44, $$45));
         }

         return new ece($$33, $$3, $$0.aq(), $$4, $$5, $$6, $$9, $$11, $$7, $$13, $$16, $$21, $$23, $$8, $$32, $$28, $$29, $$30);
      }
   }

   public ebd a(arn $$0, cht $$1, ecc $$2, dgw $$3) {
      if (!Objects.equals($$3, this.i)) {
         A.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$3, $$3, this.i});
         $$0.p().a(this.i, $$3, $$2);
      }

      int $$4 = $$0.ap();
      eau[] $$5 = new eau[$$4];
      boolean $$6 = $$0.B_().g();
      ean $$7 = $$0.m();
      eui $$8 = $$7.q();
      kf<dis> $$9 = $$0.F_().f(me.aM);
      boolean $$10 = false;

      for (ece.b $$11 : this.v) {
         kl $$12 = kl.a($$3, $$11.a);
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
               $$8.a(dhy.b, $$12, $$11.c);
            }

            if ($$14) {
               $$8.a(dhy.a, $$12, $$11.d);
            }
         }
      }

      ebo $$15 = this.m.d();
      eaj $$18;
      if ($$15 == ebo.b) {
         feh<dku> $$16 = new feh<>(this.s.a());
         feh<eus> $$17 = new feh<>(this.s.b());
         $$18 = new eat($$0.a(), $$3, this.p, $$16, $$17, this.l, $$5, a($$0, this.w, this.x), efo.a(this.n));
      } else {
         fek<dku> $$19 = fek.a(this.s.a());
         fek<eus> $$20 = fek.a(this.s.b());
         ebd $$21 = new ebd($$3, this.p, $$5, $$19, $$20, $$0, $$9, efo.a(this.n));
         $$18 = $$21;
         $$21.c(this.l);
         if (this.o != null) {
            $$21.a(this.o);
         }

         $$21.a(this.m);
         if (this.m.a(ebk.k)) {
            $$21.a($$8);
         }
      }

      $$18.a(this.u);
      EnumSet<eel.a> $$23 = EnumSet.noneOf(eel.a.class);

      for (eel.a $$24 : $$18.n().e()) {
         long[] $$25 = this.r.get($$24);
         if ($$25 != null) {
            $$18.a($$24, $$25);
         } else {
            $$23.add($$24);
         }
      }

      eel.a($$18, $$23);
      $$18.a(a(epw.a($$0), this.y, $$0.E()));
      $$18.b(a($$0.F_(), $$3, this.y));

      for (int $$26 = 0; $$26 < this.t.length; $$26++) {
         $$18.a(this.t[$$26], $$26);
      }

      if ($$15 == ebo.b) {
         return new eas((eat)$$18, false);
      } else {
         ebd $$27 = (ebd)$$18;

         for (tw $$28 : this.w) {
            $$27.b($$28);
         }

         for (tw $$29 : this.x) {
            $$27.a($$29);
         }

         if (this.q != null) {
            $$27.a(new eai(this.q, $$18.G_()));
         }

         return $$27;
      }
   }

   private static void a(dgw $$0, int $$1, String $$2) {
      A.error("Recoverable errors when loading section [{}, {}, {}]: {}", new Object[]{$$0.h, $$1, $$0.i, $$2});
   }

   private static Codec<ebc<js<dis>>> a(kf<dis> $$0) {
      return ebb.b($$0.t(), $$0.r(), ebb.d.e, $$0.b(diz.b));
   }

   public static ece a(arn $$0, eaj $$1) {
      if (!$$1.s()) {
         throw new IllegalArgumentException("Chunk can't be serialized: " + $$1);
      } else {
         dgw $$2 = $$1.f();
         List<ece.b> $$3 = new ArrayList<>();
         eau[] $$4 = $$1.d();
         eui $$5 = $$0.m().a();

         for (int $$6 = $$5.d(); $$6 < $$5.e(); $$6++) {
            int $$7 = $$1.g($$6);
            boolean $$8 = $$7 >= 0 && $$7 < $$4.length;
            eao $$9 = $$5.a(dhy.b).a(kl.a($$2, $$6));
            eao $$10 = $$5.a(dhy.a).a(kl.a($$2, $$6));
            eao $$11 = $$9 != null && !$$9.d() ? $$9.b() : null;
            eao $$12 = $$10 != null && !$$10.d() ? $$10.b() : null;
            if ($$8 || $$11 != null || $$12 != null) {
               eau $$13 = $$8 ? $$4[$$7].k() : null;
               $$3.add(new ece.b($$6, $$13, $$11, $$12));
            }
         }

         List<tw> $$14 = new ArrayList<>($$1.c().size());

         for (jj $$15 : $$1.c()) {
            tw $$16 = $$1.a($$15, $$0.F_());
            if ($$16 != null) {
               $$14.add($$16);
            }
         }

         List<tw> $$17 = new ArrayList<>();
         long[] $$18 = null;
         if ($$1.n().d() == ebo.a) {
            ebd $$19 = (ebd)$$1;
            $$17.addAll($$19.I());
            eai $$20 = $$19.E();
            if ($$20 != null) {
               $$18 = $$20.a();
            }
         }

         Map<eel.a, long[]> $$21 = new EnumMap<>(eel.a.class);

         for (Entry<eel.a, eel> $$22 : $$1.e()) {
            if ($$1.n().e().contains($$22.getKey())) {
               long[] $$23 = $$22.getValue().a();
               $$21.put($$22.getKey(), (long[])$$23.clone());
            }
         }

         eaj.a $$24 = $$1.a($$0.ae());
         ShortList[] $$25 = Arrays.stream($$1.p()).map($$0x -> $$0x != null ? new ShortArrayList($$0x) : null).toArray(ShortList[]::new);
         tw $$26 = a(epw.a($$0), $$2, $$1.g(), $$1.h());
         return new ece(
            $$0.F_().f(me.aM),
            $$2,
            $$1.aq(),
            $$0.ae(),
            $$1.w(),
            $$1.n(),
            x.a($$1.v(), efo::a),
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

   public tw a() {
      tw $$0 = ul.e(new tw());
      $$0.a("xPos", this.i.h);
      $$0.a("yPos", this.j);
      $$0.a("zPos", this.i.i);
      $$0.a("LastUpdate", this.k);
      $$0.a("InhabitedTime", this.l);
      $$0.a("Status", md.l.b(this.m).toString());
      if (this.n != null) {
         efo.d.a.encodeStart(uk.a, this.n).resultOrPartial(A::error).ifPresent($$1x -> $$0.a("blending_data", $$1x));
      }

      if (this.o != null) {
         edz.a.encodeStart(uk.a, this.o).resultOrPartial(A::error).ifPresent($$1x -> $$0.a("below_zero_retrogen", $$1x));
      }

      if (!this.p.a()) {
         $$0.a("UpgradeData", this.p.b());
      }

      uc $$1 = new uc();
      Codec<ebc<js<dis>>> $$2 = a(this.h);

      for (ece.b $$3 : this.v) {
         tw $$4 = new tw();
         eau $$5 = $$3.b;
         if ($$5 != null) {
            $$4.a("block_states", (ut)z.encodeStart(uk.a, $$5.h()).getOrThrow());
            $$4.a("biomes", (ut)$$2.encodeStart(uk.a, $$5.i()).getOrThrow());
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

      uc $$6 = new uc();
      $$6.addAll(this.x);
      $$0.a("block_entities", $$6);
      if (this.m.d() == ebo.a) {
         uc $$7 = new uc();
         $$7.addAll(this.w);
         $$0.a("entities", $$7);
         if (this.q != null) {
            $$0.a("carving_mask", this.q);
         }
      }

      a($$0, this.s);
      $$0.a("PostProcessing", a(this.t));
      tw $$8 = new tw();
      this.r.forEach(($$1x, $$2x) -> $$8.a($$1x.a(), new ud($$2x)));
      $$0.a("Heightmaps", $$8);
      $$0.a("structures", this.y);
      return $$0;
   }

   private static void a(tw $$0, eaj.a $$1) {
      uc $$2 = new uc();

      for (fel<dku> $$3 : $$1.a()) {
         $$2.add($$3.a($$0x -> md.e.b($$0x).toString()));
      }

      $$0.a("block_ticks", $$2);
      uc $$4 = new uc();

      for (fel<eus> $$5 : $$1.b()) {
         $$4.add($$5.a($$0x -> md.c.b($$0x).toString()));
      }

      $$0.a("fluid_ticks", $$4);
   }

   public static ebo a(@Nullable tw $$0) {
      return $$0 != null ? ebk.a($$0.l("Status")).d() : ebo.a;
   }

   @Nullable
   private static eat.c a(arn $$0, List<tw> $$1, List<tw> $$2) {
      return $$1.isEmpty() && $$2.isEmpty() ? null : $$3 -> {
         if (!$$1.isEmpty()) {
            $$0.a(bwb.a($$1, $$0, bwa.r));
         }

         for (tw $$4 : $$2) {
            boolean $$5 = $$4.q("keepPacked");
            if ($$5) {
               $$3.a($$4);
            } else {
               jj $$6 = dvl.b($$4);
               dvl $$7 = dvl.a($$6, $$3.a_($$6), $$4, $$0.F_());
               if ($$7 != null) {
                  $$3.a($$7);
               }
            }
         }
      };
   }

   private static tw a(epw $$0, dgw $$1, Map<epg, epo> $$2, Map<epg, LongSet> $$3) {
      tw $$4 = new tw();
      tw $$5 = new tw();
      kf<epg> $$6 = $$0.b().f(me.aZ);

      for (Entry<epg, epo> $$7 : $$2.entrySet()) {
         ald $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      tw $$9 = new tw();

      for (Entry<epg, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            ald $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new ud($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<epg, epo> a(epw $$0, tw $$1, long $$2) {
      Map<epg, epo> $$3 = Maps.newHashMap();
      kf<epg> $$4 = $$0.b().f(me.aZ);
      tw $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         ald $$7 = ald.c($$6);
         epg $$8 = $$4.a($$7);
         if ($$8 == null) {
            A.error("Unknown structure start: {}", $$7);
         } else {
            epo $$9 = epo.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<epg, LongSet> a(kg $$0, dgw $$1, tw $$2) {
      Map<epg, LongSet> $$3 = Maps.newHashMap();
      kf<epg> $$4 = $$0.f(me.aZ);
      tw $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         ald $$7 = ald.c($$6);
         epg $$8 = $$4.a($$7);
         if ($$8 == null) {
            A.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  dgw $$3x = new dgw($$2x);
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

   private static uc a(ShortList[] $$0) {
      uc $$1 = new uc();

      for (ShortList $$2 : $$0) {
         uc $$3 = new uc();
         if ($$2 != null) {
            for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
               $$3.add(uo.a($$2.getShort($$4)));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }

   public kf<dis> b() {
      return this.h;
   }

   public dgw c() {
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

   public ebk g() {
      return this.m;
   }

   @Nullable
   public efo.d h() {
      return this.n;
   }

   @Nullable
   public edz i() {
      return this.o;
   }

   public ebg j() {
      return this.p;
   }

   @Nullable
   public long[] k() {
      return this.q;
   }

   public Map<eel.a, long[]> l() {
      return this.r;
   }

   public eaj.a m() {
      return this.s;
   }

   public ShortList[] n() {
      return this.t;
   }

   public boolean o() {
      return this.u;
   }

   public List<ece.b> p() {
      return this.v;
   }

   public List<tw> q() {
      return this.w;
   }

   public List<tw> r() {
      return this.x;
   }

   public tw s() {
      return this.y;
   }

   public static class a extends uh {
      public a(String $$0) {
         super($$0);
      }
   }

   public static record b(int a, @Nullable eau b, @Nullable eao c, @Nullable eao d) {
   }
}
