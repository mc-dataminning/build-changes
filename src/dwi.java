import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dwi extends dmq {
   public static final MapCodec<dwi> a = b(dwi::new);
   public static final ece<eal> b = ebw.bB;
   public static final ebx c = ebw.bE;

   @Override
   public MapCodec<dwi> a() {
      return a;
   }

   public dwi(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, eal.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b, c);
   }

   @Nullable
   @Override
   public dye a(iw $$0, ebg $$1) {
      return new eae($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dye> dyf<T> a(djz $$0, ebg $$1, dyg<T> $$2) {
      return $$0 instanceof aru $$3
         ? a($$2, dyg.R, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(ebw.bE).orElse(false)))
         : a($$2, dyg.R, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(ebw.bE).orElse(false)));
   }
}
