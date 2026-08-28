import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class elx implements eli {
   public static final Codec<elx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzz.a.fieldOf("target").forGetter($$0x -> $$0x.b),
               dzz.a.fieldOf("state").forGetter($$0x -> $$0x.c),
               btg.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, elx::new)
   );
   public final dzz b;
   public final dzz c;
   private final btg d;

   public elx(dzz $$0, dzz $$1, btg $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public btg a() {
      return this.d;
   }
}
