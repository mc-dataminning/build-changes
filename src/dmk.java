import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class dmk implements dlz {
   protected final hy f;

   protected static <P extends dmk> P1<Mu<P>, hy> a(Instance<P> $$0) {
      return $$0.group(hy.v(16).optionalFieldOf("offset", hy.g).forGetter($$0x -> $$0x.f));
   }

   protected dmk(hy $$0) {
      this.f = $$0;
   }

   public final boolean a(cqp $$0, gw $$1) {
      return this.a($$0.a_($$1.a(this.f)));
   }

   protected abstract boolean a(dfj var1);
}
