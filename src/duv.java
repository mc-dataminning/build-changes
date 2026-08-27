import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duv implements dug {
   public static final Codec<duv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               djp.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               djp.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               bjh.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, duv::new)
   );
   public final djp b;
   public final djp c;
   private final bjh d;

   public duv(djp $$0, djp $$1, bjh $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bjh a() {
      return this.d;
   }
}
