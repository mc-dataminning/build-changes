import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehi implements egt {
   public static final Codec<ehi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvo.a.fieldOf("target").forGetter($$0x -> $$0x.b),
               dvo.a.fieldOf("state").forGetter($$0x -> $$0x.c),
               brm.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ehi::new)
   );
   public final dvo b;
   public final dvo c;
   private final brm d;

   public ehi(dvo $$0, dvo $$1, brm $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public brm a() {
      return this.d;
   }
}
