enum evd {
   a(0, 0, 28, 32, 8),
   b(84, 0, 28, 32, 8),
   c(0, 64, 32, 28, 5),
   d(96, 64, 32, 28, 5);

   private final int e;
   private final int f;
   private final int g;
   private final int h;
   private final int i;

   private evd(int $$0, int $$1, int $$2, int $$3, int $$4) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = $$4;
   }

   public int a() {
      return this.i;
   }

   public void a(eox $$0, int $$1, int $$2, boolean $$3, int $$4) {
      int $$5 = this.e;
      if ($$4 > 0) {
         $$5 += this.g;
      }

      if ($$4 == this.i - 1) {
         $$5 += this.g;
      }

      int $$6 = $$3 ? this.f + this.h : this.f;
      $$0.a(evg.a, $$1 + this.a($$4), $$2 + this.b($$4), $$5, $$6, this.g, this.h);
   }

   public void a(eox $$0, int $$1, int $$2, int $$3, cfz $$4) {
      int $$5 = $$1 + this.a($$3);
      int $$6 = $$2 + this.b($$3);
      switch (this) {
         case a:
            $$5 += 6;
            $$6 += 9;
            break;
         case b:
            $$5 += 6;
            $$6 += 6;
            break;
         case c:
            $$5 += 10;
            $$6 += 5;
            break;
         case d:
            $$5 += 6;
            $$6 += 5;
      }

      $$0.b($$4, $$5, $$6);
   }

   public int a(int $$0) {
      switch (this) {
         case a:
            return (this.g + 4) * $$0;
         case b:
            return (this.g + 4) * $$0;
         case c:
            return -this.g + 4;
         case d:
            return 248;
         default:
            throw new UnsupportedOperationException("Don't know what this tab type is!" + this);
      }
   }

   public int b(int $$0) {
      switch (this) {
         case a:
            return -this.h + 4;
         case b:
            return 136;
         case c:
            return this.h * $$0;
         case d:
            return this.h * $$0;
         default:
            throw new UnsupportedOperationException("Don't know what this tab type is!" + this);
      }
   }

   public boolean a(int $$0, int $$1, int $$2, double $$3, double $$4) {
      int $$5 = $$0 + this.a($$2);
      int $$6 = $$1 + this.b($$2);
      return $$3 > (double)$$5 && $$3 < (double)($$5 + this.g) && $$4 > (double)$$6 && $$4 < (double)($$6 + this.h);
   }
}
