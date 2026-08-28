import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eip implements eia {
   public static final Codec<eip> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dwv.a.fieldOf("target").forGetter($$0x -> $$0x.b),
               dwv.a.fieldOf("state").forGetter($$0x -> $$0x.c),
               brn.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eip::new)
   );
   public final dwv b;
   public final dwv c;
   private final brn d;

   public eip(dwv $$0, dwv $$1, brn $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public brn a() {
      return this.d;
   }
}
