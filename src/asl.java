import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record asl(cpj b) {
   private static final Codec<asl> c = RecordCodecBuilder.create($$0 -> $$0.group(cpl.e.fieldOf("enabled").forGetter(asl::a)).apply($$0, asl::new));
   public static final atd<asl> a = atd.a("features", c);

   public cpj a() {
      return this.b;
   }
}
