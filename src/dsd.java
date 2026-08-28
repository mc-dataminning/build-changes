import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsd extends doi implements djv {
   public static final MapCodec<dsd> h = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwe.q.fieldOf("color").forGetter(dsd::b), t()).apply($$0, dsd::new));
   private final cwe i;

   @Override
   public MapCodec<dsd> a() {
      return h;
   }

   public dsd(cwe $$0, dxp.d $$1) {
      super($$1);
      this.i = $$0;
      this.l(
         this.B
            .b()
            .b(a, Boolean.valueOf(false))
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
      );
   }

   @Override
   public cwe b() {
      return this.i;
   }
}
