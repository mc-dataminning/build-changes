import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsm extends dkm {
   public static final MapCodec<dsm> a = b(dsm::new);
   private static final xv d = xv.c("container.stonecutter");
   public static final dys<jm> b = dok.aF;
   protected static final fcs c = dkm.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dsm> a() {
      return a;
   }

   public dsm(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c));
   }

   @Override
   public dxv a(dbg $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(axp.ay);
      }

      return btj.a;
   }

   @Nullable
   @Override
   protected btl b(dxv $$0, dhi $$1, jh $$2) {
      return new btr(($$2x, $$3, $$4) -> new cvf($$2x, $$3, ctp.a($$1, $$2)), d);
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return c;
   }

   @Override
   protected boolean g_(dxv $$0) {
      return true;
   }

   @Override
   protected dqv a_(dxv $$0) {
      return dqv.c;
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }
}
