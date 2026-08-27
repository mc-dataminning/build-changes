import javax.annotation.Nullable;

public abstract class ewj extends eve {
   protected final agm a;
   protected final int b;
   protected final int c;

   ewj(int $$0, int $$1, uv $$2, int $$3, int $$4, agm $$5, eve.c $$6) {
      super(0, 0, $$0, $$1, $$2, $$6, p);
      this.b = $$3;
      this.c = $$4;
      this.a = $$5;
   }

   public static ewj.a a(uv $$0, eve.c $$1, boolean $$2) {
      return new ewj.a($$0, $$1, $$2);
   }

   public static class a {
      private final uv a;
      private final eve.c b;
      private final boolean c;
      private int d = 150;
      private int e = 20;
      @Nullable
      private agm f;
      private int g;
      private int h;

      public a(uv $$0, eve.c $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public ewj.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public ewj.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public ewj.a a(agm $$0, int $$1, int $$2) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2;
         return this;
      }

      public ewj a() {
         if (this.f == null) {
            throw new IllegalStateException("Sprite not set");
         } else {
            return (ewj)(this.c
               ? new ewj.b(this.d, this.e, this.a, this.g, this.h, this.f, this.b)
               : new ewj.c(this.d, this.e, this.a, this.g, this.h, this.f, this.b));
         }
      }
   }

   public static class b extends ewj {
      protected b(int $$0, int $$1, uv $$2, int $$3, int $$4, agm $$5, eve.c $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      @Override
      public void b(eut $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.p() + this.k() / 2 - this.b / 2;
         int $$5 = this.r() + this.i() / 2 - this.c / 2;
         $$0.a(this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(eut $$0, eur $$1, int $$2) {
      }
   }

   public static class c extends ewj {
      protected c(int $$0, int $$1, uv $$2, int $$3, int $$4, agm $$5, eve.c $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      @Override
      public void b(eut $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.p() + this.k() - this.b - 2;
         int $$5 = this.r() + this.i() / 2 - this.c / 2;
         $$0.a(this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(eut $$0, eur $$1, int $$2) {
         int $$3 = this.p() + 2;
         int $$4 = this.p() + this.k() - this.b - 4;
         int $$5 = this.p() + this.k() / 2;
         a($$0, $$1, this.l(), $$5, $$3, this.r(), $$4, this.r() + this.i(), $$2);
      }
   }
}
