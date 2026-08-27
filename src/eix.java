import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eix extends eih {
   public static final Codec<eix> a = RecordCodecBuilder.create($$0 -> a($$0).and(tl.i.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, eix::new));
   private final sn b;

   private eix(List<eju> $$0, sn $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eij b() {
      return eik.g;
   }

   @Override
   public cmx a(cmx $$0, egv $$1) {
      $$0.w().a(this.b);
      return $$0;
   }

   @Deprecated
   public static eih.a<?> a(sn $$0) {
      return a($$1 -> new eix($$1, $$0));
   }
}
