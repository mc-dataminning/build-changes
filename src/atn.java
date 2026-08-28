import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record atn(cvh b) {
   private static final Codec<atn> c = RecordCodecBuilder.create($$0 -> $$0.group(cvj.f.fieldOf("enabled").forGetter(atn::a)).apply($$0, atn::new));
   public static final aue<atn> a = new aue<>("features", c);

   public cvh a() {
      return this.b;
   }
}
