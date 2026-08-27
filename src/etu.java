import javax.annotation.Nullable;

public abstract class etu extends esq {
   protected final aew a;
   protected final int b;
   protected final int c;

   etu(int $$0, int $$1, tl $$2, int $$3, int $$4, aew $$5, esq.c $$6) {
      super(0, 0, $$0, $$1, $$2, $$6, o);
      this.b = $$3;
      this.c = $$4;
      this.a = $$5;
   }

   public static etu.a a(tl $$0, esq.c $$1, boolean $$2) {
      return new etu.a($$0, $$1, $$2);
   }

   public static class a {
      private final tl a;
      private final esq.c b;
      private final boolean c;
      private int d = 150;
      private int e = 20;
      @Nullable
      private aew f;
      private int g;
      private int h;

      public a(tl $$0, esq.c $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public etu.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public etu.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public etu.a a(aew $$0, int $$1, int $$2) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2;
         return this;
      }

      public etu a() {
         if (this.f == null) {
            throw new IllegalStateException("Sprite not set");
         } else {
            return (etu)(this.c
               ? new etu.b(this.d, this.e, this.a, this.g, this.h, this.f, this.b)
               : new etu.c(this.d, this.e, this.a, this.g, this.h, this.f, this.b));
         }
      }
   }

   public static class b extends etu {
      protected b(int $$0, int $$1, tl $$2, int $$3, int $$4, aew $$5, esq.c $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      @Override
      public void b(esf $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.r() + this.l() / 2 - this.b / 2;
         int $$5 = this.t() + this.i() / 2 - this.c / 2;
         $$0.a(this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(esf $$0, esd $$1, int $$2) {
      }
   }

   public static class c extends etu {
      protected c(int $$0, int $$1, tl $$2, int $$3, int $$4, aew $$5, esq.c $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      @Override
      public void b(esf $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.r() + this.l() - this.b - 2;
         int $$5 = this.t() + this.i() / 2 - this.c / 2;
         $$0.a(this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(esf $$0, esd $$1, int $$2) {
         int $$3 = this.r() + 2;
         int $$4 = this.r() + this.l() - this.b - 4;
         int $$5 = this.r() + this.l() / 2;
         a($$0, $$1, this.m(), $$5, $$3, this.t(), $$4, this.t() + this.i(), $$2);
      }
   }
}
