import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsa implements dse {
   public static final Codec<dsa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dhn.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dhn.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               big.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               big.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dsa::new)
   );
   private final dhn b;
   private final dhn c;
   private final big d;
   private final big e;

   public dsa(dhn $$0, dhn $$1, big $$2, big $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dhn a() {
      return this.b;
   }

   public dhn b() {
      return this.c;
   }

   public big c() {
      return this.d;
   }

   public big d() {
      return this.e;
   }
}
