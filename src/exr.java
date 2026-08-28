import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class exr extends exf {
   public static final MapCodec<exr> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(uo.j.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, exr::new));
   private final tq b;

   private exr(List<ezb> $$0, tq $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exh<exr> b() {
      return exi.j;
   }

   @Override
   public cwq a(cwq $$0, evs $$1) {
      cyz.a(kv.b, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static exf.a<?> a(tq $$0) {
      return a($$1 -> new exr($$1, $$0));
   }
}
