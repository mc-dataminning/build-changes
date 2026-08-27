import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebx implements ecb {
   public static final Codec<ebx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drb.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               drb.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               boz.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               boz.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ebx::new)
   );
   private final drb b;
   private final drb c;
   private final boz d;
   private final boz e;

   public ebx(drb $$0, drb $$1, boz $$2, boz $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public drb a() {
      return this.b;
   }

   public drb b() {
      return this.c;
   }

   public boz c() {
      return this.d;
   }

   public boz d() {
      return this.e;
   }
}
