import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwj extends dvv {
   public static final Codec<dwj> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dye.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               avq.j.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               avq.j.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dwj::new)
   );
   public final int d;
   public final int e;

   public dwj(dye $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
