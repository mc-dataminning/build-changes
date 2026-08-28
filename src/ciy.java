import javax.annotation.Nullable;

public class ciy extends cjy {
   public ciy(bsj<? extends ciy> $$0, dcd $$1) {
      super($$0, $$1);
   }

   public static buf.a s() {
      return cjy.u().a(bug.s, 12.0);
   }

   @Override
   public boolean D(bsd $$0) {
      if (super.D($$0)) {
         if ($$0 instanceof bsy) {
            int $$1 = 0;
            if (this.dP().al() == bqa.c) {
               $$1 = 7;
            } else if (this.dP().al() == bqa.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((bsy)$$0).b(new brl(brn.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      return $$3;
   }

   @Override
   public evz l(bsd $$0) {
      return $$0.dj() <= this.dj() ? new evz(0.0, 0.21875 * (double)this.eb(), 0.0) : super.l($$0);
   }
}
