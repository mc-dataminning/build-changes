import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esu extends erw {
   static final MapCodec<esu> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(euq.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, esu::new));
   private final eup b;

   private esu(List<etu> $$0, eup $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<etd<?>> a() {
      return this.b.a();
   }

   @Override
   public ery<esu> b() {
      return erz.Q;
   }

   @Override
   public cur a(cur $$0, eqk $$1) {
      int $$2 = ayz.a(this.b.a($$1), 0, 4);
      $$0.b(km.Q, Integer.valueOf($$2));
      return $$0;
   }

   public eup c() {
      return this.b;
   }

   public static erw.a<?> a(eup $$0) {
      return a($$1 -> new esu($$1, $$0));
   }
}
