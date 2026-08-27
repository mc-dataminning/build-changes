import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eao extends eaa {
   public static final Codec<eao> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ecj.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               awu.j.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               awu.j.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eao::new)
   );
   public final int d;
   public final int e;

   public eao(ecj $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
