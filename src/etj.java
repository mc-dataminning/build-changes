import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etj extends eta {
   public static final Codec<etj> a = RecordCodecBuilder.create($$0 -> a($$0).and(kb.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, etj::new));
   private final kb b;

   private etj(List<euu> $$0, kb $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public etc b() {
      return etd.j;
   }

   @Override
   public cuh a(cuh $$0, erp $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> eta.a<?> a(kd<T> $$0, T $$1) {
      return a($$2 -> new etj($$2, kb.a().a($$0, $$1).a()));
   }
}
