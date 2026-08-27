import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dpw extends dqb {
   private final il<cwj> e;
   public static final Codec<dpw> a = RecordCodecBuilder.create($$0 -> a($$0).and(iv.a(ke.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dpw::new));

   public dpw(jb $$0, il<cwj> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dja $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dpr<?> a() {
      return dpr.a;
   }
}
