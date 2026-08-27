import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eiy extends eih {
   public static final Codec<eiy> a = RecordCodecBuilder.create($$0 -> a($$0).and(kd.i.r().fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, eiy::new));
   private final ih<cov> b;

   private eiy(List<eju> $$0, ih<cov> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eij b() {
      return eik.z;
   }

   @Override
   public cmx a(cmx $$0, egv $$1) {
      cox.a($$0, this.b.a());
      return $$0;
   }

   public static eih.a<?> a(cov $$0) {
      return a($$1 -> new eiy($$1, $$0.c()));
   }
}
