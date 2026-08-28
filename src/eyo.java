import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyo extends eyc {
   public static final MapCodec<eyo> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(vv.j.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, eyo::new));
   private final ux b;

   private eyo(List<ezy> $$0, ux $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eye<eyo> b() {
      return eyf.j;
   }

   @Override
   public cxp a(cxp $$0, ewp $$1) {
      czy.a(ku.b, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static eyc.a<?> a(ux $$0) {
      return a($$1 -> new eyo($$1, $$0));
   }
}
