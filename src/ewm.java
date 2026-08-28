import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ewm extends ewa {
   public static final MapCodec<ewm> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(vj.j.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, ewm::new));
   private final ul b;

   private ewm(List<exy> $$0, ul $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ewc<ewm> b() {
      return ewd.j;
   }

   @Override
   public cwm a(cwm $$0, eun $$1) {
      cyv.a(ku.b, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static ewa.a<?> a(ul $$0) {
      return a($$1 -> new ewm($$1, $$0));
   }
}
