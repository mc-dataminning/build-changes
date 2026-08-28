import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtx extends dkg {
   public static final MapCodec<dtx> a = b(dtx::new);
   public static final dzp<dxz> b = dzc.bC;
   public static final dzk<jo> c = dot.e;
   public static final dzd d = dzc.bE;

   @Override
   public MapCodec<dtx> a() {
      return a;
   }

   public dtx(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, jo.c).b(b, dxz.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   public btq a(cxy $$0, dym $$1, dhp $$2, jj $$3, cqi $$4, btp $$5, fcq $$6) {
      if (!$$0.f() && $$1.c(b) == dxz.b) {
         if ($$2 instanceof arn $$7) {
            if (!($$7.c_($$3) instanceof dxu $$8)) {
               return btq.f;
            }

            dxu.b.a($$7, $$3, $$1, $$8.f(), $$8.a(), $$8.c(), $$4, $$0);
         }

         return btq.b;
      } else {
         return btq.f;
      }
   }

   @Nullable
   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dxu($$0, $$1);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends dvl> dvm<T> a(dhp $$0, dym $$1, dvn<T> $$2) {
      return $$0 instanceof arn $$3
         ? a($$2, dvn.S, ($$1x, $$2x, $$3x, $$4) -> dxu.b.a($$3, $$2x, $$3x, $$4.f(), $$4.a(), $$4.c()))
         : a($$2, dvn.S, ($$0x, $$1x, $$2x, $$3x) -> dxu.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public dym a(dbn $$0) {
      return this.m().b(c, $$0.g().g());
   }

   @Override
   public dym a(dym $$0, drm $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   public dym a(dym $$0, dpv $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
