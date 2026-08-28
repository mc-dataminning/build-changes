import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejo implements eiz {
   public static final Codec<ejo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dxu.a.fieldOf("target").forGetter($$0x -> $$0x.b),
               dxu.a.fieldOf("state").forGetter($$0x -> $$0x.c),
               bsn.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ejo::new)
   );
   public final dxu b;
   public final dxu c;
   private final bsn d;

   public ejo(dxu $$0, dxu $$1, bsn $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bsn a() {
      return this.d;
   }
}
