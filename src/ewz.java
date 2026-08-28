import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ewz extends exf {
   public static final MapCodec<ewz> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(evs.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, ewz::new)
   );
   private final evs.b b;

   public ewz(List<ezb> $$0, evs.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exh<ewz> b() {
      return exi.B;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(this.b.a());
   }

   @Override
   public cwq a(cwq $$0, evs $$1) {
      if ($$0.a(cwu.vm) && $$1.c(this.b.a()) instanceof coy $$2) {
         $$0.b(kv.ag, new czp($$2.gh()));
      }

      return $$0;
   }

   public static exf.a<?> a(evs.b $$0) {
      return a($$1 -> new ewz($$1, $$0));
   }
}
