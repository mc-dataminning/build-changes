import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fcd extends fbu {
   public static final MapCodec<fcd> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ki.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, fcd::new)
   );
   private final ki b;

   private fcd(List<fdq> $$0, ki $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fbw<fcd> b() {
      return fbx.k;
   }

   @Override
   public czy a(czy $$0, fah $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> fbu.a<?> a(kj<T> $$0, T $$1) {
      return a($$2 -> new fcd($$2, ki.a().a($$0, $$1).a()));
   }
}
