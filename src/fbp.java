import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fbp extends fbg {
   public static final MapCodec<fbp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ki.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, fbp::new)
   );
   private final ki b;

   private fbp(List<fdc> $$0, ki $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fbi<fbp> b() {
      return fbj.k;
   }

   @Override
   public czn a(czn $$0, ezt $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> fbg.a<?> a(kj<T> $$0, T $$1) {
      return a($$2 -> new fbp($$2, ki.a().a($$0, $$1).a()));
   }
}
