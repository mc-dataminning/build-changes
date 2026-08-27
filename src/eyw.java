import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.DoubleConsumer;
import javax.annotation.Nullable;

public class eyw extends epb {
   private static final int a = 32;
   private static final String b = "telemetry.event.required";
   private static final String c = "telemetry.event.optional";
   private static final sw d = sw.c("telemetry_info.property_title").a(n.t);
   private final eov e;
   private eyw.a f;
   @Nullable
   private DoubleConsumer g;

   public eyw(int $$0, int $$1, int $$2, int $$3, eov $$4) {
      super($$0, $$1, $$2, $$3, sw.h());
      this.e = $$4;
      this.f = this.c(enn.N().z());
   }

   public void b(boolean $$0) {
      this.f = this.c($$0);
      this.a(this.c());
   }

   private eyw.a c(boolean $$0) {
      eyw.b $$1 = new eyw.b(this.v());
      List<fzl> $$2 = new ArrayList<>(fzl.g());
      $$2.sort(Comparator.comparing(fzl::d));
      if (!$$0) {
         $$2.removeIf(fzl::d);
      }

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         fzl $$4 = $$2.get($$3);
         this.a($$1, $$4);
         if ($$3 < $$2.size() - 1) {
            $$1.a(9);
         }
      }

      return $$1.a();
   }

   public void a(@Nullable DoubleConsumer $$0) {
      this.g = $$0;
   }

   @Override
   protected void a(double $$0) {
      super.a($$0);
      if (this.g != null) {
         this.g.accept(this.c());
      }
   }

   @Override
   protected int f() {
      return this.f.a().h();
   }

   @Override
   protected double g() {
      return 9.0;
   }

   @Override
   protected void c(eox $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.r() + this.a();
      int $$5 = this.p() + this.a();
      $$0.c().a();
      $$0.c().a((double)$$5, (double)$$4, 0.0);
      this.f.a().a($$4x -> $$4x.a($$0, $$1, $$2, $$3));
      $$0.c().b();
   }

   @Override
   protected void a(esp $$0) {
      $$0.a(eso.a, this.f.b());
   }

   private void a(eyw.b $$0, fzl $$1) {
      String $$2 = $$1.d() ? "telemetry.event.optional" : "telemetry.event.required";
      $$0.b(this.e, sw.a($$2, $$1.e()));
      $$0.b(this.e, $$1.f().a(n.h));
      $$0.a(9 / 2);
      $$0.a(this.e, d, 2);
      this.a($$1, $$0);
   }

   private void a(fzl $$0, eyw.b $$1) {
      for (fzn<?> $$2 : $$0.b()) {
         $$1.a(this.e, $$2.a());
      }
   }

   private int v() {
      return this.o - this.b();
   }

   static record a(esf a, sw b) {
   }

   static class b {
      private final int a;
      private final esf b;
      private final esf.b c;
      private final esj d;
      private final tj e = sw.h();

      public b(int $$0) {
         this.a = $$0;
         this.b = new esf();
         this.b.b().a();
         this.c = this.b.d(1);
         this.c.a(esl.a($$0));
         this.d = this.c.b().b().f(32);
      }

      public void a(eov $$0, sw $$1) {
         this.a($$0, $$1, 0);
      }

      public void a(eov $$0, sw $$1, int $$2) {
         this.c.a(new eqa($$1, $$0).i(this.a), this.c.b().e($$2));
         this.e.b($$1).f("\n");
      }

      public void b(eov $$0, sw $$1) {
         this.c.a(new eqa($$1, $$0).i(this.a - 64).b(true), this.d);
         this.e.b($$1).f("\n");
      }

      public void a(int $$0) {
         this.c.a(esl.b($$0));
      }

      public eyw.a a() {
         this.b.c();
         return new eyw.a(this.b, this.e);
      }
   }
}
