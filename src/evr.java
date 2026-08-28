import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class evr extends euu {
   static final MapCodec<evr> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(exp.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, evr::new));
   private final exo b;

   private evr(List<ews> $$0, exo $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<ewa<?>> a() {
      return this.b.a();
   }

   @Override
   public euw<evr> b() {
      return eux.Q;
   }

   @Override
   public cvp a(cvp $$0, eth $$1) {
      int $$2 = azd.a(this.b.a($$1), 0, 4);
      $$0.b(kr.V, new cyr($$2));
      return $$0;
   }

   public exo c() {
      return this.b;
   }

   public static euu.a<?> a(exo $$0) {
      return a($$1 -> new evr($$1, $$0));
   }
}
