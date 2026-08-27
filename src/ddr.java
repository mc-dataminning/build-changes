import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ddr extends czz implements cvq {
   public static final MapCodec<ddr> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ckv.q.fieldOf("color").forGetter(ddr::b), u()).apply($$0, ddr::new));
   private final ckv k;

   @Override
   public MapCodec<ddr> a() {
      return j;
   }

   public ddr(ckv $$0, dio.d $$1) {
      super($$1);
      this.k = $$0;
      this.k(
         this.E
            .b()
            .a(a, Boolean.valueOf(false))
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
      );
   }

   @Override
   public ckv b() {
      return this.k;
   }
}
