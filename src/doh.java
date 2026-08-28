import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doh extends dez implements doe {
   public static final MapCodec<doh> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(doe.a.e.fieldOf("weathering_state").forGetter(dga::c), u()).apply($$0, doh::new)
   );
   private final doe.a e;

   @Override
   public MapCodec<doh> a() {
      return d;
   }

   public doh(doe.a $$0, dsb.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dsc $$0, arf $$1, iz $$2, azh $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(dsc $$0) {
      return doe.c($$0.b()).isPresent();
   }

   public doe.a m() {
      return this.e;
   }
}
