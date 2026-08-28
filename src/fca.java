import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fca extends fcg {
   public static final MapCodec<fca> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(fat.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, fca::new)
   );
   private final fat.b b;

   public fca(List<fec> $$0, fat.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fci<fca> b() {
      return fcj.B;
   }

   @Override
   public Set<bbk<?>> a() {
      return Set.of(this.b.a());
   }

   @Override
   public dak a(dak $$0, fat $$1) {
      if ($$0.a(dao.vx) && $$1.c(this.b.a()) instanceof csi $$2) {
         $$0.b(kl.ak, new ddk($$2.gi()));
      }

      return $$0;
   }

   public static fcg.a<?> a(fat.b $$0) {
      return a($$1 -> new fca($$1, $$0));
   }
}
