import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsl extends djh {
   public static final MapCodec<dsl> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvj.q.fieldOf("color").forGetter(dsl::b), t()).apply($$0, dsl::new));
   private final cvj d;

   @Override
   public MapCodec<dsl> a() {
      return c;
   }

   protected dsl(cvj $$0, dvu.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public cvj b() {
      return this.d;
   }
}
