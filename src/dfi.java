import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfi extends del implements dfb {
   public static final MapCodec<dfi> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dje.a.fieldOf("block_set_type").forGetter(del::g), dfb.a.e.fieldOf("weathering_state").forGetter(dfi::s), u()).apply($$0, dfi::new)
   );
   private final dfb.a n;

   @Override
   public MapCodec<dfi> a() {
      return m;
   }

   protected dfi(dje $$0, dfb.a $$1, dio.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   public void b(dip $$0, amp $$1, hv $$2, auf $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(dip $$0) {
      return dfb.c($$0.b()).isPresent();
   }

   public dfb.a s() {
      return this.n;
   }
}
