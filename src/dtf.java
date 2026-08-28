import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtf extends djq {
   public static final MapCodec<dtf> a = b(dtf::new);
   public static final dyt<dxd> b = dyg.bC;
   public static final dyo<jn> c = dod.e;
   public static final dyh d = dyg.bE;

   @Override
   public MapCodec<dtf> a() {
      return a;
   }

   public dtf(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, jn.c).b(b, dxd.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   public bsy a(cxh $$0, dxq $$1, dgz $$2, ji $$3, cpr $$4, bsx $$5, fbt $$6) {
      if (!$$0.f() && $$1.c(b) == dxd.b) {
         if ($$2 instanceof ard $$7) {
            if (!($$7.c_($$3) instanceof dwy $$8)) {
               return bsy.f;
            }

            dwy.b.a($$7, $$3, $$1, $$8.f(), $$8.b(), $$8.c(), $$4, $$0);
         }

         return bsy.b;
      } else {
         return bsy.f;
      }
   }

   @Nullable
   @Override
   public dus a(ji $$0, dxq $$1) {
      return new dwy($$0, $$1);
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends dus> dut<T> a(dgz $$0, dxq $$1, duu<T> $$2) {
      return $$0 instanceof ard $$3
         ? a($$2, duu.S, ($$1x, $$2x, $$3x, $$4) -> dwy.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, duu.S, ($$0x, $$1x, $$2x, $$3x) -> dwy.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public dxq a(dax $$0) {
      return this.m().b(c, $$0.g().g());
   }

   @Override
   public dxq a(dxq $$0, dqw $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   public dxq a(dxq $$0, dpf $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
