import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class eam implements eab {
   protected final jv f;

   protected static <P extends eam> P1<Mu<P>, jv> a(Instance<P> $$0) {
      return $$0.group(jv.v(16).optionalFieldOf("offset", jv.g).forGetter($$0x -> $$0x.f));
   }

   protected eam(jv $$0) {
      this.f = $$0;
   }

   public final boolean a(dcv $$0, ir $$1) {
      return this.a($$0.a_($$1.a(this.f)));
   }

   protected abstract boolean a(dtc var1);
}
