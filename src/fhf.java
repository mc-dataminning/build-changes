import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.DoubleConsumer;
import javax.annotation.Nullable;

public class fhf extends ews {
   private static final int a = 32;
   private static final String b = "telemetry.event.required";
   private static final String c = "telemetry.event.optional";
   private static final String d = "telemetry.event.optional.disabled";
   private static final vd e = vd.c("telemetry_info.property_title").a(n.t);
   private final ewk f;
   private fhf.a m;
   @Nullable
   private DoubleConsumer n;

   public fhf(int $$0, int $$1, int $$2, int $$3, ewk $$4) {
      super($$0, $$1, $$2, $$3, vd.i());
      this.f = $$4;
      this.m = this.c(eva.N().z());
   }

   public void b(boolean $$0) {
      this.m = this.c($$0);
      this.a(this.c());
   }

   private fhf.a c(boolean $$0) {
      fhf.b $$1 = new fhf.b(this.j());
      List<gja> $$2 = new ArrayList<>(gja.g());
      $$2.sort(Comparator.comparing(gja::d));

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         gja $$4 = $$2.get($$3);
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
   protected void c(ewm $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.C() + this.a();
      int $$5 = this.B() + this.a();
      $$0.c().a();
      $$0.c().a((double)$$5, (double)$$4, 0.0);
      this.m.a().a($$4x -> $$4x.a($$0, $$1, $$2, $$3));
      $$0.c().b();
   }

   @Override
   protected void a(far $$0) {
      $$0.a(faq.a, this.m.b());
   }

   private vd a(vd $$0, boolean $$1) {
      return (vd)($$1 ? $$0.f().a(n.h) : $$0);
   }

   private void a(fhf.b $$0, gja $$1, boolean $$2) {
      String $$3 = $$1.d() ? ($$2 ? "telemetry.event.optional.disabled" : "telemetry.event.optional") : "telemetry.event.required";
      $$0.b(this.f, this.a(vd.a($$3, $$1.e()), $$2));
      $$0.b(this.f, $$1.f().a(n.h));
      $$0.a(9 / 2);
      $$0.a(this.f, this.a(e, $$2), 2);
      this.a($$1, $$0, $$2);
   }

   private void a(gja $$0, fhf.b $$1, boolean $$2) {
      for (gjc<?> $$3 : $$0.b()) {
         $$1.a(this.f, this.a($$3.a(), $$2));
      }
   }

   private int j() {
      return this.g - this.b();
   }

   static record a(faj a, vd b) {
   }

   static class b {
      private final int a;
      private final fam b;
      private final vr c = vd.i();

      public b(int $$0) {
         this.a = $$0;
         this.b = fam.d();
         this.b.c().a();
         this.b.a(fan.a($$0));
      }

      public void a(ewk $$0, vd $$1) {
         this.a($$0, $$1, 0);
      }

      public void a(ewk $$0, vd $$1, int $$2) {
         this.b.a(new exs($$1, $$0).c(this.a), $$1x -> $$1x.e($$2));
         this.c.b($$1).f("\n");
      }

      public void b(ewk $$0, vd $$1) {
         this.b.a(new exs($$1, $$0).c(this.a - 64).b(true), $$0x -> $$0x.b().f(32));
         this.c.b($$1).f("\n");
      }

      public void a(int $$0) {
         this.b.a(fan.b($$0));
      }

      public fhf.a a() {
         this.b.a();
         return new fhf.a(this.b, this.c);
      }
   }
}
