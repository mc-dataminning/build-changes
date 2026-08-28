import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fdd extends fcg {
   static final MapCodec<fdd> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(fez.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, fdd::new));
   private final fey b;

   private fdd(List<fec> $$0, fey $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<bbk<?>> a() {
      return this.b.a();
   }

   @Override
   public fci<fdd> b() {
      return fcj.Q;
   }

   @Override
   public dak a(dak $$0, fat $$1) {
      int $$2 = azz.a(this.b.a($$1), 0, 4);
      $$0.b(kl.ad, new ddi($$2));
      return $$0;
   }

   public fey c() {
      return this.b;
   }

   public static fcg.a<?> a(fey $$0) {
      return a($$1 -> new fdd($$1, $$0));
   }
}
