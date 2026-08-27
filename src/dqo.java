import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqo implements dqs {
   public static final Codec<dqo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dgb.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dgb.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bhg.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bhg.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dqo::new)
   );
   private final dgb b;
   private final dgb c;
   private final bhg d;
   private final bhg e;

   public dqo(dgb $$0, dgb $$1, bhg $$2, bhg $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dgb a() {
      return this.b;
   }

   public dgb b() {
      return this.c;
   }

   public bhg c() {
      return this.d;
   }

   public bhg d() {
      return this.e;
   }
}
