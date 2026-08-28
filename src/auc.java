import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record auc(cso b) {
   private static final Codec<auc> c = RecordCodecBuilder.create($$0 -> $$0.group(csq.g.fieldOf("enabled").forGetter(auc::a)).apply($$0, auc::new));
   public static final auu<auc> a = auu.a("features", c);

   public cso a() {
      return this.b;
   }
}
