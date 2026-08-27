import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dsy(hf<cir> c, dta d) {
   public static final Codec<dsy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aem.a(jd.D).fieldOf("display").forGetter($$0x -> $$0x.c), dta.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, dsy::new)
   );
   public static final Codec<hf<dsy>> b = ael.a(jd.av, a);

   public hf<cir> a() {
      return this.c;
   }

   public dta b() {
      return this.d;
   }
}
