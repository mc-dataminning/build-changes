import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class ftd {
   private static final int a = 44;
   private final List<ftd.c> b;

   ftd(List<ftd.c> $$0) {
      this.b = $$0;
   }

   public void a() {
      this.b.forEach(ftd.c::a);
   }

   public static ftd.a a(int $$0) {
      return new ftd.a($$0);
   }

   public static class a {
      final int a;
      private final List<ftd.d> b = new ArrayList<>();
      int c;
      int d = 4;
      int e;
      Optional<ftd.b> f = Optional.empty();

      public a(int $$0) {
         this.a = $$0;
      }

      void a() {
         this.e++;
      }

      public ftd.d a(wy $$0, BooleanSupplier $$1, Consumer<Boolean> $$2) {
         ftd.d $$3 = new ftd.d($$0, $$1, $$2, 44);
         this.b.add($$3);
         return $$3;
      }

      public ftd.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public ftd.a b(int $$0) {
         this.d = $$0;
         return this;
      }

      public ftd a(Consumer<flv> $$0) {
         fls $$1 = new fls().b(this.d);
         $$1.a(fly.a(this.a - 44), 0, 0);
         $$1.a(fly.a(44), 0, 1);
         List<ftd.c> $$2 = new ArrayList<>();
         this.e = 0;

         for (ftd.d $$3 : this.b) {
            $$2.add($$3.a(this, $$1, 0));
         }

         $$1.a();
         $$0.accept($$1);
         ftd $$4 = new ftd($$2);
         $$4.a();
         return $$4;
      }

      public ftd.a a(int $$0, boolean $$1) {
         this.f = Optional.of(new ftd.b($$0, $$1));
         return this;
      }
   }

   static record b(int a, boolean b) {
   }

   static record c(fin<Boolean> a, BooleanSupplier b, @Nullable BooleanSupplier c) {
      public void a() {
         this.a.a(this.b.getAsBoolean());
         if (this.c != null) {
            this.a.j = this.c.getAsBoolean();
         }
      }

      public fin<Boolean> b() {
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
      private final wy a;
      private final BooleanSupplier b;
      private final Consumer<Boolean> c;
      @Nullable
      private wy d;
      @Nullable
      private BooleanSupplier e;
      private final int f;

      d(wy $$0, BooleanSupplier $$1, Consumer<Boolean> $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = $$3;
      }

      public ftd.d a(BooleanSupplier $$0) {
         this.e = $$0;
         return this;
      }

      public ftd.d a(wy $$0) {
         this.d = $$0;
         return this;
      }

      ftd.c a(ftd.a $$0, fls $$1, int $$2) {
         $$0.a();
         fjn $$3 = new fjn(this.a, fgi.Q().h).c();
         $$1.a($$3, $$0.e, $$2, $$1.b().a(0.0F, 0.5F).b($$0.c));
         Optional<ftd.b> $$4 = $$0.f;
         fin.a<Boolean> $$5 = fin.b(this.b.getAsBoolean());
         $$5.a();
         boolean $$6 = this.d != null && $$4.isEmpty();
         if ($$6) {
            fjr $$7 = fjr.a(this.d);
            $$5.a($$1x -> $$7);
         }

         if (this.d != null && !$$6) {
            $$5.a($$0x -> wx.a(this.a, $$0x.c(), this.d));
         } else {
            $$5.a($$0x -> wx.a(this.a, $$0x.c()));
         }

         fin<Boolean> $$8 = $$5.a(0, 0, this.f, 20, wy.i(), ($$0x, $$1x) -> this.c.accept($$1x));
         if (this.e != null) {
            $$8.j = this.e.getAsBoolean();
         }

         $$1.a($$8, $$0.e, $$2 + 1, $$1.b().c());
         if (this.d != null) {
            $$4.ifPresent($$3x -> {
               wy $$4x = this.d.f().a(n.h);
               fhr $$5x = fgi.Q().h;
               fja $$6x = new fja($$4x, $$5x);
               $$6x.d($$0.a - $$0.c - this.f);
               $$6x.e($$3x.a());
               $$0.a();
               int $$7 = $$3x.b ? 9 * $$3x.a - $$6x.w() : 0;
               $$1.a($$6x, $$0.e, $$2, $$1.b().c(-$$0.d).e($$7));
            });
         }

         return new ftd.c($$8, this.b, this.e);
      }
   }
}
