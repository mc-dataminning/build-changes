import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class dzr implements dzg {
   protected final ke f;

   protected static <P extends dzr> P1<Mu<P>, ke> a(Instance<P> $$0) {
      return $$0.group(ke.v(16).optionalFieldOf("offset", ke.g).forGetter($$0x -> $$0x.f));
   }

   protected dzr(ke $$0) {
      this.f = $$0;
   }

   public final boolean a(dcz $$0, ja $$1) {
      return this.a($$0.a_($$1.a(this.f)));
   }

   protected abstract boolean a(dsh var1);
}
