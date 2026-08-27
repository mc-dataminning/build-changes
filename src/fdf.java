import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class fdf {
   private static final int a = 44;
   private final List<fdf.c> b;

   fdf(List<fdf.c> $$0) {
      this.b = $$0;
   }

   public void a() {
      this.b.forEach(fdf.c::a);
   }

   public static fdf.a a(int $$0) {
      return new fdf.a($$0);
   }

   public static class a {
      final int a;
      private final List<fdf.d> b = new ArrayList<>();
      int c;
      int d = 4;
      int e;
      Optional<fdf.b> f = Optional.empty();

      public a(int $$0) {
         this.a = $$0;
      }

      void a() {
         this.e++;
      }

      public fdf.d a(tl $$0, BooleanSupplier $$1, Consumer<Boolean> $$2) {
         fdf.d $$3 = new fdf.d($$0, $$1, $$2, 44);
         this.b.add($$3);
         return $$3;
      }

      public fdf.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public fdf.a b(int $$0) {
         this.d = $$0;
         return this;
      }

      public fdf a(Consumer<ewb> $$0) {
         evy $$1 = new evy().b(this.d);
         $$1.a(ewe.a(this.a - 44), 0, 0);
         $$1.a(ewe.a(44), 0, 1);
         List<fdf.c> $$2 = new ArrayList<>();
         this.e = 0;

         for (fdf.d $$3 : this.b) {
            $$2.add($$3.a(this, $$1, 0));
         }

         $$1.a();
         $$0.accept($$1);
         fdf $$4 = new fdf($$2);
         $$4.a();
         return $$4;
      }

      public fdf.a a(int $$0, boolean $$1) {
         this.f = Optional.of(new fdf.b($$0, $$1));
         return this;
      }
   }

   static record b(int a, boolean b) {
   }

   static record c(esx<Boolean> a, BooleanSupplier b, @Nullable BooleanSupplier c) {
      public void a() {
         this.a.a(this.b.getAsBoolean());
         if (this.c != null) {
            this.a.i = this.c.getAsBoolean();
         }
      }

      public esx<Boolean> b() {
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
      private final tl a;
      private final BooleanSupplier b;
      private final Consumer<Boolean> c;
      @Nullable
      private tl d;
      @Nullable
      private BooleanSupplier e;
      private final int f;

      d(tl $$0, BooleanSupplier $$1, Consumer<Boolean> $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = $$3;
      }

      public fdf.d a(BooleanSupplier $$0) {
         this.e = $$0;
         return this;
      }

      public fdf.d a(tl $$0) {
         this.d = $$0;
         return this;
      }

      fdf.c a(fdf.a $$0, evy $$1, int $$2) {
         $$0.a();
         etw $$3 = new etw(this.a, eqv.O().h).e();
         $$1.a($$3, $$0.e, $$2, $$1.b().a(0.0F, 0.5F).b($$0.c));
         Optional<fdf.b> $$4 = $$0.f;
         esx.a<Boolean> $$5 = esx.b(this.b.getAsBoolean());
         $$5.a();
         boolean $$6 = this.d != null && $$4.isEmpty();
         if ($$6) {
            eua $$7 = eua.a(this.d);
            $$5.a($$1x -> $$7);
         }

         if (this.d != null && !$$6) {
            $$5.a($$0x -> tk.a(this.a, $$0x.b(), this.d));
         } else {
            $$5.a($$0x -> tk.a(this.a, $$0x.b()));
         }

         esx<Boolean> $$8 = $$5.a(0, 0, this.f, 20, tl.h(), ($$0x, $$1x) -> this.c.accept($$1x));
         if (this.e != null) {
            $$8.i = this.e.getAsBoolean();
         }

         $$1.a($$8, $$0.e, $$2 + 1, $$1.b().c());
         if (this.d != null) {
            $$4.ifPresent($$3x -> {
               tl $$4x = this.d.e().a(n.h);
               esd $$5x = eqv.O().h;
               etk $$6x = new etk($$4x, $$5x);
               $$6x.j($$0.a - $$0.c - this.f);
               $$6x.k($$3x.a());
               $$0.a();
               int $$7 = $$3x.b ? 9 * $$3x.a - $$6x.i() : 0;
               $$1.a($$6x, $$0.e, $$2, $$1.b().c(-$$0.d).e($$7));
            });
         }

         return new fdf.c($$8, this.b, this.e);
      }
   }
}
