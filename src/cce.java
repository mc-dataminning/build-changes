import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cce extends cbd implements bqo<cce.b> {
   public static final String b = "BucketVariantTag";
   private static final aim<Integer> d = aiq.a(cce.class, aio.b);
   public static final List<cce.d> c = List.of(
      new cce.d(cce.b.h, cpd.b, cpd.h),
      new cce.d(cce.b.g, cpd.h, cpd.h),
      new cce.d(cce.b.g, cpd.h, cpd.l),
      new cce.d(cce.b.l, cpd.a, cpd.h),
      new cce.d(cce.b.b, cpd.l, cpd.h),
      new cce.d(cce.b.a, cpd.b, cpd.a),
      new cce.d(cce.b.f, cpd.g, cpd.d),
      new cce.d(cce.b.j, cpd.k, cpd.e),
      new cce.d(cce.b.l, cpd.a, cpd.o),
      new cce.d(cce.b.f, cpd.a, cpd.e),
      new cce.d(cce.b.i, cpd.a, cpd.h),
      new cce.d(cce.b.l, cpd.a, cpd.b),
      new cce.d(cce.b.d, cpd.j, cpd.g),
      new cce.d(cce.b.e, cpd.f, cpd.d),
      new cce.d(cce.b.k, cpd.o, cpd.a),
      new cce.d(cce.b.c, cpd.h, cpd.o),
      new cce.d(cce.b.j, cpd.o, cpd.a),
      new cce.d(cce.b.g, cpd.a, cpd.e),
      new cce.d(cce.b.a, cpd.o, cpd.a),
      new cce.d(cce.b.b, cpd.h, cpd.a),
      new cce.d(cce.b.d, cpd.j, cpd.e),
      new cce.d(cce.b.g, cpd.e, cpd.e)
   );
   private boolean e = true;

   public cce(bpd<? extends cce> $$0, cxb $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(cce.b $$0, cpd $$1, cpd $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cpd t(int $$0) {
      return cpd.a($$0 >> 16 & 0xFF);
   }

   public static cpd u(int $$0) {
      return cpd.a($$0 >> 24 & 0xFF);
   }

   public static cce.b v(int $$0) {
      return cce.b.a($$0 & 65535);
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

   public cpd gw() {
      return t(this.gz());
   }

   public cpd gx() {
      return u(this.gz());
   }

   public cce.b gy() {
      return v(this.gz());
   }

   public void a(cce.b $$0) {
      int $$1 = this.gz();
      cpd $$2 = t($$1);
      cpd $$3 = u($$1);
      this.w(a($$0, $$2, $$3));
   }

   @Override
   public void n(cqm $$0) {
      super.n($$0);
      ta $$1 = $$0.x();
      $$1.a("BucketVariantTag", this.gz());
   }

   @Override
   public cqm b() {
      return new cqm(cqp.qH);
   }

   @Override
   protected atx v() {
      return aty.zn;
   }

   @Override
   protected atx n_() {
      return aty.zo;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.zq;
   }

   @Override
   protected atx go() {
      return aty.zp;
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
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      axd $$4 = $$0.E_();
      cce.d $$6;
      if ($$3 instanceof cce.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ac.a(c, $$4);
         $$3 = new cce.c(this, $$6);
      } else {
         this.e = false;
         cce.b[] $$8 = cce.b.values();
         cpd[] $$9 = cpd.values();
         cce.b $$10 = ac.a($$8, $$4);
         cpd $$11 = ac.a($$9, $$4);
         cpd $$12 = ac.a($$9, $$4);
         $$6 = new cce.d($$10, $$11, $$12);
      }

      this.w($$6.a());
      return $$3;
   }

   public static boolean b(bpd<cce> $$0, cxc $$1, bpt $$2, ib $$3, axd $$4) {
      return $$1.b_($$3.d()).a(aus.a) && $$1.a_($$3.c()).a(dae.G) && ($$1.t($$3).a(aum.an) || ccg.c($$0, $$1, $$2, $$3, $$4));
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
      a("kob", cce.a.a, 0),
      b("sunstreak", cce.a.a, 1),
      c("snooper", cce.a.a, 2),
      d("dasher", cce.a.a, 3),
      e("brinely", cce.a.a, 4),
      f("spotty", cce.a.a, 5),
      g("flopper", cce.a.b, 0),
      h("stripey", cce.a.b, 1),
      i("glitter", cce.a.b, 2),
      j("blockfish", cce.a.b, 3),
      k("betty", cce.a.b, 4),
      l("clayfish", cce.a.b, 5);

      public static final Codec<cce.b> m = axq.a(cce.b::values);
      private static final IntFunction<cce.b> n = avn.a(cce.b::b, values(), a);
      private final String o;
      private final vu p;
      private final cce.a q;
      private final int r;

      private b(String $$0, cce.a $$1, int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = vu.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static cce.b a(int $$0) {
         return n.apply($$0);
      }

      public cce.a a() {
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

   static class c extends cbd.a {
      final cce.d b;

      c(cce $$0, cce.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(cce.b a, cpd b, cpd c) {
      public int a() {
         return cce.a(this.a, this.b, this.c);
      }

      public cce.b b() {
         return this.a;
      }

      public cpd c() {
         return this.b;
      }

      public cpd d() {
         return this.c;
      }
   }
}
