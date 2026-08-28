import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emm implements elx {
   public static final Codec<emm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eao.a.fieldOf("target").forGetter($$0x -> $$0x.b),
               eao.a.fieldOf("state").forGetter($$0x -> $$0x.c),
               btl.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, emm::new)
   );
   public final eao b;
   public final eao c;
   private final btl d;

   public emm(eao $$0, eao $$1, btl $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public btl a() {
      return this.d;
   }
}
