import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmf extends ddt {
   public static final MapCodec<dmf> c = b(dmf::new);

   @Override
   public MapCodec<dmf> a() {
      return c;
   }

   protected dmf(dsa.d $$0) {
      super($$0);
   }

   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dqt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpg> dph<T> a(dbx $$0, dsb $$1, dpi<T> $$2) {
      return a($$0, $$2, dpi.B);
   }

   @Override
   protected void a(dbx $$0, iz $$1, cmw $$2) {
      dpg $$3 = $$0.c_($$1);
      if ($$3 instanceof dqt) {
         $$2.a((bqx)$$3);
         $$2.a(awj.at);
      }
   }

   @Override
   public void a(dsb $$0, dbx $$1, iz $$2, azg $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, avz.yh, awa.e, 1.0F, 1.0F, false);
         }

         $$1.a(li.ae, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
