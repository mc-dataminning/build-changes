import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class etc extends ete {
   public static final MapCodec<etc> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(erq.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, etc::new));
   private final erq b;

   private etc(List<evc> $$0, erq $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public etg<etc> b() {
      return eth.w;
   }

   @Override
   public Set<euk<?>> a() {
      return this.b.a();
   }

   @Override
   public cuq a(cuq $$0, err $$1) {
      int $$2 = this.b.a($$1, $$0.H());
      $$0.e($$2);
      return $$0;
   }

   public static ete.a<?> a(erq $$0) {
      return a($$1 -> new etc($$1, $$0));
   }
}
