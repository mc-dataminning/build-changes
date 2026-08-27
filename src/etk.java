import javax.annotation.Nullable;

public abstract class etk extends esh {
   protected final aer a;
   protected final int b;
   protected final int c;

   etk(int $$0, int $$1, tf $$2, int $$3, int $$4, aer $$5, esh.c $$6) {
      super(0, 0, $$0, $$1, $$2, $$6, o);
      this.b = $$3;
      this.c = $$4;
      this.a = $$5;
   }

   public static etk.a a(tf $$0, esh.c $$1, boolean $$2) {
      return new etk.a($$0, $$1, $$2);
   }

   public static class a {
      private final tf a;
      private final esh.c b;
      private final boolean c;
      private int d = 150;
      private int e = 20;
      @Nullable
      private aer f;
      private int g;
      private int h;

      public a(tf $$0, esh.c $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public etk.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public etk.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public etk.a a(aer $$0, int $$1, int $$2) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2;
         return this;
      }

      public etk a() {
         if (this.f == null) {
            throw new IllegalStateException("Sprite not set");
         } else {
            return (etk)(this.c
               ? new etk.b(this.d, this.e, this.a, this.g, this.h, this.f, this.b)
               : new etk.c(this.d, this.e, this.a, this.g, this.h, this.f, this.b));
         }
      }
   }

   public static class b extends etk {
      protected b(int $$0, int $$1, tf $$2, int $$3, int $$4, aer $$5, esh.c $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      @Override
      public void b(erw $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.p() + this.k() / 2 - this.b / 2;
         int $$5 = this.r() + this.h() / 2 - this.c / 2;
         $$0.a(this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(erw $$0, eru $$1, int $$2) {
      }
   }

   public static class c extends etk {
      protected c(int $$0, int $$1, tf $$2, int $$3, int $$4, aer $$5, esh.c $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      @Override
      public void b(erw $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.p() + this.k() - this.b - 2;
         int $$5 = this.r() + this.h() / 2 - this.c / 2;
         $$0.a(this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(erw $$0, eru $$1, int $$2) {
         int $$3 = this.p() + 2;
         int $$4 = this.p() + this.k() - this.b - 4;
         int $$5 = this.p() + this.k() / 2;
         a($$0, $$1, this.l(), $$5, $$3, this.r(), $$4, this.r() + this.h(), $$2);
      }
   }
}
