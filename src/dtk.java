import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtk extends djy {
   public static final MapCodec<dtk> a = b(dtk::new);
   public static final dyx<dxi> b = dyl.bA;
   public static final dys<jm> c = dok.aF;
   public static final dym d = dyl.bC;

   @Override
   public MapCodec<dtk> a() {
      return a;
   }

   public dtk(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, jm.c).b(b, dxi.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   public btj a(cxp $$0, dxv $$1, dhi $$2, jh $$3, cpx $$4, bti $$5, fbu $$6) {
      if (!$$0.f() && $$1.c(b) == dxi.b) {
         if ($$2 instanceof ash $$7) {
            if (!($$7.c_($$3) instanceof dxd $$8)) {
               return btj.f;
            }

            dxd.b.a($$7, $$3, $$1, $$8.f(), $$8.b(), $$8.c(), $$4, $$0);
         }

         return btj.b;
      } else {
         return btj.f;
      }
   }

   @Nullable
   @Override
   public dux a(jh $$0, dxv $$1) {
      return new dxd($$0, $$1);
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends dux> duy<T> a(dhi $$0, dxv $$1, duz<T> $$2) {
      return $$0 instanceof ash $$3
         ? a($$2, duz.S, ($$1x, $$2x, $$3x, $$4) -> dxd.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, duz.S, ($$0x, $$1x, $$2x, $$3x) -> dxd.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public dxv a(dbg $$0) {
      return this.m().b(c, $$0.g().g());
   }

   @Override
   public dxv a(dxv $$0, drc $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   public dxv a(dxv $$0, dpl $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public dqv a_(dxv $$0) {
      return dqv.c;
   }
}
