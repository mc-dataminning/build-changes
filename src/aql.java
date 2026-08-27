import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record aql(cjs b) {
   private static final Codec<aql> c = RecordCodecBuilder.create($$0 -> $$0.group(cju.f.fieldOf("enabled").forGetter(aql::a)).apply($$0, aql::new));
   public static final arb<aql> a = arb.a("features", c);

   public cjs a() {
      return this.b;
   }
}
