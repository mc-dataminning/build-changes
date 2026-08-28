import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dom extends dod {
   public static final MapCodec<dom> e = b(dom::new);

   @Override
   public MapCodec<? extends dom> a() {
      return e;
   }

   public dom(dxu.d $$0) {
      super($$0);
   }

   public static dxv b() {
      return dko.J.m();
   }

   @Override
   public void a(dhi $$0, cpx $$1, jh $$2, dxv $$3, @Nullable dux $$4, cxp $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!deb.a($$5, axx.s)) {
         if ($$0.G_().i()) {
            $$0.a($$2, false);
            return;
         }

         dxv $$6 = $$0.a_($$2.e());
         if ($$6.d() || $$6.n()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if ($$1.a(dhr.b, $$2) > 11 - $$0.g()) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dxv $$0, dhi $$1, jh $$2) {
      if ($$1.G_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.b($$2, b().b(), null);
      }
   }
}
