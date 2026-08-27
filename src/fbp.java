import javax.annotation.Nullable;

public abstract class fbp extends fak {
   protected final ajc a;
   protected final int b;
   protected final int c;

   fbp(int $$0, int $$1, vs $$2, int $$3, int $$4, ajc $$5, fak.c $$6) {
      super(0, 0, $$0, $$1, $$2, $$6, p);
      this.b = $$3;
      this.c = $$4;
      this.a = $$5;
   }

   public static fbp.a a(vs $$0, fak.c $$1, boolean $$2) {
      return new fbp.a($$0, $$1, $$2);
   }

   public static class a {
      private final vs a;
      private final fak.c b;
      private final boolean c;
      private int d = 150;
      private int e = 20;
      @Nullable
      private ajc f;
      private int g;
      private int h;

      public a(vs $$0, fak.c $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public fbp.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public fbp.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fbp.a a(ajc $$0, int $$1, int $$2) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2;
         return this;
      }

      public fbp a() {
         if (this.f == null) {
            throw new IllegalStateException("Sprite not set");
         } else {
            return (fbp)(this.c
               ? new fbp.b(this.d, this.e, this.a, this.g, this.h, this.f, this.b)
               : new fbp.c(this.d, this.e, this.a, this.g, this.h, this.f, this.b));
         }
      }
   }

   public static class b extends fbp {
      protected b(int $$0, int $$1, vs $$2, int $$3, int $$4, ajc $$5, fak.c $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      @Override
      public void b(ezx $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.B() + this.w() / 2 - this.b / 2;
         int $$5 = this.C() + this.u() / 2 - this.c / 2;
         $$0.a(this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(ezx $$0, ezv $$1, int $$2) {
      }
   }

   public static class c extends fbp {
      protected c(int $$0, int $$1, vs $$2, int $$3, int $$4, ajc $$5, fak.c $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      @Override
      public void b(ezx $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.B() + this.w() - this.b - 2;
         int $$5 = this.C() + this.u() / 2 - this.c / 2;
         $$0.a(this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(ezx $$0, ezv $$1, int $$2) {
         int $$3 = this.B() + 2;
         int $$4 = this.B() + this.w() - this.b - 4;
         int $$5 = this.B() + this.w() / 2;
         a($$0, $$1, this.x(), $$5, $$3, this.C(), $$4, this.C() + this.u(), $$2);
      }
   }
}
