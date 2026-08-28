import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eet implements eee {
   public static final Codec<eet> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dta.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               dta.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               bpv.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eet::new)
   );
   public final dta b;
   public final dta c;
   private final bpv d;

   public eet(dta $$0, dta $$1, bpv $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bpv a() {
      return this.d;
   }
}
