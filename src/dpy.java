import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dpy extends drd {
   public static final ecc<ebp> c = ebu.X;

   protected dpy(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dpy> a();

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      return b($$1, $$2, n($$0).g());
   }

   public static boolean b(dka $$0, iv $$1, jb $$2) {
      iv $$3 = $$1.a($$2);
      return $$0.a_($$3).c($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      for (jb $$1 : $$0.f()) {
         ebe $$2;
         if ($$1.o() == jb.a.b) {
            $$2 = this.m().b(c, $$1 == jb.b ? ebp.c : ebp.a).b(e, $$0.g());
         } else {
            $$2 = this.m().b(c, ebp.b).b(e, $$1.g());
         }

         if ($$2.a((dka)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      return n($$0).g() == $$4 && !$$0.a($$1, $$3) ? dne.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected static jb n(ebe $$0) {
      switch ((ebp)$$0.c(c)) {
         case c:
            return jb.a;
         case a:
            return jb.b;
         default:
            return $$0.c(e);
      }
   }
}
