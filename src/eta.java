import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eta extends etc {
   public static final MapCodec<eta> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(ero.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, eta::new));
   private final ero b;

   private eta(List<eva> $$0, ero $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ete<eta> b() {
      return etf.w;
   }

   @Override
   public Set<eui<?>> a() {
      return this.b.a();
   }

   @Override
   public cuq a(cuq $$0, erp $$1) {
      int $$2 = this.b.a($$1, $$0.H());
      $$0.e($$2);
      return $$0;
   }

   public static etc.a<?> a(ero $$0) {
      return a($$1 -> new eta($$1, $$0));
   }
}
