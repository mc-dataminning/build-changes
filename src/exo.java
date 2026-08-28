import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class exo extends exu {
   public static final MapCodec<exo> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ewh.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, exo::new)
   );
   private final ewh.b b;

   public exo(List<ezs> $$0, ewh.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exw<exo> b() {
      return exx.B;
   }

   @Override
   public Set<eza<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cxk a(cxk $$0, ewh $$1) {
      if ($$0.a(cxo.vd) && $$1.c(this.b.a()) instanceof cps $$2) {
         $$0.b(ku.ag, new daj($$2.gf()));
      }

      return $$0;
   }

   public static exu.a<?> a(ewh.b $$0) {
      return a($$1 -> new exo($$1, $$0));
   }
}
