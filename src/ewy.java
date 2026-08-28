import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ewy extends ewa {
   public static final MapCodec<ewy> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(cyj.a.fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, ewy::new));
   private final jq<cyj> b;

   private ewy(List<exy> $$0, jq<cyj> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ewc<ewy> b() {
      return ewd.F;
   }

   @Override
   public cwm a(cwm $$0, eun $$1) {
      $$0.a(ku.Q, cyl.a, this.b, cyl::b);
      return $$0;
   }

   public static ewa.a<?> a(jq<cyj> $$0) {
      return a($$1 -> new ewy($$1, $$0));
   }
}
