import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsk extends diw {
   public static final MapCodec<dsk> a = b(dsk::new);
   public static final dxx<dwi> b = dxl.bC;
   public static final dxs<jn> c = dni.aF;
   public static final dxm d = dxl.bD;

   @Override
   public MapCodec<dsk> a() {
      return a;
   }

   public dsk(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, jn.c).b(b, dwi.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   public bsi a(cwn $$0, dwv $$1, dgg $$2, ji $$3, cov $$4, bsh $$5, fau $$6) {
      if (!$$0.f() && $$1.c(b) == dwi.b) {
         if ($$2 instanceof arc $$7) {
            if (!($$7.c_($$3) instanceof dwd $$8)) {
               return bsi.f;
            }

            dwd.b.a($$7, $$3, $$1, $$8.f(), $$8.b(), $$8.c(), $$4, $$0);
         }

         return bsi.b;
      } else {
         return bsi.f;
      }
   }

   @Nullable
   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new dwd($$0, $$1);
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends dtx> dty<T> a(dgg $$0, dwv $$1, dtz<T> $$2) {
      return $$0 instanceof arc $$3
         ? a($$2, dtz.S, ($$1x, $$2x, $$3x, $$4) -> dwd.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, dtz.S, ($$0x, $$1x, $$2x, $$3x) -> dwd.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public dwv a(dae $$0) {
      return this.m().b(c, $$0.g().g());
   }

   @Override
   public dwv a(dwv $$0, dqc $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   public dwv a(dwv $$0, doj $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
