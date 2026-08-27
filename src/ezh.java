import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class ezh {
   private static final int a = 44;
   private final List<ezh.c> b;

   ezh(List<ezh.c> $$0) {
      this.b = $$0;
   }

   public void a() {
      this.b.forEach(ezh.c::a);
   }

   public static ezh.a a(int $$0) {
      return new ezh.a($$0);
   }

   public static class a {
      final int a;
      private final List<ezh.d> b = new ArrayList<>();
      int c;
      int d = 4;
      int e;
      Optional<ezh.b> f = Optional.empty();

      public a(int $$0) {
         this.a = $$0;
      }

      void a() {
         this.e++;
      }

      public ezh.d a(sw $$0, BooleanSupplier $$1, Consumer<Boolean> $$2) {
         ezh.d $$3 = new ezh.d($$0, $$1, $$2, 44);
         this.b.add($$3);
         return $$3;
      }

      public ezh.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public ezh.a b(int $$0) {
         this.d = $$0;
         return this;
      }

      public ezh a(Consumer<esi> $$0) {
         esf $$1 = new esf().b(this.d);
         $$1.a(esl.a(this.a - 44), 0, 0);
         $$1.a(esl.a(44), 0, 1);
         List<ezh.c> $$2 = new ArrayList<>();
         this.e = 0;

         for (ezh.d $$3 : this.b) {
            $$2.add($$3.a(this, $$1, 0));
         }

         $$1.c();
         $$0.accept($$1);
         ezh $$4 = new ezh($$2);
         $$4.a();
         return $$4;
      }

      public ezh.a a(int $$0, boolean $$1) {
         this.f = Optional.of(new ezh.b($$0, $$1));
         return this;
      }
   }

   static record b(int a, boolean b) {
   }

   static record c(epp<Boolean> a, BooleanSupplier b, @Nullable BooleanSupplier c) {
      public void a() {
         this.a.a(this.b.getAsBoolean());
         if (this.c != null) {
            this.a.r = this.c.getAsBoolean();
         }
      }

      public epp<Boolean> b() {
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
      private final sw a;
      private final BooleanSupplier b;
      private final Consumer<Boolean> c;
      @Nullable
      private sw d;
      @Nullable
      private BooleanSupplier e;
      private final int f;

      d(sw $$0, BooleanSupplier $$1, Consumer<Boolean> $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = $$3;
      }

      public ezh.d a(BooleanSupplier $$0) {
         this.e = $$0;
         return this;
      }

      public ezh.d a(sw $$0) {
         this.d = $$0;
         return this;
      }

      ezh.c a(ezh.a $$0, esf $$1, int $$2) {
         $$0.a();
         eqk $$3 = new eqk(this.a, enn.N().h).e();
         $$1.a($$3, $$0.e, $$2, $$1.a().a(0.0F, 0.5F).b($$0.c));
         Optional<ezh.b> $$4 = $$0.f;
         epp.a<Boolean> $$5 = epp.b(this.b.getAsBoolean());
         $$5.a();
         boolean $$6 = this.d != null && !$$4.isPresent();
         if ($$6) {
            eqp $$7 = eqp.a(this.d);
            $$5.a($$1x -> $$7);
         }

         if (this.d != null && !$$6) {
            $$5.a($$0x -> sv.a(this.a, $$0x.b(), this.d));
         } else {
            $$5.a($$0x -> sv.a(this.a, $$0x.b()));
         }

         epp<Boolean> $$8 = $$5.a(0, 0, this.f, 20, sw.h(), ($$0x, $$1x) -> this.c.accept($$1x));
         if (this.e != null) {
            $$8.r = this.e.getAsBoolean();
         }

         $$1.a($$8, $$0.e, $$2 + 1, $$1.a().c());
         if (this.d != null) {
            $$4.ifPresent($$3x -> {
               sw $$4x = this.d.e().a(n.h);
               eov $$5x = enn.N().h;
               eqa $$6x = new eqa($$4x, $$5x);
               $$6x.i($$0.a - $$0.c - this.f);
               $$6x.j($$3x.a());
               $$0.a();
               int $$7 = $$3x.b ? 9 * $$3x.a - $$6x.h() : 0;
               $$1.a($$6x, $$0.e, $$2, $$1.a().c(-$$0.d).e($$7));
            });
         }

         return new ezh.c($$8, this.b, this.e);
      }
   }
}
