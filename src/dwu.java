import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwu implements dwy {
   public static final Codec<dwu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dme.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dme.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               blq.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               blq.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dwu::new)
   );
   private final dme b;
   private final dme c;
   private final blq d;
   private final blq e;

   public dwu(dme $$0, dme $$1, blq $$2, blq $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dme a() {
      return this.b;
   }

   public dme b() {
      return this.c;
   }

   public blq c() {
      return this.d;
   }

   public blq d() {
      return this.e;
   }
}
