import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class fqa {
   private static final int a = 44;
   private final List<fqa.c> b;

   fqa(List<fqa.c> $$0) {
      this.b = $$0;
   }

   public void a() {
      this.b.forEach(fqa.c::a);
   }

   public static fqa.a a(int $$0) {
      return new fqa.a($$0);
   }

   public static class a {
      final int a;
      private final List<fqa.d> b = new ArrayList<>();
      int c;
      int d = 4;
      int e;
      Optional<fqa.b> f = Optional.empty();

      public a(int $$0) {
         this.a = $$0;
      }

      void a() {
         this.e++;
      }

      public fqa.d a(wu $$0, BooleanSupplier $$1, Consumer<Boolean> $$2) {
         fqa.d $$3 = new fqa.d($$0, $$1, $$2, 44);
         this.b.add($$3);
         return $$3;
      }

      public fqa.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public fqa.a b(int $$0) {
         this.d = $$0;
         return this;
      }

      public fqa a(Consumer<fit> $$0) {
         fiq $$1 = new fiq().b(this.d);
         $$1.a(fiw.a(this.a - 44), 0, 0);
         $$1.a(fiw.a(44), 0, 1);
         List<fqa.c> $$2 = new ArrayList<>();
         this.e = 0;

         for (fqa.d $$3 : this.b) {
            $$2.add($$3.a(this, $$1, 0));
         }

         $$1.a();
         $$0.accept($$1);
         fqa $$4 = new fqa($$2);
         $$4.a();
         return $$4;
      }

      public fqa.a a(int $$0, boolean $$1) {
         this.f = Optional.of(new fqa.b($$0, $$1));
         return this;
      }
   }

   static record b(int a, boolean b) {
   }

   static record c(ffl<Boolean> a, BooleanSupplier b, @Nullable BooleanSupplier c) {
      public void a() {
         this.a.a(this.b.getAsBoolean());
         if (this.c != null) {
            this.a.j = this.c.getAsBoolean();
         }
      }

      public ffl<Boolean> b() {
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
      private final wu a;
      private final BooleanSupplier b;
      private final Consumer<Boolean> c;
      @Nullable
      private wu d;
      @Nullable
      private BooleanSupplier e;
      private final int f;

      d(wu $$0, BooleanSupplier $$1, Consumer<Boolean> $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = $$3;
      }

      public fqa.d a(BooleanSupplier $$0) {
         this.e = $$0;
         return this;
      }

      public fqa.d a(wu $$0) {
         this.d = $$0;
         return this;
      }

      fqa.c a(fqa.a $$0, fiq $$1, int $$2) {
         $$0.a();
         fgl $$3 = new fgl(this.a, fde.Q().h).d();
         $$1.a($$3, $$0.e, $$2, $$1.b().a(0.0F, 0.5F).b($$0.c));
         Optional<fqa.b> $$4 = $$0.f;
         ffl.a<Boolean> $$5 = ffl.b(this.b.getAsBoolean());
         $$5.a();
         boolean $$6 = this.d != null && $$4.isEmpty();
         if ($$6) {
            fgp $$7 = fgp.a(this.d);
            $$5.a($$1x -> $$7);
         }

         if (this.d != null && !$$6) {
            $$5.a($$0x -> wt.a(this.a, $$0x.d(), this.d));
         } else {
            $$5.a($$0x -> wt.a(this.a, $$0x.d()));
         }

         ffl<Boolean> $$8 = $$5.a(0, 0, this.f, 20, wu.i(), ($$0x, $$1x) -> this.c.accept($$1x));
         if (this.e != null) {
            $$8.j = this.e.getAsBoolean();
         }

         $$1.a($$8, $$0.e, $$2 + 1, $$1.b().c());
         if (this.d != null) {
            $$4.ifPresent($$3x -> {
               wu $$4x = this.d.f().a(n.h);
               fep $$5x = fde.Q().h;
               ffy $$6x = new ffy($$4x, $$5x);
               $$6x.d($$0.a - $$0.c - this.f);
               $$6x.e($$3x.a());
               $$0.a();
               int $$7 = $$3x.b ? 9 * $$3x.a - $$6x.v() : 0;
               $$1.a($$6x, $$0.e, $$2, $$1.b().c(-$$0.d).e($$7));
            });
         }

         return new fqa.c($$8, this.b, this.e);
      }
   }
}
