import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esq extends esh {
   public static final MapCodec<esq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kk.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, esq::new)
   );
   private final kk b;

   private esq(List<euf> $$0, kk $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public esj<esq> b() {
      return esk.k;
   }

   @Override
   public cuc a(cuc $$0, equ $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> esh.a<?> a(km<T> $$0, T $$1) {
      return a($$2 -> new esq($$2, kk.a().a($$0, $$1).a()));
   }
}
