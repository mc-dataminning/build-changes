import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvr extends dru implements dnf {
   public static final MapCodec<dvr> h = RecordCodecBuilder.mapCodec($$0 -> $$0.group(czi.q.fieldOf("color").forGetter(dvr::b), t()).apply($$0, dvr::new));
   private final czi i;

   @Override
   public MapCodec<dvr> a() {
      return h;
   }

   public dvr(czi $$0, ebp.d $$1) {
      super($$1);
      this.i = $$0;
      this.l(
         this.C
            .b()
            .b(a, Boolean.valueOf(false))
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
      );
   }

   @Override
   public czi b() {
      return this.i;
   }
}
