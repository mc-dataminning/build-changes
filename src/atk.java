import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record atk(crq b) {
   private static final Codec<atk> c = RecordCodecBuilder.create($$0 -> $$0.group(crs.f.fieldOf("enabled").forGetter(atk::a)).apply($$0, atk::new));
   public static final auc<atk> a = auc.a("features", c);

   public crq a() {
      return this.b;
   }
}
