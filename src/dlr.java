import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlr extends dhz implements ddp {
   public static final MapCodec<dlr> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(csh.q.fieldOf("color").forGetter(dlr::b), u()).apply($$0, dlr::new));
   private final csh k;

   @Override
   public MapCodec<dlr> a() {
      return j;
   }

   public dlr(csh $$0, dra.d $$1) {
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
   public csh b() {
      return this.k;
   }
}
