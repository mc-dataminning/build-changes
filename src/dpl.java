import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpl implements dpp {
   public static final Codec<dpl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dey.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dey.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bft.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bft.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dpl::new)
   );
   private final dey b;
   private final dey c;
   private final bft d;
   private final bft e;

   public dpl(dey $$0, dey $$1, bft $$2, bft $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dey a() {
      return this.b;
   }

   public dey b() {
      return this.c;
   }

   public bft c() {
      return this.d;
   }

   public bft d() {
      return this.e;
   }
}
