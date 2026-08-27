import javax.annotation.Nullable;

public class csd extends ctg {
   public static final dcz<dcm> I = dcr.U;

   protected csd(dca.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dcb $$0, cmp $$1, gu $$2) {
      return b($$1, $$2, h($$0).g());
   }

   public static boolean b(cmp $$0, gu $$1, ha $$2) {
      gu $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dcb a(cih $$0) {
      for (ha $$1 : $$0.f()) {
         dcb $$2;
         if ($$1.o() == ha.a.b) {
            $$2 = this.n().a(I, $$1 == ha.b ? dcm.c : dcm.a).a(aC, $$0.g());
         } else {
            $$2 = this.n().a(I, dcm.b).a(aC, $$1.g());
         }

         if ($$2.a((cmp)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? cpo.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static ha h(dcb $$0) {
      switch ((dcm)$$0.c(I)) {
         case c:
            return ha.a;
         case a:
            return ha.b;
         default:
            return $$0.c(aC);
      }
   }
}
