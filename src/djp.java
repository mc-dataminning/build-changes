import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djp extends dkj implements dbp {
   public static final MapCodec<djp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cqc.q.fieldOf("color").forGetter(djp::b), u()).apply($$0, djp::new));
   private final cqc c;

   @Override
   public MapCodec<djp> a() {
      return a;
   }

   public djp(cqc $$0, doy.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cqc b() {
      return this.c;
   }
}
