import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dlu extends dlz {
   private final hj<csk> e;
   public static final Codec<dlu> a = RecordCodecBuilder.create($$0 -> a($$0).and(hu.a(jd.e).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dlu::new));

   public dlu(ia $$0, hj<csk> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dey $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dlp<?> a() {
      return dlp.a;
   }
}
