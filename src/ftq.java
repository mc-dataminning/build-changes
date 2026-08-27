public class ftq extends fuh {
   private final fuc a;

   ftq(fqe $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fuc $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      this.B = 0.96F;
      this.a = $$7;
      this.d(1.5F);
      this.n = false;
      this.b($$7);
   }

   @Override
   public int a(float $$0) {
      return 240;
   }

   @Override
   public ftl b() {
      return ftl.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.a);
   }

   public static record a(fuc a) implements ftk<ka> {
      public fth a(ka $$0, fqe $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         ftq $$8 = new ftq($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         $$8.b($$5, $$6, $$7);
         $$8.A = $$0.c();
         $$8.z = $$0.c();
         $$8.a($$1.z.a(12) + 8);
         return $$8;
      }
   }
}
