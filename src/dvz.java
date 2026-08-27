import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvz implements dwd {
   public static final Codec<dvz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dlj.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dlj.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               blb.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               blb.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dvz::new)
   );
   private final dlj b;
   private final dlj c;
   private final blb d;
   private final blb e;

   public dvz(dlj $$0, dlj $$1, blb $$2, blb $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dlj a() {
      return this.b;
   }

   public dlj b() {
      return this.c;
   }

   public blb c() {
      return this.d;
   }

   public blb d() {
      return this.e;
   }
}
