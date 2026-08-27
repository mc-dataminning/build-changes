public class ftl implements fsz<dhj> {
   private final frt a;

   public ftl(fta.a $$0) {
      this.a = $$0.b();
   }

   public void a(dhj $$0, float $$1, eob $$2, fqz $$3, int $$4, int $$5) {
      csf $$6 = $$0.i();
      if ($$6 != null) {
         hx $$7 = $$0.aC_().a($$0.g().g());
         dhn $$8 = $$0.k();
         if (!$$8.i()) {
            frv.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$8.a(cvh.bz) && $$0.a($$1) <= 4.0F) {
               $$8 = $$8.a(dhh.d, Boolean.valueOf($$0.a($$1) <= 0.5F));
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            } else if ($$0.f() && !$$0.c()) {
               dip $$9 = $$8.a(cvh.br) ? dip.b : dip.a;
               dhn $$10 = cvh.bz.o().a(dhh.c, $$9).a(dhh.a, $$8.c(dhg.a));
               $$10 = $$10.a(dhh.d, Boolean.valueOf($$0.a($$1) >= 0.5F));
               this.a($$7, $$10, $$2, $$3, $$6, false, $$5);
               hx $$11 = $$7.a($$0.g());
               $$2.b();
               $$2.a();
               $$8 = $$8.a(dhg.c, Boolean.valueOf(true));
               this.a($$11, $$8, $$2, $$3, $$6, true, $$5);
            } else {
               this.a($$7, $$8, $$2, $$3, $$6, false, $$5);
            }

            $$2.b();
            frv.b();
         }
      }
   }

   private void a(hx $$0, dhn $$1, eob $$2, fqz $$3, csf $$4, boolean $$5, int $$6) {
      frh $$7 = fqu.b($$1);
      eof $$8 = $$3.getBuffer($$7);
      this.a.b().a($$4, this.a.a($$1), $$1, $$0, $$2, $$8, $$5, atw.a(), $$1.a($$0), $$6);
   }

   @Override
   public int aT_() {
      return 68;
   }
}
