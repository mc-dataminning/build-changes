import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehg extends egs {
   public static final Codec<ehg> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ejb.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               ayv.m.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               ayv.m.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ehg::new)
   );
   public final int d;
   public final int e;

   public ehg(ejb $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
