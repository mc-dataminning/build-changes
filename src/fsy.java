import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.DoubleConsumer;
import javax.annotation.Nullable;

public class fsy extends fig {
   private static final int a = 32;
   private static final String b = "telemetry.event.required";
   private static final String c = "telemetry.event.optional";
   private static final String d = "telemetry.event.optional.disabled";
   private static final wz e = wz.c("telemetry_info.property_title").a(n.t);
   private final fhx f;
   private fsy.a m;
   @Nullable
   private DoubleConsumer n;

   public fsy(int $$0, int $$1, int $$2, int $$3, fhx $$4) {
      super($$0, $$1, $$2, $$3, wz.i());
      this.f = $$4;
      this.m = this.c(fgo.Q().C());
   }

   public void b(boolean $$0) {
      this.m = this.c($$0);
      this.a(this.c());
   }

   public void j() {
      this.m = this.c(fgo.Q().C());
      this.a(this.c());
   }

   private fsy.a c(boolean $$0) {
      fsy.b $$1 = new fsy.b(this.k());
      List<gvo> $$2 = new ArrayList<>(gvo.g());
      $$2.sort(Comparator.comparing(gvo::d));

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         gvo $$4 = $$2.get($$3);
         boolean $$5 = $$4.d() && !$$0;
         this.a($$1, $$4, $$5);
         if ($$3 < $$2.size() - 1) {
            $$1.a(9);
         }
      }

      return $$1.a();
   }

   public void a(@Nullable DoubleConsumer $$0) {
      this.n = $$0;
   }

   @Override
   protected void a(double $$0) {
      super.a($$0);
      if (this.n != null) {
         this.n.accept(this.c());
      }
   }

   @Override
   protected int h() {
      return this.m.a().w();
   }

   @Override
   protected double i() {
      return 9.0;
   }

   @Override
   protected void c(fhz $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.E() + this.a();
      int $$5 = this.D() + this.a();
      $$0.c().a();
      $$0.c().a((double)$$5, (double)$$4, 0.0);
      this.m.a().a($$4x -> $$4x.a($$0, $$1, $$2, $$3));
      $$0.c().b();
   }

   @Override
   protected void a(fmi $$0) {
      $$0.a(fmh.a, this.m.b());
   }

   private wz a(wz $$0, boolean $$1) {
      return (wz)($$1 ? $$0.f().a(n.h) : $$0);
   }

   private void a(fsy.b $$0, gvo $$1, boolean $$2) {
      String $$3 = $$1.d() ? ($$2 ? "telemetry.event.optional.disabled" : "telemetry.event.optional") : "telemetry.event.required";
      $$0.b(this.f, this.a(wz.a($$3, $$1.e()), $$2));
      $$0.b(this.f, $$1.f().a(n.h));
      $$0.a(9 / 2);
      $$0.a(this.f, this.a(e, $$2), 2);
      this.a($$1, $$0, $$2);
   }

   private void a(gvo $$0, fsy.b $$1, boolean $$2) {
      for (gvq<?> $$3 : $$0.b()) {
         $$1.a(this.f, this.a($$3.a(), $$2));
      }
   }

   private int k() {
      return this.g - this.b();
   }

   static record a(fma a, wz b) {
   }

   static class b {
      private final int a;
      private final fmd b;
      private final xn c = wz.i();

      public b(int $$0) {
         this.a = $$0;
         this.b = fmd.d();
         this.b.c().a();
         this.b.a(fme.a($$0));
      }

      public void a(fhx $$0, wz $$1) {
         this.a($$0, $$1, 0);
      }

      public void a(fhx $$0, wz $$1, int $$2) {
         this.b.a(new fjg($$1, $$0).d(this.a), $$1x -> $$1x.e($$2));
         this.c.b($$1).f("\n");
      }

      public void b(fhx $$0, wz $$1) {
         this.b.a(new fjg($$1, $$0).d(this.a - 64).b(true), $$0x -> $$0x.b().f(32));
         this.c.b($$1).f("\n");
      }

      public void a(int $$0) {
         this.b.a(fme.b($$0));
      }

      public fsy.a a() {
         this.b.a();
         return new fsy.a(this.b, this.c);
      }
   }
}
