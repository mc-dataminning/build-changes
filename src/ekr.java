import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ekr implements ekx {
   public static final Codec<ekr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(btd.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), btd.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, ekr::new)
   );
   private final btd b;
   private final btd c;

   public ekr(btd $$0, btd $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public btd a() {
      return this.b;
   }

   public btd b() {
      return this.c;
   }
}
