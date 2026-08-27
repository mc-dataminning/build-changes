import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxw extends cxp {
   public static final MapCodec<cxw> e = b(cxw::new);

   @Override
   public MapCodec<? extends cxw> a() {
      return e;
   }

   public cxw(dga.d $$0) {
      super($$0);
   }

   public static dgb b() {
      return cuc.G.o();
   }

   @Override
   public void a(cqz $$0, ccx $$1, ht $$2, dgb $$3, @Nullable ddx $$4, ckj $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (cov.a(cox.v, $$5) == 0) {
         if ($$0.D_().i()) {
            $$0.a($$2, false);
            return;
         }

         dgb $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   public void b(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if ($$1.a(cri.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dgb $$0, cqz $$1, ht $$2) {
      if ($$1.D_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.a($$2, b().b(), $$2);
      }
   }
}
