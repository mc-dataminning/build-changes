import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edm implements ecx {
   public static final Codec<edm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drx.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               drx.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               bpu.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, edm::new)
   );
   public final drx b;
   public final drx c;
   private final bpu d;

   public edm(drx $$0, drx $$1, bpu $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bpu a() {
      return this.d;
   }
}
