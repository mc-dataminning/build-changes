import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnk extends dnb {
   public static final MapCodec<dnk> e = b(dnk::new);

   @Override
   public MapCodec<? extends dnk> a() {
      return e;
   }

   public dnk(dwu.d $$0) {
      super($$0);
   }

   public static dwv b() {
      return djm.J.m();
   }

   @Override
   public void a(dgg $$0, cov $$1, ji $$2, dwv $$3, @Nullable dtx $$4, cwn $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!dcz.a($$5, awr.s)) {
         if ($$0.G_().i()) {
            $$0.a($$2, false);
            return;
         }

         dwv $$6 = $$0.a_($$2.e());
         if ($$6.d() || $$6.n()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if ($$1.a(dgp.b, $$2) > 11 - $$0.g()) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dwv $$0, dgg $$1, ji $$2) {
      if ($$1.G_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.b($$2, b().b(), null);
      }
   }
}
