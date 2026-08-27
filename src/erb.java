import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class erb extends eqs {
   public static final MapCodec<erb> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(jy.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, erb::new)
   );
   private final jy b;

   private erb(List<esn> $$0, jy $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public equ b() {
      return eqv.j;
   }

   @Override
   public ctq a(ctq $$0, eph $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> eqs.a<?> a(ka<T> $$0, T $$1) {
      return a($$2 -> new erb($$2, jy.a().a($$0, $$1).a()));
   }
}
