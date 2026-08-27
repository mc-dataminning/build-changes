import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class fok {
   private static final int a = 44;
   private final List<fok.c> b;

   fok(List<fok.c> $$0) {
      this.b = $$0;
   }

   public void a() {
      this.b.forEach(fok.c::a);
   }

   public static fok.a a(int $$0) {
      return new fok.a($$0);
   }

   public static class a {
      final int a;
      private final List<fok.d> b = new ArrayList<>();
      int c;
      int d = 4;
      int e;
      Optional<fok.b> f = Optional.empty();

      public a(int $$0) {
         this.a = $$0;
      }

      void a() {
         this.e++;
      }

      public fok.d a(wg $$0, BooleanSupplier $$1, Consumer<Boolean> $$2) {
         fok.d $$3 = new fok.d($$0, $$1, $$2, 44);
         this.b.add($$3);
         return $$3;
      }

      public fok.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public fok.a b(int $$0) {
         this.d = $$0;
         return this;
      }

      public fok a(Consumer<fhe> $$0) {
         fhb $$1 = new fhb().b(this.d);
         $$1.a(fhh.a(this.a - 44), 0, 0);
         $$1.a(fhh.a(44), 0, 1);
         List<fok.c> $$2 = new ArrayList<>();
         this.e = 0;

         for (fok.d $$3 : this.b) {
            $$2.add($$3.a(this, $$1, 0));
         }

         $$1.a();
         $$0.accept($$1);
         fok $$4 = new fok($$2);
         $$4.a();
         return $$4;
      }

      public fok.a a(int $$0, boolean $$1) {
         this.f = Optional.of(new fok.b($$0, $$1));
         return this;
      }
   }

   static record b(int a, boolean b) {
   }

   static record c(fdw<Boolean> a, BooleanSupplier b, @Nullable BooleanSupplier c) {
      public void a() {
         this.a.a(this.b.getAsBoolean());
         if (this.c != null) {
            this.a.j = this.c.getAsBoolean();
         }
      }

      public fdw<Boolean> b() {
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
      private final wg a;
      private final BooleanSupplier b;
      private final Consumer<Boolean> c;
      @Nullable
      private wg d;
      @Nullable
      private BooleanSupplier e;
      private final int f;

      d(wg $$0, BooleanSupplier $$1, Consumer<Boolean> $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = $$3;
      }

      public fok.d a(BooleanSupplier $$0) {
         this.e = $$0;
         return this;
      }

      public fok.d a(wg $$0) {
         this.d = $$0;
         return this;
      }

      fok.c a(fok.a $$0, fhb $$1, int $$2) {
         $$0.a();
         few $$3 = new few(this.a, fbp.Q().h).d();
         $$1.a($$3, $$0.e, $$2, $$1.b().a(0.0F, 0.5F).b($$0.c));
         Optional<fok.b> $$4 = $$0.f;
         fdw.a<Boolean> $$5 = fdw.b(this.b.getAsBoolean());
         $$5.a();
         boolean $$6 = this.d != null && $$4.isEmpty();
         if ($$6) {
            ffa $$7 = ffa.a(this.d);
            $$5.a($$1x -> $$7);
         }

         if (this.d != null && !$$6) {
            $$5.a($$0x -> wf.a(this.a, $$0x.d(), this.d));
         } else {
            $$5.a($$0x -> wf.a(this.a, $$0x.d()));
         }

         fdw<Boolean> $$8 = $$5.a(0, 0, this.f, 20, wg.i(), ($$0x, $$1x) -> this.c.accept($$1x));
         if (this.e != null) {
            $$8.j = this.e.getAsBoolean();
         }

         $$1.a($$8, $$0.e, $$2 + 1, $$1.b().c());
         if (this.d != null) {
            $$4.ifPresent($$3x -> {
               wg $$4x = this.d.f().a(n.h);
               fda $$5x = fbp.Q().h;
               fej $$6x = new fej($$4x, $$5x);
               $$6x.d($$0.a - $$0.c - this.f);
               $$6x.e($$3x.a());
               $$0.a();
               int $$7 = $$3x.b ? 9 * $$3x.a - $$6x.v() : 0;
               $$1.a($$6x, $$0.e, $$2, $$1.b().c(-$$0.d).e($$7));
            });
         }

         return new fok.c($$8, this.b, this.e);
      }
   }
}
