import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmo implements dms {
   public static final Codec<dmo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dcb.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dcb.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bdc.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bdc.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dmo::new)
   );
   private final dcb b;
   private final dcb c;
   private final bdc d;
   private final bdc e;

   public dmo(dcb $$0, dcb $$1, bdc $$2, bdc $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dcb a() {
      return this.b;
   }

   public dcb b() {
      return this.c;
   }

   public bdc c() {
      return this.d;
   }

   public bdc d() {
      return this.e;
   }
}
