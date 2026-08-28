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

public record dzl(
   kd<dgo> h,
   des i,
   int j,
   long k,
   long l,
   dyr m,
   @Nullable ect.d n,
   @Nullable ebe o,
   dyn p,
   @Nullable long[] q,
   Map<ebq.a, long[]> r,
   dxq.a s,
   ShortList[] t,
   boolean u,
   List<dzl.b> v,
   List<ul> w,
   List<ul> x,
   ul y
) {
   private static final Codec<dyi<dvv>> z = dyi.a(diq.q, dvv.a, dyi.d.d, dis.a.m());
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
   public static dzl a(dfo $$0, ke $$1, ul $$2) {
      if (!$$2.b("Status", 8)) {
         return null;
      } else {
         des $$3 = new des($$2.h("xPos"), $$2.h("zPos"));
         long $$4 = $$2.i("LastUpdate");
         long $$5 = $$2.i("InhabitedTime");
         dyr $$6 = dyr.a($$2.l("Status"));
         dyn $$7 = $$2.b("UpgradeData", 10) ? new dyn($$2.p("UpgradeData"), $$0) : dyn.a;
         boolean $$8 = $$2.q("isLightOn");
         ect.d $$9;
         if ($$2.b("blending_data", 10)) {
            $$9 = (ect.d)ect.d.a.parse(uz.a, $$2.p("blending_data")).resultOrPartial(A::error).orElse(null);
         } else {
            $$9 = null;
         }

         ebe $$11;
         if ($$2.b("below_zero_retrogen", 10)) {
            $$11 = (ebe)ebe.a.parse(uz.a, $$2.p("below_zero_retrogen")).resultOrPartial(A::error).orElse(null);
         } else {
            $$11 = null;
         }

         long[] $$13;
         if ($$2.b("carving_mask", 12)) {
            $$13 = $$2.o("carving_mask");
         } else {
            $$13 = null;
         }

         ul $$15 = $$2.p("Heightmaps");
         Map<ebq.a, long[]> $$16 = new EnumMap<>(ebq.a.class);

         for (ebq.a $$17 : $$6.e()) {
            String $$18 = $$17.a();
            if ($$15.b($$18, 12)) {
               $$16.put($$17, $$15.o($$18));
            }
         }

         List<fbp<diq>> $$19 = fbp.a($$2.c("block_ticks", 10), $$0x -> lz.e.b(alj.c($$0x)), $$3);
         List<fbp<eru>> $$20 = fbp.a($$2.c("fluid_ticks", 10), $$0x -> lz.c.b(alj.c($$0x)), $$3);
         dxq.a $$21 = new dxq.a($$19, $$20);
         ur $$22 = $$2.c("PostProcessing", 9);
         ShortList[] $$23 = new ShortList[$$22.size()];

         for (int $$24 = 0; $$24 < $$22.size(); $$24++) {
            ur $$25 = $$22.b($$24);
            ShortList $$26 = new ShortArrayList($$25.size());

            for (int $$27 = 0; $$27 < $$25.size(); $$27++) {
               $$26.add($$25.d($$27));
            }

            $$23[$$24] = $$26;
         }

         List<ul> $$28 = Lists.transform($$2.c("entities", 10), $$0x -> (ul)$$0x);
         List<ul> $$29 = Lists.transform($$2.c("block_entities", 10), $$0x -> (ul)$$0x);
         ul $$30 = $$2.p("structures");
         ur $$31 = $$2.c("sections", 10);
         List<dzl.b> $$32 = new ArrayList<>($$31.size());
         kd<dgo> $$33 = $$1.e(ma.aG);
         Codec<dyj<jq<dgo>>> $$34 = a($$33);

         for (int $$35 = 0; $$35 < $$31.size(); $$35++) {
            ul $$36 = $$31.a($$35);
            int $$37 = $$36.f("Y");
            dyb $$42;
            if ($$37 >= $$0.an() && $$37 <= $$0.ao()) {
               dyi<dvv> $$38;
               if ($$36.b("block_states", 10)) {
                  $$38 = (dyi<dvv>)z.parse(uz.a, $$36.p("block_states")).promotePartial($$2x -> a($$3, $$37, $$2x)).getOrThrow(dzl.a::new);
               } else {
                  $$38 = new dyi<>(diq.q, dis.a.m(), dyi.d.d);
               }

               dyj<jq<dgo>> $$40;
               if ($$36.b("biomes", 10)) {
                  $$40 = (dyj<jq<dgo>>)$$34.parse(uz.a, $$36.p("biomes")).promotePartial($$2x -> a($$3, $$37, $$2x)).getOrThrow(dzl.a::new);
               } else {
                  $$40 = new dyi<>($$33.t(), $$33.b(dgv.b), dyi.d.e);
               }

               $$42 = new dyb($$38, $$40);
            } else {
               $$42 = null;
            }

            dxv $$44 = $$36.b("BlockLight", 7) ? new dxv($$36.m("BlockLight")) : null;
            dxv $$45 = $$36.b("SkyLight", 7) ? new dxv($$36.m("SkyLight")) : null;
            $$32.add(new dzl.b($$37, $$42, $$44, $$45));
         }

         return new dzl($$33, $$3, $$0.an(), $$4, $$5, $$6, $$9, $$11, $$7, $$13, $$16, $$21, $$23, $$8, $$32, $$28, $$29, $$30);
      }
   }

   public dyk a(arp $$0, cgl $$1, dzj $$2, des $$3) {
      if (!Objects.equals($$3, this.i)) {
         A.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$3, $$3, this.i});
         $$0.p().a(this.i, $$3, $$2);
      }

      int $$4 = $$0.am();
      dyb[] $$5 = new dyb[$$4];
      boolean $$6 = $$0.F_().g();
      dxu $$7 = $$0.m();
      erk $$8 = $$7.p();
      kd<dgo> $$9 = $$0.J_().e(ma.aG);
      boolean $$10 = false;

      for (dzl.b $$11 : this.v) {
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
               $$8.a(dfv.b, $$12, $$11.c);
            }

            if ($$14) {
               $$8.a(dfv.a, $$12, $$11.d);
            }
         }
      }

      dyv $$15 = this.m.d();
      dxq $$18;
      if ($$15 == dyv.b) {
         fbl<diq> $$16 = new fbl<>(this.s.a());
         fbl<eru> $$17 = new fbl<>(this.s.b());
         $$18 = new dya($$0.a(), $$3, this.p, $$16, $$17, this.l, $$5, a($$0, this.w, this.x), ect.a(this.n));
      } else {
         fbo<diq> $$19 = fbo.a(this.s.a());
         fbo<eru> $$20 = fbo.a(this.s.b());
         dyk $$21 = new dyk($$3, this.p, $$5, $$19, $$20, $$0, $$9, ect.a(this.n));
         $$18 = $$21;
         $$21.c(this.l);
         if (this.o != null) {
            $$21.a(this.o);
         }

         $$21.a(this.m);
         if (this.m.a(dyr.k)) {
            $$21.a($$8);
         }
      }

      $$18.b(this.u);
      EnumSet<ebq.a> $$23 = EnumSet.noneOf(ebq.a.class);

      for (ebq.a $$24 : $$18.j().e()) {
         long[] $$25 = this.r.get($$24);
         if ($$25 != null) {
            $$18.a($$24, $$25);
         } else {
            $$23.add($$24);
         }
      }

      ebq.a($$18, $$23);
      $$18.a(a(emy.a($$0), this.y, $$0.D()));
      $$18.b(a($$0.J_(), $$3, this.y));

      for (int $$26 = 0; $$26 < this.t.length; $$26++) {
         $$18.a(this.t[$$26], $$26);
      }

      if ($$15 == dyv.b) {
         return new dxz((dya)$$18, false);
      } else {
         dyk $$27 = (dyk)$$18;

         for (ul $$28 : this.w) {
            $$27.b($$28);
         }

         for (ul $$29 : this.x) {
            $$27.a($$29);
         }

         if (this.q != null) {
            $$27.a(new dxp(this.q, $$18.K_()));
         }

         return $$27;
      }
   }

   private static void a(des $$0, int $$1, String $$2) {
      A.error("Recoverable errors when loading section [{}, {}, {}]: {}", new Object[]{$$0.g, $$1, $$0.h, $$2});
   }

   private static Codec<dyj<jq<dgo>>> a(kd<dgo> $$0) {
      return dyi.b($$0.t(), $$0.r(), dyi.d.e, $$0.b(dgv.b));
   }

   public static dzl a(arp $$0, dxq $$1) {
      des $$2 = $$1.f();
      List<dzl.b> $$3 = new ArrayList<>();
      dyb[] $$4 = $$1.d();
      erk $$5 = $$0.m().a();

      for (int $$6 = $$5.d(); $$6 < $$5.e(); $$6++) {
         int $$7 = $$1.g($$6);
         boolean $$8 = $$7 >= 0 && $$7 < $$4.length;
         dxv $$9 = $$5.a(dfv.b).a(kj.a($$2, $$6));
         dxv $$10 = $$5.a(dfv.a).a(kj.a($$2, $$6));
         dxv $$11 = $$9 != null && !$$9.d() ? $$9.b() : null;
         dxv $$12 = $$10 != null && !$$10.d() ? $$10.b() : null;
         if ($$8 || $$11 != null || $$12 != null) {
            dyb $$13 = $$8 ? $$4[$$7].k() : null;
            $$3.add(new dzl.b($$6, $$13, $$11, $$12));
         }
      }

      List<ul> $$14 = new ArrayList<>($$1.c().size());

      for (jh $$15 : $$1.c()) {
         ul $$16 = $$1.a($$15, $$0.J_());
         if ($$16 != null) {
            $$14.add($$16);
         }
      }

      List<ul> $$17 = new ArrayList<>();
      long[] $$18 = null;
      if ($$1.j().d() == dyv.a) {
         dyk $$19 = (dyk)$$1;
         $$17.addAll($$19.F());
         dxp $$20 = $$19.B();
         if ($$20 != null) {
            $$18 = $$20.a();
         }
      }

      Map<ebq.a, long[]> $$21 = new EnumMap<>(ebq.a.class);

      for (Entry<ebq.a, ebq> $$22 : $$1.e()) {
         if ($$1.j().e().contains($$22.getKey())) {
            long[] $$23 = $$22.getValue().a();
            $$21.put($$22.getKey(), (long[])$$23.clone());
         }
      }

      dxq.a $$24 = $$1.a($$0.ab());
      ShortList[] $$25 = Arrays.stream($$1.n()).map($$0x -> $$0x != null ? new ShortArrayList($$0x) : null).toArray(ShortList[]::new);
      ul $$26 = a(emy.a($$0), $$2, $$1.g(), $$1.h());
      return new dzl(
         $$0.J_().e(ma.aG),
         $$2,
         $$1.an(),
         $$0.ab(),
         $$1.t(),
         $$1.j(),
         x.a($$1.s(), ect::a),
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

   public ul a() {
      ul $$0 = va.e(new ul());
      $$0.a("xPos", this.i.g);
      $$0.a("yPos", this.j);
      $$0.a("zPos", this.i.h);
      $$0.a("LastUpdate", this.k);
      $$0.a("InhabitedTime", this.l);
      $$0.a("Status", lz.l.b(this.m).toString());
      if (this.n != null) {
         ect.d.a.encodeStart(uz.a, this.n).resultOrPartial(A::error).ifPresent($$1x -> $$0.a("blending_data", $$1x));
      }

      if (this.o != null) {
         ebe.a.encodeStart(uz.a, this.o).resultOrPartial(A::error).ifPresent($$1x -> $$0.a("below_zero_retrogen", $$1x));
      }

      if (!this.p.a()) {
         $$0.a("UpgradeData", this.p.b());
      }

      ur $$1 = new ur();
      Codec<dyj<jq<dgo>>> $$2 = a(this.h);

      for (dzl.b $$3 : this.v) {
         ul $$4 = new ul();
         dyb $$5 = $$3.b;
         if ($$5 != null) {
            $$4.a("block_states", (vi)z.encodeStart(uz.a, $$5.h()).getOrThrow());
            $$4.a("biomes", (vi)$$2.encodeStart(uz.a, $$5.i()).getOrThrow());
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

      ur $$6 = new ur();
      $$6.addAll(this.x);
      $$0.a("block_entities", $$6);
      if (this.m.d() == dyv.a) {
         ur $$7 = new ur();
         $$7.addAll(this.w);
         $$0.a("entities", $$7);
         if (this.q != null) {
            $$0.a("carving_mask", this.q);
         }
      }

      a($$0, this.s);
      $$0.a("PostProcessing", a(this.t));
      ul $$8 = new ul();
      this.r.forEach(($$1x, $$2x) -> $$8.a($$1x.a(), new us($$2x)));
      $$0.a("Heightmaps", $$8);
      $$0.a("structures", this.y);
      return $$0;
   }

   private static void a(ul $$0, dxq.a $$1) {
      ur $$2 = new ur();

      for (fbp<diq> $$3 : $$1.a()) {
         $$2.add($$3.a($$0x -> lz.e.b($$0x).toString()));
      }

      $$0.a("block_ticks", $$2);
      ur $$4 = new ur();

      for (fbp<eru> $$5 : $$1.b()) {
         $$4.add($$5.a($$0x -> lz.c.b($$0x).toString()));
      }

      $$0.a("fluid_ticks", $$4);
   }

   public static dyv a(@Nullable ul $$0) {
      return $$0 != null ? dyr.a($$0.l("Status")).d() : dyv.a;
   }

   @Nullable
   private static dya.c a(arp $$0, List<ul> $$1, List<ul> $$2) {
      return $$1.isEmpty() && $$2.isEmpty() ? null : $$3 -> {
         if (!$$1.isEmpty()) {
            $$0.a(bus.a($$1, $$0, bur.r));
         }

         for (ul $$4 : $$2) {
            boolean $$5 = $$4.q("keepPacked");
            if ($$5) {
               $$3.a($$4);
            } else {
               jh $$6 = dsy.b($$4);
               dsy $$7 = dsy.a($$6, $$3.a_($$6), $$4, $$0.J_());
               if ($$7 != null) {
                  $$3.a($$7);
               }
            }
         }
      };
   }

   private static ul a(emy $$0, des $$1, Map<emi, emq> $$2, Map<emi, LongSet> $$3) {
      ul $$4 = new ul();
      ul $$5 = new ul();
      kd<emi> $$6 = $$0.b().e(ma.aS);

      for (Entry<emi, emq> $$7 : $$2.entrySet()) {
         alj $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      ul $$9 = new ul();

      for (Entry<emi, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            alj $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new us($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<emi, emq> a(emy $$0, ul $$1, long $$2) {
      Map<emi, emq> $$3 = Maps.newHashMap();
      kd<emi> $$4 = $$0.b().e(ma.aS);
      ul $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         alj $$7 = alj.c($$6);
         emi $$8 = $$4.a($$7);
         if ($$8 == null) {
            A.error("Unknown structure start: {}", $$7);
         } else {
            emq $$9 = emq.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<emi, LongSet> a(ke $$0, des $$1, ul $$2) {
      Map<emi, LongSet> $$3 = Maps.newHashMap();
      kd<emi> $$4 = $$0.e(ma.aS);
      ul $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         alj $$7 = alj.c($$6);
         emi $$8 = $$4.a($$7);
         if ($$8 == null) {
            A.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  des $$3x = new des($$2x);
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

   private static ur a(ShortList[] $$0) {
      ur $$1 = new ur();

      for (ShortList $$2 : $$0) {
         ur $$3 = new ur();
         if ($$2 != null) {
            for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
               $$3.add(vd.a($$2.getShort($$4)));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }

   public kd<dgo> b() {
      return this.h;
   }

   public des c() {
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

   public dyr g() {
      return this.m;
   }

   @Nullable
   public ect.d h() {
      return this.n;
   }

   @Nullable
   public ebe i() {
      return this.o;
   }

   public dyn j() {
      return this.p;
   }

   @Nullable
   public long[] k() {
      return this.q;
   }

   public Map<ebq.a, long[]> l() {
      return this.r;
   }

   public dxq.a m() {
      return this.s;
   }

   public ShortList[] n() {
      return this.t;
   }

   public boolean o() {
      return this.u;
   }

   public List<dzl.b> p() {
      return this.v;
   }

   public List<ul> q() {
      return this.w;
   }

   public List<ul> r() {
      return this.x;
   }

   public ul s() {
      return this.y;
   }

   public static class a extends uw {
      public a(String $$0) {
         super($$0);
      }
   }

   public static record b(int a, @Nullable dyb b, @Nullable dxv c, @Nullable dxv d) {
   }
}
