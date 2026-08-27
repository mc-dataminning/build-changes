import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class dyl implements dya {
   protected final js f;

   protected static <P extends dyl> P1<Mu<P>, js> a(Instance<P> $$0) {
      return $$0.group(js.v(16).optionalFieldOf("offset", js.g).forGetter($$0x -> $$0x.f));
   }

   protected dyl(js $$0) {
      this.f = $$0;
   }

   public final boolean a(dbs $$0, io $$1) {
      return this.a($$0.a_($$1.a(this.f)));
   }

   protected abstract boolean a(drb var1);
}
