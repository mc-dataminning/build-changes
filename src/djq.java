import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djq extends dfy implements dbp {
   public static final MapCodec<djq> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cqc.q.fieldOf("color").forGetter(djq::b), u()).apply($$0, djq::new));
   private final cqc k;

   @Override
   public MapCodec<djq> a() {
      return j;
   }

   public djq(cqc $$0, doy.d $$1) {
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
   public cqc b() {
      return this.k;
   }
}
