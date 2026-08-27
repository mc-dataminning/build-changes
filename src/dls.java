import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dls implements dlo {
   public static final Codec<dls> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ia.v(16).optionalFieldOf("offset", gv.b).forGetter($$0x -> $$0x.e)).apply($$0, dls::new)
   );
   private final ia e;

   public dls(ia $$0) {
      this.e = $$0;
   }

   public boolean a(cqe $$0, gv $$1) {
      return !$$0.r($$1.a(this.e));
   }

   @Override
   public dlp<?> a() {
      return dlp.h;
   }
}
