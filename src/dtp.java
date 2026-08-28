import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtp extends dkv {
   public static final MapCodec<dtp> c = b(dtp::new);

   @Override
   public MapCodec<dtp> a() {
      return c;
   }

   protected dtp(dzy.d $$0) {
      super($$0);
   }

   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dyo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwx> dwy<T> a(div $$0, dzz $$1, dwz<T> $$2) {
      return a($$0, $$2, dwz.C);
   }

   @Override
   protected void a(div $$0, iu $$1, cqy $$2) {
      dwx $$3 = $$0.c_($$1);
      if ($$3 instanceof dyo) {
         $$2.a((bud)$$3);
         $$2.a(awx.at);
      }
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, azv $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awn.zl, awo.e, 1.0F, 1.0F, false);
         }

         $$1.a(lx.ah, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
