import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esc extends erp {
   public static final MapCodec<esc> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(vp.j.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, esc::new));
   private final ur b;

   private esc(List<etn> $$0, ur $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public err<esc> b() {
      return ers.j;
   }

   @Override
   public cuk a(cuk $$0, eqd $$1) {
      cwz.a(km.a, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static erp.a<?> a(ur $$0) {
      return a($$1 -> new esc($$1, $$0));
   }
}
