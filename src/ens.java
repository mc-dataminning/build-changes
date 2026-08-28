import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ens extends enn {
   public static final MapCodec<ens> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bsb.b(enn.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, ens::new)
   );
   private final bsb<enn> b;

   public ens(bsb<enn> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(azs $$0, efi $$1) {
      return this.b.b($$0).a($$0, $$1);
   }

   @Override
   public eno<?> a() {
      return eno.f;
   }
}
