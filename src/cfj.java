import javax.annotation.Nullable;

public class cfj extends cgj {
   public cfj(bpc<? extends cfj> $$0, cwz $$1) {
      super($$0, $$1);
   }

   public static bqu.a r() {
      return cgj.s().a(bqv.q, 12.0);
   }

   @Override
   public boolean C(bow $$0) {
      if (super.C($$0)) {
         if ($$0 instanceof bpo) {
            int $$1 = 0;
            if (this.dM().aj() == bmz.c) {
               $$1 = 7;
            } else if (this.dM().aj() == bmz.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((bpo)$$0).b(new boj(bol.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bqg a(cxo $$0, bna $$1, bps $$2, @Nullable bqg $$3) {
      return $$3;
   }

   @Override
   public epr l(bow $$0) {
      return $$0.dg() <= this.dg() ? new epr(0.0, 0.21875 * (double)this.eb(), 0.0) : super.l($$0);
   }
}
