import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.DoubleConsumer;
import javax.annotation.Nullable;

public class fet extends eug {
   private static final int a = 32;
   private static final String b = "telemetry.event.required";
   private static final String c = "telemetry.event.optional";
   private static final ur d = ur.c("telemetry_info.property_title").a(n.t);
   private final etz e;
   private fet.a l;
   @Nullable
   private DoubleConsumer m;

   public fet(int $$0, int $$1, int $$2, int $$3, etz $$4) {
      super($$0, $$1, $$2, $$3, ur.i());
      this.e = $$4;
      this.l = this.c(esr.N().z());
   }

   public void b(boolean $$0) {
      this.l = this.c($$0);
      this.a(this.c());
   }

   private fet.a c(boolean $$0) {
      fet.b $$1 = new fet.b(this.v());
      List<ggc> $$2 = new ArrayList<>(ggc.g());
      $$2.sort(Comparator.comparing(ggc::d));
      if (!$$0) {
         $$2.removeIf(ggc::d);
      }

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         ggc $$4 = $$2.get($$3);
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
   protected void c(eub $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.r() + this.a();
      int $$5 = this.p() + this.a();
      $$0.c().a();
      $$0.c().a((double)$$5, (double)$$4, 0.0);
      this.l.a().a($$4x -> $$4x.a($$0, $$1, $$2, $$3));
      $$0.c().b();
   }

   @Override
   protected void a(eyf $$0) {
      $$0.a(eye.a, this.l.b());
   }

   private void a(fet.b $$0, ggc $$1) {
      String $$2 = $$1.d() ? "telemetry.event.optional" : "telemetry.event.required";
      $$0.b(this.e, ur.a($$2, $$1.e()));
      $$0.b(this.e, $$1.f().a(n.h));
      $$0.a(9 / 2);
      $$0.a(this.e, d, 2);
      this.a($$1, $$0);
   }

   private void a(ggc $$0, fet.b $$1) {
      for (gge<?> $$2 : $$0.b()) {
         $$1.a(this.e, $$2.a());
      }
   }

   private int v() {
      return this.f - this.b();
   }

   static record a(exx a, ur b) {
   }

   static class b {
      private final int a;
      private final eya b;
      private final vf c = ur.i();

      public b(int $$0) {
         this.a = $$0;
         this.b = eya.d();
         this.b.c().a();
         this.b.a(eyb.a($$0));
      }

      public void a(etz $$0, ur $$1) {
         this.a($$0, $$1, 0);
      }

      public void a(etz $$0, ur $$1, int $$2) {
         this.b.a(new evg($$1, $$0).j(this.a), $$1x -> $$1x.e($$2));
         this.c.b($$1).f("\n");
      }

      public void b(etz $$0, ur $$1) {
         this.b.a(new evg($$1, $$0).j(this.a - 64).b(true), $$0x -> $$0x.b().f(32));
         this.c.b($$1).f("\n");
      }

      public void a(int $$0) {
         this.b.a(eyb.b($$0));
      }

      public fet.a a() {
         this.b.a();
         return new fet.a(this.b, this.c);
      }
   }
}
