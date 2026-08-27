import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etm extends eta {
   public static final Codec<etm> a = RecordCodecBuilder.create($$0 -> a($$0).and(vi.i.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, etm::new));
   private final uk b;

   private etm(List<euu> $$0, uk $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public etc b() {
      return etd.i;
   }

   @Override
   public cuh a(cuh $$0, erp $$1) {
      cxf.a(ke.a, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static eta.a<?> a(uk $$0) {
      return a($$1 -> new etm($$1, $$0));
   }
}
