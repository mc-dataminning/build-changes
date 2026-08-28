import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class evh extends euy {
   public static final MapCodec<evh> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kp.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, evh::new)
   );
   private final kp b;

   private evh(List<eww> $$0, kp $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eva<evh> b() {
      return evb.k;
   }

   @Override
   public cvs a(cvs $$0, etl $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> euy.a<?> a(kr<T> $$0, T $$1) {
      return a($$2 -> new evh($$2, kp.a().a($$0, $$1).a()));
   }
}
