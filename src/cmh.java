import javax.annotation.Nullable;

public class cmh extends cnh {
   public cmh(bvq<? extends cmh> $$0, dhh $$1) {
      super($$0, $$1);
   }

   public static bxm.a m() {
      return cnh.p().a(bxn.s, 12.0);
   }

   @Override
   public boolean c(ash $$0, bvj $$1) {
      if (super.c($$0, $$1)) {
         if ($$1 instanceof bwf) {
            int $$2 = 0;
            if (this.dV().al() == btf.c) {
               $$2 = 7;
            } else if (this.dV().al() == btf.d) {
               $$2 = 15;
            }

            if ($$2 > 0) {
               ((bwf)$$1).b(new buo(buq.s, $$2 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      return $$3;
   }

   @Override
   public fbx l(bvj $$0) {
      return $$0.dq() <= this.dq() ? new fbx(0.0, 0.21875 * (double)this.ej(), 0.0) : super.l($$0);
   }
}
