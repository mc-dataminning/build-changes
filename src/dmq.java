import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmq extends diy implements deo {
   public static final MapCodec<dmq> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ctg.q.fieldOf("color").forGetter(dmq::b), u()).apply($$0, dmq::new));
   private final ctg k;

   @Override
   public MapCodec<dmq> a() {
      return j;
   }

   public dmq(ctg $$0, drz.d $$1) {
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
