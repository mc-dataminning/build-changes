import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drl extends dnq implements dje {
   public static final MapCodec<drl> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvn.q.fieldOf("color").forGetter(drl::b), t()).apply($$0, drl::new));
   private final cvn k;

   @Override
   public MapCodec<drl> a() {
      return j;
   }

   public drl(cvn $$0, dwx.d $$1) {
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
   public cvn b() {
      return this.k;
   }
}
