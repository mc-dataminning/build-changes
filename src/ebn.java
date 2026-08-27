import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebn extends eaz {
   public static final Codec<ebn> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               edi.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               axh.j.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               axh.j.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ebn::new)
   );
   public final int d;
   public final int e;

   public ebn(edi $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
