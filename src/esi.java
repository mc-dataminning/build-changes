import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esi extends eru {
   static final MapCodec<esi> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(euo.a.fieldOf("value").forGetter($$0x -> $$0x.b)).apply($$0, esi::new));
   private final eun b;

   private esi(List<ets> $$0, eun $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<etb<?>> a() {
      return this.b.a();
   }

   @Override
   public erw<esi> b() {
      return erx.R;
   }

   @Override
   public cup a(cup $$0, eqi $$1) {
      $$0.b(km.o, new cxf(this.b.a($$1)));
      return $$0;
   }
}
