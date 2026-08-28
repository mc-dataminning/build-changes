import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esg extends ers {
   static final MapCodec<esg> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(eum.a.fieldOf("value").forGetter($$0x -> $$0x.b)).apply($$0, esg::new));
   private final eul b;

   private esg(List<etq> $$0, eul $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<esz<?>> a() {
      return this.b.a();
   }

   @Override
   public eru<esg> b() {
      return erv.R;
   }

   @Override
   public cun a(cun $$0, eqg $$1) {
      $$0.b(km.n, new cxd(this.b.a($$1)));
      return $$0;
   }
}
