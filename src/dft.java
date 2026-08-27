import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dft extends dev implements dfm {
   public static final MapCodec<dft> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(djp.a.fieldOf("block_set_type").forGetter(dev::g), dfm.a.e.fieldOf("weathering_state").forGetter(dft::s), u()).apply($$0, dft::new)
   );
   private final dfm.a n;

   @Override
   public MapCodec<dft> a() {
      return m;
   }

   protected dft(djp $$0, dfm.a $$1, diz.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   public void b(dja $$0, amz $$1, hx $$2, aup $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(dja $$0) {
      return dfm.c($$0.b()).isPresent();
   }

   public dfm.a s() {
      return this.n;
   }
}
