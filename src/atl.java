import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record atl(cuw b) {
   private static final Codec<atl> c = RecordCodecBuilder.create($$0 -> $$0.group(cuy.f.fieldOf("enabled").forGetter(atl::a)).apply($$0, atl::new));
   public static final auc<atl> a = new auc<>("features", c);

   public cuw a() {
      return this.b;
   }
}
