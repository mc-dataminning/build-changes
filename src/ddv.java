import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddv extends cvk {
   public static final MapCodec<ddv> c = b(ddv::new);

   @Override
   public MapCodec<ddv> a() {
      return c;
   }

   protected ddv(djf.d $$0) {
      super($$0);
   }

   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dig($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgu> dgv<T> a(cto $$0, djg $$1, dgw<T> $$2) {
      return a($$0, $$2, dgw.B);
   }

   @Override
   protected void a(cto $$0, hx $$1, cfh $$2) {
      dgu $$3 = $$0.c_($$1);
      if ($$3 instanceof dig) {
         $$2.a((bkd)$$3);
         $$2.a(asb.at);
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, auu $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, arr.xn, ars.e, 1.0F, 1.0F, false);
         }

         $$1.a(jx.ab, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
