import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpw implements dqa {
   public static final Codec<dpw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dfj.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dfj.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bgd.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bgd.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dpw::new)
   );
   private final dfj b;
   private final dfj c;
   private final bgd d;
   private final bgd e;

   public dpw(dfj $$0, dfj $$1, bgd $$2, bgd $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dfj a() {
      return this.b;
   }

   public dfj b() {
      return this.c;
   }

   public bgd c() {
      return this.d;
   }

   public bgd d() {
      return this.e;
   }
}
