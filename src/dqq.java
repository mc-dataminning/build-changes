import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class dqq implements dqf {
   protected final jb f;

   protected static <P extends dqq> P1<Mu<P>, jb> a(Instance<P> $$0) {
      return $$0.group(jb.v(16).optionalFieldOf("offset", jb.g).forGetter($$0x -> $$0x.f));
   }

   protected dqq(jb $$0) {
      this.f = $$0;
   }

   public final boolean a(cus $$0, hx $$1) {
      return this.a($$0.a_($$1.a(this.f)));
   }

   protected abstract boolean a(djp var1);
}
