import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class fcv {
   private static final int a = 44;
   private final List<fcv.c> b;

   fcv(List<fcv.c> $$0) {
      this.b = $$0;
   }

   public void a() {
      this.b.forEach(fcv.c::a);
   }

   public static fcv.a a(int $$0) {
      return new fcv.a($$0);
   }

   public static class a {
      final int a;
      private final List<fcv.d> b = new ArrayList<>();
      int c;
      int d = 4;
      int e;
      Optional<fcv.b> f = Optional.empty();

      public a(int $$0) {
         this.a = $$0;
      }

      void a() {
         this.e++;
      }

      public fcv.d a(tf $$0, BooleanSupplier $$1, Consumer<Boolean> $$2) {
         fcv.d $$3 = new fcv.d($$0, $$1, $$2, 44);
         this.b.add($$3);
         return $$3;
      }

      public fcv.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public fcv.a b(int $$0) {
         this.d = $$0;
         return this;
      }

      public fcv a(Consumer<evr> $$0) {
         evo $$1 = new evo().b(this.d);
         $$1.a(evu.a(this.a - 44), 0, 0);
         $$1.a(evu.a(44), 0, 1);
         List<fcv.c> $$2 = new ArrayList<>();
         this.e = 0;

         for (fcv.d $$3 : this.b) {
            $$2.add($$3.a(this, $$1, 0));
         }

         $$1.a();
         $$0.accept($$1);
         fcv $$4 = new fcv($$2);
         $$4.a();
         return $$4;
      }

      public fcv.a a(int $$0, boolean $$1) {
         this.f = Optional.of(new fcv.b($$0, $$1));
         return this;
      }
   }

   static record b(int a, boolean b) {
   }

   static record c(esn<Boolean> a, BooleanSupplier b, @Nullable BooleanSupplier c) {
      public void a() {
         this.a.a(this.b.getAsBoolean());
         if (this.c != null) {
            this.a.i = this.c.getAsBoolean();
         }
      }

      public esn<Boolean> b() {
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
      private final tf a;
      private final BooleanSupplier b;
      private final Consumer<Boolean> c;
      @Nullable
      private tf d;
      @Nullable
      private BooleanSupplier e;
      private final int f;

      d(tf $$0, BooleanSupplier $$1, Consumer<Boolean> $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = $$3;
      }

      public fcv.d a(BooleanSupplier $$0) {
         this.e = $$0;
         return this;
      }

      public fcv.d a(tf $$0) {
         this.d = $$0;
         return this;
      }

      fcv.c a(fcv.a $$0, evo $$1, int $$2) {
         $$0.a();
         etm $$3 = new etm(this.a, eql.O().h).e();
         $$1.a($$3, $$0.e, $$2, $$1.b().a(0.0F, 0.5F).b($$0.c));
         Optional<fcv.b> $$4 = $$0.f;
         esn.a<Boolean> $$5 = esn.b(this.b.getAsBoolean());
         $$5.a();
         boolean $$6 = this.d != null && $$4.isEmpty();
         if ($$6) {
            etq $$7 = etq.a(this.d);
            $$5.a($$1x -> $$7);
         }

         if (this.d != null && !$$6) {
            $$5.a($$0x -> te.a(this.a, $$0x.b(), this.d));
         } else {
            $$5.a($$0x -> te.a(this.a, $$0x.b()));
         }

         esn<Boolean> $$8 = $$5.a(0, 0, this.f, 20, tf.h(), ($$0x, $$1x) -> this.c.accept($$1x));
         if (this.e != null) {
            $$8.i = this.e.getAsBoolean();
         }

         $$1.a($$8, $$0.e, $$2 + 1, $$1.b().c());
         if (this.d != null) {
            $$4.ifPresent($$3x -> {
               tf $$4x = this.d.e().a(n.h);
               ert $$5x = eql.O().h;
               eta $$6x = new eta($$4x, $$5x);
               $$6x.j($$0.a - $$0.c - this.f);
               $$6x.k($$3x.a());
               $$0.a();
               int $$7 = $$3x.b ? 9 * $$3x.a - $$6x.i() : 0;
               $$1.a($$6x, $$0.e, $$2, $$1.b().c(-$$0.d).e($$7));
            });
         }

         return new fcv.c($$8, this.b, this.e);
      }
   }
}
