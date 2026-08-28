import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyh extends exv {
   public static final MapCodec<eyh> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(vk.j.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, eyh::new));
   private final um b;

   private eyh(List<ezr> $$0, um $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exx<eyh> b() {
      return exy.j;
   }

   @Override
   public cxg a(cxg $$0, ewi $$1) {
      czp.a(ku.b, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static exv.a<?> a(um $$0) {
      return a($$1 -> new eyh($$1, $$0));
   }
}
