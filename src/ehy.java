import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class ehy implements ehn {
   protected final jz f;

   protected static <P extends ehy> P1<Mu<P>, jz> a(Instance<P> $$0) {
      return $$0.group(jz.v(16).optionalFieldOf("offset", jz.i).forGetter($$0x -> $$0x.f));
   }

   protected ehy(jz $$0) {
      this.f = $$0;
   }

   public final boolean a(djz $$0, iu $$1) {
      return this.a($$0.a_($$1.a(this.f)));
   }

   protected abstract boolean a(eah var1);
}
