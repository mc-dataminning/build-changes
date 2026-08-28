import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drj extends dno implements djc {
   public static final MapCodec<drj> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvl.q.fieldOf("color").forGetter(drj::b), t()).apply($$0, drj::new));
   private final cvl k;

   @Override
   public MapCodec<drj> a() {
      return j;
   }

   public drj(cvl $$0, dwv.d $$1) {
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
   public cvl b() {
      return this.k;
   }
}
