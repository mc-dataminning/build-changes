import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class ffw {
   private static final int a = 44;
   private final List<ffw.c> b;

   ffw(List<ffw.c> $$0) {
      this.b = $$0;
   }

   public void a() {
      this.b.forEach(ffw.c::a);
   }

   public static ffw.a a(int $$0) {
      return new ffw.a($$0);
   }

   public static class a {
      final int a;
      private final List<ffw.d> b = new ArrayList<>();
      int c;
      int d = 4;
      int e;
      Optional<ffw.b> f = Optional.empty();

      public a(int $$0) {
         this.a = $$0;
      }

      void a() {
         this.e++;
      }

      public ffw.d a(uv $$0, BooleanSupplier $$1, Consumer<Boolean> $$2) {
         ffw.d $$3 = new ffw.d($$0, $$1, $$2, 44);
         this.b.add($$3);
         return $$3;
      }

      public ffw.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public ffw.a b(int $$0) {
         this.d = $$0;
         return this;
      }

      public ffw a(Consumer<eyq> $$0) {
         eyn $$1 = new eyn().b(this.d);
         $$1.a(eyt.a(this.a - 44), 0, 0);
         $$1.a(eyt.a(44), 0, 1);
         List<ffw.c> $$2 = new ArrayList<>();
         this.e = 0;

         for (ffw.d $$3 : this.b) {
            $$2.add($$3.a(this, $$1, 0));
         }

         $$1.a();
         $$0.accept($$1);
         ffw $$4 = new ffw($$2);
         $$4.a();
         return $$4;
      }

      public ffw.a a(int $$0, boolean $$1) {
         this.f = Optional.of(new ffw.b($$0, $$1));
         return this;
      }
   }

   static record b(int a, boolean b) {
   }

   static record c(evl<Boolean> a, BooleanSupplier b, @Nullable BooleanSupplier c) {
      public void a() {
         this.a.a(this.b.getAsBoolean());
         if (this.c != null) {
            this.a.i = this.c.getAsBoolean();
         }
      }

      public evl<Boolean> b() {
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
      private final uv a;
      private final BooleanSupplier b;
      private final Consumer<Boolean> c;
      @Nullable
      private uv d;
      @Nullable
      private BooleanSupplier e;
      private final int f;

      d(uv $$0, BooleanSupplier $$1, Consumer<Boolean> $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = $$3;
      }

      public ffw.d a(BooleanSupplier $$0) {
         this.e = $$0;
         return this;
      }

      public ffw.d a(uv $$0) {
         this.d = $$0;
         return this;
      }

      ffw.c a(ffw.a $$0, eyn $$1, int $$2) {
         $$0.a();
         ewl $$3 = new ewl(this.a, eti.N().h).e();
         $$1.a($$3, $$0.e, $$2, $$1.b().a(0.0F, 0.5F).b($$0.c));
         Optional<ffw.b> $$4 = $$0.f;
         evl.a<Boolean> $$5 = evl.b(this.b.getAsBoolean());
         $$5.a();
         boolean $$6 = this.d != null && $$4.isEmpty();
         if ($$6) {
            ewp $$7 = ewp.a(this.d);
            $$5.a($$1x -> $$7);
         }

         if (this.d != null && !$$6) {
            $$5.a($$0x -> uu.a(this.a, $$0x.e(), this.d));
         } else {
            $$5.a($$0x -> uu.a(this.a, $$0x.e()));
         }

         evl<Boolean> $$8 = $$5.a(0, 0, this.f, 20, uv.i(), ($$0x, $$1x) -> this.c.accept($$1x));
         if (this.e != null) {
            $$8.i = this.e.getAsBoolean();
         }

         $$1.a($$8, $$0.e, $$2 + 1, $$1.b().c());
         if (this.d != null) {
            $$4.ifPresent($$3x -> {
               uv $$4x = this.d.f().a(n.h);
               eur $$5x = eti.N().h;
               evy $$6x = new evy($$4x, $$5x);
               $$6x.j($$0.a - $$0.c - this.f);
               $$6x.k($$3x.a());
               $$0.a();
               int $$7 = $$3x.b ? 9 * $$3x.a - $$6x.i() : 0;
               $$1.a($$6x, $$0.e, $$2, $$1.b().c(-$$0.d).e($$7));
            });
         }

         return new ffw.c($$8, this.b, this.e);
      }
   }
}
