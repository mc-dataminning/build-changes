import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwm extends dws {
   final avt<dch> a;
   public static final Codec<dwm> e = RecordCodecBuilder.create($$0 -> a($$0).and(avt.a(ku.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dwm::new));

   protected dwm(ji $$0, avt<dch> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dpi $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dwi<?> a() {
      return dwi.b;
   }
}
