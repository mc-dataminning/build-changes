import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class fto {
   private static final int a = 44;
   private final List<fto.c> b;

   fto(List<fto.c> $$0) {
      this.b = $$0;
   }

   public void a() {
      this.b.forEach(fto.c::a);
   }

   public static fto.a a(int $$0) {
      return new fto.a($$0);
   }

   public static class a {
      final int a;
      private final List<fto.d> b = new ArrayList<>();
      int c;
      int d = 4;
      int e;
      Optional<fto.b> f = Optional.empty();

      public a(int $$0) {
         this.a = $$0;
      }

      void a() {
         this.e++;
      }

      public fto.d a(xe $$0, BooleanSupplier $$1, Consumer<Boolean> $$2) {
         fto.d $$3 = new fto.d($$0, $$1, $$2, 44);
         this.b.add($$3);
         return $$3;
      }

      public fto.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public fto.a b(int $$0) {
         this.d = $$0;
         return this;
      }

      public fto a(Consumer<fmc> $$0) {
         flz $$1 = new flz().b(this.d);
         $$1.a(fmf.a(this.a - 44), 0, 0);
         $$1.a(fmf.a(44), 0, 1);
         List<fto.c> $$2 = new ArrayList<>();
         this.e = 0;

         for (fto.d $$3 : this.b) {
            $$2.add($$3.a(this, $$1, 0));
         }

         $$1.a();
         $$0.accept($$1);
         fto $$4 = new fto($$2);
         $$4.a();
         return $$4;
      }

      public fto.a a(int $$0, boolean $$1) {
         this.f = Optional.of(new fto.b($$0, $$1));
         return this;
      }
   }

   static record b(int a, boolean b) {
   }

   static record c(fiu<Boolean> a, BooleanSupplier b, @Nullable BooleanSupplier c) {
      public void a() {
         this.a.a(this.b.getAsBoolean());
         if (this.c != null) {
            this.a.j = this.c.getAsBoolean();
         }
      }

      public fiu<Boolean> b() {
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
      private final xe a;
      private final BooleanSupplier b;
      private final Consumer<Boolean> c;
      @Nullable
      private xe d;
      @Nullable
      private BooleanSupplier e;
      private final int f;

      d(xe $$0, BooleanSupplier $$1, Consumer<Boolean> $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = $$3;
      }

      public fto.d a(BooleanSupplier $$0) {
         this.e = $$0;
         return this;
      }

      public fto.d a(xe $$0) {
         this.d = $$0;
         return this;
      }

      fto.c a(fto.a $$0, flz $$1, int $$2) {
         $$0.a();
         fju $$3 = new fju(this.a, fgj.Q().h).d();
         $$1.a($$3, $$0.e, $$2, $$1.b().a(0.0F, 0.5F).b($$0.c));
         Optional<fto.b> $$4 = $$0.f;
         fiu.a<Boolean> $$5 = fiu.b(this.b.getAsBoolean());
         $$5.a();
         boolean $$6 = this.d != null && $$4.isEmpty();
         if ($$6) {
            fjy $$7 = fjy.a(this.d);
            $$5.a($$1x -> $$7);
         }

         if (this.d != null && !$$6) {
            $$5.a($$0x -> xd.a(this.a, $$0x.d(), this.d));
         } else {
            $$5.a($$0x -> xd.a(this.a, $$0x.d()));
         }

         fiu<Boolean> $$8 = $$5.a(0, 0, this.f, 20, xe.i(), ($$0x, $$1x) -> this.c.accept($$1x));
         if (this.e != null) {
            $$8.j = this.e.getAsBoolean();
         }

         $$1.a($$8, $$0.e, $$2 + 1, $$1.b().c());
         if (this.d != null) {
            $$4.ifPresent($$3x -> {
               xe $$4x = this.d.f().a(n.h);
               fhy $$5x = fgj.Q().h;
               fjh $$6x = new fjh($$4x, $$5x);
               $$6x.d($$0.a - $$0.c - this.f);
               $$6x.e($$3x.a());
               $$0.a();
               int $$7 = $$3x.b ? 9 * $$3x.a - $$6x.v() : 0;
               $$1.a($$6x, $$0.e, $$2, $$1.b().c(-$$0.d).e($$7));
            });
         }

         return new fto.c($$8, this.b, this.e);
      }
   }
}
