import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class evy extends ewa {
   public static final MapCodec<evy> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(eum.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, evy::new));
   private final eum b;

   private evy(List<exy> $$0, eum $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ewc<evy> b() {
      return ewd.w;
   }

   @Override
   public Set<exg<?>> a() {
      return this.b.a();
   }

   @Override
   public cwm a(cwm $$0, eun $$1) {
      int $$2 = this.b.a($$1, $$0.L());
      $$0.e($$2);
      return $$0;
   }

   public static ewa.a<?> a(eum $$0) {
      return a($$1 -> new evy($$1, $$0));
   }
}
