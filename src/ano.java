import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ano(cfv b) {
   private static final Codec<ano> c = RecordCodecBuilder.create($$0 -> $$0.group(cfx.f.fieldOf("enabled").forGetter(ano::a)).apply($$0, ano::new));
   public static final aoe<ano> a = aoe.a("features", c);

   public cfv a() {
      return this.b;
   }
}
