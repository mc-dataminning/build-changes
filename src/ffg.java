import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.DoubleConsumer;
import javax.annotation.Nullable;

public class ffg extends eut {
   private static final int a = 32;
   private static final String b = "telemetry.event.required";
   private static final String c = "telemetry.event.optional";
   private static final String d = "telemetry.event.optional.disabled";
   private static final ur e = ur.c("telemetry_info.property_title").a(n.t);
   private final eum l;
   private ffg.a m;
   @Nullable
   private DoubleConsumer n;

   public ffg(int $$0, int $$1, int $$2, int $$3, eum $$4) {
      super($$0, $$1, $$2, $$3, ur.i());
      this.l = $$4;
      this.m = this.c(etd.N().z());
   }

   public void b(boolean $$0) {
      this.m = this.c($$0);
      this.a(this.c());
   }

   private ffg.a c(boolean $$0) {
      ffg.b $$1 = new ffg.b(this.v());
      List<ggp> $$2 = new ArrayList<>(ggp.g());
      $$2.sort(Comparator.comparing(ggp::d));

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         ggp $$4 = $$2.get($$3);
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
   protected void c(euo $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.r() + this.a();
      int $$5 = this.p() + this.a();
      $$0.c().a();
      $$0.c().a((double)$$5, (double)$$4, 0.0);
      this.m.a().a($$4x -> $$4x.a($$0, $$1, $$2, $$3));
      $$0.c().b();
   }

   @Override
   protected void a(eys $$0) {
      $$0.a(eyr.a, this.m.b());
   }

   private ur a(ur $$0, boolean $$1) {
      return (ur)($$1 ? $$0.f().a(n.h) : $$0);
   }

   private void a(ffg.b $$0, ggp $$1, boolean $$2) {
      String $$3 = $$1.d() ? ($$2 ? "telemetry.event.optional.disabled" : "telemetry.event.optional") : "telemetry.event.required";
      $$0.b(this.l, this.a(ur.a($$3, $$1.e()), $$2));
      $$0.b(this.l, $$1.f().a(n.h));
      $$0.a(9 / 2);
      $$0.a(this.l, this.a(e, $$2), 2);
      this.a($$1, $$0, $$2);
   }

   private void a(ggp $$0, ffg.b $$1, boolean $$2) {
      for (ggr<?> $$3 : $$0.b()) {
         $$1.a(this.l, this.a($$3.a(), $$2));
      }
   }

   private int v() {
      return this.f - this.b();
   }

   static record a(eyk a, ur b) {
   }

   static class b {
      private final int a;
      private final eyn b;
      private final vf c = ur.i();

      public b(int $$0) {
         this.a = $$0;
         this.b = eyn.d();
         this.b.c().a();
         this.b.a(eyo.a($$0));
      }

      public void a(eum $$0, ur $$1) {
         this.a($$0, $$1, 0);
      }

      public void a(eum $$0, ur $$1, int $$2) {
         this.b.a(new evt($$1, $$0).j(this.a), $$1x -> $$1x.e($$2));
         this.c.b($$1).f("\n");
      }

      public void b(eum $$0, ur $$1) {
         this.b.a(new evt($$1, $$0).j(this.a - 64).b(true), $$0x -> $$0x.b().f(32));
         this.c.b($$1).f("\n");
      }

      public void a(int $$0) {
         this.b.a(eyo.b($$0));
      }

      public ffg.a a() {
         this.b.a();
         return new ffg.a(this.b, this.c);
      }
   }
}
