import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cio extends chm implements bwx<cio.b> {
   public static final String a = "BucketVariantTag";
   private static final aks<Integer> c = akw.a(cio.class, aku.b);
   public static final List<cio.d> b = List.of(
      new cio.d(cio.b.h, cwd.b, cwd.h),
      new cio.d(cio.b.g, cwd.h, cwd.h),
      new cio.d(cio.b.g, cwd.h, cwd.l),
      new cio.d(cio.b.l, cwd.a, cwd.h),
      new cio.d(cio.b.b, cwd.l, cwd.h),
      new cio.d(cio.b.a, cwd.b, cwd.a),
      new cio.d(cio.b.f, cwd.g, cwd.d),
      new cio.d(cio.b.j, cwd.k, cwd.e),
      new cio.d(cio.b.l, cwd.a, cwd.o),
      new cio.d(cio.b.f, cwd.a, cwd.e),
      new cio.d(cio.b.i, cwd.a, cwd.h),
      new cio.d(cio.b.l, cwd.a, cwd.b),
      new cio.d(cio.b.d, cwd.j, cwd.g),
      new cio.d(cio.b.e, cwd.f, cwd.d),
      new cio.d(cio.b.k, cwd.o, cwd.a),
      new cio.d(cio.b.c, cwd.h, cwd.o),
      new cio.d(cio.b.j, cwd.o, cwd.a),
      new cio.d(cio.b.g, cwd.a, cwd.e),
      new cio.d(cio.b.a, cwd.o, cwd.a),
      new cio.d(cio.b.b, cwd.h, cwd.a),
      new cio.d(cio.b.d, cwd.j, cwd.e),
      new cio.d(cio.b.g, cwd.e, cwd.e)
   );
   private boolean bZ = true;

   public cio(bvi<? extends cio> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public static String b(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(cio.b $$0, cwd $$1, cwd $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cwd c(int $$0) {
      return cwd.a($$0 >> 16 & 0xFF);
   }

   public static cwd r(int $$0) {
      return cwd.a($$0 >> 24 & 0xFF);
   }

   public static cio.b s(int $$0) {
      return cio.b.a($$0 & 65535);
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(c, 0);
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("Variant", this.gz());
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.u($$0.h("Variant"));
   }

   private void u(int $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public boolean q(int $$0) {
      return !this.bZ;
   }

   private int gz() {
      return this.al.a(c);
   }

   public cwd gw() {
      return c(this.gz());
   }

   public cwd gx() {
      return r(this.gz());
   }

   public cio.b gy() {
      return s(this.gz());
   }

   public void a(cio.b $$0) {
      int $$1 = this.gz();
      cwd $$2 = c($$1);
      cwd $$3 = r($$1);
      this.u(a($$0, $$2, $$3));
   }

   @Override
   public void i(cxg $$0) {
      super.i($$0);
      czp.a(ku.X, $$0, $$0x -> $$0x.a("BucketVariantTag", this.gz()));
   }

   @Override
   public cxg X_() {
      return new cxg(cxk.rp);
   }

   @Override
   protected awu u() {
      return awv.AB;
   }

   @Override
   protected awu o_() {
      return awv.AC;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.AE;
   }

   @Override
   protected awu go() {
      return awv.AD;
   }

   @Override
   public void h(um $$0) {
      super.h($$0);
      if ($$0.b("BucketVariantTag", 3)) {
         this.u($$0.h("BucketVariantTag"));
      }
   }

   @Nullable
   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      bac $$4 = $$0.H_();
      cio.d $$6;
      if ($$3 instanceof cio.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ae.a(b, $$4);
         $$3 = new cio.c(this, $$6);
      } else {
         this.bZ = false;
         cio.b[] $$8 = cio.b.values();
         cwd[] $$9 = cwd.values();
         cio.b $$10 = ae.a($$8, $$4);
         cwd $$11 = ae.a($$9, $$4);
         cwd $$12 = ae.a($$9, $$4);
         $$6 = new cio.d($$10, $$11, $$12);
      }

      this.u($$6.a());
      return $$3;
   }

   public static boolean b(bvi<cio> $$0, dha $$1, bvh $$2, jh $$3, bac $$4) {
      return $$1.b_($$3.e()).a(axq.a) && $$1.a_($$3.d()).a(dkf.J) && ($$1.t($$3).a(axj.an) || ciq.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements baq {
      a("kob", cio.a.a, 0),
      b("sunstreak", cio.a.a, 1),
      c("snooper", cio.a.a, 2),
      d("dasher", cio.a.a, 3),
      e("brinely", cio.a.a, 4),
      f("spotty", cio.a.a, 5),
      g("flopper", cio.a.b, 0),
      h("stripey", cio.a.b, 1),
      i("glitter", cio.a.b, 2),
      j("blockfish", cio.a.b, 3),
      k("betty", cio.a.b, 4),
      l("clayfish", cio.a.b, 5);

      public static final Codec<cio.b> m = baq.a(cio.b::values);
      private static final IntFunction<cio.b> n = ayl.a(cio.b::b, values(), a);
      private final String o;
      private final xk p;
      private final cio.a q;
      private final int r;

      private b(final String $$0, final cio.a $$1, final int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = xk.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static cio.b a(int $$0) {
         return n.apply($$0);
      }

      public cio.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public xk d() {
         return this.p;
      }
   }

   static class c extends chm.a {
      final cio.d b;

      c(cio $$0, cio.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(cio.b b, cwd c, cwd d) {
      public static final Codec<cio.d> a = Codec.INT.xmap(cio.d::new, cio.d::a);

      public d(int $$0) {
         this(cio.s($$0), cio.c($$0), cio.r($$0));
      }

      public int a() {
         return cio.a(this.b, this.c, this.d);
      }
   }
}
