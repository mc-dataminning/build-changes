import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drm extends djk {
   public static final MapCodec<drm> a = b(drm::new);
   private static final wo d = wo.c("container.stonecutter");
   public static final dxs<jn> b = dni.aF;
   protected static final fbs c = djk.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<drm> a() {
      return a;
   }

   public drm(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c));
   }

   @Override
   public dwv a(dae $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awj.ay);
      }

      return bsi.a;
   }

   @Nullable
   @Override
   protected bsk b(dwv $$0, dgg $$1, ji $$2) {
      return new bsq(($$2x, $$3, $$4) -> new cud($$2x, $$3, csn.a($$1, $$2)), d);
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return c;
   }

   @Override
   protected boolean g_(dwv $$0) {
      return true;
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }
}
