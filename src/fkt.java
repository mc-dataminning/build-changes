import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.DoubleConsumer;
import javax.annotation.Nullable;

public class fkt extends fae {
   private static final int a = 32;
   private static final String b = "telemetry.event.required";
   private static final String c = "telemetry.event.optional";
   private static final String d = "telemetry.event.optional.disabled";
   private static final vs e = vs.c("telemetry_info.property_title").a(n.t);
   private final ezv f;
   private fkt.a m;
   @Nullable
   private DoubleConsumer n;

   public fkt(int $$0, int $$1, int $$2, int $$3, ezv $$4) {
      super($$0, $$1, $$2, $$3, vs.i());
      this.f = $$4;
      this.m = this.c(eyk.P().B());
   }

   public void b(boolean $$0) {
      this.m = this.c($$0);
      this.a(this.c());
   }

   private fkt.a c(boolean $$0) {
      fkt.b $$1 = new fkt.b(this.j());
      List<gmz> $$2 = new ArrayList<>(gmz.g());
      $$2.sort(Comparator.comparing(gmz::d));

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         gmz $$4 = $$2.get($$3);
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
   protected void c(ezx $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.C() + this.a();
      int $$5 = this.B() + this.a();
      $$0.c().a();
      $$0.c().a((double)$$5, (double)$$4, 0.0);
      this.m.a().a($$4x -> $$4x.a($$0, $$1, $$2, $$3));
      $$0.c().b();
   }

   @Override
   protected void a(fef $$0) {
      $$0.a(fee.a, this.m.b());
   }

   private vs a(vs $$0, boolean $$1) {
      return (vs)($$1 ? $$0.f().a(n.h) : $$0);
   }

   private void a(fkt.b $$0, gmz $$1, boolean $$2) {
      String $$3 = $$1.d() ? ($$2 ? "telemetry.event.optional.disabled" : "telemetry.event.optional") : "telemetry.event.required";
      $$0.b(this.f, this.a(vs.a($$3, $$1.e()), $$2));
      $$0.b(this.f, $$1.f().a(n.h));
      $$0.a(9 / 2);
      $$0.a(this.f, this.a(e, $$2), 2);
      this.a($$1, $$0, $$2);
   }

   private void a(gmz $$0, fkt.b $$1, boolean $$2) {
      for (gnb<?> $$3 : $$0.b()) {
         $$1.a(this.f, this.a($$3.a(), $$2));
      }
   }

   private int j() {
      return this.g - this.b();
   }

   static record a(fdx a, vs b) {
   }

   static class b {
      private final int a;
      private final fea b;
      private final wg c = vs.i();

      public b(int $$0) {
         this.a = $$0;
         this.b = fea.d();
         this.b.c().a();
         this.b.a(feb.a($$0));
      }

      public void a(ezv $$0, vs $$1) {
         this.a($$0, $$1, 0);
      }

      public void a(ezv $$0, vs $$1, int $$2) {
         this.b.a(new fbe($$1, $$0).c(this.a), $$1x -> $$1x.e($$2));
         this.c.b($$1).f("\n");
      }

      public void b(ezv $$0, vs $$1) {
         this.b.a(new fbe($$1, $$0).c(this.a - 64).b(true), $$0x -> $$0x.b().f(32));
         this.c.b($$1).f("\n");
      }

      public void a(int $$0) {
         this.b.a(feb.b($$0));
      }

      public fkt.a a() {
         this.b.a();
         return new fkt.a(this.b, this.c);
      }
   }
}
