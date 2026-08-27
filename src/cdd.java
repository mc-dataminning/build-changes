import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cdd extends ccc implements brn<cdd.b> {
   public static final String b = "BucketVariantTag";
   private static final aiy<Integer> d = ajc.a(cdd.class, aja.b);
   public static final List<cdd.d> c = List.of(
      new cdd.d(cdd.b.h, cqc.b, cqc.h),
      new cdd.d(cdd.b.g, cqc.h, cqc.h),
      new cdd.d(cdd.b.g, cqc.h, cqc.l),
      new cdd.d(cdd.b.l, cqc.a, cqc.h),
      new cdd.d(cdd.b.b, cqc.l, cqc.h),
      new cdd.d(cdd.b.a, cqc.b, cqc.a),
      new cdd.d(cdd.b.f, cqc.g, cqc.d),
      new cdd.d(cdd.b.j, cqc.k, cqc.e),
      new cdd.d(cdd.b.l, cqc.a, cqc.o),
      new cdd.d(cdd.b.f, cqc.a, cqc.e),
      new cdd.d(cdd.b.i, cqc.a, cqc.h),
      new cdd.d(cdd.b.l, cqc.a, cqc.b),
      new cdd.d(cdd.b.d, cqc.j, cqc.g),
      new cdd.d(cdd.b.e, cqc.f, cqc.d),
      new cdd.d(cdd.b.k, cqc.o, cqc.a),
      new cdd.d(cdd.b.c, cqc.h, cqc.o),
      new cdd.d(cdd.b.j, cqc.o, cqc.a),
      new cdd.d(cdd.b.g, cqc.a, cqc.e),
      new cdd.d(cdd.b.a, cqc.o, cqc.a),
      new cdd.d(cdd.b.b, cqc.h, cqc.a),
      new cdd.d(cdd.b.d, cqc.j, cqc.e),
      new cdd.d(cdd.b.g, cqc.e, cqc.e)
   );
   private boolean e = true;

   public cdd(bqb<? extends cdd> $$0, cyx $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(cdd.b $$0, cqc $$1, cqc $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cqc t(int $$0) {
      return cqc.a($$0 >> 16 & 0xFF);
   }

   public static cqc u(int $$0) {
      return cqc.a($$0 >> 24 & 0xFF);
   }

   public static cdd.b v(int $$0) {
      return cdd.b.a($$0 & 65535);
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("Variant", this.gz());
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
   }

   private void w(int $$0) {
      this.an.a(d, $$0);
   }

   @Override
   public boolean d(int $$0) {
      return !this.e;
   }

   private int gz() {
      return this.an.a(d);
   }

   public cqc gw() {
      return t(this.gz());
   }

   public cqc gx() {
      return u(this.gz());
   }

   public cdd.b gy() {
      return v(this.gz());
   }

   public void a(cdd.b $$0) {
      int $$1 = this.gz();
      cqc $$2 = t($$1);
      cqc $$3 = u($$1);
      this.w(a($$0, $$2, $$3));
   }

   @Override
   public void n(crj $$0) {
      super.n($$0);
      ctt.a(jp.E, $$0, $$0x -> $$0x.a("BucketVariantTag", this.gz()));
   }

   @Override
   public crj b() {
      return new crj(crm.qH);
   }

   @Override
   protected aul v() {
      return aum.zq;
   }

   @Override
   protected aul o_() {
      return aum.zr;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.zt;
   }

   @Override
   protected aul go() {
      return aum.zs;
   }

   @Override
   public void c(tm $$0) {
      super.c($$0);
      if ($$0.b("BucketVariantTag", 3)) {
         this.w($$0.h("BucketVariantTag"));
      }
   }

   @Nullable
   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      axr $$4 = $$0.E_();
      cdd.d $$6;
      if ($$3 instanceof cdd.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ac.a(c, $$4);
         $$3 = new cdd.c(this, $$6);
      } else {
         this.e = false;
         cdd.b[] $$8 = cdd.b.values();
         cqc[] $$9 = cqc.values();
         cdd.b $$10 = ac.a($$8, $$4);
         cqc $$11 = ac.a($$9, $$4);
         cqc $$12 = ac.a($$9, $$4);
         $$6 = new cdd.d($$10, $$11, $$12);
      }

      this.w($$6.a());
      return $$3;
   }

   public static boolean b(bqb<cdd> $$0, cyy $$1, bqs $$2, ib $$3, axr $$4) {
      return $$1.b_($$3.d()).a(avh.a) && $$1.a_($$3.c()).a(dca.G) && ($$1.t($$3).a(avb.an) || cdf.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements aye {
      a("kob", cdd.a.a, 0),
      b("sunstreak", cdd.a.a, 1),
      c("snooper", cdd.a.a, 2),
      d("dasher", cdd.a.a, 3),
      e("brinely", cdd.a.a, 4),
      f("spotty", cdd.a.a, 5),
      g("flopper", cdd.a.b, 0),
      h("stripey", cdd.a.b, 1),
      i("glitter", cdd.a.b, 2),
      j("blockfish", cdd.a.b, 3),
      k("betty", cdd.a.b, 4),
      l("clayfish", cdd.a.b, 5);

      public static final Codec<cdd.b> m = aye.a(cdd.b::values);
      private static final IntFunction<cdd.b> n = awb.a(cdd.b::b, values(), a);
      private final String o;
      private final wg p;
      private final cdd.a q;
      private final int r;

      private b(String $$0, cdd.a $$1, int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = wg.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static cdd.b a(int $$0) {
         return n.apply($$0);
      }

      public cdd.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public wg d() {
         return this.p;
      }
   }

   static class c extends ccc.a {
      final cdd.d b;

      c(cdd $$0, cdd.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(cdd.b b, cqc c, cqc d) {
      public static final Codec<cdd.d> a = Codec.INT.xmap(cdd.d::new, cdd.d::a);

      public d(int $$0) {
         this(cdd.v($$0), cdd.t($$0), cdd.u($$0));
      }

      public int a() {
         return cdd.a(this.b, this.c, this.d);
      }
   }
}
