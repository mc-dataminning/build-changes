import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emi implements emp {
   public static final Codec<emi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(btw.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), btw.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, emi::new)
   );
   private final btw b;
   private final btw c;

   public emi(btw $$0, btw $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public btw a() {
      return this.b;
   }

   public btw b() {
      return this.c;
   }
}
