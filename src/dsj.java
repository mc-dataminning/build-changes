import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dsj extends dsn {
   private final in<egv> e;
   public static final Codec<dsj> a = RecordCodecBuilder.create($$0 -> a($$0).and(ix.a(kg.y).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dsj::new));

   public dsj(jd $$0, in<egv> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dlj $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public dsd<?> a() {
      return dsd.c;
   }
}
