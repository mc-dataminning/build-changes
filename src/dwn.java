import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dwn extends dws {
   private final ir<dch> e;
   public static final Codec<dwn> a = RecordCodecBuilder.create($$0 -> a($$0).and(jc.a(ku.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dwn::new));

   public dwn(ji $$0, ir<dch> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dpi $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dwi<?> a() {
      return dwi.a;
   }
}
