import com.google.common.collect.Lists;
import com.mojang.serialization.DynamicLike;
import java.util.List;

public class dyn {
   public static final double b = 5.999997E7F;
   public static final double c = 2.9999984E7;
   private final List<dyl> a = Lists.newArrayList();
   private double e = 0.2;
   private double f = 5.0;
   private int g = 15;
   private int h = 5;
   private double i;
   private double j;
   int k = 29999984;
   private dyn.a l = new dyn.d(5.999997E7F);
   public static final dyn.c d = new dyn.c(0.0, 0.0, 0.2, 5.0, 5, 15, 5.999997E7F, 0L, 0.0);

   public boolean a(ji $$0) {
      return this.a((double)$$0.u(), (double)$$0.w());
   }

   public boolean a(fba $$0) {
      return this.a($$0.d, $$0.f);
   }

   public boolean a(dfo $$0) {
      return this.a((double)$$0.d(), (double)$$0.e()) && this.a((double)$$0.f(), (double)$$0.g());
   }

   public boolean a(fav $$0) {
      return this.a($$0.a, $$0.c, $$0.d - 1.0E-5F, $$0.f - 1.0E-5F);
   }

   private boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.a($$0, $$1) && this.a($$2, $$3);
   }

   public boolean a(double $$0, double $$1) {
      return this.a($$0, $$1, 0.0);
   }

   public boolean a(double $$0, double $$1, double $$2) {
      return $$0 >= this.e() - $$2 && $$0 < this.g() + $$2 && $$1 >= this.f() - $$2 && $$1 < this.h() + $$2;
   }

   public ji b(ji $$0) {
      return this.b((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
   }

   public ji b(fba $$0) {
      return this.b($$0.a(), $$0.b(), $$0.c());
   }

   public ji b(double $$0, double $$1, double $$2) {
      return ji.a((kb)this.c($$0, $$1, $$2));
   }

   public fba c(fba $$0) {
      return this.c($$0.d, $$0.e, $$0.f);
   }

   public fba c(double $$0, double $$1, double $$2) {
      return new fba(ayz.a($$0, this.e(), this.g() - 1.0E-5F), $$1, ayz.a($$2, this.f(), this.h() - 1.0E-5F));
   }

   public double a(buk $$0) {
      return this.b($$0.dB(), $$0.dH());
   }

   public fbu c() {
      return this.l.m();
   }

   public double b(double $$0, double $$1) {
      double $$2 = $$1 - this.f();
      double $$3 = this.h() - $$1;
      double $$4 = $$0 - this.e();
      double $$5 = this.g() - $$0;
      double $$6 = Math.min($$4, $$5);
      $$6 = Math.min($$6, $$2);
      return Math.min($$6, $$3);
   }

   public boolean a(buk $$0, fav $$1) {
      double $$2 = Math.max(ayz.a($$1.b(), $$1.d()), 1.0);
      return this.a($$0) < $$2 * 2.0 && this.a($$0.dB(), $$0.dH(), $$2);
   }

   public dym d() {
      return this.l.i();
   }

   public double e() {
      return this.l.a();
   }

   public double f() {
      return this.l.c();
   }

   public double g() {
      return this.l.b();
   }

   public double h() {
      return this.l.d();
   }

   public double a() {
      return this.i;
   }

   public double b() {
      return this.j;
   }

   public void c(double $$0, double $$1) {
      this.i = $$0;
      this.j = $$1;
      this.l.k();

      for (dyl $$2 : this.l()) {
         $$2.a(this, $$0, $$1);
      }
   }

   public double i() {
      return this.l.e();
   }

   public long j() {
      return this.l.g();
   }

   public double k() {
      return this.l.h();
   }

   public void a(double $$0) {
      this.l = new dyn.d($$0);

      for (dyl $$1 : this.l()) {
         $$1.a(this, $$0);
      }
   }

   public void a(double $$0, double $$1, long $$2) {
      this.l = (dyn.a)($$0 == $$1 ? new dyn.d($$1) : new dyn.b($$0, $$1, $$2));

      for (dyl $$3 : this.l()) {
         $$3.a(this, $$0, $$1, $$2);
      }
   }

   protected List<dyl> l() {
      return Lists.newArrayList(this.a);
   }

   public void a(dyl $$0) {
      this.a.add($$0);
   }

   public void b(dyl $$0) {
      this.a.remove($$0);
   }

   public void a(int $$0) {
      this.k = $$0;
      this.l.j();
   }

   public int m() {
      return this.k;
   }

   public double n() {
      return this.f;
   }

   public void b(double $$0) {
      this.f = $$0;

      for (dyl $$1 : this.l()) {
         $$1.c(this, $$0);
      }
   }

   public double o() {
      return this.e;
   }

   public void c(double $$0) {
      this.e = $$0;

      for (dyl $$1 : this.l()) {
         $$1.b(this, $$0);
      }
   }

   public double p() {
      return this.l.f();
   }

   public int q() {
      return this.g;
   }

   public void b(int $$0) {
      this.g = $$0;

      for (dyl $$1 : this.l()) {
         $$1.a(this, $$0);
      }
   }

   public int r() {
      return this.h;
   }

   public void c(int $$0) {
      this.h = $$0;

      for (dyl $$1 : this.l()) {
         $$1.b(this, $$0);
      }
   }

   public void s() {
      this.l = this.l.l();
   }

   public dyn.c t() {
      return new dyn.c(this);
   }

   public void a(dyn.c $$0) {
      this.c($$0.a(), $$0.b());
      this.c($$0.c());
      this.b($$0.d());
      this.c($$0.e());
      this.b($$0.f());
      if ($$0.h() > 0L) {
         this.a($$0.g(), $$0.i(), $$0.h());
      } else {
         this.a($$0.g());
      }
   }

   interface a {
      double a();

      double b();

      double c();

      double d();

      double e();

      double f();

      long g();

      double h();

      dym i();

      void j();

      void k();

      dyn.a l();

      fbu m();
   }

   class b implements dyn.a {
      private final double b;
      private final double c;
      private final long d;
      private final long e;
      private final double f;

      b(final double $$0, final double $$1, final long $$2) {
         this.b = $$0;
         this.c = $$1;
         this.f = (double)$$2;
         this.e = af.c();
         this.d = this.e + $$2;
      }

      @Override
      public double a() {
         return ayz.a(dyn.this.a() - this.e() / 2.0, (double)(-dyn.this.k), (double)dyn.this.k);
      }

      @Override
      public double c() {
         return ayz.a(dyn.this.b() - this.e() / 2.0, (double)(-dyn.this.k), (double)dyn.this.k);
      }

      @Override
      public double b() {
         return ayz.a(dyn.this.a() + this.e() / 2.0, (double)(-dyn.this.k), (double)dyn.this.k);
      }

      @Override
      public double d() {
         return ayz.a(dyn.this.b() + this.e() / 2.0, (double)(-dyn.this.k), (double)dyn.this.k);
      }

      @Override
      public double e() {
         double $$0 = (double)(af.c() - this.e) / this.f;
         return $$0 < 1.0 ? ayz.d($$0, this.b, this.c) : this.c;
      }

      @Override
      public double f() {
         return Math.abs(this.b - this.c) / (double)(this.d - this.e);
      }

      @Override
      public long g() {
         return this.d - af.c();
      }

      @Override
      public double h() {
         return this.c;
      }

      @Override
      public dym i() {
         return this.c < this.b ? dym.b : dym.a;
      }

      @Override
      public void k() {
      }

      @Override
      public void j() {
      }

      @Override
      public dyn.a l() {
         return (dyn.a)(this.g() <= 0L ? dyn.this.new d(this.c) : this);
      }

      @Override
      public fbu m() {
         return fbr.a(
            fbr.c,
            fbr.a(Math.floor(this.a()), Double.NEGATIVE_INFINITY, Math.floor(this.c()), Math.ceil(this.b()), Double.POSITIVE_INFINITY, Math.ceil(this.d())),
            fbe.e
         );
      }
   }

   public static class c {
      private final double a;
      private final double b;
      private final double c;
      private final double d;
      private final int e;
      private final int f;
      private final double g;
      private final long h;
      private final double i;

      c(double $$0, double $$1, double $$2, double $$3, int $$4, int $$5, double $$6, long $$7, double $$8) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
         this.g = $$6;
         this.h = $$7;
         this.i = $$8;
      }

      c(dyn $$0) {
         this.a = $$0.a();
         this.b = $$0.b();
         this.c = $$0.o();
         this.d = $$0.n();
         this.e = $$0.r();
         this.f = $$0.q();
         this.g = $$0.i();
         this.h = $$0.j();
         this.i = $$0.k();
      }

      public double a() {
         return this.a;
      }

      public double b() {
         return this.b;
      }

      public double c() {
         return this.c;
      }

      public double d() {
         return this.d;
      }

      public int e() {
         return this.e;
      }

      public int f() {
         return this.f;
      }

      public double g() {
         return this.g;
      }

      public long h() {
         return this.h;
      }

      public double i() {
         return this.i;
      }

      public static dyn.c a(DynamicLike<?> $$0, dyn.c $$1) {
         double $$2 = ayz.a($$0.get("BorderCenterX").asDouble($$1.a), -2.9999984E7, 2.9999984E7);
         double $$3 = ayz.a($$0.get("BorderCenterZ").asDouble($$1.b), -2.9999984E7, 2.9999984E7);
         double $$4 = $$0.get("BorderSize").asDouble($$1.g);
         long $$5 = $$0.get("BorderSizeLerpTime").asLong($$1.h);
         double $$6 = $$0.get("BorderSizeLerpTarget").asDouble($$1.i);
         double $$7 = $$0.get("BorderSafeZone").asDouble($$1.d);
         double $$8 = $$0.get("BorderDamagePerBlock").asDouble($$1.c);
         int $$9 = $$0.get("BorderWarningBlocks").asInt($$1.e);
         int $$10 = $$0.get("BorderWarningTime").asInt($$1.f);
         return new dyn.c($$2, $$3, $$8, $$7, $$9, $$10, $$4, $$5, $$6);
      }

      public void a(tq $$0) {
         $$0.a("BorderCenterX", this.a);
         $$0.a("BorderCenterZ", this.b);
         $$0.a("BorderSize", this.g);
         $$0.a("BorderSizeLerpTime", this.h);
         $$0.a("BorderSafeZone", this.d);
         $$0.a("BorderDamagePerBlock", this.c);
         $$0.a("BorderSizeLerpTarget", this.i);
         $$0.a("BorderWarningBlocks", (double)this.e);
         $$0.a("BorderWarningTime", (double)this.f);
      }
   }

   class d implements dyn.a {
      private final double b;
      private double c;
      private double d;
      private double e;
      private double f;
      private fbu g;

      public d(final double $$0) {
         this.b = $$0;
         this.n();
      }

      @Override
      public double a() {
         return this.c;
      }

      @Override
      public double b() {
         return this.e;
      }

      @Override
      public double c() {
         return this.d;
      }

      @Override
      public double d() {
         return this.f;
      }

      @Override
      public double e() {
         return this.b;
      }

      @Override
      public dym i() {
         return dym.c;
      }

      @Override
      public double f() {
         return 0.0;
      }

      @Override
      public long g() {
         return 0L;
      }

      @Override
      public double h() {
         return this.b;
      }

      private void n() {
         this.c = ayz.a(dyn.this.a() - this.b / 2.0, (double)(-dyn.this.k), (double)dyn.this.k);
         this.d = ayz.a(dyn.this.b() - this.b / 2.0, (double)(-dyn.this.k), (double)dyn.this.k);
         this.e = ayz.a(dyn.this.a() + this.b / 2.0, (double)(-dyn.this.k), (double)dyn.this.k);
         this.f = ayz.a(dyn.this.b() + this.b / 2.0, (double)(-dyn.this.k), (double)dyn.this.k);
         this.g = fbr.a(
            fbr.c,
            fbr.a(Math.floor(this.a()), Double.NEGATIVE_INFINITY, Math.floor(this.c()), Math.ceil(this.b()), Double.POSITIVE_INFINITY, Math.ceil(this.d())),
            fbe.e
         );
      }

      @Override
      public void j() {
         this.n();
      }

      @Override
      public void k() {
         this.n();
      }

      @Override
      public dyn.a l() {
         return this;
      }

      @Override
      public fbu m() {
         return this.g;
      }
   }
}
