import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record arm(cmn b) {
   private static final Codec<arm> c = RecordCodecBuilder.create($$0 -> $$0.group(cmp.f.fieldOf("enabled").forGetter(arm::a)).apply($$0, arm::new));
   public static final ase<arm> a = ase.a("features", c);

   public cmn a() {
      return this.b;
   }
}
