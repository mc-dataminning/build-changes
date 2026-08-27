import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqy extends dqk {
   public static final Codec<dqy> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dst.a.fieldOf("state_provider").forGetter($$0x -> $$0x.b),
               asg.j.fieldOf("spread_width").forGetter($$0x -> $$0x.d),
               asg.j.fieldOf("spread_height").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dqy::new)
   );
   public final int d;
   public final int e;

   public dqy(dst $$0, int $$1, int $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }
}
