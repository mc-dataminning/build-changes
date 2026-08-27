import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzv implements dzz {
   public static final Codec<dzv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               doz.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               doz.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bnf.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bnf.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dzv::new)
   );
   private final doz b;
   private final doz c;
   private final bnf d;
   private final bnf e;

   public dzv(doz $$0, doz $$1, bnf $$2, bnf $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public doz a() {
      return this.b;
   }

   public doz b() {
      return this.c;
   }

   public bnf c() {
      return this.d;
   }

   public bnf d() {
      return this.e;
   }
}
