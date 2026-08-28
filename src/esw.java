import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esw extends esy {
   public static final MapCodec<esw> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(erk.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, esw::new));
   private final erk b;

   private esw(List<euw> $$0, erk $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eta<esw> b() {
      return etb.w;
   }

   @Override
   public Set<eue<?>> a() {
      return this.b.a();
   }

   @Override
   public cuo a(cuo $$0, erl $$1) {
      int $$2 = this.b.a($$1, $$0.H());
      $$0.e($$2);
      return $$0;
   }

   public static esy.a<?> a(erk $$0) {
      return a($$1 -> new esw($$1, $$0));
   }
}
