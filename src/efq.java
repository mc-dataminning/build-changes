import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efq implements efu {
   public static final Codec<efq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               duo.a.fieldOf("contents").forGetter($$0x -> $$0x.b),
               duo.a.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bqu.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bqu.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, efq::new)
   );
   private final duo b;
   private final duo c;
   private final bqu d;
   private final bqu e;

   public efq(duo $$0, duo $$1, bqu $$2, bqu $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public duo a() {
      return this.b;
   }

   public duo b() {
      return this.c;
   }

   public bqu c() {
      return this.d;
   }

   public bqu d() {
      return this.e;
   }
}
