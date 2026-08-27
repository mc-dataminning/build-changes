import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etq extends eta {
   public static final Codec<etq> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(awt.b(li.E).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, etq::new)
   );
   private final awt<ctz> b;

   private etq(List<euu> $$0, awt<ctz> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public etc b() {
      return etd.D;
   }

   @Override
   public cuh a(cuh $$0, erp $$1) {
      cua.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static eta.a<?> a(awt<ctz> $$0) {
      return a($$1 -> new etq($$1, $$0));
   }
}
