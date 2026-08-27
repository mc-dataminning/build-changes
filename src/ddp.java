import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddp extends cve {
   public static final MapCodec<ddp> c = b(ddp::new);

   @Override
   public MapCodec<ddp> a() {
      return c;
   }

   protected ddp(diz.d $$0) {
      super($$0);
   }

   @Override
   public dgo a(hx $$0, dja $$1) {
      return new dia($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgo> dgp<T> a(cti $$0, dja $$1, dgq<T> $$2) {
      return a($$0, $$2, dgq.B);
   }

   @Override
   protected void a(cti $$0, hx $$1, cfb $$2) {
      dgo $$3 = $$0.c_($$1);
      if ($$3 instanceof dia) {
         $$2.a((bjy)$$3);
         $$2.a(arw.at);
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, aup $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, arm.xn, arn.e, 1.0F, 1.0F, false);
         }

         $$1.a(jx.ab, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
