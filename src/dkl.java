import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkl extends dbz {
   public static final MapCodec<dkl> c = b(dkl::new);

   @Override
   public MapCodec<dkl> a() {
      return c;
   }

   protected dkl(dqg.d $$0) {
      super($$0);
   }

   @Override
   public dnm a(in $$0, dqh $$1) {
      return new doz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnm> dnn<T> a(dad $$0, dqh $$1, dno<T> $$2) {
      return a($$0, $$2, dno.B);
   }

   @Override
   protected void a(dad $$0, in $$1, clh $$2) {
      dnm $$3 = $$0.c_($$1);
      if ($$3 instanceof doz) {
         $$2.a((bpq)$$3);
         $$2.a(avm.at);
      }
   }

   @Override
   public void a(dqh $$0, dad $$1, in $$2, ayg $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, avc.xW, avd.e, 1.0F, 1.0F, false);
         }

         $$1.a(kx.ab, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
