import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dou extends dgh {
   public static final MapCodec<dou> c = b(dou::new);

   @Override
   public MapCodec<dou> a() {
      return c;
   }

   protected dou(dur.d $$0) {
      super($$0);
   }

   @Override
   public drv a(jf $$0, dus $$1) {
      return new dtk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drv> drw<T> a(dej $$0, dus $$1, drx<T> $$2) {
      return a($$0, $$2, drx.B);
   }

   @Override
   protected void a(dej $$0, jf $$1, cnx $$2) {
      drv $$3 = $$0.c_($$1);
      if ($$3 instanceof dtk) {
         $$2.a((bru)$$3);
         $$2.a(awq.at);
      }
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, azn $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awg.yq, awh.e, 1.0F, 1.0F, false);
         }

         $$1.a(lo.ae, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
