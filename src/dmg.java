import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmg extends ddu {
   public static final MapCodec<dmg> c = b(dmg::new);

   @Override
   public MapCodec<dmg> a() {
      return c;
   }

   protected dmg(dsb.d $$0) {
      super($$0);
   }

   @Override
   public dph a(iz $$0, dsc $$1) {
      return new dqu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dph> dpi<T> a(dby $$0, dsc $$1, dpj<T> $$2) {
      return a($$0, $$2, dpj.B);
   }

   @Override
   protected void a(dby $$0, iz $$1, cmx $$2) {
      dph $$3 = $$0.c_($$1);
      if ($$3 instanceof dqu) {
         $$2.a((bqy)$$3);
         $$2.a(awk.at);
      }
   }

   @Override
   public void a(dsc $$0, dby $$1, iz $$2, azh $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awa.yh, awb.e, 1.0F, 1.0F, false);
         }

         $$1.a(li.ae, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
