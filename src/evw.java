import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class evw extends euy {
   public static final MapCodec<evw> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(cxp.a.fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, evw::new));
   private final jo<cxp> b;

   private evw(List<eww> $$0, jo<cxp> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eva<evw> b() {
      return evb.F;
   }

   @Override
   public cvs a(cvs $$0, etl $$1) {
      $$0.a(ks.L, cxr.a, this.b, cxr::b);
      return $$0;
   }

   public static euy.a<?> a(jo<cxp> $$0) {
      return a($$1 -> new evw($$1, $$0));
   }
}
