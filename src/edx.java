import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edx implements edi {
   public static final Codec<edx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsh.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               dsh.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               bpi.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, edx::new)
   );
   public final dsh b;
   public final dsh c;
   private final bpi d;

   public edx(dsh $$0, dsh $$1, bpi $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bpi a() {
      return this.d;
   }
}
