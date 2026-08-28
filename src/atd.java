import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record atd(cqq b) {
   private static final Codec<atd> c = RecordCodecBuilder.create($$0 -> $$0.group(cqs.g.fieldOf("enabled").forGetter(atd::a)).apply($$0, atd::new));
   public static final atv<atd> a = atv.a("features", c);

   public cqq a() {
      return this.b;
   }
}
