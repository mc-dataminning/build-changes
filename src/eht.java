import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eht(ja<cuc> c, ehv d) {
   public static final Codec<eht> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akq.a(li.G).fieldOf("display").forGetter($$0x -> $$0x.c), ehv.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, eht::new)
   );
   public static final Codec<ja<eht>> b = akp.a(li.aF, a);

   public ja<cuc> a() {
      return this.c;
   }

   public ehv b() {
      return this.d;
   }
}
