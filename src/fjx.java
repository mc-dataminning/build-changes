import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.DoubleConsumer;
import javax.annotation.Nullable;

public class fjx extends ezi {
   private static final int a = 32;
   private static final String b = "telemetry.event.required";
   private static final String c = "telemetry.event.optional";
   private static final String d = "telemetry.event.optional.disabled";
   private static final vq e = vq.c("telemetry_info.property_title").a(n.t);
   private final eyz f;
   private fjx.a m;
   @Nullable
   private DoubleConsumer n;

   public fjx(int $$0, int $$1, int $$2, int $$3, eyz $$4) {
      super($$0, $$1, $$2, $$3, vq.i());
      this.f = $$4;
      this.m = this.c(exo.P().B());
   }

   public void b(boolean $$0) {
      this.m = this.c($$0);
      this.a(this.c());
   }

   private fjx.a c(boolean $$0) {
      fjx.b $$1 = new fjx.b(this.j());
      List<gmb> $$2 = new ArrayList<>(gmb.g());
      $$2.sort(Comparator.comparing(gmb::d));

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         gmb $$4 = $$2.get($$3);
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
   protected void c(ezb $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.C() + this.a();
      int $$5 = this.B() + this.a();
      $$0.c().a();
      $$0.c().a((double)$$5, (double)$$4, 0.0);
      this.m.a().a($$4x -> $$4x.a($$0, $$1, $$2, $$3));
      $$0.c().b();
   }

   @Override
   protected void a(fdj $$0) {
      $$0.a(fdi.a, this.m.b());
   }

   private vq a(vq $$0, boolean $$1) {
      return (vq)($$1 ? $$0.f().a(n.h) : $$0);
   }

   private void a(fjx.b $$0, gmb $$1, boolean $$2) {
      String $$3 = $$1.d() ? ($$2 ? "telemetry.event.optional.disabled" : "telemetry.event.optional") : "telemetry.event.required";
      $$0.b(this.f, this.a(vq.a($$3, $$1.e()), $$2));
      $$0.b(this.f, $$1.f().a(n.h));
      $$0.a(9 / 2);
      $$0.a(this.f, this.a(e, $$2), 2);
      this.a($$1, $$0, $$2);
   }

   private void a(gmb $$0, fjx.b $$1, boolean $$2) {
      for (gmd<?> $$3 : $$0.b()) {
         $$1.a(this.f, this.a($$3.a(), $$2));
      }
   }

   private int j() {
      return this.g - this.b();
   }

   static record a(fdb a, vq b) {
   }

   static class b {
      private final int a;
      private final fde b;
      private final we c = vq.i();

      public b(int $$0) {
         this.a = $$0;
         this.b = fde.d();
         this.b.c().a();
         this.b.a(fdf.a($$0));
      }

      public void a(eyz $$0, vq $$1) {
         this.a($$0, $$1, 0);
      }

      public void a(eyz $$0, vq $$1, int $$2) {
         this.b.a(new fai($$1, $$0).c(this.a), $$1x -> $$1x.e($$2));
         this.c.b($$1).f("\n");
      }

      public void b(eyz $$0, vq $$1) {
         this.b.a(new fai($$1, $$0).c(this.a - 64).b(true), $$0x -> $$0x.b().f(32));
         this.c.b($$1).f("\n");
      }

      public void a(int $$0) {
         this.b.a(fdf.b($$0));
      }

      public fjx.a a() {
         this.b.a();
         return new fjx.a(this.b, this.c);
      }
   }
}
