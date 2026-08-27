import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dpx extends dqb {
   private final il<eej> e;
   public static final Codec<dpx> a = RecordCodecBuilder.create($$0 -> a($$0).and(iv.a(ke.y).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dpx::new));

   public dpx(jb $$0, il<eej> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dja $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public dpr<?> a() {
      return dpr.c;
   }
}
