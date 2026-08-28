import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnq extends djx implements dfn {
   public static final MapCodec<dnq> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ctg.q.fieldOf("color").forGetter(dnq::b), u()).apply($$0, dnq::new));
   private final ctg k;

   @Override
   public MapCodec<dnq> a() {
      return j;
   }

   public dnq(ctg $$0, dsz.d $$1) {
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
   public ctg b() {
      return this.k;
   }
}
