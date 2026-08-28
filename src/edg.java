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

public record edg(
   jr<djs> h,
   dhw i,
   int j,
   long k,
   long l,
   ecm m,
   @Nullable egq.d n,
   @Nullable efb o,
   eci p,
   @Nullable long[] q,
   Map<efn.a, long[]> r,
   ebl.a s,
   ShortList[] t,
   boolean u,
   List<edg.b> v,
   List<tx> w,
   List<tx> x,
   tx y
) {
   private static final Codec<ecd<dzo>> z = ecd.a(dlu.k, dzo.a, ecd.d.d, dlw.a.m());
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
   public static edg a(dir $$0, js $$1, tx $$2) {
      if (!$$2.b("Status", 8)) {
         return null;
      } else {
         dhw $$3 = new dhw($$2.h("xPos"), $$2.h("zPos"));
         long $$4 = $$2.i("LastUpdate");
         long $$5 = $$2.i("InhabitedTime");
         ecm $$6 = ecm.a($$2.l("Status"));
         eci $$7 = $$2.b("UpgradeData", 10) ? new eci($$2.p("UpgradeData"), $$0) : eci.a;
         boolean $$8 = $$2.q("isLightOn");
         egq.d $$9;
         if ($$2.b("blending_data", 10)) {
            $$9 = (egq.d)egq.d.a.parse(ul.a, $$2.p("blending_data")).resultOrPartial(A::error).orElse(null);
         } else {
            $$9 = null;
         }

         efb $$11;
         if ($$2.b("below_zero_retrogen", 10)) {
            $$11 = (efb)efb.a.parse(ul.a, $$2.p("below_zero_retrogen")).resultOrPartial(A::error).orElse(null);
         } else {
            $$11 = null;
         }

         long[] $$13;
         if ($$2.b("carving_mask", 12)) {
            $$13 = $$2.o("carving_mask");
         } else {
            $$13 = null;
         }

         tx $$15 = $$2.p("Heightmaps");
         Map<efn.a, long[]> $$16 = new EnumMap<>(efn.a.class);

         for (efn.a $$17 : $$6.e()) {
            String $$18 = $$17.a();
            if ($$15.b($$18, 12)) {
               $$16.put($$17, $$15.o($$18));
            }
         }

         List<ffn<dlu>> $$19 = ffn.a($$2.c("block_ticks", 10), $$0x -> mf.e.b(ale.c($$0x)), $$3);
         List<ffn<evu>> $$20 = ffn.a($$2.c("fluid_ticks", 10), $$0x -> mf.c.b(ale.c($$0x)), $$3);
         ebl.a $$21 = new ebl.a($$19, $$20);
         ud $$22 = $$2.c("PostProcessing", 9);
         ShortList[] $$23 = new ShortList[$$22.size()];

         for (int $$24 = 0; $$24 < $$22.size(); $$24++) {
            ud $$25 = $$22.b($$24);
            ShortList $$26 = new ShortArrayList($$25.size());

            for (int $$27 = 0; $$27 < $$25.size(); $$27++) {
               $$26.add($$25.d($$27));
            }

            $$23[$$24] = $$26;
         }

         List<tx> $$28 = Lists.transform($$2.c("entities", 10), $$0x -> (tx)$$0x);
         List<tx> $$29 = Lists.transform($$2.c("block_entities", 10), $$0x -> (tx)$$0x);
         tx $$30 = $$2.p("structures");
         ud $$31 = $$2.c("sections", 10);
         List<edg.b> $$32 = new ArrayList<>($$31.size());
         jr<djs> $$33 = $$1.f(mg.aG);
         Codec<ece<je<djs>>> $$34 = a($$33);

         for (int $$35 = 0; $$35 < $$31.size(); $$35++) {
            tx $$36 = $$31.a($$35);
            int $$37 = $$36.f("Y");
            ebw $$42;
            if ($$37 >= $$0.aq() && $$37 <= $$0.ar()) {
               ecd<dzo> $$38;
               if ($$36.b("block_states", 10)) {
                  $$38 = (ecd<dzo>)z.parse(ul.a, $$36.p("block_states")).promotePartial($$2x -> a($$3, $$37, $$2x)).getOrThrow(edg.a::new);
               } else {
                  $$38 = new ecd<>(dlu.k, dlw.a.m(), ecd.d.d);
               }

               ece<je<djs>> $$40;
               if ($$36.b("biomes", 10)) {
                  $$40 = (ece<je<djs>>)$$34.parse(ul.a, $$36.p("biomes")).promotePartial($$2x -> a($$3, $$37, $$2x)).getOrThrow(edg.a::new);
               } else {
                  $$40 = new ecd<>($$33.t(), $$33.b(djz.b), ecd.d.e);
               }

               $$42 = new ebw($$38, $$40);
            } else {
               $$42 = null;
            }

            ebq $$44 = $$36.b("BlockLight", 7) ? new ebq($$36.m("BlockLight")) : null;
            ebq $$45 = $$36.b("SkyLight", 7) ? new ebq($$36.m("SkyLight")) : null;
            $$32.add(new edg.b($$37, $$42, $$44, $$45));
         }

         return new edg($$33, $$3, $$0.aq(), $$4, $$5, $$6, $$9, $$11, $$7, $$13, $$16, $$21, $$23, $$8, $$32, $$28, $$29, $$30);
      }
   }

   public ecf a(aro $$0, cib $$1, ede $$2, dhw $$3) {
      if (!Objects.equals($$3, this.i)) {
         A.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$3, $$3, this.i});
         $$0.p().a(this.i, $$3, $$2);
      }

      int $$4 = $$0.ap();
      ebw[] $$5 = new ebw[$$4];
      boolean $$6 = $$0.B_().g();
      ebp $$7 = $$0.m();
      evk $$8 = $$7.q();
      jr<djs> $$9 = $$0.F_().f(mg.aG);
      boolean $$10 = false;

      for (edg.b $$11 : this.v) {
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
               $$8.a(diy.b, $$12, $$11.c);
            }

            if ($$14) {
               $$8.a(diy.a, $$12, $$11.d);
            }
         }
      }

      ecq $$15 = this.m.d();
      ebl $$18;
      if ($$15 == ecq.b) {
         ffj<dlu> $$16 = new ffj<>(this.s.a());
         ffj<evu> $$17 = new ffj<>(this.s.b());
         $$18 = new ebv($$0.a(), $$3, this.p, $$16, $$17, this.l, $$5, a($$0, this.w, this.x), egq.a(this.n));
      } else {
         ffm<dlu> $$19 = ffm.a(this.s.a());
         ffm<evu> $$20 = ffm.a(this.s.b());
         ecf $$21 = new ecf($$3, this.p, $$5, $$19, $$20, $$0, $$9, egq.a(this.n));
         $$18 = $$21;
         $$21.c(this.l);
         if (this.o != null) {
            $$21.a(this.o);
         }

         $$21.a(this.m);
         if (this.m.a(ecm.k)) {
            $$21.a($$8);
         }
      }

      $$18.a(this.u);
      EnumSet<efn.a> $$23 = EnumSet.noneOf(efn.a.class);

      for (efn.a $$24 : $$18.n().e()) {
         long[] $$25 = this.r.get($$24);
         if ($$25 != null) {
            $$18.a($$24, $$25);
         } else {
            $$23.add($$24);
         }
      }

      efn.a($$18, $$23);
      $$18.a(a(eqy.a($$0), this.y, $$0.E()));
      $$18.b(a($$0.F_(), $$3, this.y));

      for (int $$26 = 0; $$26 < this.t.length; $$26++) {
         $$18.a(this.t[$$26], $$26);
      }

      if ($$15 == ecq.b) {
         return new ebu((ebv)$$18, false);
      } else {
         ecf $$27 = (ecf)$$18;

         for (tx $$28 : this.w) {
            $$27.b($$28);
         }

         for (tx $$29 : this.x) {
            $$27.a($$29);
         }

         if (this.q != null) {
            $$27.a(new ebk(this.q, $$18.G_()));
         }

         return $$27;
      }
   }

   private static void a(dhw $$0, int $$1, String $$2) {
      A.error("Recoverable errors when loading section [{}, {}, {}]: {}", new Object[]{$$0.h, $$1, $$0.i, $$2});
   }

   private static Codec<ece<je<djs>>> a(jr<djs> $$0) {
      return ecd.b($$0.t(), $$0.r(), ecd.d.e, $$0.b(djz.b));
   }

   public static edg a(aro $$0, ebl $$1) {
      if (!$$1.s()) {
         throw new IllegalArgumentException("Chunk can't be serialized: " + $$1);
      } else {
         dhw $$2 = $$1.f();
         List<edg.b> $$3 = new ArrayList<>();
         ebw[] $$4 = $$1.d();
         evk $$5 = $$0.m().a();

         for (int $$6 = $$5.d(); $$6 < $$5.e(); $$6++) {
            int $$7 = $$1.g($$6);
            boolean $$8 = $$7 >= 0 && $$7 < $$4.length;
            ebq $$9 = $$5.a(diy.b).a(jx.a($$2, $$6));
            ebq $$10 = $$5.a(diy.a).a(jx.a($$2, $$6));
            ebq $$11 = $$9 != null && !$$9.d() ? $$9.b() : null;
            ebq $$12 = $$10 != null && !$$10.d() ? $$10.b() : null;
            if ($$8 || $$11 != null || $$12 != null) {
               ebw $$13 = $$8 ? $$4[$$7].k() : null;
               $$3.add(new edg.b($$6, $$13, $$11, $$12));
            }
         }

         List<tx> $$14 = new ArrayList<>($$1.c().size());

         for (iu $$15 : $$1.c()) {
            tx $$16 = $$1.a($$15, $$0.F_());
            if ($$16 != null) {
               $$14.add($$16);
            }
         }

         List<tx> $$17 = new ArrayList<>();
         long[] $$18 = null;
         if ($$1.n().d() == ecq.a) {
            ecf $$19 = (ecf)$$1;
            $$17.addAll($$19.I());
            ebk $$20 = $$19.E();
            if ($$20 != null) {
               $$18 = $$20.a();
            }
         }

         Map<efn.a, long[]> $$21 = new EnumMap<>(efn.a.class);

         for (Entry<efn.a, efn> $$22 : $$1.e()) {
            if ($$1.n().e().contains($$22.getKey())) {
               long[] $$23 = $$22.getValue().a();
               $$21.put($$22.getKey(), (long[])$$23.clone());
            }
         }

         ebl.a $$24 = $$1.a($$0.ae());
         ShortList[] $$25 = Arrays.stream($$1.p()).map($$0x -> $$0x != null ? new ShortArrayList($$0x) : null).toArray(ShortList[]::new);
         tx $$26 = a(eqy.a($$0), $$2, $$1.g(), $$1.h());
         return new edg(
            $$0.F_().f(mg.aG),
            $$2,
            $$1.aq(),
            $$0.ae(),
            $$1.w(),
            $$1.n(),
            x.a($$1.v(), egq::a),
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

   public tx a() {
      tx $$0 = um.e(new tx());
      $$0.a("xPos", this.i.h);
      $$0.a("yPos", this.j);
      $$0.a("zPos", this.i.i);
      $$0.a("LastUpdate", this.k);
      $$0.a("InhabitedTime", this.l);
      $$0.a("Status", mf.l.b(this.m).toString());
      if (this.n != null) {
         egq.d.a.encodeStart(ul.a, this.n).resultOrPartial(A::error).ifPresent($$1x -> $$0.a("blending_data", $$1x));
      }

      if (this.o != null) {
         efb.a.encodeStart(ul.a, this.o).resultOrPartial(A::error).ifPresent($$1x -> $$0.a("below_zero_retrogen", $$1x));
      }

      if (!this.p.a()) {
         $$0.a("UpgradeData", this.p.b());
      }

      ud $$1 = new ud();
      Codec<ece<je<djs>>> $$2 = a(this.h);

      for (edg.b $$3 : this.v) {
         tx $$4 = new tx();
         ebw $$5 = $$3.b;
         if ($$5 != null) {
            $$4.a("block_states", (uu)z.encodeStart(ul.a, $$5.h()).getOrThrow());
            $$4.a("biomes", (uu)$$2.encodeStart(ul.a, $$5.i()).getOrThrow());
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

      ud $$6 = new ud();
      $$6.addAll(this.x);
      $$0.a("block_entities", $$6);
      if (this.m.d() == ecq.a) {
         ud $$7 = new ud();
         $$7.addAll(this.w);
         $$0.a("entities", $$7);
         if (this.q != null) {
            $$0.a("carving_mask", this.q);
         }
      }

      a($$0, this.s);
      $$0.a("PostProcessing", a(this.t));
      tx $$8 = new tx();
      this.r.forEach(($$1x, $$2x) -> $$8.a($$1x.a(), new ue($$2x)));
      $$0.a("Heightmaps", $$8);
      $$0.a("structures", this.y);
      return $$0;
   }

   private static void a(tx $$0, ebl.a $$1) {
      ud $$2 = new ud();

      for (ffn<dlu> $$3 : $$1.a()) {
         $$2.add($$3.a($$0x -> mf.e.b($$0x).toString()));
      }

      $$0.a("block_ticks", $$2);
      ud $$4 = new ud();

      for (ffn<evu> $$5 : $$1.b()) {
         $$4.add($$5.a($$0x -> mf.c.b($$0x).toString()));
      }

      $$0.a("fluid_ticks", $$4);
   }

   public static ecq a(@Nullable tx $$0) {
      return $$0 != null ? ecm.a($$0.l("Status")).d() : ecq.a;
   }

   @Nullable
   private static ebv.c a(aro $$0, List<tx> $$1, List<tx> $$2) {
      return $$1.isEmpty() && $$2.isEmpty() ? null : $$3 -> {
         if (!$$1.isEmpty()) {
            $$0.a(bwj.a($$1, $$0, bwi.r));
         }

         for (tx $$4 : $$2) {
            boolean $$5 = $$4.q("keepPacked");
            if ($$5) {
               $$3.a($$4);
            } else {
               iu $$6 = dwn.b($$4);
               dwn $$7 = dwn.a($$6, $$3.a_($$6), $$4, $$0.F_());
               if ($$7 != null) {
                  $$3.a($$7);
               }
            }
         }
      };
   }

   private static tx a(eqy $$0, dhw $$1, Map<eqi, eqq> $$2, Map<eqi, LongSet> $$3) {
      tx $$4 = new tx();
      tx $$5 = new tx();
      jr<eqi> $$6 = $$0.b().f(mg.bc);

      for (Entry<eqi, eqq> $$7 : $$2.entrySet()) {
         ale $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      tx $$9 = new tx();

      for (Entry<eqi, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            ale $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new ue($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<eqi, eqq> a(eqy $$0, tx $$1, long $$2) {
      Map<eqi, eqq> $$3 = Maps.newHashMap();
      jr<eqi> $$4 = $$0.b().f(mg.bc);
      tx $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         ale $$7 = ale.c($$6);
         eqi $$8 = $$4.a($$7);
         if ($$8 == null) {
            A.error("Unknown structure start: {}", $$7);
         } else {
            eqq $$9 = eqq.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<eqi, LongSet> a(js $$0, dhw $$1, tx $$2) {
      Map<eqi, LongSet> $$3 = Maps.newHashMap();
      jr<eqi> $$4 = $$0.f(mg.bc);
      tx $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         ale $$7 = ale.c($$6);
         eqi $$8 = $$4.a($$7);
         if ($$8 == null) {
            A.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  dhw $$3x = new dhw($$2x);
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

   private static ud a(ShortList[] $$0) {
      ud $$1 = new ud();

      for (ShortList $$2 : $$0) {
         ud $$3 = new ud();
         if ($$2 != null) {
            for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
               $$3.add(up.a($$2.getShort($$4)));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }

   public jr<djs> b() {
      return this.h;
   }

   public dhw c() {
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

   public ecm g() {
      return this.m;
   }

   @Nullable
   public egq.d h() {
      return this.n;
   }

   @Nullable
   public efb i() {
      return this.o;
   }

   public eci j() {
      return this.p;
   }

   @Nullable
   public long[] k() {
      return this.q;
   }

   public Map<efn.a, long[]> l() {
      return this.r;
   }

   public ebl.a m() {
      return this.s;
   }

   public ShortList[] n() {
      return this.t;
   }

   public boolean o() {
      return this.u;
   }

   public List<edg.b> p() {
      return this.v;
   }

   public List<tx> q() {
      return this.w;
   }

   public List<tx> r() {
      return this.x;
   }

   public tx s() {
      return this.y;
   }

   public static class a extends ui {
      public a(String $$0) {
         super($$0);
      }
   }

   public static record b(int a, @Nullable ebw b, @Nullable ebq c, @Nullable ebq d) {
   }
}
