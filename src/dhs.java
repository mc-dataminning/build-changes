import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhs extends dea implements czr {
   public static final MapCodec<dhs> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cpb.q.fieldOf("color").forGetter(dhs::b), u()).apply($$0, dhs::new));
   private final cpb k;

   @Override
   public MapCodec<dhs> a() {
      return j;
   }

   public dhs(cpb $$0, dmy.d $$1) {
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
   public cpb b() {
      return this.k;
   }
}
