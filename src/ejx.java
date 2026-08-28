import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejx implements ejv {
   public static final Codec<ejx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               elw.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               elw.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ejx::new)
   );
   public final elw b;
   public final elw c;
   public final int d;

   public ejx(elw $$0, elw $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
