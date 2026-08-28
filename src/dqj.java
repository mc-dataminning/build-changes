import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqj extends dmq implements dih {
   public static final MapCodec<dqj> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvj.q.fieldOf("color").forGetter(dqj::b), t()).apply($$0, dqj::new));
   private final cvj k;

   @Override
   public MapCodec<dqj> a() {
      return j;
   }

   public dqj(cvj $$0, dvu.d $$1) {
      super($$1);
      this.k = $$0;
      this.l(
         this.F
            .b()
            .b(a, Boolean.valueOf(false))
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
      );
   }

   @Override
   public cvj b() {
      return this.k;
   }
}
