import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eeh(iv<cry> c, eej d) {
   public static final Codec<eeh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akc.a(ld.G).fieldOf("display").forGetter($$0x -> $$0x.c), eej.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, eeh::new)
   );
   public static final Codec<iv<eeh>> b = akb.a(ld.aE, a);

   public iv<cry> a() {
      return this.c;
   }

   public eej b() {
      return this.d;
   }
}
