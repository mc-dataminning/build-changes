import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class dxi implements dwx {
   protected final jq f;

   protected static <P extends dxi> P1<Mu<P>, jq> a(Instance<P> $$0) {
      return $$0.group(jq.v(16).optionalFieldOf("offset", jq.g).forGetter($$0x -> $$0x.f));
   }

   protected dxi(jq $$0) {
      this.f = $$0;
   }

   public final boolean a(dap $$0, im $$1) {
      return this.a($$0.a_($$1.a(this.f)));
   }

   protected abstract boolean a(dpy var1);
}
