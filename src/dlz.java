import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dlz extends dme {
   private final hi<ctc> e;
   public static final Codec<dlz> a = RecordCodecBuilder.create($$0 -> a($$0).and(hs.a(jc.e).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dlz::new));

   public dlz(hy $$0, hi<ctc> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dfd $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dlu<?> a() {
      return dlu.a;
   }
}
