import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyz extends eyb {
   public static final MapCodec<eyz> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(czl.a.fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, eyz::new));
   private final jq<czl> b;

   private eyz(List<ezx> $$0, jq<czl> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eyd<eyz> b() {
      return eye.F;
   }

   @Override
   public cxo a(cxo $$0, ewo $$1) {
      $$0.a(ku.Q, czn.a, this.b, czn::b);
      return $$0;
   }

   public static eyb.a<?> a(jq<czl> $$0) {
      return a($$1 -> new eyz($$1, $$0));
   }
}
