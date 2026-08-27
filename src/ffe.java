import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class ffe {
   private static final int a = 44;
   private final List<ffe.c> b;

   ffe(List<ffe.c> $$0) {
      this.b = $$0;
   }

   public void a() {
      this.b.forEach(ffe.c::a);
   }

   public static ffe.a a(int $$0) {
      return new ffe.a($$0);
   }

   public static class a {
      final int a;
      private final List<ffe.d> b = new ArrayList<>();
      int c;
      int d = 4;
      int e;
      Optional<ffe.b> f = Optional.empty();

      public a(int $$0) {
         this.a = $$0;
      }

      void a() {
         this.e++;
      }

      public ffe.d a(ur $$0, BooleanSupplier $$1, Consumer<Boolean> $$2) {
         ffe.d $$3 = new ffe.d($$0, $$1, $$2, 44);
         this.b.add($$3);
         return $$3;
      }

      public ffe.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public ffe.a b(int $$0) {
         this.d = $$0;
         return this;
      }

      public ffe a(Consumer<exy> $$0) {
         exv $$1 = new exv().b(this.d);
         $$1.a(eyb.a(this.a - 44), 0, 0);
         $$1.a(eyb.a(44), 0, 1);
         List<ffe.c> $$2 = new ArrayList<>();
         this.e = 0;

         for (ffe.d $$3 : this.b) {
            $$2.add($$3.a(this, $$1, 0));
         }

         $$1.a();
         $$0.accept($$1);
         ffe $$4 = new ffe($$2);
         $$4.a();
         return $$4;
      }

      public ffe.a a(int $$0, boolean $$1) {
         this.f = Optional.of(new ffe.b($$0, $$1));
         return this;
      }
   }

   static record b(int a, boolean b) {
   }

   static record c(eut<Boolean> a, BooleanSupplier b, @Nullable BooleanSupplier c) {
      public void a() {
         this.a.a(this.b.getAsBoolean());
         if (this.c != null) {
            this.a.i = this.c.getAsBoolean();
         }
      }

      public eut<Boolean> b() {
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
      private final ur a;
      private final BooleanSupplier b;
      private final Consumer<Boolean> c;
      @Nullable
      private ur d;
      @Nullable
      private BooleanSupplier e;
      private final int f;

      d(ur $$0, BooleanSupplier $$1, Consumer<Boolean> $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = $$3;
      }

      public ffe.d a(BooleanSupplier $$0) {
         this.e = $$0;
         return this;
      }

      public ffe.d a(ur $$0) {
         this.d = $$0;
         return this;
      }

      ffe.c a(ffe.a $$0, exv $$1, int $$2) {
         $$0.a();
         evt $$3 = new evt(this.a, esr.N().h).e();
         $$1.a($$3, $$0.e, $$2, $$1.b().a(0.0F, 0.5F).b($$0.c));
         Optional<ffe.b> $$4 = $$0.f;
         eut.a<Boolean> $$5 = eut.b(this.b.getAsBoolean());
         $$5.a();
         boolean $$6 = this.d != null && $$4.isEmpty();
         if ($$6) {
            evx $$7 = evx.a(this.d);
            $$5.a($$1x -> $$7);
         }

         if (this.d != null && !$$6) {
            $$5.a($$0x -> uq.a(this.a, $$0x.e(), this.d));
         } else {
            $$5.a($$0x -> uq.a(this.a, $$0x.e()));
         }

         eut<Boolean> $$8 = $$5.a(0, 0, this.f, 20, ur.i(), ($$0x, $$1x) -> this.c.accept($$1x));
         if (this.e != null) {
            $$8.i = this.e.getAsBoolean();
         }

         $$1.a($$8, $$0.e, $$2 + 1, $$1.b().c());
         if (this.d != null) {
            $$4.ifPresent($$3x -> {
               ur $$4x = this.d.f().a(n.h);
               etz $$5x = esr.N().h;
               evg $$6x = new evg($$4x, $$5x);
               $$6x.j($$0.a - $$0.c - this.f);
               $$6x.k($$3x.a());
               $$0.a();
               int $$7 = $$3x.b ? 9 * $$3x.a - $$6x.i() : 0;
               $$1.a($$6x, $$0.e, $$2, $$1.b().c(-$$0.d).e($$7));
            });
         }

         return new ffe.c($$8, this.b, this.e);
      }
   }
}
