public class cyv extends czj implements dah {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public cyv(czj.a $$0) {
      super($$0);
   }

   @Override
   public bug a(ddi $$0) {
      djm $$1 = $$0.q();
      if ($$1 instanceof arq $$2) {
         czn $$3 = $$0.n();
         ffc $$4 = $$0.l();
         jb $$5 = $$0.k();
         csh.a(new csc($$1, $$0.o(), $$4.d + (double)$$5.j() * 0.15, $$4.e + (double)$$5.k() * 0.15, $$4.f + (double)$$5.l() * 0.15, $$3), $$2, $$3);
         $$3.h(1);
      }

      return bug.a;
   }

   @Override
   public bug a(djm $$0, crm $$1, buf $$2) {
      if ($$1.fI()) {
         czn $$3 = $$1.b($$2);
         if ($$0 instanceof arq $$4) {
            csh.a(new csc($$0, $$3, $$1), $$4, $$3);
            $$3.a(1, $$1);
            $$1.b(awx.c.b(this));
         }

         return bug.a;
      } else {
         return bug.e;
      }
   }

   @Override
   public csh a(djm $$0, jp $$1, czn $$2, jb $$3) {
      return new csc($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public dah.a a() {
      return dah.a.a().a(cyv::a).a(1.0F).b(0.5F).a(1004).a();
   }

   private static ffc a(le $$0, jb $$1) {
      return $$0.a().b((double)$$1.j() * 0.5000099999997474, (double)$$1.k() * 0.5000099999997474, (double)$$1.l() * 0.5000099999997474);
   }
}
