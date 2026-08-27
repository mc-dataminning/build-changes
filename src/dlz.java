import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class dlz implements dlo {
   protected final ia f;

   protected static <P extends dlz> P1<Mu<P>, ia> a(Instance<P> $$0) {
      return $$0.group(ia.v(16).optionalFieldOf("offset", ia.g).forGetter($$0x -> $$0x.f));
   }

   protected dlz(ia $$0) {
      this.f = $$0;
   }

   public final boolean a(cqe $$0, gv $$1) {
      return this.a($$0.a_($$1.a(this.f)));
   }

   protected abstract boolean a(dey var1);
}
