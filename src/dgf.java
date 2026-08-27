import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgf extends dgz implements cyf {
   public static final MapCodec<dgf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cnn.q.fieldOf("color").forGetter(dgf::b), u()).apply($$0, dgf::new));
   private final cnn c;

   @Override
   public MapCodec<dgf> a() {
      return a;
   }

   public dgf(cnn $$0, dle.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cnn b() {
      return this.c;
   }
}
