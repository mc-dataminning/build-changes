import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fbk extends fbb {
   public static final MapCodec<fbk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ki.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, fbk::new)
   );
   private final ki b;

   private fbk(List<fcx> $$0, ki $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fbd<fbk> b() {
      return fbe.k;
   }

   @Override
   public czk a(czk $$0, ezo $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> fbb.a<?> a(kj<T> $$0, T $$1) {
      return a($$2 -> new fbk($$2, ki.a().a($$0, $$1).a()));
   }
}
