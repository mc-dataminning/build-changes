import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eao implements dzz {
   public static final Codec<eao> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               doz.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               doz.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               bnf.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eao::new)
   );
   public final doz b;
   public final doz c;
   private final bnf d;

   public eao(doz $$0, doz $$1, bnf $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bnf a() {
      return this.d;
   }
}
