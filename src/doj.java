import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class doj implements dny {
   protected final iw f;

   protected static <P extends doj> P1<Mu<P>, iw> a(Instance<P> $$0) {
      return $$0.group(iw.v(16).optionalFieldOf("offset", iw.g).forGetter($$0x -> $$0x.f));
   }

   protected doj(iw $$0) {
      this.f = $$0;
   }

   public final boolean a(csu $$0, ht $$1) {
      return this.a($$0.a_($$1.a(this.f)));
   }

   protected abstract boolean a(dhi var1);
}
