import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eis extends eih {
   public static final Codec<eis> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(asv.b(ke.D).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, eis::new)
   );
   private final asv<cmp> b;

   private eis(List<eju> $$0, asv<cmp> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eij b() {
      return eik.A;
   }

   @Override
   public cmx a(cmx $$0, egv $$1) {
      cmq.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static eih.a<?> a(asv<cmp> $$0) {
      return a($$1 -> new eis($$1, $$0));
   }
}
