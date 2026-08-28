import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esk extends erw {
   static final MapCodec<esk> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(euq.a.fieldOf("value").forGetter($$0x -> $$0x.b)).apply($$0, esk::new));
   private final eup b;

   private esk(List<etu> $$0, eup $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<etd<?>> a() {
      return this.b.a();
   }

   @Override
   public ery<esk> b() {
      return erz.R;
   }

   @Override
   public cur a(cur $$0, eqk $$1) {
      $$0.b(km.o, new cxh(this.b.a($$1)));
      return $$0;
   }
}
