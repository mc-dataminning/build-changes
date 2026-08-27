import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class elj extends elk {
   public static final Codec<elj> a = RecordCodecBuilder.create($$0 -> a($$0).and(ejx.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, elj::new));
   private final ejx b;

   private elj(List<emx> $$0, ejx $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public elm b() {
      return eln.q;
   }

   @Override
   public Set<emg<?>> a() {
      return this.b.a();
   }

   @Override
   public cpq a(cpq $$0, ejy $$1) {
      int $$2 = this.b.a($$1, $$0.M());
      $$0.f($$2);
      return $$0;
   }

   public static elk.a<?> a(ejx $$0) {
      return a($$1 -> new elj($$1, $$0));
   }
}
