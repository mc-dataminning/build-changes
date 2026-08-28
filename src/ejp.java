import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejp implements ejv {
   public static final Codec<ejp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bsv.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bsv.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, ejp::new)
   );
   private final bsv b;
   private final bsv c;

   public ejp(bsv $$0, bsv $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bsv a() {
      return this.b;
   }

   public bsv b() {
      return this.c;
   }
}
