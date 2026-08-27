import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpx extends dpj {
   public static final Codec<dpx> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drs.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               aqy.j.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               aqy.j.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dpx::new)
   );
   public final int d;
   public final int e;

   public dpx(drs $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
