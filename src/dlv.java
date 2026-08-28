import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlv extends dln {
   public static final MapCodec<dlv> e = b(dlv::new);

   @Override
   public MapCodec<? extends dlv> a() {
      return e;
   }

   public dlv(dvc.d $$0) {
      super($$0);
   }

   public static dvd b() {
      return dia.G.m();
   }

   @Override
   public void a(dev $$0, coh $$1, jg $$2, dvd $$3, @Nullable dsg $$4, cvx $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!dbo.a($$5, axc.s)) {
         if ($$0.D_().i()) {
            $$0.a($$2, false);
            return;
         }

         dvd $$6 = $$0.a_($$2.e());
         if ($$6.d() || $$6.n()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if ($$1.a(dfe.b, $$2) > 11 - $$0.g()) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dvd $$0, dev $$1, jg $$2) {
      if ($$1.D_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.b($$2, b().b(), null);
      }
   }
}
