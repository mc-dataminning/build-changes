import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecj extends ebv {
   public static final Codec<ecj> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eee.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               axn.j.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               axn.j.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ecj::new)
   );
   public final int d;
   public final int e;

   public ecj(eee $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
