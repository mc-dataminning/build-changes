import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwl implements dvw {
   public static final Codec<dwl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dlf.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               dlf.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               bkz.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dwl::new)
   );
   public final dlf b;
   public final dlf c;
   private final bkz d;

   public dwl(dlf $$0, dlf $$1, bkz $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bkz a() {
      return this.d;
   }
}
