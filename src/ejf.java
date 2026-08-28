import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejf extends eir {
   public static final Codec<ejf> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ela.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               azn.m.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               azn.m.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ejf::new)
   );
   public final int d;
   public final int e;

   public ejf(ela $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
