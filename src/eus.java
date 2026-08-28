import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eus extends euu {
   public static final MapCodec<eus> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(etg.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, eus::new));
   private final etg b;

   private eus(List<ews> $$0, etg $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public euw<eus> b() {
      return eux.w;
   }

   @Override
   public Set<ewa<?>> a() {
      return this.b.a();
   }

   @Override
   public cvp a(cvp $$0, eth $$1) {
      int $$2 = this.b.a($$1, $$0.J());
      $$0.e($$2);
      return $$0;
   }

   public static euu.a<?> a(etg $$0) {
      return a($$1 -> new eus($$1, $$0));
   }
}
