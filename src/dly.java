import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dly extends dme {
   final aqk<ctc> a;
   public static final Codec<dly> e = RecordCodecBuilder.create($$0 -> a($$0).and(aqk.a(jc.e).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dly::new));

   protected dly(hy $$0, aqk<ctc> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dfd $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dlu<?> a() {
      return dlu.b;
   }
}
