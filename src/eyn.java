import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyn extends eyb {
   public static final MapCodec<eyn> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(vv.j.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, eyn::new));
   private final ux b;

   private eyn(List<ezx> $$0, ux $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eyd<eyn> b() {
      return eye.j;
   }

   @Override
   public cxo a(cxo $$0, ewo $$1) {
      czx.a(ku.b, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static eyb.a<?> a(ux $$0) {
      return a($$1 -> new eyn($$1, $$0));
   }
}
