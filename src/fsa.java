import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class fsa {
   private static final int a = 44;
   private final List<fsa.c> b;

   fsa(List<fsa.c> $$0) {
      this.b = $$0;
   }

   public void a() {
      this.b.forEach(fsa.c::a);
   }

   public static fsa.a a(int $$0) {
      return new fsa.a($$0);
   }

   public static class a {
      final int a;
      private final List<fsa.d> b = new ArrayList<>();
      int c;
      int d = 4;
      int e;
      Optional<fsa.b> f = Optional.empty();

      public a(int $$0) {
         this.a = $$0;
      }

      void a() {
         this.e++;
      }

      public fsa.d a(xp $$0, BooleanSupplier $$1, Consumer<Boolean> $$2) {
         fsa.d $$3 = new fsa.d($$0, $$1, $$2, 44);
         this.b.add($$3);
         return $$3;
      }

      public fsa.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public fsa.a b(int $$0) {
         this.d = $$0;
         return this;
      }

      public fsa a(Consumer<fku> $$0) {
         fkr $$1 = new fkr().b(this.d);
         $$1.a(fkx.a(this.a - 44), 0, 0);
         $$1.a(fkx.a(44), 0, 1);
         List<fsa.c> $$2 = new ArrayList<>();
         this.e = 0;

         for (fsa.d $$3 : this.b) {
            $$2.add($$3.a(this, $$1, 0));
         }

         $$1.a();
         $$0.accept($$1);
         fsa $$4 = new fsa($$2);
         $$4.a();
         return $$4;
      }

      public fsa.a a(int $$0, boolean $$1) {
         this.f = Optional.of(new fsa.b($$0, $$1));
         return this;
      }
   }

   static record b(int a, boolean b) {
   }

   static record c(fhm<Boolean> a, BooleanSupplier b, @Nullable BooleanSupplier c) {
      public void a() {
         this.a.a(this.b.getAsBoolean());
         if (this.c != null) {
            this.a.j = this.c.getAsBoolean();
         }
      }

      public fhm<Boolean> b() {
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
      private final xp a;
      private final BooleanSupplier b;
      private final Consumer<Boolean> c;
      @Nullable
      private xp d;
      @Nullable
      private BooleanSupplier e;
      private final int f;

      d(xp $$0, BooleanSupplier $$1, Consumer<Boolean> $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = $$3;
      }

      public fsa.d a(BooleanSupplier $$0) {
         this.e = $$0;
         return this;
      }

      public fsa.d a(xp $$0) {
         this.d = $$0;
         return this;
      }

      fsa.c a(fsa.a $$0, fkr $$1, int $$2) {
         $$0.a();
         fim $$3 = new fim(this.a, ffg.Q().h).c();
         $$1.a($$3, $$0.e, $$2, $$1.b().a(0.0F, 0.5F).b($$0.c));
         Optional<fsa.b> $$4 = $$0.f;
         fhm.a<Boolean> $$5 = fhm.b(this.b.getAsBoolean());
         $$5.a();
         boolean $$6 = this.d != null && $$4.isEmpty();
         if ($$6) {
            fiq $$7 = fiq.a(this.d);
            $$5.a($$1x -> $$7);
         }

         if (this.d != null && !$$6) {
            $$5.a($$0x -> xo.a(this.a, $$0x.c(), this.d));
         } else {
            $$5.a($$0x -> xo.a(this.a, $$0x.c()));
         }

         fhm<Boolean> $$8 = $$5.a(0, 0, this.f, 20, xp.i(), ($$0x, $$1x) -> this.c.accept($$1x));
         if (this.e != null) {
            $$8.j = this.e.getAsBoolean();
         }

         $$1.a($$8, $$0.e, $$2 + 1, $$1.b().c());
         if (this.d != null) {
            $$4.ifPresent($$3x -> {
               xp $$4x = this.d.f().a(n.h);
               fgq $$5x = ffg.Q().h;
               fhz $$6x = new fhz($$4x, $$5x);
               $$6x.d($$0.a - $$0.c - this.f);
               $$6x.e($$3x.a());
               $$0.a();
               int $$7 = $$3x.b ? 9 * $$3x.a - $$6x.v() : 0;
               $$1.a($$6x, $$0.e, $$2, $$1.b().c(-$$0.d).e($$7));
            });
         }

         return new fsa.c($$8, this.b, this.e);
      }
   }
}
