import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dpn extends dqs {
   public static final ebr<ebe> c = ebj.X;

   protected dpn(eas.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dpn> a();

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      return b($$1, $$2, n($$0).g());
   }

   public static boolean b(djp $$0, iv $$1, jb $$2) {
      iv $$3 = $$1.a($$2);
      return $$0.a_($$3).c($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      for (jb $$1 : $$0.f()) {
         eat $$2;
         if ($$1.o() == jb.a.b) {
            $$2 = this.m().b(c, $$1 == jb.b ? ebe.c : ebe.a).b(e, $$0.g());
         } else {
            $$2 = this.m().b(c, ebe.b).b(e, $$1.g());
         }

         if ($$2.a((djp)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      return n($$0).g() == $$4 && !$$0.a($$1, $$3) ? dmt.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected static jb n(eat $$0) {
      switch ((ebe)$$0.c(c)) {
         case c:
            return jb.a;
         case a:
            return jb.b;
         default:
            return $$0.c(e);
      }
   }
}
