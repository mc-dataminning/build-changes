import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ejs(elb b) implements eja {
   public static final Codec<ejs> a = RecordCodecBuilder.create($$0 -> $$0.group(elb.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, ejs::new));

   public elb a() {
      return this.b;
   }
}
