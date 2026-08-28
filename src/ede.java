import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ede implements edi {
   public static final Codec<ede> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsh.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dsh.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bpi.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bpi.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ede::new)
   );
   private final dsh b;
   private final dsh c;
   private final bpi d;
   private final bpi e;

   public ede(dsh $$0, dsh $$1, bpi $$2, bpi $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dsh a() {
      return this.b;
   }

   public dsh b() {
      return this.c;
   }

   public bpi c() {
      return this.d;
   }

   public bpi d() {
      return this.e;
   }
}
