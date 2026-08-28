import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esy extends esb {
   static final MapCodec<esy> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(euw.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, esy::new));
   private final euv b;

   private esy(List<etz> $$0, euv $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<eth<?>> a() {
      return this.b.a();
   }

   @Override
   public esd<esy> b() {
      return ese.Q;
   }

   @Override
   public cua a(cua $$0, eqo $$1) {
      int $$2 = aye.a(this.b.a($$1), 0, 4);
      $$0.b(kn.Q, Integer.valueOf($$2));
      return $$0;
   }

   public euv c() {
      return this.b;
   }

   public static esb.a<?> a(euv $$0) {
      return a($$1 -> new esy($$1, $$0));
   }
}
