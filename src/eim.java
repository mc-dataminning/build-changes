import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eim extends eib {
   public static final Codec<eim> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(asq.b(ke.D).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, eim::new)
   );
   private final asq<cmj> b;

   private eim(List<ejo> $$0, asq<cmj> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eid b() {
      return eie.A;
   }

   @Override
   public cmr a(cmr $$0, egp $$1) {
      cmk.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static eib.a<?> a(asq<cmj> $$0) {
      return a($$1 -> new eim($$1, $$0));
   }
}
