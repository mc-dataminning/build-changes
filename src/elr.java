import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class elr implements elx {
   public static final Codec<elr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(btl.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), btl.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, elr::new)
   );
   private final btl b;
   private final btl c;

   public elr(btl $$0, btl $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public btl a() {
      return this.b;
   }

   public btl b() {
      return this.c;
   }
}
