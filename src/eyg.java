import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyg extends exu {
   public static final MapCodec<eyg> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(vv.j.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, eyg::new));
   private final ux b;

   private eyg(List<ezs> $$0, ux $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exw<eyg> b() {
      return exx.j;
   }

   @Override
   public cxk a(cxk $$0, ewh $$1) {
      czt.a(ku.b, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static exu.a<?> a(ux $$0) {
      return a($$1 -> new eyg($$1, $$0));
   }
}
