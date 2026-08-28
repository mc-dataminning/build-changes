import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class evh extends euu {
   static final MapCodec<evh> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(exp.a.fieldOf("value").forGetter($$0x -> $$0x.b)).apply($$0, evh::new));
   private final exo b;

   private evh(List<ews> $$0, exo $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<ewa<?>> a() {
      return this.b.a();
   }

   @Override
   public euw<evh> b() {
      return eux.R;
   }

   @Override
   public cvp a(cvp $$0, eth $$1) {
      $$0.b(kr.o, new cyf(this.b.a($$1)));
      return $$0;
   }
}
