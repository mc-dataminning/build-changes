import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class elw implements emc {
   public static final Codec<elw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(btl.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), btl.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, elw::new)
   );
   private final btl b;
   private final btl c;

   public elw(btl $$0, btl $$1) {
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
