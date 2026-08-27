import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmq extends ddm {
   public static final MapCodec<dmq> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cqw.q.fieldOf("color").forGetter(dmq::b), u()).apply($$0, dmq::new));
   private final cqw d;

   @Override
   public MapCodec<dmq> a() {
      return c;
   }

   protected dmq(cqw $$0, dpx.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public cqw b() {
      return this.d;
   }
}
