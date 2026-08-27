import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvs implements dvw {
   public static final Codec<dvs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dlf.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dlf.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bkz.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bkz.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dvs::new)
   );
   private final dlf b;
   private final dlf c;
   private final bkz d;
   private final bkz e;

   public dvs(dlf $$0, dlf $$1, bkz $$2, bkz $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dlf a() {
      return this.b;
   }

   public dlf b() {
      return this.c;
   }

   public bkz c() {
      return this.d;
   }

   public bkz d() {
      return this.e;
   }
}
