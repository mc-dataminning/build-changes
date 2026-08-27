import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dkx extends dhf implements dcv {
   public static final MapCodec<dkx> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(crs.q.fieldOf("color").forGetter(dkx::b), u()).apply($$0, dkx::new));
   private final crs k;

   @Override
   public MapCodec<dkx> a() {
      return j;
   }

   public dkx(crs $$0, dqg.d $$1) {
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
   public crs b() {
      return this.k;
   }
}
