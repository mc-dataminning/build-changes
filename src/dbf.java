import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbf extends csu {
   public static final MapCodec<dbf> c = b(dbf::new);

   @Override
   public MapCodec<dbf> a() {
      return c;
   }

   protected dbf(dga.d $$0) {
      super($$0);
   }

   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new dfi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends ddx> ddy<T> a(cqz $$0, dgb $$1, ddz<T> $$2) {
      return a($$0, $$2, ddz.B);
   }

   @Override
   protected void a(cqz $$0, ht $$1, ccx $$2) {
      ddx $$3 = $$0.c_($$1);
      if ($$3 instanceof dfi) {
         $$2.a((bie)$$3);
         $$2.a(aqn.at);
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, ate $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, aqd.wz, aqe.e, 1.0F, 1.0F, false);
         }

         $$1.a(js.Z, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
