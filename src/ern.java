import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ern extends eqs {
   static final MapCodec<ern> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(etj.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, ern::new));
   private final eti b;

   private ern(List<esn> $$0, eti $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public equ b() {
      return eqv.N;
   }

   @Override
   public ctq a(ctq $$0, eph $$1) {
      $$0.b(kb.P, Integer.valueOf(this.b.a($$1)));
      return $$0;
   }

   public eti c() {
      return this.b;
   }

   public static eqs.a<?> a(eti $$0) {
      return a($$1 -> new ern($$1, $$0));
   }
}
