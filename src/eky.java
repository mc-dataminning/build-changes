import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eky extends ekh {
   public static final Codec<eky> a = RecordCodecBuilder.create($$0 -> a($$0).and(kf.i.r().fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, eky::new));
   private final ij<cqv> b;

   private eky(List<elu> $$0, ij<cqv> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ekj b() {
      return ekk.z;
   }

   @Override
   public coz a(coz $$0, eiv $$1) {
      cqx.a($$0, this.b);
      return $$0;
   }

   public static ekh.a<?> a(ij<cqv> $$0) {
      return a($$1 -> new eky($$1, $$0));
   }
}
