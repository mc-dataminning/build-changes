import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsl extends dix {
   public static final MapCodec<dsl> a = b(dsl::new);
   public static final dxy<dwj> b = dxm.bC;
   public static final dxt<jn> c = dnj.aF;
   public static final dxn d = dxm.bD;

   @Override
   public MapCodec<dsl> a() {
      return a;
   }

   public dsl(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, jn.c).b(b, dwj.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   public bsj a(cwo $$0, dww $$1, dgh $$2, ji $$3, cow $$4, bsi $$5, fav $$6) {
      if (!$$0.f() && $$1.c(b) == dwj.b) {
         if ($$2 instanceof ard $$7) {
            if (!($$7.c_($$3) instanceof dwe $$8)) {
               return bsj.f;
            }

            dwe.b.a($$7, $$3, $$1, $$8.f(), $$8.b(), $$8.c(), $$4, $$0);
         }

         return bsj.b;
      } else {
         return bsj.f;
      }
   }

   @Nullable
   @Override
   public dty a(ji $$0, dww $$1) {
      return new dwe($$0, $$1);
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends dty> dtz<T> a(dgh $$0, dww $$1, dua<T> $$2) {
      return $$0 instanceof ard $$3
         ? a($$2, dua.S, ($$1x, $$2x, $$3x, $$4) -> dwe.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, dua.S, ($$0x, $$1x, $$2x, $$3x) -> dwe.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public dww a(daf $$0) {
      return this.m().b(c, $$0.g().g());
   }

   @Override
   public dww a(dww $$0, dqd $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   public dww a(dww $$0, dok $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
