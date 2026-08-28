import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ats(csk b) {
   private static final Codec<ats> c = RecordCodecBuilder.create($$0 -> $$0.group(csm.f.fieldOf("enabled").forGetter(ats::a)).apply($$0, ats::new));
   public static final auk<ats> a = auk.a("features", c);

   public csk a() {
      return this.b;
   }
}
