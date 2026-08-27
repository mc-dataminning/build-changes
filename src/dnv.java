import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnv extends der {
   public static final MapCodec<dnv> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(csj.q.fieldOf("color").forGetter(dnv::b), u()).apply($$0, dnv::new));
   private final csj d;

   @Override
   public MapCodec<dnv> a() {
      return c;
   }

   protected dnv(csj $$0, drc.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public csj b() {
      return this.d;
   }
}
