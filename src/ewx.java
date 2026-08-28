import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ewx extends exd {
   public static final MapCodec<ewx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(evq.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, ewx::new)
   );
   private final evq.b b;

   public ewx(List<eyz> $$0, evq.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exf<ewx> b() {
      return exg.B;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(this.b.a());
   }

   @Override
   public cwo a(cwo $$0, evq $$1) {
      if ($$0.a(cws.vm) && $$1.c(this.b.a()) instanceof cow $$2) {
         $$0.b(kv.ag, new czn($$2.gh()));
      }

      return $$0;
   }

   public static exd.a<?> a(evq.b $$0) {
      return a($$1 -> new ewx($$1, $$0));
   }
}
