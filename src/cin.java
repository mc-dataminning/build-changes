import javax.annotation.Nullable;

public class cin extends cjp {
   public cin(bsb<? extends cin> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean dW() {
      return false;
   }

   public static btu.a r() {
      return cjp.t().a(btv.q, 12.0);
   }

   @Override
   public boolean C(brv $$0) {
      if (super.C($$0)) {
         a($$0, this);
         return true;
      } else {
         return false;
      }
   }

   public static void a(brv $$0, @Nullable brv $$1) {
      if ($$0 instanceof bso $$2) {
         int $$3 = 0;
         if ($$0.dU().al() == bpx.c) {
            $$3 = 7;
         } else if ($$0.dU().al() == bpx.d) {
            $$3 = 15;
         }

         if ($$3 > 0) {
            $$2.b(new brh(brj.s, $$3 * 20, 0), $$1);
         }
      }
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      return $$3;
   }

   @Override
   public ewu l(brv $$0) {
      return $$0.do() <= this.do() ? new ewu(0.0, 0.21875 * (double)this.em(), 0.0) : super.l($$0);
   }
}
