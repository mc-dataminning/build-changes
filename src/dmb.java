import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmb extends dlt {
   public static final MapCodec<dmb> e = b(dmb::new);

   @Override
   public MapCodec<? extends dmb> a() {
      return e;
   }

   public dmb(dvi.d $$0) {
      super($$0);
   }

   public static dvj b() {
      return dig.G.m();
   }

   @Override
   public void a(dfb $$0, com $$1, jh $$2, dvj $$3, @Nullable dsm $$4, cwb $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!dbu.a($$5, axd.s)) {
         if ($$0.D_().i()) {
            $$0.a($$2, false);
            return;
         }

         dvj $$6 = $$0.a_($$2.e());
         if ($$6.d() || $$6.n()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if ($$1.a(dfk.b, $$2) > 11 - $$0.g()) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dvj $$0, dfb $$1, jh $$2) {
      if ($$1.D_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.b($$2, b().b(), null);
      }
   }
}
