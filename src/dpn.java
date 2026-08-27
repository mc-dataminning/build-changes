import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpn implements dpr {
   public static final Codec<dpn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dfa.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dfa.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bfv.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bfv.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dpn::new)
   );
   private final dfa b;
   private final dfa c;
   private final bfv d;
   private final bfv e;

   public dpn(dfa $$0, dfa $$1, bfv $$2, bfv $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dfa a() {
      return this.b;
   }

   public dfa b() {
      return this.c;
   }

   public bfv c() {
      return this.d;
   }

   public bfv d() {
      return this.e;
   }
}
