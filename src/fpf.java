import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.DoubleConsumer;
import javax.annotation.Nullable;

public class fpf extends feo {
   private static final int a = 32;
   private static final String b = "telemetry.event.required";
   private static final String c = "telemetry.event.optional";
   private static final String d = "telemetry.event.optional.disabled";
   private static final ws e = ws.c("telemetry_info.property_title").a(n.t);
   private final fef f;
   private fpf.a m;
   @Nullable
   private DoubleConsumer n;

   public fpf(int $$0, int $$1, int $$2, int $$3, fef $$4) {
      super($$0, $$1, $$2, $$3, ws.i());
      this.f = $$4;
      this.m = this.c(fcu.Q().C());
   }

   public void b(boolean $$0) {
      this.m = this.c($$0);
      this.a(this.c());
   }

   public void j() {
      this.m = this.c(fcu.Q().C());
      this.a(this.c());
   }

   private fpf.a c(boolean $$0) {
      fpf.b $$1 = new fpf.b(this.k());
      List<gro> $$2 = new ArrayList<>(gro.g());
      $$2.sort(Comparator.comparing(gro::d));

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         gro $$4 = $$2.get($$3);
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
      return this.m.a().v();
   }

   @Override
   protected double i() {
      return 9.0;
   }

   @Override
   protected void c(feh $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.D() + this.a();
      int $$5 = this.C() + this.a();
      $$0.c().a();
      $$0.c().a((double)$$5, (double)$$4, 0.0);
      this.m.a().a($$4x -> $$4x.a($$0, $$1, $$2, $$3));
      $$0.c().b();
   }

   @Override
   protected void a(fiq $$0) {
      $$0.a(fip.a, this.m.b());
   }

   private ws a(ws $$0, boolean $$1) {
      return (ws)($$1 ? $$0.f().a(n.h) : $$0);
   }

   private void a(fpf.b $$0, gro $$1, boolean $$2) {
      String $$3 = $$1.d() ? ($$2 ? "telemetry.event.optional.disabled" : "telemetry.event.optional") : "telemetry.event.required";
      $$0.b(this.f, this.a(ws.a($$3, $$1.e()), $$2));
      $$0.b(this.f, $$1.f().a(n.h));
      $$0.a(9 / 2);
      $$0.a(this.f, this.a(e, $$2), 2);
      this.a($$1, $$0, $$2);
   }

   private void a(gro $$0, fpf.b $$1, boolean $$2) {
      for (grq<?> $$3 : $$0.b()) {
         $$1.a(this.f, this.a($$3.a(), $$2));
      }
   }

   private int k() {
      return this.g - this.b();
   }

   static record a(fii a, ws b) {
   }

   static class b {
      private final int a;
      private final fil b;
      private final xg c = ws.i();

      public b(int $$0) {
         this.a = $$0;
         this.b = fil.d();
         this.b.c().a();
         this.b.a(fim.a($$0));
      }

      public void a(fef $$0, ws $$1) {
         this.a($$0, $$1, 0);
      }

      public void a(fef $$0, ws $$1, int $$2) {
         this.b.a(new ffo($$1, $$0).d(this.a), $$1x -> $$1x.e($$2));
         this.c.b($$1).f("\n");
      }

      public void b(fef $$0, ws $$1) {
         this.b.a(new ffo($$1, $$0).d(this.a - 64).b(true), $$0x -> $$0x.b().f(32));
         this.c.b($$1).f("\n");
      }

      public void a(int $$0) {
         this.b.a(fim.b($$0));
      }

      public fpf.a a() {
         this.b.a();
         return new fpf.a(this.b, this.c);
      }
   }
}
