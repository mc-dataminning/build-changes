import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dmh extends dnk {
   public static final dxu<dxi> L = dxn.X;

   protected dmh(dww.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dmh> a();

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      return b($$1, $$2, n($$0).g());
   }

   public static boolean b(dgl $$0, ji $$1, jn $$2) {
      ji $$3 = $$1.a($$2);
      return $$0.a_($$3).c($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dwx a(dag $$0) {
      for (jn $$1 : $$0.f()) {
         dwx $$2;
         if ($$1.o() == jn.a.b) {
            $$2 = this.m().b(L, $$1 == jn.b ? dxi.c : dxi.a).b(aF, $$0.g());
         } else {
            $$2 = this.m().b(L, dxi.b).b(aF, $$1.g());
         }

         if ($$2.a((dgl)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      return n($$0).g() == $$4 && !$$0.a($$1, $$3) ? djo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected static jn n(dwx $$0) {
      switch ((dxi)$$0.c(L)) {
         case c:
            return jn.a;
         case a:
            return jn.b;
         default:
            return $$0.c(aF);
      }
   }
}
