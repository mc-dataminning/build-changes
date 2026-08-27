import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dwo extends dws {
   private final ir<ela> e;
   public static final Codec<dwo> a = RecordCodecBuilder.create($$0 -> a($$0).and(jc.a(ku.z).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dwo::new));

   public dwo(ji $$0, ir<ela> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dpi $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public dwi<?> a() {
      return dwi.c;
   }
}
