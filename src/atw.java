import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record atw(cvs b) {
   private static final Codec<atw> c = RecordCodecBuilder.create($$0 -> $$0.group(cvu.f.fieldOf("enabled").forGetter(atw::a)).apply($$0, atw::new));
   public static final aun<atw> a = new aun<>("features", c);

   public cvs a() {
      return this.b;
   }
}
