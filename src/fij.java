import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class fij {
   private static final int a = 44;
   private final List<fij.c> b;

   fij(List<fij.c> $$0) {
      this.b = $$0;
   }

   public void a() {
      this.b.forEach(fij.c::a);
   }

   public static fij.a a(int $$0) {
      return new fij.a($$0);
   }

   public static class a {
      final int a;
      private final List<fij.d> b = new ArrayList<>();
      int c;
      int d = 4;
      int e;
      Optional<fij.b> f = Optional.empty();

      public a(int $$0) {
         this.a = $$0;
      }

      void a() {
         this.e++;
      }

      public fij.d a(vg $$0, BooleanSupplier $$1, Consumer<Boolean> $$2) {
         fij.d $$3 = new fij.d($$0, $$1, $$2, 44);
         this.b.add($$3);
         return $$3;
      }

      public fij.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public fij.a b(int $$0) {
         this.d = $$0;
         return this;
      }

      public fij a(Consumer<fbd> $$0) {
         fba $$1 = new fba().b(this.d);
         $$1.a(fbg.a(this.a - 44), 0, 0);
         $$1.a(fbg.a(44), 0, 1);
         List<fij.c> $$2 = new ArrayList<>();
         this.e = 0;

         for (fij.d $$3 : this.b) {
            $$2.add($$3.a(this, $$1, 0));
         }

         $$1.a();
         $$0.accept($$1);
         fij $$4 = new fij($$2);
         $$4.a();
         return $$4;
      }

      public fij.a a(int $$0, boolean $$1) {
         this.f = Optional.of(new fij.b($$0, $$1));
         return this;
      }
   }

   static record b(int a, boolean b) {
   }

   static record c(exy<Boolean> a, BooleanSupplier b, @Nullable BooleanSupplier c) {
      public void a() {
         this.a.a(this.b.getAsBoolean());
         if (this.c != null) {
            this.a.j = this.c.getAsBoolean();
         }
      }

      public exy<Boolean> b() {
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
      private final vg a;
      private final BooleanSupplier b;
      private final Consumer<Boolean> c;
      @Nullable
      private vg d;
      @Nullable
      private BooleanSupplier e;
      private final int f;

      d(vg $$0, BooleanSupplier $$1, Consumer<Boolean> $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = $$3;
      }

      public fij.d a(BooleanSupplier $$0) {
         this.e = $$0;
         return this;
      }

      public fij.d a(vg $$0) {
         this.d = $$0;
         return this;
      }

      fij.c a(fij.a $$0, fba $$1, int $$2) {
         $$0.a();
         eyy $$3 = new eyy(this.a, evr.O().h).d();
         $$1.a($$3, $$0.e, $$2, $$1.b().a(0.0F, 0.5F).b($$0.c));
         Optional<fij.b> $$4 = $$0.f;
         exy.a<Boolean> $$5 = exy.b(this.b.getAsBoolean());
         $$5.a();
         boolean $$6 = this.d != null && $$4.isEmpty();
         if ($$6) {
            ezc $$7 = ezc.a(this.d);
            $$5.a($$1x -> $$7);
         }

         if (this.d != null && !$$6) {
            $$5.a($$0x -> vf.a(this.a, $$0x.d(), this.d));
         } else {
            $$5.a($$0x -> vf.a(this.a, $$0x.d()));
         }

         exy<Boolean> $$8 = $$5.a(0, 0, this.f, 20, vg.i(), ($$0x, $$1x) -> this.c.accept($$1x));
         if (this.e != null) {
            $$8.j = this.e.getAsBoolean();
         }

         $$1.a($$8, $$0.e, $$2 + 1, $$1.b().c());
         if (this.d != null) {
            $$4.ifPresent($$3x -> {
               vg $$4x = this.d.f().a(n.h);
               exc $$5x = evr.O().h;
               eyl $$6x = new eyl($$4x, $$5x);
               $$6x.c($$0.a - $$0.c - this.f);
               $$6x.d($$3x.a());
               $$0.a();
               int $$7 = $$3x.b ? 9 * $$3x.a - $$6x.u() : 0;
               $$1.a($$6x, $$0.e, $$2, $$1.b().c(-$$0.d).e($$7));
            });
         }

         return new fij.c($$8, this.b, this.e);
      }
   }
}
