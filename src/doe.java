import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class doe extends doj {
   private final ig<cva> e;
   public static final Codec<doe> a = RecordCodecBuilder.create($$0 -> a($$0).and(iq.a(jz.e).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, doe::new));

   public doe(iw $$0, ig<cva> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dhi $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dnz<?> a() {
      return dnz.a;
   }
}
