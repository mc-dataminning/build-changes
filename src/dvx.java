import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvx extends dly {
   public static final MapCodec<dvx> a = b(dvx::new);
   public static final ebr<eaa> b = ebe.bC;
   public static final ebm<jb> c = dqn.e;
   public static final ebf d = ebe.bE;

   @Override
   public MapCodec<dvx> a() {
      return a;
   }

   public dvx(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, jb.c).b(b, eaa.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   public bug a(czk $$0, eao $$1, djh $$2, iv $$3, crj $$4, buf $$5, fet $$6) {
      if (!$$0.f() && $$1.c(b) == eaa.b) {
         if ($$2 instanceof arq $$7) {
            if (!($$7.c_($$3) instanceof dzv $$8)) {
               return bug.f;
            }

            dzv.b.a($$7, $$3, $$1, $$8.f(), $$8.a(), $$8.c(), $$4, $$0);
         }

         return bug.b;
      } else {
         return bug.f;
      }
   }

   @Nullable
   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dzv($$0, $$1);
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends dxm> dxn<T> a(djh $$0, eao $$1, dxo<T> $$2) {
      return $$0 instanceof arq $$3
         ? a($$2, dxo.S, ($$1x, $$2x, $$3x, $$4) -> dzv.b.a($$3, $$2x, $$3x, $$4.f(), $$4.a(), $$4.c()))
         : a($$2, dxo.S, ($$0x, $$1x, $$2x, $$3x) -> dzv.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public eao a(ddd $$0) {
      return this.m().b(c, $$0.g().g());
   }

   @Override
   public eao a(eao $$0, dtg $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   public eao a(eao $$0, drp $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
