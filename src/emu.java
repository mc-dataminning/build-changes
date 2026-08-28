import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emu implements enb {
   public static final Codec<emu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(buh.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), buh.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, emu::new)
   );
   private final buh b;
   private final buh c;

   public emu(buh $$0, buh $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public buh a() {
      return this.b;
   }

   public buh b() {
      return this.c;
   }
}
