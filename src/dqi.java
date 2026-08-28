import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqi extends drc implements dih {
   public static final MapCodec<dqi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvj.q.fieldOf("color").forGetter(dqi::b), t()).apply($$0, dqi::new));
   private final cvj c;

   @Override
   public MapCodec<dqi> a() {
      return a;
   }

   public dqi(cvj $$0, dvu.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cvj b() {
      return this.c;
   }
}
