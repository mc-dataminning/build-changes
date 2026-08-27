import javax.annotation.Nullable;

public abstract class etp extends esl {
   protected final aeu a;
   protected final int b;
   protected final int c;

   etp(int $$0, int $$1, ti $$2, int $$3, int $$4, aeu $$5, esl.c $$6) {
      super(0, 0, $$0, $$1, $$2, $$6, o);
      this.b = $$3;
      this.c = $$4;
      this.a = $$5;
   }

   public static etp.a a(ti $$0, esl.c $$1, boolean $$2) {
      return new etp.a($$0, $$1, $$2);
   }

   public static class a {
      private final ti a;
      private final esl.c b;
      private final boolean c;
      private int d = 150;
      private int e = 20;
      @Nullable
      private aeu f;
      private int g;
      private int h;

      public a(ti $$0, esl.c $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public etp.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public etp.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public etp.a a(aeu $$0, int $$1, int $$2) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2;
         return this;
      }

      public etp a() {
         if (this.f == null) {
            throw new IllegalStateException("Sprite not set");
         } else {
            return (etp)(this.c
               ? new etp.b(this.d, this.e, this.a, this.g, this.h, this.f, this.b)
               : new etp.c(this.d, this.e, this.a, this.g, this.h, this.f, this.b));
         }
      }
   }

   public static class b extends etp {
      protected b(int $$0, int $$1, ti $$2, int $$3, int $$4, aeu $$5, esl.c $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      @Override
      public void b(esa $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.r() + this.l() / 2 - this.b / 2;
         int $$5 = this.t() + this.i() / 2 - this.c / 2;
         $$0.a(this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(esa $$0, ery $$1, int $$2) {
      }
   }

   public static class c extends etp {
      protected c(int $$0, int $$1, ti $$2, int $$3, int $$4, aeu $$5, esl.c $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      @Override
      public void b(esa $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         int $$4 = this.r() + this.l() - this.b - 2;
         int $$5 = this.t() + this.i() / 2 - this.c / 2;
         $$0.a(this.a, $$4, $$5, this.b, this.c);
      }

      @Override
      public void a(esa $$0, ery $$1, int $$2) {
         int $$3 = this.r() + 2;
         int $$4 = this.r() + this.l() - this.b - 4;
         int $$5 = this.r() + this.l() / 2;
         a($$0, $$1, this.m(), $$5, $$3, this.t(), $$4, this.t() + this.i(), $$2);
      }
   }
}
