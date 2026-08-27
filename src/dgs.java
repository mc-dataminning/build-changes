import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dgs extends dhu {
   public static final drz<drm> K = drr.U;

   protected dgs(dra.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dgs> a();

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      return b($$1, $$2, m($$0).g());
   }

   public static boolean b(dba $$0, io $$1, it $$2) {
      io $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public drb a(cwz $$0) {
      for (it $$1 : $$0.f()) {
         drb $$2;
         if ($$1.o() == it.a.b) {
            $$2 = this.n().a(K, $$1 == it.b ? drm.c : drm.a).a(aE, $$0.g());
         } else {
            $$2 = this.n().a(K, drm.b).a(aE, $$1.g());
         }

         if ($$2.a((dba)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dea.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static it m(drb $$0) {
      switch ((drm)$$0.c(K)) {
         case c:
            return it.a;
         case a:
            return it.b;
         default:
            return $$0.c(aE);
      }
   }
}
