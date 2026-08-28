import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eru extends erw {
   public static final MapCodec<eru> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(eqj.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, eru::new));
   private final eqj b;

   private eru(List<etu> $$0, eqj $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ery<eru> b() {
      return erz.w;
   }

   @Override
   public Set<etd<?>> a() {
      return this.b.a();
   }

   @Override
   public cur a(cur $$0, eqk $$1) {
      int $$2 = this.b.a($$1, $$0.I());
      $$0.e($$2);
      return $$0;
   }

   public static erw.a<?> a(eqj $$0) {
      return a($$1 -> new eru($$1, $$0));
   }
}
