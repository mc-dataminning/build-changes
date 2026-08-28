import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eda implements ede {
   public static final Codec<eda> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dse.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dse.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bqb.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bqb.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eda::new)
   );
   private final dse b;
   private final dse c;
   private final bqb d;
   private final bqb e;

   public eda(dse $$0, dse $$1, bqb $$2, bqb $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dse a() {
      return this.b;
   }

   public dse b() {
      return this.c;
   }

   public bqb c() {
      return this.d;
   }

   public bqb d() {
      return this.e;
   }
}
