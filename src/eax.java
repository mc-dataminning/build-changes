import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eax implements eai {
   public static final Codec<eax> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dpi.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               dpi.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               bnk.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eax::new)
   );
   public final dpi b;
   public final dpi c;
   private final bnk d;

   public eax(dpi $$0, dpi $$1, bnk $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bnk a() {
      return this.d;
   }
}
