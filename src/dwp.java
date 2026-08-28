import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dwp extends dmq {
   public static final MapCodec<dwp> a = b(dwp::new);
   public static final ecj<eas> b = ebw.bC;
   public static final ece<jc> c = drf.e;
   public static final ebx d = ebw.bE;

   @Override
   public MapCodec<dwp> a() {
      return a;
   }

   public dwp(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, jc.c).b(b, eas.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   public but a(daa $$0, ebg $$1, djz $$2, iw $$3, crz $$4, bus $$5, ffo $$6) {
      if (!$$0.f() && $$1.c(b) == eas.b) {
         if ($$2 instanceof aru $$7) {
            if (!($$7.c_($$3) instanceof ean $$8)) {
               return but.f;
            }

            ean.b.a($$7, $$3, $$1, $$8.f(), $$8.a(), $$8.c(), $$4, $$0);
         }

         return but.b;
      } else {
         return but.f;
      }
   }

   @Nullable
   @Override
   public dye a(iw $$0, ebg $$1) {
      return new ean($$0, $$1);
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends dye> dyf<T> a(djz $$0, ebg $$1, dyg<T> $$2) {
      return $$0 instanceof aru $$3
         ? a($$2, dyg.S, ($$1x, $$2x, $$3x, $$4) -> ean.b.a($$3, $$2x, $$3x, $$4.f(), $$4.a(), $$4.c()))
         : a($$2, dyg.S, ($$0x, $$1x, $$2x, $$3x) -> ean.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public ebg a(ddt $$0) {
      return this.m().b(c, $$0.g().g());
   }

   @Override
   public ebg a(ebg $$0, dty $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   public ebg a(ebg $$0, dsh $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
