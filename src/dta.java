import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dta(he<cit> c, dtc d) {
   public static final Codec<dta> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aeo.a(jc.D).fieldOf("display").forGetter($$0x -> $$0x.c), dtc.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, dta::new)
   );
   public static final Codec<he<dta>> b = aen.a(jc.av, a);

   public he<cit> a() {
      return this.c;
   }

   public dtc b() {
      return this.d;
   }
}
