public class ftk extends fua {
   private final ftv a;

   ftk(fpx $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, ftv $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      this.B = 0.96F;
      this.a = $$7;
      this.d(1.0F);
      this.n = false;
      this.b($$7);
   }

   @Override
   public int a(float $$0) {
      return 240;
   }

   @Override
   public fte b() {
      return fte.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.a);
   }

   public static record a(ftv a) implements ftd<kc> {
      public fta a(kc $$0, fpx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         ftk $$8 = new ftk($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         $$8.b($$5, $$6, $$7);
         $$8.a($$1.z.a(4) + 6);
         return $$8;
      }
   }
}
