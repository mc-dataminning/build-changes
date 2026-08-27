import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eir extends eib {
   public static final Codec<eir> a = RecordCodecBuilder.create($$0 -> a($$0).and(tj.i.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, eir::new));
   private final sl b;

   private eir(List<ejo> $$0, sl $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eid b() {
      return eie.g;
   }

   @Override
   public cmr a(cmr $$0, egp $$1) {
      $$0.w().a(this.b);
      return $$0;
   }

   @Deprecated
   public static eib.a<?> a(sl $$0) {
      return a($$1 -> new eir($$1, $$0));
   }
}
