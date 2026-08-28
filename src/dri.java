import com.mojang.serialization.MapCodec;

public abstract class dri extends drb {
   protected dri(dww.d $$0) {
      super($$0);
   }

   private static boolean b(dwx $$0, dgl $$1, ji $$2) {
      ji $$3 = $$2.d();
      dwx $$4 = $$1.a_($$3);
      if ($$4.a(djo.ea) && $$4.c(dra.c) == 1) {
         return true;
      } else if ($$4.y().e() == 8) {
         return false;
      } else {
         int $$5 = esq.a($$0, $$4, jn.b, $$4.g());
         return $$5 < 15;
      }
   }

   @Override
   protected abstract MapCodec<? extends dri> a();

   private static boolean c(dwx $$0, dgl $$1, ji $$2) {
      ji $$3 = $$2.d();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(awv.a);
   }

   @Override
   protected void b(dwx $$0, ard $$1, ji $$2, azh $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, djo.j.m());
      } else {
         if ($$1.A($$2.d()) >= 9) {
            dwx $$4 = this.m();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               ji $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(djo.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.b(c, Boolean.valueOf(o($$1.a_($$6.d())))));
               }
            }
         }
      }
   }
}
