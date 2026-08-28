import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eec implements eei {
   public static final Codec<eec> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bpw.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bpw.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, eec::new)
   );
   private final bpw b;
   private final bpw c;

   public eec(bpw $$0, bpw $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bpw a() {
      return this.b;
   }

   public bpw b() {
      return this.c;
   }
}
