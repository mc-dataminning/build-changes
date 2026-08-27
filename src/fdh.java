import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class fdh {
   private static final int a = 44;
   private final List<fdh.c> b;

   fdh(List<fdh.c> $$0) {
      this.b = $$0;
   }

   public void a() {
      this.b.forEach(fdh.c::a);
   }

   public static fdh.a a(int $$0) {
      return new fdh.a($$0);
   }

   public static class a {
      final int a;
      private final List<fdh.d> b = new ArrayList<>();
      int c;
      int d = 4;
      int e;
      Optional<fdh.b> f = Optional.empty();

      public a(int $$0) {
         this.a = $$0;
      }

      void a() {
         this.e++;
      }

      public fdh.d a(tn $$0, BooleanSupplier $$1, Consumer<Boolean> $$2) {
         fdh.d $$3 = new fdh.d($$0, $$1, $$2, 44);
         this.b.add($$3);
         return $$3;
      }

      public fdh.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public fdh.a b(int $$0) {
         this.d = $$0;
         return this;
      }

      public fdh a(Consumer<ewd> $$0) {
         ewa $$1 = new ewa().b(this.d);
         $$1.a(ewg.a(this.a - 44), 0, 0);
         $$1.a(ewg.a(44), 0, 1);
         List<fdh.c> $$2 = new ArrayList<>();
         this.e = 0;

         for (fdh.d $$3 : this.b) {
            $$2.add($$3.a(this, $$1, 0));
         }

         $$1.a();
         $$0.accept($$1);
         fdh $$4 = new fdh($$2);
         $$4.a();
         return $$4;
      }

      public fdh.a a(int $$0, boolean $$1) {
         this.f = Optional.of(new fdh.b($$0, $$1));
         return this;
      }
   }

   static record b(int a, boolean b) {
   }

   static record c(esz<Boolean> a, BooleanSupplier b, @Nullable BooleanSupplier c) {
      public void a() {
         this.a.a(this.b.getAsBoolean());
         if (this.c != null) {
            this.a.i = this.c.getAsBoolean();
         }
      }

      public esz<Boolean> b() {
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
      private final tn a;
      private final BooleanSupplier b;
      private final Consumer<Boolean> c;
      @Nullable
      private tn d;
      @Nullable
      private BooleanSupplier e;
      private final int f;

      d(tn $$0, BooleanSupplier $$1, Consumer<Boolean> $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = $$3;
      }

      public fdh.d a(BooleanSupplier $$0) {
         this.e = $$0;
         return this;
      }

      public fdh.d a(tn $$0) {
         this.d = $$0;
         return this;
      }

      fdh.c a(fdh.a $$0, ewa $$1, int $$2) {
         $$0.a();
         ety $$3 = new ety(this.a, eqx.O().h).e();
         $$1.a($$3, $$0.e, $$2, $$1.b().a(0.0F, 0.5F).b($$0.c));
         Optional<fdh.b> $$4 = $$0.f;
         esz.a<Boolean> $$5 = esz.b(this.b.getAsBoolean());
         $$5.a();
         boolean $$6 = this.d != null && $$4.isEmpty();
         if ($$6) {
            euc $$7 = euc.a(this.d);
            $$5.a($$1x -> $$7);
         }

         if (this.d != null && !$$6) {
            $$5.a($$0x -> tm.a(this.a, $$0x.b(), this.d));
         } else {
            $$5.a($$0x -> tm.a(this.a, $$0x.b()));
         }

         esz<Boolean> $$8 = $$5.a(0, 0, this.f, 20, tn.h(), ($$0x, $$1x) -> this.c.accept($$1x));
         if (this.e != null) {
            $$8.i = this.e.getAsBoolean();
         }

         $$1.a($$8, $$0.e, $$2 + 1, $$1.b().c());
         if (this.d != null) {
            $$4.ifPresent($$3x -> {
               tn $$4x = this.d.e().a(n.h);
               esf $$5x = eqx.O().h;
               etm $$6x = new etm($$4x, $$5x);
               $$6x.j($$0.a - $$0.c - this.f);
               $$6x.k($$3x.a());
               $$0.a();
               int $$7 = $$3x.b ? 9 * $$3x.a - $$6x.i() : 0;
               $$1.a($$6x, $$0.e, $$2, $$1.b().c(-$$0.d).e($$7));
            });
         }

         return new fdh.c($$8, this.b, this.e);
      }
   }
}
