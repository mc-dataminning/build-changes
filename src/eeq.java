import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eeq extends eec {
   public static final Codec<eeq> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egl.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               axu.j.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               axu.j.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eeq::new)
   );
   public final int d;
   public final int e;

   public eeq(egl $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
