import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class fhq {
   private static final int a = 44;
   private final List<fhq.c> b;

   fhq(List<fhq.c> $$0) {
      this.b = $$0;
   }

   public void a() {
      this.b.forEach(fhq.c::a);
   }

   public static fhq.a a(int $$0) {
      return new fhq.a($$0);
   }

   public static class a {
      final int a;
      private final List<fhq.d> b = new ArrayList<>();
      int c;
      int d = 4;
      int e;
      Optional<fhq.b> f = Optional.empty();

      public a(int $$0) {
         this.a = $$0;
      }

      void a() {
         this.e++;
      }

      public fhq.d a(vd $$0, BooleanSupplier $$1, Consumer<Boolean> $$2) {
         fhq.d $$3 = new fhq.d($$0, $$1, $$2, 44);
         this.b.add($$3);
         return $$3;
      }

      public fhq.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public fhq.a b(int $$0) {
         this.d = $$0;
         return this;
      }

      public fhq a(Consumer<fak> $$0) {
         fah $$1 = new fah().b(this.d);
         $$1.a(fan.a(this.a - 44), 0, 0);
         $$1.a(fan.a(44), 0, 1);
         List<fhq.c> $$2 = new ArrayList<>();
         this.e = 0;

         for (fhq.d $$3 : this.b) {
            $$2.add($$3.a(this, $$1, 0));
         }

         $$1.a();
         $$0.accept($$1);
         fhq $$4 = new fhq($$2);
         $$4.a();
         return $$4;
      }

      public fhq.a a(int $$0, boolean $$1) {
         this.f = Optional.of(new fhq.b($$0, $$1));
         return this;
      }
   }

   static record b(int a, boolean b) {
   }

   static record c(exf<Boolean> a, BooleanSupplier b, @Nullable BooleanSupplier c) {
      public void a() {
         this.a.a(this.b.getAsBoolean());
         if (this.c != null) {
            this.a.j = this.c.getAsBoolean();
         }
      }

      public exf<Boolean> b() {
         return this.a;
      }

      public BooleanSupplier c() {
         return this.b;
      }

      @Nullable
      public BooleanSupplier d() {
         return this.c;
      }
   }

   public static class d {
      private final vd a;
      private final BooleanSupplier b;
      private final Consumer<Boolean> c;
      @Nullable
      private vd d;
      @Nullable
      private BooleanSupplier e;
      private final int f;

      d(vd $$0, BooleanSupplier $$1, Consumer<Boolean> $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = $$3;
      }

      public fhq.d a(BooleanSupplier $$0) {
         this.e = $$0;
         return this;
      }

      public fhq.d a(vd $$0) {
         this.d = $$0;
         return this;
      }

      fhq.c a(fhq.a $$0, fah $$1, int $$2) {
         $$0.a();
         eyf $$3 = new eyf(this.a, eva.N().h).d();
         $$1.a($$3, $$0.e, $$2, $$1.b().a(0.0F, 0.5F).b($$0.c));
         Optional<fhq.b> $$4 = $$0.f;
         exf.a<Boolean> $$5 = exf.b(this.b.getAsBoolean());
         $$5.a();
         boolean $$6 = this.d != null && $$4.isEmpty();
         if ($$6) {
            eyj $$7 = eyj.a(this.d);
            $$5.a($$1x -> $$7);
         }

         if (this.d != null && !$$6) {
            $$5.a($$0x -> vc.a(this.a, $$0x.d(), this.d));
         } else {
            $$5.a($$0x -> vc.a(this.a, $$0x.d()));
         }

         exf<Boolean> $$8 = $$5.a(0, 0, this.f, 20, vd.i(), ($$0x, $$1x) -> this.c.accept($$1x));
         if (this.e != null) {
            $$8.j = this.e.getAsBoolean();
         }

         $$1.a($$8, $$0.e, $$2 + 1, $$1.b().c());
         if (this.d != null) {
            $$4.ifPresent($$3x -> {
               vd $$4x = this.d.f().a(n.h);
               ewk $$5x = eva.N().h;
               exs $$6x = new exs($$4x, $$5x);
               $$6x.c($$0.a - $$0.c - this.f);
               $$6x.d($$3x.a());
               $$0.a();
               int $$7 = $$3x.b ? 9 * $$3x.a - $$6x.u() : 0;
               $$1.a($$6x, $$0.e, $$2, $$1.b().c(-$$0.d).e($$7));
            });
         }

         return new fhq.c($$8, this.b, this.e);
      }
   }
}
