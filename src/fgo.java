import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.DoubleConsumer;
import javax.annotation.Nullable;

public class fgo extends ewb {
   private static final int a = 32;
   private static final String b = "telemetry.event.required";
   private static final String c = "telemetry.event.optional";
   private static final String d = "telemetry.event.optional.disabled";
   private static final vb e = vb.c("telemetry_info.property_title").a(n.t);
   private final evu l;
   private fgo.a m;
   @Nullable
   private DoubleConsumer n;

   public fgo(int $$0, int $$1, int $$2, int $$3, evu $$4) {
      super($$0, $$1, $$2, $$3, vb.i());
      this.l = $$4;
      this.m = this.c(euk.N().z());
   }

   public void b(boolean $$0) {
      this.m = this.c($$0);
      this.a(this.c());
   }

   private fgo.a c(boolean $$0) {
      fgo.b $$1 = new fgo.b(this.v());
      List<gij> $$2 = new ArrayList<>(gij.g());
      $$2.sort(Comparator.comparing(gij::d));

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         gij $$4 = $$2.get($$3);
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
      return this.m.a().i();
   }

   @Override
   protected double h() {
      return 9.0;
   }

   @Override
   protected void c(evw $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.r() + this.a();
      int $$5 = this.p() + this.a();
      $$0.c().a();
      $$0.c().a((double)$$5, (double)$$4, 0.0);
      this.m.a().a($$4x -> $$4x.a($$0, $$1, $$2, $$3));
      $$0.c().b();
   }

   @Override
   protected void a(faa $$0) {
      $$0.a(ezz.a, this.m.b());
   }

   private vb a(vb $$0, boolean $$1) {
      return (vb)($$1 ? $$0.f().a(n.h) : $$0);
   }

   private void a(fgo.b $$0, gij $$1, boolean $$2) {
      String $$3 = $$1.d() ? ($$2 ? "telemetry.event.optional.disabled" : "telemetry.event.optional") : "telemetry.event.required";
      $$0.b(this.l, this.a(vb.a($$3, $$1.e()), $$2));
      $$0.b(this.l, $$1.f().a(n.h));
      $$0.a(9 / 2);
      $$0.a(this.l, this.a(e, $$2), 2);
      this.a($$1, $$0, $$2);
   }

   private void a(gij $$0, fgo.b $$1, boolean $$2) {
      for (gil<?> $$3 : $$0.b()) {
         $$1.a(this.l, this.a($$3.a(), $$2));
      }
   }

   private int v() {
      return this.f - this.b();
   }

   static record a(ezs a, vb b) {
   }

   static class b {
      private final int a;
      private final ezv b;
      private final vp c = vb.i();

      public b(int $$0) {
         this.a = $$0;
         this.b = ezv.d();
         this.b.c().a();
         this.b.a(ezw.a($$0));
      }

      public void a(evu $$0, vb $$1) {
         this.a($$0, $$1, 0);
      }

      public void a(evu $$0, vb $$1, int $$2) {
         this.b.a(new exb($$1, $$0).j(this.a), $$1x -> $$1x.e($$2));
         this.c.b($$1).f("\n");
      }

      public void b(evu $$0, vb $$1) {
         this.b.a(new exb($$1, $$0).j(this.a - 64).b(true), $$0x -> $$0x.b().f(32));
         this.c.b($$1).f("\n");
      }

      public void a(int $$0) {
         this.b.a(ezw.b($$0));
      }

      public fgo.a a() {
         this.b.a();
         return new fgo.a(this.b, this.c);
      }
   }
}
