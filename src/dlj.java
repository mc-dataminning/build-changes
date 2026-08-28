import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dlj extends dml {
   public static final dws<dwg> L = dwl.U;

   protected dlj(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dlj> a();

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      return b($$1, $$2, n($$0).g());
   }

   public static boolean b(dfp $$0, jh $$1, jm $$2) {
      jh $$3 = $$1.a($$2);
      return $$0.a_($$3).c($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      for (jm $$1 : $$0.f()) {
         dvv $$2;
         if ($$1.o() == jm.a.b) {
            $$2 = this.m().b(L, $$1 == jm.b ? dwg.c : dwg.a).b(aF, $$0.g());
         } else {
            $$2 = this.m().b(L, dwg.b).b(aF, $$1.g());
         }

         if ($$2.a((dfp)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      return n($$0).g() == $$4 && !$$0.a($$1, $$3) ? dis.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected static jm n(dvv $$0) {
      switch ((dwg)$$0.c(L)) {
         case c:
            return jm.a;
         case a:
            return jm.b;
         default:
            return $$0.c(aF);
      }
   }
}
