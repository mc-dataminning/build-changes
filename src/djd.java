import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djd extends div {
   public static final MapCodec<djd> e = b(djd::new);

   @Override
   public MapCodec<? extends djd> a() {
      return e;
   }

   public djd(dsg.d $$0) {
      super($$0);
   }

   public static dsh b() {
      return dfh.G.o();
   }

   @Override
   public void a(dcd $$0, cmh $$1, ja $$2, dsh $$3, @Nullable dpn $$4, cua $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!czl.a($$5, avx.s)) {
         if ($$0.D_().i()) {
            $$0.a($$2, false);
            return;
         }

         dsh $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if ($$1.a(dcm.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dsh $$0, dcd $$1, ja $$2) {
      if ($$1.D_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.a($$2, b().b(), $$2);
      }
   }
}
