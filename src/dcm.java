import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dcm extends dac {
   public static final MapCodec<dcm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bmi.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), u()).apply($$0, dcm::new)
   );
   private final bmi b;

   @Override
   public MapCodec<? extends dcm> a() {
      return a;
   }

   public dcm(bmi $$0, dna.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, cqm $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
