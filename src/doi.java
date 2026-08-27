import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doi extends doo {
   final arz<cvf> a;
   public static final Codec<doi> e = RecordCodecBuilder.create($$0 -> a($$0).and(arz.a(kd.e).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, doi::new));

   protected doi(ja $$0, arz<cvf> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dhn $$0) {
      return $$0.a(this.a);
   }

   @Override
   public doe<?> a() {
      return doe.b;
   }
}
