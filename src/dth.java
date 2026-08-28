import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dth extends dkp {
   public static final MapCodec<dth> c = b(dth::new);

   @Override
   public MapCodec<dth> a() {
      return c;
   }

   protected dth(dzn.d $$0) {
      super($$0);
   }

   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dye($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwn> dwo<T> a(dip $$0, dzo $$1, dwp<T> $$2) {
      return a($$0, $$2, dwp.C);
   }

   @Override
   protected void a(dip $$0, iu $$1, cqs $$2) {
      dwn $$3 = $$0.c_($$1);
      if ($$3 instanceof dye) {
         $$2.a((bua)$$3);
         $$2.a(awv.at);
      }
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, azt $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awl.zi, awm.e, 1.0F, 1.0F, false);
         }

         $$1.a(lx.ah, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
