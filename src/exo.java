import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class exo extends exc {
   public static final MapCodec<exo> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(uo.j.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, exo::new));
   private final tq b;

   private exo(List<eyy> $$0, tq $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exe<exo> b() {
      return exf.j;
   }

   @Override
   public cwn a(cwn $$0, evp $$1) {
      cyw.a(kv.b, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static exc.a<?> a(tq $$0) {
      return a($$1 -> new exo($$1, $$0));
   }
}
