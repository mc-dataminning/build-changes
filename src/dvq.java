import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvq extends dwp implements dnf {
   public static final MapCodec<dvq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(czi.q.fieldOf("color").forGetter(dvq::b), t()).apply($$0, dvq::new));
   private final czi c;

   @Override
   public MapCodec<dvq> a() {
      return a;
   }

   public dvq(czi $$0, ebp.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public czi b() {
      return this.c;
   }
}
