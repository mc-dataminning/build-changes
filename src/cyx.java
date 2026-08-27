import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyx extends cyq {
   public static final MapCodec<cyx> e = b(cyx::new);

   @Override
   public MapCodec<? extends cyx> a() {
      return e;
   }

   public cyx(dhh.d $$0) {
      super($$0);
   }

   public static dhi b() {
      return cvc.G.o();
   }

   @Override
   public void a(csa $$0, cdu $$1, ht $$2, dhi $$3, @Nullable dfd $$4, clj $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (cpw.a(cpy.v, $$5) == 0) {
         if ($$0.D_().i()) {
            $$0.a($$2, false);
            return;
         }

         dhi $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   public void b(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if ($$1.a(csj.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dhi $$0, csa $$1, ht $$2) {
      if ($$1.D_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.a($$2, b().b(), $$2);
      }
   }
}
