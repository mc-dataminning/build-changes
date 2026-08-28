import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtj extends djx {
   public static final MapCodec<dtj> a = b(dtj::new);
   public static final dyw<dxh> b = dyk.bA;
   public static final dyr<jm> c = doj.aF;
   public static final dyl d = dyk.bC;

   @Override
   public MapCodec<dtj> a() {
      return a;
   }

   public dtj(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, jm.c).b(b, dxh.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   public bti a(cxo $$0, dxu $$1, dhh $$2, jh $$3, cpw $$4, bth $$5, fbt $$6) {
      if (!$$0.f() && $$1.c(b) == dxh.b) {
         if ($$2 instanceof ash $$7) {
            if (!($$7.c_($$3) instanceof dxc $$8)) {
               return bti.f;
            }

            dxc.b.a($$7, $$3, $$1, $$8.f(), $$8.b(), $$8.c(), $$4, $$0);
         }

         return bti.b;
      } else {
         return bti.f;
      }
   }

   @Nullable
   @Override
   public duw a(jh $$0, dxu $$1) {
      return new dxc($$0, $$1);
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends duw> dux<T> a(dhh $$0, dxu $$1, duy<T> $$2) {
      return $$0 instanceof ash $$3
         ? a($$2, duy.S, ($$1x, $$2x, $$3x, $$4) -> dxc.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, duy.S, ($$0x, $$1x, $$2x, $$3x) -> dxc.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public dxu a(dbf $$0) {
      return this.m().b(c, $$0.g().g());
   }

   @Override
   public dxu a(dxu $$0, drb $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   public dxu a(dxu $$0, dpk $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public dqu a_(dxu $$0) {
      return dqu.c;
   }
}
