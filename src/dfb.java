import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dfb extends dgc {
   public static final dqg<dpt> K = dpy.U;

   protected dfb(dph.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dfb> a();

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      return b($$1, $$2, m($$0).g());
   }

   public static boolean b(czj $$0, id $$1, ij $$2) {
      id $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      for (ij $$1 : $$0.f()) {
         dpi $$2;
         if ($$1.o() == ij.a.b) {
            $$2 = this.n().a(K, $$1 == ij.b ? dpt.c : dpt.a).a(aE, $$0.g());
         } else {
            $$2 = this.n().a(K, dpt.b).a(aE, $$1.g());
         }

         if ($$2.a((czj)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dcj.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static ij m(dpi $$0) {
      switch ((dpt)$$0.c(K)) {
         case c:
            return ij.a;
         case a:
            return ij.b;
         default:
            return $$0.c(aE);
      }
   }
}
