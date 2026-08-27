import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record amg(cee b) {
   private static final Codec<amg> c = RecordCodecBuilder.create($$0 -> $$0.group(ceg.e.fieldOf("enabled").forGetter(amg::a)).apply($$0, amg::new));
   public static final amw<amg> a = amw.a("features", c);

   public cee a() {
      return this.b;
   }
}
