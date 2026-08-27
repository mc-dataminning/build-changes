import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtt implements dtx {
   public static final Codec<dtt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               djg.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               djg.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bjf.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bjf.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dtt::new)
   );
   private final djg b;
   private final djg c;
   private final bjf d;
   private final bjf e;

   public dtt(djg $$0, djg $$1, bjf $$2, bjf $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public djg a() {
      return this.b;
   }

   public djg b() {
      return this.c;
   }

   public bjf c() {
      return this.d;
   }

   public bjf d() {
      return this.e;
   }
}
