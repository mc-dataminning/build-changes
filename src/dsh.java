import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsh extends djp {
   public static final MapCodec<dsh> c = b(dsh::new);

   @Override
   public MapCodec<dsh> a() {
      return c;
   }

   protected dsh(dyl.d $$0) {
      super($$0);
   }

   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dxc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dvl> dvm<T> a(dhp $$0, dym $$1, dvn<T> $$2) {
      return a($$0, $$2, dvn.C);
   }

   @Override
   protected void a(dhp $$0, jj $$1, cqi $$2) {
      dvl $$3 = $$0.c_($$1);
      if ($$3 instanceof dxc) {
         $$2.a((bts)$$3);
         $$2.a(awu.at);
      }
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, azs $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awk.zi, awl.e, 1.0F, 1.0F, false);
         }

         $$1.a(lv.ah, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
