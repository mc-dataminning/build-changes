import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class dsn implements dsc {
   protected final jd f;

   protected static <P extends dsn> P1<Mu<P>, jd> a(Instance<P> $$0) {
      return $$0.group(jd.v(16).optionalFieldOf("offset", jd.g).forGetter($$0x -> $$0x.f));
   }

   protected dsn(jd $$0) {
      this.f = $$0;
   }

   public final boolean a(cwm $$0, hz $$1) {
      return this.a($$0.a_($$1.a(this.f)));
   }

   protected abstract boolean a(dlj var1);
}
