import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duc implements dug {
   public static final Codec<duc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               djp.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               djp.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bjh.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bjh.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, duc::new)
   );
   private final djp b;
   private final djp c;
   private final bjh d;
   private final bjh e;

   public duc(djp $$0, djp $$1, bjh $$2, bjh $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public djp a() {
      return this.b;
   }

   public djp b() {
      return this.c;
   }

   public bjh c() {
      return this.d;
   }

   public bjh d() {
      return this.e;
   }
}
