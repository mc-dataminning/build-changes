import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class elk extends eld {
   public static final MapCodec<elk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, elk::new)
   );
   private final int c;

   private elk(int $$0) {
      this.c = $$0;
   }

   public static elk a(int $$0) {
      return new elk($$0);
   }

   @Override
   protected boolean a(elc $$0, azs $$1, jh $$2) {
      int $$3 = $$0.a(ebf.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(ebf.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public elf<?> b() {
      return elf.d;
   }
}
