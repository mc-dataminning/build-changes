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

public record eam(
   ke<dhj> h,
   dfn i,
   int j,
   long k,
   long l,
   dzs m,
   @Nullable edu.d n,
   @Nullable ecf o,
   dzo p,
   @Nullable long[] q,
   Map<ecr.a, long[]> r,
   dyr.a s,
   ShortList[] t,
   boolean u,
   List<eam.b> v,
   List<tq> w,
   List<tq> x,
   tq y
) {
   private static final Codec<dzj<dww>> z = dzj.a(djl.q, dww.a, dzj.d.d, djn.a.m());
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
   public static eam a(dgj $$0, kf $$1, tq $$2) {
      if (!$$2.b("Status", 8)) {
         return null;
      } else {
         dfn $$3 = new dfn($$2.h("xPos"), $$2.h("zPos"));
         long $$4 = $$2.i("LastUpdate");
         long $$5 = $$2.i("InhabitedTime");
         dzs $$6 = dzs.a($$2.l("Status"));
         dzo $$7 = $$2.b("UpgradeData", 10) ? new dzo($$2.p("UpgradeData"), $$0) : dzo.a;
         boolean $$8 = $$2.q("isLightOn");
         edu.d $$9;
         if ($$2.b("blending_data", 10)) {
            $$9 = (edu.d)edu.d.a.parse(ue.a, $$2.p("blending_data")).resultOrPartial(A::error).orElse(null);
         } else {
            $$9 = null;
         }

         ecf $$11;
         if ($$2.b("below_zero_retrogen", 10)) {
            $$11 = (ecf)ecf.a.parse(ue.a, $$2.p("below_zero_retrogen")).resultOrPartial(A::error).orElse(null);
         } else {
            $$11 = null;
         }

         long[] $$13;
         if ($$2.b("carving_mask", 12)) {
            $$13 = $$2.o("carving_mask");
         } else {
            $$13 = null;
         }

         tq $$15 = $$2.p("Heightmaps");
         Map<ecr.a, long[]> $$16 = new EnumMap<>(ecr.a.class);

         for (ecr.a $$17 : $$6.e()) {
            String $$18 = $$17.a();
            if ($$15.b($$18, 12)) {
               $$16.put($$17, $$15.o($$18));
            }
         }

         List<fcq<djl>> $$19 = fcq.a($$2.c("block_ticks", 10), $$0x -> mb.e.b(akv.c($$0x)), $$3);
         List<fcq<esx>> $$20 = fcq.a($$2.c("fluid_ticks", 10), $$0x -> mb.c.b(akv.c($$0x)), $$3);
         dyr.a $$21 = new dyr.a($$19, $$20);
         tw $$22 = $$2.c("PostProcessing", 9);
         ShortList[] $$23 = new ShortList[$$22.size()];

         for (int $$24 = 0; $$24 < $$22.size(); $$24++) {
            tw $$25 = $$22.b($$24);
            ShortList $$26 = new ShortArrayList($$25.size());

            for (int $$27 = 0; $$27 < $$25.size(); $$27++) {
               $$26.add($$25.d($$27));
            }

            $$23[$$24] = $$26;
         }

         List<tq> $$28 = Lists.transform($$2.c("entities", 10), $$0x -> (tq)$$0x);
         List<tq> $$29 = Lists.transform($$2.c("block_entities", 10), $$0x -> (tq)$$0x);
         tq $$30 = $$2.p("structures");
         tw $$31 = $$2.c("sections", 10);
         List<eam.b> $$32 = new ArrayList<>($$31.size());
         ke<dhj> $$33 = $$1.e(mc.aI);
         Codec<dzk<jr<dhj>>> $$34 = a($$33);

         for (int $$35 = 0; $$35 < $$31.size(); $$35++) {
            tq $$36 = $$31.a($$35);
            int $$37 = $$36.f("Y");
            dzc $$42;
            if ($$37 >= $$0.ap() && $$37 <= $$0.aq()) {
               dzj<dww> $$38;
               if ($$36.b("block_states", 10)) {
                  $$38 = (dzj<dww>)z.parse(ue.a, $$36.p("block_states")).promotePartial($$2x -> a($$3, $$37, $$2x)).getOrThrow(eam.a::new);
               } else {
                  $$38 = new dzj<>(djl.q, djn.a.m(), dzj.d.d);
               }

               dzk<jr<dhj>> $$40;
               if ($$36.b("biomes", 10)) {
                  $$40 = (dzk<jr<dhj>>)$$34.parse(ue.a, $$36.p("biomes")).promotePartial($$2x -> a($$3, $$37, $$2x)).getOrThrow(eam.a::new);
               } else {
                  $$40 = new dzj<>($$33.t(), $$33.b(dhq.b), dzj.d.e);
               }

               $$42 = new dzc($$38, $$40);
            } else {
               $$42 = null;
            }

            dyw $$44 = $$36.b("BlockLight", 7) ? new dyw($$36.m("BlockLight")) : null;
            dyw $$45 = $$36.b("SkyLight", 7) ? new dyw($$36.m("SkyLight")) : null;
            $$32.add(new eam.b($$37, $$42, $$44, $$45));
         }

         return new eam($$33, $$3, $$0.ap(), $$4, $$5, $$6, $$9, $$11, $$7, $$13, $$16, $$21, $$23, $$8, $$32, $$28, $$29, $$30);
      }
   }

   public dzl a(ard $$0, cgk $$1, eak $$2, dfn $$3) {
      if (!Objects.equals($$3, this.i)) {
         A.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$3, $$3, this.i});
         $$0.p().a(this.i, $$3, $$2);
      }

      int $$4 = $$0.ao();
      dzc[] $$5 = new dzc[$$4];
      boolean $$6 = $$0.G_().g();
      dyv $$7 = $$0.m();
      esn $$8 = $$7.p();
      ke<dhj> $$9 = $$0.K_().e(mc.aI);
      boolean $$10 = false;

      for (eam.b $$11 : this.v) {
         kk $$12 = kk.a($$3, $$11.a);
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
               $$8.a(dgq.b, $$12, $$11.c);
            }

            if ($$14) {
               $$8.a(dgq.a, $$12, $$11.d);
            }
         }
      }

      dzw $$15 = this.m.d();
      dyr $$18;
      if ($$15 == dzw.b) {
         fcm<djl> $$16 = new fcm<>(this.s.a());
         fcm<esx> $$17 = new fcm<>(this.s.b());
         $$18 = new dzb($$0.a(), $$3, this.p, $$16, $$17, this.l, $$5, a($$0, this.w, this.x), edu.a(this.n));
      } else {
         fcp<djl> $$19 = fcp.a(this.s.a());
         fcp<esx> $$20 = fcp.a(this.s.b());
         dzl $$21 = new dzl($$3, this.p, $$5, $$19, $$20, $$0, $$9, edu.a(this.n));
         $$18 = $$21;
         $$21.c(this.l);
         if (this.o != null) {
            $$21.a(this.o);
         }

         $$21.a(this.m);
         if (this.m.a(dzs.k)) {
            $$21.a($$8);
         }
      }

      $$18.a(this.u);
      EnumSet<ecr.a> $$23 = EnumSet.noneOf(ecr.a.class);

      for (ecr.a $$24 : $$18.n().e()) {
         long[] $$25 = this.r.get($$24);
         if ($$25 != null) {
            $$18.a($$24, $$25);
         } else {
            $$23.add($$24);
         }
      }

      ecr.a($$18, $$23);
      $$18.a(a(eob.a($$0), this.y, $$0.E()));
      $$18.b(a($$0.K_(), $$3, this.y));

      for (int $$26 = 0; $$26 < this.t.length; $$26++) {
         $$18.a(this.t[$$26], $$26);
      }

      if ($$15 == dzw.b) {
         return new dza((dzb)$$18, false);
      } else {
         dzl $$27 = (dzl)$$18;

         for (tq $$28 : this.w) {
            $$27.b($$28);
         }

         for (tq $$29 : this.x) {
            $$27.a($$29);
         }

         if (this.q != null) {
            $$27.a(new dyq(this.q, $$18.L_()));
         }

         return $$27;
      }
   }

   private static void a(dfn $$0, int $$1, String $$2) {
      A.error("Recoverable errors when loading section [{}, {}, {}]: {}", new Object[]{$$0.h, $$1, $$0.i, $$2});
   }

   private static Codec<dzk<jr<dhj>>> a(ke<dhj> $$0) {
      return dzj.b($$0.t(), $$0.r(), dzj.d.e, $$0.b(dhq.b));
   }

   public static eam a(ard $$0, dyr $$1) {
      if (!$$1.s()) {
         throw new IllegalArgumentException("Chunk can't be serialized: " + $$1);
      } else {
         dfn $$2 = $$1.f();
         List<eam.b> $$3 = new ArrayList<>();
         dzc[] $$4 = $$1.d();
         esn $$5 = $$0.m().a();

         for (int $$6 = $$5.d(); $$6 < $$5.e(); $$6++) {
            int $$7 = $$1.g($$6);
            boolean $$8 = $$7 >= 0 && $$7 < $$4.length;
            dyw $$9 = $$5.a(dgq.b).a(kk.a($$2, $$6));
            dyw $$10 = $$5.a(dgq.a).a(kk.a($$2, $$6));
            dyw $$11 = $$9 != null && !$$9.d() ? $$9.b() : null;
            dyw $$12 = $$10 != null && !$$10.d() ? $$10.b() : null;
            if ($$8 || $$11 != null || $$12 != null) {
               dzc $$13 = $$8 ? $$4[$$7].k() : null;
               $$3.add(new eam.b($$6, $$13, $$11, $$12));
            }
         }

         List<tq> $$14 = new ArrayList<>($$1.c().size());

         for (ji $$15 : $$1.c()) {
            tq $$16 = $$1.a($$15, $$0.K_());
            if ($$16 != null) {
               $$14.add($$16);
            }
         }

         List<tq> $$17 = new ArrayList<>();
         long[] $$18 = null;
         if ($$1.n().d() == dzw.a) {
            dzl $$19 = (dzl)$$1;
            $$17.addAll($$19.I());
            dyq $$20 = $$19.E();
            if ($$20 != null) {
               $$18 = $$20.a();
            }
         }

         Map<ecr.a, long[]> $$21 = new EnumMap<>(ecr.a.class);

         for (Entry<ecr.a, ecr> $$22 : $$1.e()) {
            if ($$1.n().e().contains($$22.getKey())) {
               long[] $$23 = $$22.getValue().a();
               $$21.put($$22.getKey(), (long[])$$23.clone());
            }
         }

         dyr.a $$24 = $$1.a($$0.ad());
         ShortList[] $$25 = Arrays.stream($$1.p()).map($$0x -> $$0x != null ? new ShortArrayList($$0x) : null).toArray(ShortList[]::new);
         tq $$26 = a(eob.a($$0), $$2, $$1.g(), $$1.h());
         return new eam(
            $$0.K_().e(mc.aI),
            $$2,
            $$1.ap(),
            $$0.ad(),
            $$1.w(),
            $$1.n(),
            x.a($$1.v(), edu::a),
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

   public tq a() {
      tq $$0 = uf.e(new tq());
      $$0.a("xPos", this.i.h);
      $$0.a("yPos", this.j);
      $$0.a("zPos", this.i.i);
      $$0.a("LastUpdate", this.k);
      $$0.a("InhabitedTime", this.l);
      $$0.a("Status", mb.l.b(this.m).toString());
      if (this.n != null) {
         edu.d.a.encodeStart(ue.a, this.n).resultOrPartial(A::error).ifPresent($$1x -> $$0.a("blending_data", $$1x));
      }

      if (this.o != null) {
         ecf.a.encodeStart(ue.a, this.o).resultOrPartial(A::error).ifPresent($$1x -> $$0.a("below_zero_retrogen", $$1x));
      }

      if (!this.p.a()) {
         $$0.a("UpgradeData", this.p.b());
      }

      tw $$1 = new tw();
      Codec<dzk<jr<dhj>>> $$2 = a(this.h);

      for (eam.b $$3 : this.v) {
         tq $$4 = new tq();
         dzc $$5 = $$3.b;
         if ($$5 != null) {
            $$4.a("block_states", (un)z.encodeStart(ue.a, $$5.h()).getOrThrow());
            $$4.a("biomes", (un)$$2.encodeStart(ue.a, $$5.i()).getOrThrow());
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

      tw $$6 = new tw();
      $$6.addAll(this.x);
      $$0.a("block_entities", $$6);
      if (this.m.d() == dzw.a) {
         tw $$7 = new tw();
         $$7.addAll(this.w);
         $$0.a("entities", $$7);
         if (this.q != null) {
            $$0.a("carving_mask", this.q);
         }
      }

      a($$0, this.s);
      $$0.a("PostProcessing", a(this.t));
      tq $$8 = new tq();
      this.r.forEach(($$1x, $$2x) -> $$8.a($$1x.a(), new tx($$2x)));
      $$0.a("Heightmaps", $$8);
      $$0.a("structures", this.y);
      return $$0;
   }

   private static void a(tq $$0, dyr.a $$1) {
      tw $$2 = new tw();

      for (fcq<djl> $$3 : $$1.a()) {
         $$2.add($$3.a($$0x -> mb.e.b($$0x).toString()));
      }

      $$0.a("block_ticks", $$2);
      tw $$4 = new tw();

      for (fcq<esx> $$5 : $$1.b()) {
         $$4.add($$5.a($$0x -> mb.c.b($$0x).toString()));
      }

      $$0.a("fluid_ticks", $$4);
   }

   public static dzw a(@Nullable tq $$0) {
      return $$0 != null ? dzs.a($$0.l("Status")).d() : dzw.a;
   }

   @Nullable
   private static dzb.c a(ard $$0, List<tq> $$1, List<tq> $$2) {
      return $$1.isEmpty() && $$2.isEmpty() ? null : $$3 -> {
         if (!$$1.isEmpty()) {
            $$0.a(bur.a($$1, $$0, buq.r));
         }

         for (tq $$4 : $$2) {
            boolean $$5 = $$4.q("keepPacked");
            if ($$5) {
               $$3.a($$4);
            } else {
               ji $$6 = dty.b($$4);
               dty $$7 = dty.a($$6, $$3.a_($$6), $$4, $$0.K_());
               if ($$7 != null) {
                  $$3.a($$7);
               }
            }
         }
      };
   }

   private static tq a(eob $$0, dfn $$1, Map<enl, ent> $$2, Map<enl, LongSet> $$3) {
      tq $$4 = new tq();
      tq $$5 = new tq();
      ke<enl> $$6 = $$0.b().e(mc.aU);

      for (Entry<enl, ent> $$7 : $$2.entrySet()) {
         akv $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      tq $$9 = new tq();

      for (Entry<enl, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            akv $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new tx($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<enl, ent> a(eob $$0, tq $$1, long $$2) {
      Map<enl, ent> $$3 = Maps.newHashMap();
      ke<enl> $$4 = $$0.b().e(mc.aU);
      tq $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         akv $$7 = akv.c($$6);
         enl $$8 = $$4.a($$7);
         if ($$8 == null) {
            A.error("Unknown structure start: {}", $$7);
         } else {
            ent $$9 = ent.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<enl, LongSet> a(kf $$0, dfn $$1, tq $$2) {
      Map<enl, LongSet> $$3 = Maps.newHashMap();
      ke<enl> $$4 = $$0.e(mc.aU);
      tq $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         akv $$7 = akv.c($$6);
         enl $$8 = $$4.a($$7);
         if ($$8 == null) {
            A.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  dfn $$3x = new dfn($$2x);
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

   private static tw a(ShortList[] $$0) {
      tw $$1 = new tw();

      for (ShortList $$2 : $$0) {
         tw $$3 = new tw();
         if ($$2 != null) {
            for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
               $$3.add(ui.a($$2.getShort($$4)));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }

   public ke<dhj> b() {
      return this.h;
   }

   public dfn c() {
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

   public dzs g() {
      return this.m;
   }

   @Nullable
   public edu.d h() {
      return this.n;
   }

   @Nullable
   public ecf i() {
      return this.o;
   }

   public dzo j() {
      return this.p;
   }

   @Nullable
   public long[] k() {
      return this.q;
   }

   public Map<ecr.a, long[]> l() {
      return this.r;
   }

   public dyr.a m() {
      return this.s;
   }

   public ShortList[] n() {
      return this.t;
   }

   public boolean o() {
      return this.u;
   }

   public List<eam.b> p() {
      return this.v;
   }

   public List<tq> q() {
      return this.w;
   }

   public List<tq> r() {
      return this.x;
   }

   public tq s() {
      return this.y;
   }

   public static class a extends ub {
      public a(String $$0) {
         super($$0);
      }
   }

   public static record b(int a, @Nullable dzc b, @Nullable dyw c, @Nullable dyw d) {
   }
}
