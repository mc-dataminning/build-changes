import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dnp extends dot {
   public static final dzk<dyx> c = dzc.X;

   protected dnp(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dnp> a();

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      return b($$1, $$2, n($$0).g());
   }

   public static boolean b(dhs $$0, jj $$1, jo $$2) {
      jj $$3 = $$1.a($$2);
      return $$0.a_($$3).c($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      for (jo $$1 : $$0.f()) {
         dym $$2;
         if ($$1.o() == jo.a.b) {
            $$2 = this.m().b(c, $$1 == jo.b ? dyx.c : dyx.a).b(e, $$0.g());
         } else {
            $$2 = this.m().b(c, dyx.b).b(e, $$1.g());
         }

         if ($$2.a((dhs)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      return n($$0).g() == $$4 && !$$0.a($$1, $$3) ? dkw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected static jo n(dym $$0) {
      switch ((dyx)$$0.c(c)) {
         case c:
            return jo.a;
         case a:
            return jo.b;
         default:
            return $$0.c(e);
      }
   }
}
