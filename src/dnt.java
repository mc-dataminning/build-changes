import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnt extends duf {
   public static final MapCodec<dnt> a = b(dnt::new);
   public static final ece<jc> b = ebw.T;

   @Override
   public MapCodec<dnt> a() {
      return a;
   }

   public dnt(ebf.d $$0) {
      super($$0);
      this.l(this.m().b(b, jc.c));
   }

   @Nullable
   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dyk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dye> dyf<T> a(djz $$0, ebg $$1, dyg<T> $$2) {
      return !$$0.C ? a($$2, dyg.K, ($$0x, $$1x, $$2x, $$3) -> egp.c.a($$0x, $$3.x(), $$3.gu())) : null;
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      return super.a($$0).b(b, $$0.g());
   }

   @Override
   public int a(ebg $$0, djd $$1, iw $$2, jc $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public ebg a(ebg $$0, dty $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public ebg a(ebg $$0, dsh $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
