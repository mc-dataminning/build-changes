import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsn extends diz {
   public static final MapCodec<dsn> a = b(dsn::new);
   public static final dya<dwl> b = dxo.bC;
   public static final dxv<jn> c = dnl.aF;
   public static final dxp d = dxo.bD;

   @Override
   public MapCodec<dsn> a() {
      return a;
   }

   public dsn(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, jn.c).b(b, dwl.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   public bsl a(cwq $$0, dwy $$1, dgj $$2, ji $$3, coy $$4, bsk $$5, fax $$6) {
      if (!$$0.f() && $$1.c(b) == dwl.b) {
         if ($$2 instanceof ard $$7) {
            if (!($$7.c_($$3) instanceof dwg $$8)) {
               return bsl.f;
            }

            dwg.b.a($$7, $$3, $$1, $$8.f(), $$8.b(), $$8.c(), $$4, $$0);
         }

         return bsl.b;
      } else {
         return bsl.f;
      }
   }

   @Nullable
   @Override
   public dua a(ji $$0, dwy $$1) {
      return new dwg($$0, $$1);
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends dua> dub<T> a(dgj $$0, dwy $$1, duc<T> $$2) {
      return $$0 instanceof ard $$3
         ? a($$2, duc.S, ($$1x, $$2x, $$3x, $$4) -> dwg.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, duc.S, ($$0x, $$1x, $$2x, $$3x) -> dwg.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public dwy a(dah $$0) {
      return this.m().b(c, $$0.g().g());
   }

   @Override
   public dwy a(dwy $$0, dqf $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   public dwy a(dwy $$0, dom $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
