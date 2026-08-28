import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edj extends ecv {
   public static final Codec<edj> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efe.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               ayh.l.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               ayh.l.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, edj::new)
   );
   public final int d;
   public final int e;

   public edj(efe $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
