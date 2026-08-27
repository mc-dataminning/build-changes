import java.util.List;
import javax.annotation.Nullable;

public class cqo extends cre {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public cqo(cre.a $$0) {
      super($$0);
   }

   @Override
   public boa a(cuq $$0) {
      cyx $$1 = $$0.q();
      if (!$$1.B) {
         crj $$2 = $$0.n();
         esa $$3 = $$0.l();
         ih $$4 = $$0.k();
         ckg $$5 = new ckg($$1, $$0.o(), $$3.c + (double)$$4.j() * 0.15, $$3.d + (double)$$4.k() * 0.15, $$3.e + (double)$$4.l() * 0.15, $$2);
         $$1.b($$5);
         $$2.g(1);
      }

      return boa.a($$1.B);
   }

   @Override
   public bob<crj> a(cyx $$0, cjt $$1, bnz $$2) {
      if ($$1.fB()) {
         crj $$3 = $$1.b($$2);
         if (!$$0.B) {
            ckg $$4 = new ckg($$0, $$3, $$1);
            $$0.b($$4);
            $$3.a(1, $$1);
            $$1.b(auw.c.b(this));
         }

         return bob.a($$1.b($$2), $$0.x_());
      } else {
         return bob.c($$1.b($$2));
      }
   }

   @Override
   public void a(crj $$0, @Nullable cyx $$1, List<wg> $$2, csz $$3) {
      cty $$4 = $$0.a(jp.K);
      if ($$4 != null) {
         $$4.a($$2::add, $$3);
      }
   }
}
