import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.DoubleConsumer;
import javax.annotation.Nullable;

public class flt extends fbc {
   private static final int a = 32;
   private static final String b = "telemetry.event.required";
   private static final String c = "telemetry.event.optional";
   private static final String d = "telemetry.event.optional.disabled";
   private static final vu e = vu.c("telemetry_info.property_title").a(n.t);
   private final fat f;
   private flt.a m;
   @Nullable
   private DoubleConsumer n;

   public flt(int $$0, int $$1, int $$2, int $$3, fat $$4) {
      super($$0, $$1, $$2, $$3, vu.i());
      this.f = $$4;
      this.m = this.c(ezi.Q().C());
   }

   public void b(boolean $$0) {
      this.m = this.c($$0);
      this.a(this.c());
   }

   private flt.a c(boolean $$0) {
      flt.b $$1 = new flt.b(this.j());
      List<goc> $$2 = new ArrayList<>(goc.g());
      $$2.sort(Comparator.comparing(goc::d));

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         goc $$4 = $$2.get($$3);
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
   protected int g() {
      return this.m.a().u();
   }

   @Override
   protected double i() {
      return 9.0;
   }

   @Override
   protected void c(fav $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.C() + this.a();
      int $$5 = this.B() + this.a();
      $$0.c().a();
      $$0.c().a((double)$$5, (double)$$4, 0.0);
      this.m.a().a($$4x -> $$4x.a($$0, $$1, $$2, $$3));
      $$0.c().b();
   }

   @Override
   protected void a(ffe $$0) {
      $$0.a(ffd.a, this.m.b());
   }

   private vu a(vu $$0, boolean $$1) {
      return (vu)($$1 ? $$0.f().a(n.h) : $$0);
   }

   private void a(flt.b $$0, goc $$1, boolean $$2) {
      String $$3 = $$1.d() ? ($$2 ? "telemetry.event.optional.disabled" : "telemetry.event.optional") : "telemetry.event.required";
      $$0.b(this.f, this.a(vu.a($$3, $$1.e()), $$2));
      $$0.b(this.f, $$1.f().a(n.h));
      $$0.a(9 / 2);
      $$0.a(this.f, this.a(e, $$2), 2);
      this.a($$1, $$0, $$2);
   }

   private void a(goc $$0, flt.b $$1, boolean $$2) {
      for (goe<?> $$3 : $$0.b()) {
         $$1.a(this.f, this.a($$3.a(), $$2));
      }
   }

   private int j() {
      return this.g - this.b();
   }

   static record a(few a, vu b) {
   }

   static class b {
      private final int a;
      private final fez b;
      private final wi c = vu.i();

      public b(int $$0) {
         this.a = $$0;
         this.b = fez.d();
         this.b.c().a();
         this.b.a(ffa.a($$0));
      }

      public void a(fat $$0, vu $$1) {
         this.a($$0, $$1, 0);
      }

      public void a(fat $$0, vu $$1, int $$2) {
         this.b.a(new fcc($$1, $$0).c(this.a), $$1x -> $$1x.e($$2));
         this.c.b($$1).f("\n");
      }

      public void b(fat $$0, vu $$1) {
         this.b.a(new fcc($$1, $$0).c(this.a - 64).b(true), $$0x -> $$0x.b().f(32));
         this.c.b($$1).f("\n");
      }

      public void a(int $$0) {
         this.b.a(ffa.b($$0));
      }

      public flt.a a() {
         this.b.a();
         return new flt.a(this.b, this.c);
      }
   }
}
