import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyz extends eyb {
   public static final MapCodec<eyz> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(czc.a.fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, eyz::new));
   private final jr<czc> b;

   private eyz(List<ezx> $$0, jr<czc> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eyd<eyz> b() {
      return eye.F;
   }

   @Override
   public cxh a(cxh $$0, ewo $$1) {
      $$0.a(kv.R, cze.a, this.b, cze::b);
      return $$0;
   }

   public static eyb.a<?> a(jr<czc> $$0) {
      return a($$1 -> new eyz($$1, $$0));
   }
}
