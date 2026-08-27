import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dbk extends dcy {
   public static final MapCodec<dbk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(avq.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), u()).apply($$0, dbk::new)
   );
   private final avq b;

   @Override
   public MapCodec<dbk> a() {
      return a;
   }

   public dbk(avq $$0, dna.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dnb $$0, cwh $$1, ib $$2) {
      return this.b.a();
   }
}
