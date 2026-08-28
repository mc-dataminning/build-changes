import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecw implements edc {
   public static final Codec<ecw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bpz.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bpz.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, ecw::new)
   );
   private final bpz b;
   private final bpz c;

   public ecw(bpz $$0, bpz $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bpz a() {
      return this.b;
   }

   public bpz b() {
      return this.c;
   }
}
