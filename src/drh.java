import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drh implements dqs {
   public static final Codec<drh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dgb.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               dgb.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               bhg.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, drh::new)
   );
   public final dgb b;
   public final dgb c;
   private final bhg d;

   public drh(dgb $$0, dgb $$1, bhg $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bhg a() {
      return this.d;
   }
}
