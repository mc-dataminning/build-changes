import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class deq extends day implements cwp {
   public static final MapCodec<deq> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(clv.q.fieldOf("color").forGetter(deq::b), u()).apply($$0, deq::new));
   private final clv k;

   @Override
   public MapCodec<deq> a() {
      return j;
   }

   public deq(clv $$0, djo.d $$1) {
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
   public clv b() {
      return this.k;
   }
}
