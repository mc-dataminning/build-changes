import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvi extends dlm {
   public static final MapCodec<dvi> a = b(dvi::new);
   public static final ebc<dzl> b = eap.bC;
   public static final eax<ja> c = dqa.e;
   public static final eaq d = eap.bE;

   @Override
   public MapCodec<dvi> a() {
      return a;
   }

   public dvi(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, ja.c).b(b, dzl.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   public bub a(cyy $$0, dzz $$1, div $$2, iu $$3, cqy $$4, bua $$5, fee $$6) {
      if (!$$0.f() && $$1.c(b) == dzl.b) {
         if ($$2 instanceof arq $$7) {
            if (!($$7.c_($$3) instanceof dzg $$8)) {
               return bub.f;
            }

            dzg.b.a($$7, $$3, $$1, $$8.f(), $$8.a(), $$8.c(), $$4, $$0);
         }

         return bub.b;
      } else {
         return bub.f;
      }
   }

   @Nullable
   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dzg($$0, $$1);
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends dwx> dwy<T> a(div $$0, dzz $$1, dwz<T> $$2) {
      return $$0 instanceof arq $$3
         ? a($$2, dwz.S, ($$1x, $$2x, $$3x, $$4) -> dzg.b.a($$3, $$2x, $$3x, $$4.f(), $$4.a(), $$4.c()))
         : a($$2, dwz.S, ($$0x, $$1x, $$2x, $$3x) -> dzg.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public dzz a(dcr $$0) {
      return this.m().b(c, $$0.g().g());
   }

   @Override
   public dzz a(dzz $$0, dst $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   public dzz a(dzz $$0, drc $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
