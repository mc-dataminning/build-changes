import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drr extends dri {
   public static final MapCodec<drr> e = b(drr::new);

   @Override
   public MapCodec<? extends drr> a() {
      return e;
   }

   public drr(ebp.d $$0) {
      super($$0);
   }

   public static ebq b() {
      return dnq.J.m();
   }

   @Override
   public void a(dkj $$0, csi $$1, iw $$2, ebq $$3, @Nullable dyo $$4, dak $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!dgz.a($$5, axp.s)) {
         if ($$0.F_().i()) {
            $$0.a($$2, false);
            return;
         }

         ebq $$6 = $$0.a_($$2.e());
         if ($$6.d() || $$6.n()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if ($$1.a(dks.b, $$2) > 11 - $$0.g()) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(ebq $$0, dkj $$1, iw $$2) {
      if ($$1.F_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.b($$2, b().b(), null);
      }
   }
}
