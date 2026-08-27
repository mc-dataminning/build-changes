import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dto {
   public static final Codec<dto> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dyk.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, dto::new)
   );
   public final ih<dyk> b;
   public final float c;

   public dto(ih<dyk> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(cuk $$0, dle $$1, auv $$2, hx $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
