import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlu extends dma {
   final aqa<csl> a;
   public static final Codec<dlu> e = RecordCodecBuilder.create($$0 -> a($$0).and(aqa.a(jc.e).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dlu::new));

   protected dlu(hz $$0, aqa<csl> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dez $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dlq<?> a() {
      return dlq.b;
   }
}
