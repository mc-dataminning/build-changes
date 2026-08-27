import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eia extends eib {
   public static final Codec<eia> a = RecordCodecBuilder.create($$0 -> a($$0).and(ego.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, eia::new));
   private final ego b;

   private eia(List<ejo> $$0, ego $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eid b() {
      return eie.q;
   }

   @Override
   public Set<eix<?>> a() {
      return this.b.a();
   }

   @Override
   public cmr a(cmr $$0, egp $$1) {
      int $$2 = this.b.a($$1, $$0.L());
      $$0.f($$2);
      return $$0;
   }

   public static eib.a<?> a(ego $$0) {
      return a($$1 -> new eia($$1, $$0));
   }
}
