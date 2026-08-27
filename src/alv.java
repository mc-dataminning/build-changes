import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record alv(cdt b) {
   private static final Codec<alv> c = RecordCodecBuilder.create($$0 -> $$0.group(cdv.e.fieldOf("enabled").forGetter(alv::a)).apply($$0, alv::new));
   public static final aml<alv> a = aml.a("features", c);

   public cdt a() {
      return this.b;
   }
}
