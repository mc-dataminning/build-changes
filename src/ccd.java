import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class ccd extends cbc implements bqn<ccd.b> {
   public static final String b = "BucketVariantTag";
   private static final aim<Integer> d = aiq.a(ccd.class, aio.b);
   public static final List<ccd.d> c = List.of(
      new ccd.d(ccd.b.h, cpb.b, cpb.h),
      new ccd.d(ccd.b.g, cpb.h, cpb.h),
      new ccd.d(ccd.b.g, cpb.h, cpb.l),
      new ccd.d(ccd.b.l, cpb.a, cpb.h),
      new ccd.d(ccd.b.b, cpb.l, cpb.h),
      new ccd.d(ccd.b.a, cpb.b, cpb.a),
      new ccd.d(ccd.b.f, cpb.g, cpb.d),
      new ccd.d(ccd.b.j, cpb.k, cpb.e),
      new ccd.d(ccd.b.l, cpb.a, cpb.o),
      new ccd.d(ccd.b.f, cpb.a, cpb.e),
      new ccd.d(ccd.b.i, cpb.a, cpb.h),
      new ccd.d(ccd.b.l, cpb.a, cpb.b),
      new ccd.d(ccd.b.d, cpb.j, cpb.g),
      new ccd.d(ccd.b.e, cpb.f, cpb.d),
      new ccd.d(ccd.b.k, cpb.o, cpb.a),
      new ccd.d(ccd.b.c, cpb.h, cpb.o),
      new ccd.d(ccd.b.j, cpb.o, cpb.a),
      new ccd.d(ccd.b.g, cpb.a, cpb.e),
      new ccd.d(ccd.b.a, cpb.o, cpb.a),
      new ccd.d(ccd.b.b, cpb.h, cpb.a),
      new ccd.d(ccd.b.d, cpb.j, cpb.e),
      new ccd.d(ccd.b.g, cpb.e, cpb.e)
   );
   private boolean e = true;

   public ccd(bpc<? extends ccd> $$0, cwz $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(ccd.b $$0, cpb $$1, cpb $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cpb t(int $$0) {
      return cpb.a($$0 >> 16 & 0xFF);
   }

   public static cpb u(int $$0) {
      return cpb.a($$0 >> 24 & 0xFF);
   }

   public static ccd.b v(int $$0) {
      return ccd.b.a($$0 & 65535);
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("Variant", this.gz());
   }

   @Override
   public void a(ta $$0) {
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

   public cpb gw() {
      return t(this.gz());
   }

   public cpb gx() {
      return u(this.gz());
   }

   public ccd.b gy() {
      return v(this.gz());
   }

   public void a(ccd.b $$0) {
      int $$1 = this.gz();
      cpb $$2 = t($$1);
      cpb $$3 = u($$1);
      this.w(a($$0, $$2, $$3));
   }

   @Override
   public void n(cqk $$0) {
      super.n($$0);
      ta $$1 = $$0.x();
      $$1.a("BucketVariantTag", this.gz());
   }

   @Override
   public cqk b() {
      return new cqk(cqn.qH);
   }

   @Override
   protected atx v() {
      return aty.zi;
   }

   @Override
   protected atx n_() {
      return aty.zj;
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.zl;
   }

   @Override
   protected atx go() {
      return aty.zk;
   }

   @Override
   public void c(ta $$0) {
      super.c($$0);
      if ($$0.b("BucketVariantTag", 3)) {
         this.w($$0.h("BucketVariantTag"));
      }
   }

   @Nullable
   @Override
   public bqg a(cxo $$0, bna $$1, bps $$2, @Nullable bqg $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      axd $$4 = $$0.E_();
      ccd.d $$6;
      if ($$3 instanceof ccd.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ac.a(c, $$4);
         $$3 = new ccd.c(this, $$6);
      } else {
         this.e = false;
         ccd.b[] $$8 = ccd.b.values();
         cpb[] $$9 = cpb.values();
         ccd.b $$10 = ac.a($$8, $$4);
         cpb $$11 = ac.a($$9, $$4);
         cpb $$12 = ac.a($$9, $$4);
         $$6 = new ccd.d($$10, $$11, $$12);
      }

      this.w($$6.a());
      return $$3;
   }

   public static boolean b(bpc<ccd> $$0, cxa $$1, bps $$2, ib $$3, axd $$4) {
      return $$1.b_($$3.d()).a(aus.a) && $$1.a_($$3.c()).a(dac.G) && ($$1.t($$3).a(aum.an) || ccf.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements axq {
      a("kob", ccd.a.a, 0),
      b("sunstreak", ccd.a.a, 1),
      c("snooper", ccd.a.a, 2),
      d("dasher", ccd.a.a, 3),
      e("brinely", ccd.a.a, 4),
      f("spotty", ccd.a.a, 5),
      g("flopper", ccd.a.b, 0),
      h("stripey", ccd.a.b, 1),
      i("glitter", ccd.a.b, 2),
      j("blockfish", ccd.a.b, 3),
      k("betty", ccd.a.b, 4),
      l("clayfish", ccd.a.b, 5);

      public static final Codec<ccd.b> m = axq.a(ccd.b::values);
      private static final IntFunction<ccd.b> n = avn.a(ccd.b::b, values(), a);
      private final String o;
      private final vu p;
      private final ccd.a q;
      private final int r;

      private b(String $$0, ccd.a $$1, int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = vu.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static ccd.b a(int $$0) {
         return n.apply($$0);
      }

      public ccd.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public vu d() {
         return this.p;
      }
   }

   static class c extends cbc.a {
      final ccd.d b;

      c(ccd $$0, ccd.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(ccd.b a, cpb b, cpb c) {
      public int a() {
         return ccd.a(this.a, this.b, this.c);
      }

      public ccd.b b() {
         return this.a;
      }

      public cpb c() {
         return this.b;
      }

      public cpb d() {
         return this.c;
      }
   }
}
