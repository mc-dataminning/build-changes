import java.util.Map;

public class cib extends bsg<chv> {
   public cib() {
      super(Map.of(bzr.o, bzs.a, bzr.m, bzs.b, bzr.aU, bzs.b, bzr.aV, bzs.b));
   }

   protected boolean a(aps $$0, chv $$1) {
      return $$1.aC() && !$$1.bc() && $$1.ap() == bqz.a;
   }

   protected void a(aps $$0, chv $$1, long $$2) {
      bqo $$3 = $$1.dP().c(bzr.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.j($$3.dk());
         esa $$5 = null;
         if ($$4) {
            esa $$6 = cbi.a($$1, 5, 5, $$3.dk());
            if ($$6 != null && chx.a($$1, $$6) && $$3.i($$6.c, $$6.d, $$6.e) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.ei().h() ? chx.a($$3, $$1.ei()) : a($$1, $$3);
         }

         $$1.dP().a(bzr.m, new bzu(ib.a($$5), 0.6F, 1));
      }
   }

   private static esa a(chv $$0, bqo $$1) {
      esa $$2 = $$1.dk().d($$0.dk());
      double $$3 = $$2.f() - axk.d($$0.ei().j(), 8.0, 4.0);
      esa $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dk().e($$4);
   }
}
