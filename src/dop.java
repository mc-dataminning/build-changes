import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dop extends dpt {
   public static final eam<dzz> c = eae.X;

   protected dop(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dop> a();

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      return b($$1, $$2, n($$0).g());
   }

   public static boolean b(dis $$0, iu $$1, ja $$2) {
      iu $$3 = $$1.a($$2);
      return $$0.a_($$3).c($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      for (ja $$1 : $$0.f()) {
         dzo $$2;
         if ($$1.o() == ja.a.b) {
            $$2 = this.m().b(c, $$1 == ja.b ? dzz.c : dzz.a).b(e, $$0.g());
         } else {
            $$2 = this.m().b(c, dzz.b).b(e, $$1.g());
         }

         if ($$2.a((dis)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      return n($$0).g() == $$4 && !$$0.a($$1, $$3) ? dlw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected static ja n(dzo $$0) {
      switch ((dzz)$$0.c(c)) {
         case c:
            return ja.a;
         case a:
            return ja.b;
         default:
            return $$0.c(e);
      }
   }
}
