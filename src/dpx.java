import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpx extends dhl {
   public static final MapCodec<dpx> c = b(dpx::new);

   @Override
   public MapCodec<dpx> a() {
      return c;
   }

   protected dpx(dvu.d $$0) {
      super($$0);
   }

   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new dun($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsy> dsz<T> a(dfm $$0, dvv $$1, dta<T> $$2) {
      return a($$0, $$2, dta.B);
   }

   @Override
   protected void a(dfm $$0, jh $$1, cou $$2) {
      dsy $$3 = $$0.c_($$1);
      if ($$3 instanceof dun) {
         $$2.a((bsm)$$3);
         $$2.a(awx.at);
      }
   }

   @Override
   public void a(dvv $$0, dfm $$1, jh $$2, azu $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awn.yo, awo.e, 1.0F, 1.0F, false);
         }

         $$1.a(ls.ae, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
