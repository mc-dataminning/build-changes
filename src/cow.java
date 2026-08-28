import java.util.Map;

public class cow extends byq<coq> {
   public cow() {
      super(Map.of(cgb.p, cgc.a, cgb.n, cgc.b, cgb.aV, cgc.b, cgb.aW, cgc.b));
   }

   protected boolean a(aro $$0, coq $$1) {
      return $$1.aJ() && !$$1.bj() && $$1.aw() == bxl.a;
   }

   protected void a(aro $$0, coq $$1, long $$2) {
      bwz $$3 = $$1.eb().c(cgb.p).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.l($$3.dt());
         fdw $$5 = null;
         if ($$4) {
            fdw $$6 = chs.a($$1, 5, 5, $$3.dt());
            if ($$6 != null && cos.a($$1, $$6) && $$3.i($$6.d, $$6.e, $$6.f) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.dY().h() ? cos.a($$3, $$1.dY()) : a($$1, $$3);
         }

         $$1.eb().a(cgb.n, new cge(iu.a((jo)$$5), 0.6F, 1));
      }
   }

   private static fdw a(coq $$0, bwz $$1) {
      fdw $$2 = $$1.dt().d($$0.dt());
      double $$3 = $$2.g() - azk.d($$0.dY().j(), 8.0, 4.0);
      fdw $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dt().e($$4);
   }
}
