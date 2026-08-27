import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esy extends eta {
   public static final Codec<esy> a = RecordCodecBuilder.create($$0 -> a($$0).and(ero.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, esy::new));
   private final ero b;

   private esy(List<euu> $$0, ero $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public etc b() {
      return etd.t;
   }

   @Override
   public Set<eud<?>> a() {
      return this.b.a();
   }

   @Override
   public cuh a(cuh $$0, erp $$1) {
      int $$2 = this.b.a($$1, $$0.G());
      $$0.e($$2);
      return $$0;
   }

   public static eta.a<?> a(ero $$0) {
      return a($$1 -> new esy($$1, $$0));
   }
}
