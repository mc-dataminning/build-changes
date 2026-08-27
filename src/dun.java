import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dun implements dty {
   public static final Codec<dun> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               djh.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               djh.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               bjg.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dun::new)
   );
   public final djh b;
   public final djh c;
   private final bjg d;

   public dun(djh $$0, djh $$1, bjg $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bjg a() {
      return this.d;
   }
}
