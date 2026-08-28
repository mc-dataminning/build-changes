import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ete extends esh {
   static final MapCodec<ete> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(evc.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, ete::new));
   private final evb b;

   private ete(List<euf> $$0, evb $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<etn<?>> a() {
      return this.b.a();
   }

   @Override
   public esj<ete> b() {
      return esk.Q;
   }

   @Override
   public cuc a(cuc $$0, equ $$1) {
      int $$2 = ayg.a(this.b.a($$1), 0, 4);
      $$0.b(kn.Q, Integer.valueOf($$2));
      return $$0;
   }

   public evb c() {
      return this.b;
   }

   public static esh.a<?> a(evb $$0) {
      return a($$1 -> new ete($$1, $$0));
   }
}
