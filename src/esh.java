import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esh extends erp {
   public static final MapCodec<esh> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axb.b(lq.E).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, esh::new)
   );
   private final axb<cuc> b;

   private esh(List<etn> $$0, axb<cuc> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public err<esh> b() {
      return ers.G;
   }

   @Override
   public cuk a(cuk $$0, eqd $$1) {
      cud.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static erp.a<?> a(axb<cuc> $$0) {
      return a($$1 -> new esh($$1, $$0));
   }
}
