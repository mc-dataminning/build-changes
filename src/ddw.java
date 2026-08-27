import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddw extends cvl {
   public static final MapCodec<ddw> c = b(ddw::new);

   @Override
   public MapCodec<ddw> a() {
      return c;
   }

   protected ddw(djg.d $$0) {
      super($$0);
   }

   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dih($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgv> dgw<T> a(ctp $$0, djh $$1, dgx<T> $$2) {
      return a($$0, $$2, dgx.B);
   }

   @Override
   protected void a(ctp $$0, hx $$1, cfi $$2) {
      dgv $$3 = $$0.c_($$1);
      if ($$3 instanceof dih) {
         $$2.a((bke)$$3);
         $$2.a(asc.at);
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, auv $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, ars.xn, art.e, 1.0F, 1.0F, false);
         }

         $$1.a(jx.ab, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
