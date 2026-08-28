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

public record ebe(
   kd<dib> h,
   dgf i,
   int j,
   long k,
   long l,
   eak m,
   @Nullable eem.d n,
   @Nullable ecx o,
   eag p,
   @Nullable long[] q,
   Map<edj.a, long[]> r,
   dzj.a s,
   ShortList[] t,
   boolean u,
   List<ebe.b> v,
   List<um> w,
   List<um> x,
   um y
) {
   private static final Codec<eab<dxo>> z = eab.a(dkd.q, dxo.a, eab.d.d, dkf.a.m());
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
   public static ebe a(dhb $$0, ke $$1, um $$2) {
      if (!$$2.b("Status", 8)) {
         return null;
      } else {
         dgf $$3 = new dgf($$2.h("xPos"), $$2.h("zPos"));
         long $$4 = $$2.i("LastUpdate");
         long $$5 = $$2.i("InhabitedTime");
         eak $$6 = eak.a($$2.l("Status"));
         eag $$7 = $$2.b("UpgradeData", 10) ? new eag($$2.p("UpgradeData"), $$0) : eag.a;
         boolean $$8 = $$2.q("isLightOn");
         eem.d $$9;
         if ($$2.b("blending_data", 10)) {
            $$9 = (eem.d)eem.d.a.parse(va.a, $$2.p("blending_data")).resultOrPartial(A::error).orElse(null);
         } else {
            $$9 = null;
         }

         ecx $$11;
         if ($$2.b("below_zero_retrogen", 10)) {
            $$11 = (ecx)ecx.a.parse(va.a, $$2.p("below_zero_retrogen")).resultOrPartial(A::error).orElse(null);
         } else {
            $$11 = null;
         }

         long[] $$13;
         if ($$2.b("carving_mask", 12)) {
            $$13 = $$2.o("carving_mask");
         } else {
            $$13 = null;
         }

         um $$15 = $$2.p("Heightmaps");
         Map<edj.a, long[]> $$16 = new EnumMap<>(edj.a.class);

         for (edj.a $$17 : $$6.e()) {
            String $$18 = $$17.a();
            if ($$15.b($$18, 12)) {
               $$16.put($$17, $$15.o($$18));
            }
         }

         List<fdi<dkd>> $$19 = fdi.a($$2.c("block_ticks", 10), $$0x -> ma.e.b(alp.c($$0x)), $$3);
         List<fdi<etp>> $$20 = fdi.a($$2.c("fluid_ticks", 10), $$0x -> ma.c.b(alp.c($$0x)), $$3);
         dzj.a $$21 = new dzj.a($$19, $$20);
         us $$22 = $$2.c("PostProcessing", 9);
         ShortList[] $$23 = new ShortList[$$22.size()];

         for (int $$24 = 0; $$24 < $$22.size(); $$24++) {
            us $$25 = $$22.b($$24);
            ShortList $$26 = new ShortArrayList($$25.size());

            for (int $$27 = 0; $$27 < $$25.size(); $$27++) {
               $$26.add($$25.d($$27));
            }

            $$23[$$24] = $$26;
         }

         List<um> $$28 = Lists.transform($$2.c("entities", 10), $$0x -> (um)$$0x);
         List<um> $$29 = Lists.transform($$2.c("block_entities", 10), $$0x -> (um)$$0x);
         um $$30 = $$2.p("structures");
         us $$31 = $$2.c("sections", 10);
         List<ebe.b> $$32 = new ArrayList<>($$31.size());
         kd<dib> $$33 = $$1.e(mb.aI);
         Codec<eac<jq<dib>>> $$34 = a($$33);

         for (int $$35 = 0; $$35 < $$31.size(); $$35++) {
            um $$36 = $$31.a($$35);
            int $$37 = $$36.f("Y");
            dzu $$42;
            if ($$37 >= $$0.ap() && $$37 <= $$0.aq()) {
               eab<dxo> $$38;
               if ($$36.b("block_states", 10)) {
                  $$38 = (eab<dxo>)z.parse(va.a, $$36.p("block_states")).promotePartial($$2x -> a($$3, $$37, $$2x)).getOrThrow(ebe.a::new);
               } else {
                  $$38 = new eab<>(dkd.q, dkf.a.m(), eab.d.d);
               }

               eac<jq<dib>> $$40;
               if ($$36.b("biomes", 10)) {
                  $$40 = (eac<jq<dib>>)$$34.parse(va.a, $$36.p("biomes")).promotePartial($$2x -> a($$3, $$37, $$2x)).getOrThrow(ebe.a::new);
               } else {
                  $$40 = new eab<>($$33.t(), $$33.b(dii.b), eab.d.e);
               }

               $$42 = new dzu($$38, $$40);
            } else {
               $$42 = null;
            }

            dzo $$44 = $$36.b("BlockLight", 7) ? new dzo($$36.m("BlockLight")) : null;
            dzo $$45 = $$36.b("SkyLight", 7) ? new dzo($$36.m("SkyLight")) : null;
            $$32.add(new ebe.b($$37, $$42, $$44, $$45));
         }

         return new ebe($$33, $$3, $$0.ap(), $$4, $$5, $$6, $$9, $$11, $$7, $$13, $$16, $$21, $$23, $$8, $$32, $$28, $$29, $$30);
      }
   }

   public ead a(arx $$0, chb $$1, ebc $$2, dgf $$3) {
      if (!Objects.equals($$3, this.i)) {
         A.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$3, $$3, this.i});
         $$0.p().a(this.i, $$3, $$2);
      }

      int $$4 = $$0.ao();
      dzu[] $$5 = new dzu[$$4];
      boolean $$6 = $$0.G_().g();
      dzn $$7 = $$0.m();
      etf $$8 = $$7.p();
      kd<dib> $$9 = $$0.K_().e(mb.aI);
      boolean $$10 = false;

      for (ebe.b $$11 : this.v) {
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
               $$8.a(dhi.b, $$12, $$11.c);
            }

            if ($$14) {
               $$8.a(dhi.a, $$12, $$11.d);
            }
         }
      }

      eao $$15 = this.m.d();
      dzj $$18;
      if ($$15 == eao.b) {
         fde<dkd> $$16 = new fde<>(this.s.a());
         fde<etp> $$17 = new fde<>(this.s.b());
         $$18 = new dzt($$0.a(), $$3, this.p, $$16, $$17, this.l, $$5, a($$0, this.w, this.x), eem.a(this.n));
      } else {
         fdh<dkd> $$19 = fdh.a(this.s.a());
         fdh<etp> $$20 = fdh.a(this.s.b());
         ead $$21 = new ead($$3, this.p, $$5, $$19, $$20, $$0, $$9, eem.a(this.n));
         $$18 = $$21;
         $$21.c(this.l);
         if (this.o != null) {
            $$21.a(this.o);
         }

         $$21.a(this.m);
         if (this.m.a(eak.k)) {
            $$21.a($$8);
         }
      }

      $$18.a(this.u);
      EnumSet<edj.a> $$23 = EnumSet.noneOf(edj.a.class);

      for (edj.a $$24 : $$18.n().e()) {
         long[] $$25 = this.r.get($$24);
         if ($$25 != null) {
            $$18.a($$24, $$25);
         } else {
            $$23.add($$24);
         }
      }

      edj.a($$18, $$23);
      $$18.a(a(eot.a($$0), this.y, $$0.E()));
      $$18.b(a($$0.K_(), $$3, this.y));

      for (int $$26 = 0; $$26 < this.t.length; $$26++) {
         $$18.a(this.t[$$26], $$26);
      }

      if ($$15 == eao.b) {
         return new dzs((dzt)$$18, false);
      } else {
         ead $$27 = (ead)$$18;

         for (um $$28 : this.w) {
            $$27.b($$28);
         }

         for (um $$29 : this.x) {
            $$27.a($$29);
         }

         if (this.q != null) {
            $$27.a(new dzi(this.q, $$18.L_()));
         }

         return $$27;
      }
   }

   private static void a(dgf $$0, int $$1, String $$2) {
      A.error("Recoverable errors when loading section [{}, {}, {}]: {}", new Object[]{$$0.h, $$1, $$0.i, $$2});
   }

   private static Codec<eac<jq<dib>>> a(kd<dib> $$0) {
      return eab.b($$0.t(), $$0.r(), eab.d.e, $$0.b(dii.b));
   }

   public static ebe a(arx $$0, dzj $$1) {
      if (!$$1.s()) {
         throw new IllegalArgumentException("Chunk can't be serialized: " + $$1);
      } else {
         dgf $$2 = $$1.f();
         List<ebe.b> $$3 = new ArrayList<>();
         dzu[] $$4 = $$1.d();
         etf $$5 = $$0.m().a();

         for (int $$6 = $$5.d(); $$6 < $$5.e(); $$6++) {
            int $$7 = $$1.g($$6);
            boolean $$8 = $$7 >= 0 && $$7 < $$4.length;
            dzo $$9 = $$5.a(dhi.b).a(kj.a($$2, $$6));
            dzo $$10 = $$5.a(dhi.a).a(kj.a($$2, $$6));
            dzo $$11 = $$9 != null && !$$9.d() ? $$9.b() : null;
            dzo $$12 = $$10 != null && !$$10.d() ? $$10.b() : null;
            if ($$8 || $$11 != null || $$12 != null) {
               dzu $$13 = $$8 ? $$4[$$7].k() : null;
               $$3.add(new ebe.b($$6, $$13, $$11, $$12));
            }
         }

         List<um> $$14 = new ArrayList<>($$1.c().size());

         for (jh $$15 : $$1.c()) {
            um $$16 = $$1.a($$15, $$0.K_());
            if ($$16 != null) {
               $$14.add($$16);
            }
         }

         List<um> $$17 = new ArrayList<>();
         long[] $$18 = null;
         if ($$1.n().d() == eao.a) {
            ead $$19 = (ead)$$1;
            $$17.addAll($$19.I());
            dzi $$20 = $$19.E();
            if ($$20 != null) {
               $$18 = $$20.a();
            }
         }

         Map<edj.a, long[]> $$21 = new EnumMap<>(edj.a.class);

         for (Entry<edj.a, edj> $$22 : $$1.e()) {
            if ($$1.n().e().contains($$22.getKey())) {
               long[] $$23 = $$22.getValue().a();
               $$21.put($$22.getKey(), (long[])$$23.clone());
            }
         }

         dzj.a $$24 = $$1.a($$0.ad());
         ShortList[] $$25 = Arrays.stream($$1.p()).map($$0x -> $$0x != null ? new ShortArrayList($$0x) : null).toArray(ShortList[]::new);
         um $$26 = a(eot.a($$0), $$2, $$1.g(), $$1.h());
         return new ebe(
            $$0.K_().e(mb.aI),
            $$2,
            $$1.ap(),
            $$0.ad(),
            $$1.w(),
            $$1.n(),
            x.a($$1.v(), eem::a),
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

   public um a() {
      um $$0 = vb.e(new um());
      $$0.a("xPos", this.i.h);
      $$0.a("yPos", this.j);
      $$0.a("zPos", this.i.i);
      $$0.a("LastUpdate", this.k);
      $$0.a("InhabitedTime", this.l);
      $$0.a("Status", ma.l.b(this.m).toString());
      if (this.n != null) {
         eem.d.a.encodeStart(va.a, this.n).resultOrPartial(A::error).ifPresent($$1x -> $$0.a("blending_data", $$1x));
      }

      if (this.o != null) {
         ecx.a.encodeStart(va.a, this.o).resultOrPartial(A::error).ifPresent($$1x -> $$0.a("below_zero_retrogen", $$1x));
      }

      if (!this.p.a()) {
         $$0.a("UpgradeData", this.p.b());
      }

      us $$1 = new us();
      Codec<eac<jq<dib>>> $$2 = a(this.h);

      for (ebe.b $$3 : this.v) {
         um $$4 = new um();
         dzu $$5 = $$3.b;
         if ($$5 != null) {
            $$4.a("block_states", (vj)z.encodeStart(va.a, $$5.h()).getOrThrow());
            $$4.a("biomes", (vj)$$2.encodeStart(va.a, $$5.i()).getOrThrow());
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

      us $$6 = new us();
      $$6.addAll(this.x);
      $$0.a("block_entities", $$6);
      if (this.m.d() == eao.a) {
         us $$7 = new us();
         $$7.addAll(this.w);
         $$0.a("entities", $$7);
         if (this.q != null) {
            $$0.a("carving_mask", this.q);
         }
      }

      a($$0, this.s);
      $$0.a("PostProcessing", a(this.t));
      um $$8 = new um();
      this.r.forEach(($$1x, $$2x) -> $$8.a($$1x.a(), new ut($$2x)));
      $$0.a("Heightmaps", $$8);
      $$0.a("structures", this.y);
      return $$0;
   }

   private static void a(um $$0, dzj.a $$1) {
      us $$2 = new us();

      for (fdi<dkd> $$3 : $$1.a()) {
         $$2.add($$3.a($$0x -> ma.e.b($$0x).toString()));
      }

      $$0.a("block_ticks", $$2);
      us $$4 = new us();

      for (fdi<etp> $$5 : $$1.b()) {
         $$4.add($$5.a($$0x -> ma.c.b($$0x).toString()));
      }

      $$0.a("fluid_ticks", $$4);
   }

   public static eao a(@Nullable um $$0) {
      return $$0 != null ? eak.a($$0.l("Status")).d() : eao.a;
   }

   @Nullable
   private static dzt.c a(arx $$0, List<um> $$1, List<um> $$2) {
      return $$1.isEmpty() && $$2.isEmpty() ? null : $$3 -> {
         if (!$$1.isEmpty()) {
            $$0.a(bvi.a($$1, $$0, bvh.r));
         }

         for (um $$4 : $$2) {
            boolean $$5 = $$4.q("keepPacked");
            if ($$5) {
               $$3.a($$4);
            } else {
               jh $$6 = duq.b($$4);
               duq $$7 = duq.a($$6, $$3.a_($$6), $$4, $$0.K_());
               if ($$7 != null) {
                  $$3.a($$7);
               }
            }
         }
      };
   }

   private static um a(eot $$0, dgf $$1, Map<eod, eol> $$2, Map<eod, LongSet> $$3) {
      um $$4 = new um();
      um $$5 = new um();
      kd<eod> $$6 = $$0.b().e(mb.aU);

      for (Entry<eod, eol> $$7 : $$2.entrySet()) {
         alp $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      um $$9 = new um();

      for (Entry<eod, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            alp $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new ut($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<eod, eol> a(eot $$0, um $$1, long $$2) {
      Map<eod, eol> $$3 = Maps.newHashMap();
      kd<eod> $$4 = $$0.b().e(mb.aU);
      um $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         alp $$7 = alp.c($$6);
         eod $$8 = $$4.a($$7);
         if ($$8 == null) {
            A.error("Unknown structure start: {}", $$7);
         } else {
            eol $$9 = eol.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<eod, LongSet> a(ke $$0, dgf $$1, um $$2) {
      Map<eod, LongSet> $$3 = Maps.newHashMap();
      kd<eod> $$4 = $$0.e(mb.aU);
      um $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         alp $$7 = alp.c($$6);
         eod $$8 = $$4.a($$7);
         if ($$8 == null) {
            A.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  dgf $$3x = new dgf($$2x);
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

   private static us a(ShortList[] $$0) {
      us $$1 = new us();

      for (ShortList $$2 : $$0) {
         us $$3 = new us();
         if ($$2 != null) {
            for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
               $$3.add(ve.a($$2.getShort($$4)));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }

   public kd<dib> b() {
      return this.h;
   }

   public dgf c() {
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

   public eak g() {
      return this.m;
   }

   @Nullable
   public eem.d h() {
      return this.n;
   }

   @Nullable
   public ecx i() {
      return this.o;
   }

   public eag j() {
      return this.p;
   }

   @Nullable
   public long[] k() {
      return this.q;
   }

   public Map<edj.a, long[]> l() {
      return this.r;
   }

   public dzj.a m() {
      return this.s;
   }

   public ShortList[] n() {
      return this.t;
   }

   public boolean o() {
      return this.u;
   }

   public List<ebe.b> p() {
      return this.v;
   }

   public List<um> q() {
      return this.w;
   }

   public List<um> r() {
      return this.x;
   }

   public um s() {
      return this.y;
   }

   public static class a extends ux {
      public a(String $$0) {
         super($$0);
      }
   }

   public static record b(int a, @Nullable dzu b, @Nullable dzo c, @Nullable dzo d) {
   }
}
