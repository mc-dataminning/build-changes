import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dlx extends dmb {
   private final hi<eac> e;
   public static final Codec<dlx> a = RecordCodecBuilder.create($$0 -> a($$0).and(ht.a(jc.w).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dlx::new));

   public dlx(hz $$0, hi<eac> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dfa $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public dlr<?> a() {
      return dlr.c;
   }
}
