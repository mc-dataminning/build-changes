public abstract class exv {
   protected static final int a = 14737632;
   protected static final int b = 60;
   protected static final int c = 1;
   protected final evu d;
   protected final auh e;

   protected exv(evu $$0, auh $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public int a(int $$0) {
      return Math.min(this.e.a() + 2, $$0);
   }

   public void a(evw $$0, int $$1, int $$2) {
      int $$3 = $$0.b();
      $$0.a(fsq.C(), $$1, $$3 - 60, $$1 + $$2, $$3, -1873784752);
      long $$4 = 0L;
      long $$5 = 2147483647L;
      long $$6 = -2147483648L;
      int $$7 = Math.max(0, this.e.a() - ($$2 - 2));
      int $$8 = this.e.b() - $$7;

      for (int $$9 = 0; $$9 < $$8; $$9++) {
         int $$10 = $$1 + $$9 + 1;
         long $$11 = this.e.a($$7 + $$9);
         $$5 = Math.min($$5, $$11);
         $$6 = Math.max($$6, $$11);
         $$4 += $$11;
         int $$12 = this.b((double)$$11);
         int $$13 = this.a($$11);
         $$0.a(fsq.C(), $$10, $$3 - $$12, $$10 + 1, $$3, $$13);
      }

      $$0.a(fsq.C(), $$1, $$1 + $$2 - 1, $$3 - 60, -1);
      $$0.a(fsq.C(), $$1, $$1 + $$2 - 1, $$3 - 1, -1);
      $$0.b(fsq.C(), $$1, $$3 - 60, $$3, -1);
      $$0.b(fsq.C(), $$1 + $$2 - 1, $$3 - 60, $$3, -1);
      if ($$8 > 0) {
         String $$14 = this.a((double)$$5) + " min";
         String $$15 = this.a((double)$$4 / (double)$$8) + " avg";
         String $$16 = this.a((double)$$6) + " max";
         $$0.b(this.d, $$14, $$1 + 2, $$3 - 60 - 9, 14737632);
         $$0.a(this.d, $$15, $$1 + $$2 / 2, $$3 - 60 - 9, 14737632);
         $$0.b(this.d, $$16, $$1 + $$2 - this.d.b($$16) - 2, $$3 - 60 - 9, 14737632);
      }

      this.a($$0, $$1, $$2, $$3);
   }

   protected void a(evw $$0, int $$1, int $$2, int $$3) {
   }

   protected void a(evw $$0, String $$1, int $$2, int $$3) {
      $$0.a(fsq.C(), $$2, $$3, $$2 + this.d.b($$1) + 1, $$3 + 9, -1873784752);
      $$0.a(this.d, $$1, $$2 + 1, $$3 + 1, 14737632, false);
   }

   protected abstract String a(double var1);

   protected abstract int b(double var1);

   protected abstract int a(long var1);

   protected int a(double $$0, double $$1, int $$2, double $$3, int $$4, double $$5, int $$6) {
      $$0 = aty.a($$0, $$1, $$5);
      return $$0 < $$3 ? ati.b.a((float)($$0 / ($$3 - $$1)), $$2, $$4) : ati.b.a((float)(($$0 - $$3) / ($$5 - $$3)), $$4, $$6);
   }
}
