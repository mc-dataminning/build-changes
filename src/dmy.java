import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmy extends djg implements dew {
   public static final MapCodec<dmy> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cst.q.fieldOf("color").forGetter(dmy::b), u()).apply($$0, dmy::new));
   private final cst k;

   @Override
   public MapCodec<dmy> a() {
      return j;
   }

   public dmy(cst $$0, dsg.d $$1) {
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
   public cst b() {
      return this.k;
   }
}
