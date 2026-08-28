import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmm extends dea {
   public static final MapCodec<dmm> c = b(dmm::new);

   @Override
   public MapCodec<dmm> a() {
      return c;
   }

   protected dmm(dsg.d $$0) {
      super($$0);
   }

   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new dra($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpn> dpo<T> a(dcd $$0, dsh $$1, dpp<T> $$2) {
      return a($$0, $$2, dpp.B);
   }

   @Override
   protected void a(dcd $$0, ja $$1, cmh $$2) {
      dpn $$3 = $$0.c_($$1);
      if ($$3 instanceof dra) {
         $$2.a((bqh)$$3);
         $$2.a(avp.at);
      }
   }

   @Override
   public void a(dsh $$0, dcd $$1, ja $$2, aym $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, avf.yk, avg.e, 1.0F, 1.0F, false);
         }

         $$1.a(lj.ae, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
