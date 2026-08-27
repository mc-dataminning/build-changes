import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.DoubleConsumer;
import javax.annotation.Nullable;

public class fcp extends esf {
   private static final int a = 32;
   private static final String b = "telemetry.event.required";
   private static final String c = "telemetry.event.optional";
   private static final ti d = ti.c("telemetry_info.property_title").a(n.t);
   private final ery e;
   private fcp.a l;
   @Nullable
   private DoubleConsumer m;

   public fcp(int $$0, int $$1, int $$2, int $$3, ery $$4) {
      super($$0, $$1, $$2, $$3, ti.h());
      this.e = $$4;
      this.l = this.c(eqq.O().A());
   }

   public void b(boolean $$0) {
      this.l = this.c($$0);
      this.a(this.c());
   }

   private fcp.a c(boolean $$0) {
      fcp.b $$1 = new fcp.b(this.w());
      List<gdu> $$2 = new ArrayList<>(gdu.g());
      $$2.sort(Comparator.comparing(gdu::d));
      if (!$$0) {
         $$2.removeIf(gdu::d);
      }

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         gdu $$4 = $$2.get($$3);
         this.a($$1, $$4);
         if ($$3 < $$2.size() - 1) {
            $$1.a(9);
         }
      }

      return $$1.a();
   }

   public void a(@Nullable DoubleConsumer $$0) {
      this.m = $$0;
   }

   @Override
   protected void a(double $$0) {
      super.a($$0);
      if (this.m != null) {
         this.m.accept(this.c());
      }
   }

   @Override
   protected int g() {
      return this.l.a().i();
   }

   @Override
   protected double h() {
      return 9.0;
   }

   @Override
   protected void c(esa $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.t() + this.a();
      int $$5 = this.r() + this.a();
      $$0.c().a();
      $$0.c().a((double)$$5, (double)$$4, 0.0);
      this.l.a().a($$4x -> $$4x.a($$0, $$1, $$2, $$3));
      $$0.c().b();
   }

   @Override
   protected void a(ewd $$0) {
      $$0.a(ewc.a, this.l.b());
   }

   private void a(fcp.b $$0, gdu $$1) {
      String $$2 = $$1.d() ? "telemetry.event.optional" : "telemetry.event.required";
      $$0.b(this.e, ti.a($$2, $$1.e()));
      $$0.b(this.e, $$1.f().a(n.h));
      $$0.a(9 / 2);
      $$0.a(this.e, d, 2);
      this.a($$1, $$0);
   }

   private void a(gdu $$0, fcp.b $$1) {
      for (gdw<?> $$2 : $$0.b()) {
         $$1.a(this.e, $$2.a());
      }
   }

   private int w() {
      return this.f - this.b();
   }

   static record a(evv a, ti b) {
   }

   static class b {
      private final int a;
      private final evy b;
      private final tv c = ti.h();

      public b(int $$0) {
         this.a = $$0;
         this.b = evy.d();
         this.b.c().a();
         this.b.a(evz.a($$0));
      }

      public void a(ery $$0, ti $$1) {
         this.a($$0, $$1, 0);
      }

      public void a(ery $$0, ti $$1, int $$2) {
         this.b.a(new etf($$1, $$0).j(this.a), $$1x -> $$1x.e($$2));
         this.c.b($$1).f("\n");
      }

      public void b(ery $$0, ti $$1) {
         this.b.a(new etf($$1, $$0).j(this.a - 64).b(true), $$0x -> $$0x.b().f(32));
         this.c.b($$1).f("\n");
      }

      public void a(int $$0) {
         this.b.a(evz.b($$0));
      }

      public fcp.a a() {
         this.b.a();
         return new fcp.a(this.b, this.c);
      }
   }
}
