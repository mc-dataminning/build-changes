import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsm extends diy {
   public static final MapCodec<dsm> a = b(dsm::new);
   public static final dxz<dwk> b = dxn.bC;
   public static final dxu<jn> c = dnk.aF;
   public static final dxo d = dxn.bD;

   @Override
   public MapCodec<dsm> a() {
      return a;
   }

   public dsm(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, jn.c).b(b, dwk.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   public bsk a(cwp $$0, dwx $$1, dgi $$2, ji $$3, cox $$4, bsj $$5, faw $$6) {
      if (!$$0.f() && $$1.c(b) == dwk.b) {
         if ($$2 instanceof ard $$7) {
            if (!($$7.c_($$3) instanceof dwf $$8)) {
               return bsk.f;
            }

            dwf.b.a($$7, $$3, $$1, $$8.f(), $$8.b(), $$8.c(), $$4, $$0);
         }

         return bsk.b;
      } else {
         return bsk.f;
      }
   }

   @Nullable
   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new dwf($$0, $$1);
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends dtz> dua<T> a(dgi $$0, dwx $$1, dub<T> $$2) {
      return $$0 instanceof ard $$3
         ? a($$2, dub.S, ($$1x, $$2x, $$3x, $$4) -> dwf.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, dub.S, ($$0x, $$1x, $$2x, $$3x) -> dwf.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public dwx a(dag $$0) {
      return this.m().b(c, $$0.g().g());
   }

   @Override
   public dwx a(dwx $$0, dqe $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   public dwx a(dwx $$0, dol $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
