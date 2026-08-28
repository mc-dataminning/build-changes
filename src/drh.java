import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drh extends dqy {
   public static final MapCodec<drh> e = b(drh::new);

   @Override
   public MapCodec<? extends drh> a() {
      return e;
   }

   public drh(ebf.d $$0) {
      super($$0);
   }

   public static ebg b() {
      return dng.J.m();
   }

   @Override
   public void a(djz $$0, crz $$1, iw $$2, ebg $$3, @Nullable dye $$4, daa $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!dgp.a($$5, axi.s)) {
         if ($$0.F_().i()) {
            $$0.a($$2, false);
            return;
         }

         ebg $$6 = $$0.a_($$2.e());
         if ($$6.d() || $$6.n()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if ($$1.a(dki.b, $$2) > 11 - $$0.g()) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(ebg $$0, djz $$1, iw $$2) {
      if ($$1.F_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.b($$2, b().b(), null);
      }
   }
}
