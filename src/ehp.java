import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehp implements eha {
   public static final Codec<ehp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvv.a.fieldOf("target").forGetter($$0x -> $$0x.b),
               dvv.a.fieldOf("state").forGetter($$0x -> $$0x.c),
               brp.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ehp::new)
   );
   public final dvv b;
   public final dvv c;
   private final brp d;

   public ehp(dvv $$0, dvv $$1, brp $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public brp a() {
      return this.d;
   }
}
