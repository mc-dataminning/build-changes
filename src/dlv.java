import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dlv extends dlz {
   private final hj<eaa> e;
   public static final Codec<dlv> a = RecordCodecBuilder.create($$0 -> a($$0).and(hu.a(jd.w).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dlv::new));

   public dlv(ia $$0, hj<eaa> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dey $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public dlp<?> a() {
      return dlp.c;
   }
}
