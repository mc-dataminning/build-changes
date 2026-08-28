import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class egd implements efs {
   protected final kn f;

   protected static <P extends egd> P1<Mu<P>, kn> a(Instance<P> $$0) {
      return $$0.group(kn.v(16).optionalFieldOf("offset", kn.i).forGetter($$0x -> $$0x.f));
   }

   protected egd(kn $$0) {
      this.f = $$0;
   }

   public final boolean a(dio $$0, jj $$1) {
      return this.a($$0.a_($$1.a(this.f)));
   }

   protected abstract boolean a(dym var1);
}
