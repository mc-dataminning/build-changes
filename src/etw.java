import javax.annotation.Nullable;

public abstract class etw extends ess {
   protected final aey a;
   protected final int b;
   protected final int c;

   etw(int $$0, int $$1, tn $$2, int $$3, int $$4, aey $$5, ess.c $$6) {
      super(0, 0, $$0, $$1, $$2, $$6, o);
      this.b = $$3;
      this.c = $$4;
      this.a = $$5;
   }

   public static etw.a a(tn $$0, ess.c $$1, boolean $$2) {
      return new etw.a($$0, $$1, $$2);
   }

   public static class a {
      private final tn a;
      private final ess.c b;
      private final boolean c;
      private int d = 150;
      private int e = 20;
      @Nullable
      private aey f;
      private int g;
      private int h;

      public a(tn $$0, ess.c $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public etw.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public etw.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public etw.a a(aey $$0, int $$1, int $$2) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2;
         return this;
      }

      public etw a() {
         if (this.f == null) {
            throw new IllegalStateException("Sprite not set");
         } else {
            return (etw)(this.c
               ? new etw.b(this.d, this.e, this.a, this.g, this.h, this.f, this.b)
               : new etw.c(this.d, this.e, this.a, this.g, this.h, this.f, this.b));
         }
      }
   }

   public static class b extends etw {
      protected b(int $$0, int $$1, tn $$2, int $$3, int $$4, aey $$5, ess.c $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      @Override
      public void b(esh $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.r() + this.l() / 2 - this.b / 2;
         int $$5 = this.t() + this.i() / 2 - this.c / 2;
         $$0.a(this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(esh $$0, esf $$1, int $$2) {
      }
   }

   public static class c extends etw {
      protected c(int $$0, int $$1, tn $$2, int $$3, int $$4, aey $$5, ess.c $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      @Override
      public void b(esh $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.r() + this.l() - this.b - 2;
         int $$5 = this.t() + this.i() / 2 - this.c / 2;
         $$0.a(this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(esh $$0, esf $$1, int $$2) {
         int $$3 = this.r() + 2;
         int $$4 = this.r() + this.l() - this.b - 4;
         int $$5 = this.r() + this.l() / 2;
         a($$0, $$1, this.m(), $$5, $$3, this.t(), $$4, this.t() + this.i(), $$2);
      }
   }
}
