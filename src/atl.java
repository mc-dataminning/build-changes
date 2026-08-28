import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record atl(cut b) {
   private static final Codec<atl> c = RecordCodecBuilder.create($$0 -> $$0.group(cuv.f.fieldOf("enabled").forGetter(atl::a)).apply($$0, atl::new));
   public static final auc<atl> a = new auc<>("features", c);

   public cut a() {
      return this.b;
   }
}
