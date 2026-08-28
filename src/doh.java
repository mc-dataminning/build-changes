import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doh extends doc implements dod {
   public static final MapCodec<doh> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dod.a.e.fieldOf("weathering_state").forGetter(doh::m), u()).apply($$0, doh::new)
   );
   private final dod.a f;

   @Override
   protected MapCodec<doh> a() {
      return e;
   }

   protected doh(dod.a $$0, dsa.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dsb $$0, are $$1, iz $$2, azg $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(dsb $$0) {
      return dod.c($$0.b()).isPresent();
   }

   public dod.a m() {
      return this.f;
   }
}
