import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class exp extends exv {
   public static final MapCodec<exp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ewi.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, exp::new)
   );
   private final ewi.b b;

   public exp(List<ezr> $$0, ewi.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exx<exp> b() {
      return exy.B;
   }

   @Override
   public Set<bbd<?>> a() {
      return Set.of(this.b.a());
   }

   @Override
   public cxg a(cxg $$0, ewi $$1) {
      if ($$0.a(cxk.vm) && $$1.c(this.b.a()) instanceof cpo $$2) {
         $$0.b(ku.ag, new daf($$2.gh()));
      }

      return $$0;
   }

   public static exv.a<?> a(ewi.b $$0) {
      return a($$1 -> new exp($$1, $$0));
   }
}
