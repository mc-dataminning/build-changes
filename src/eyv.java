import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyv extends eyb {
   public static final MapCodec<eyv> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(cxk.e.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, eyv::new));
   private final jq<cxk> b;

   private eyv(List<ezx> $$0, jq<cxk> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eyd<eyv> b() {
      return eye.f;
   }

   @Override
   public cxo a(cxo $$0, ewo $$1) {
      return $$0.a(this.b.a());
   }
}
