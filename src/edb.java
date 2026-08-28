import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class edb implements ecq {
   protected final kl f;

   protected static <P extends edb> P1<Mu<P>, kl> a(Instance<P> $$0) {
      return $$0.group(kl.v(16).optionalFieldOf("offset", kl.g).forGetter($$0x -> $$0x.f));
   }

   protected edb(kl $$0) {
      this.f = $$0;
   }

   public final boolean a(dgd $$0, jh $$1) {
      return this.a($$0.a_($$1.a(this.f)));
   }

   protected abstract boolean a(dvo var1);
}
