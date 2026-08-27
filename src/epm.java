import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class epm extends epo {
   public static final Codec<epm> a = RecordCodecBuilder.create($$0 -> a($$0).and(enz.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, epm::new));
   private final enz b;

   private epm(List<erh> $$0, enz $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public epq b() {
      return epr.r;
   }

   @Override
   public Set<eqq<?>> a() {
      return this.b.a();
   }

   @Override
   public csd a(csd $$0, eoa $$1) {
      int $$2 = this.b.a($$1, $$0.G());
      $$0.e($$2);
      return $$0;
   }

   public static epo.a<?> a(enz $$0) {
      return a($$1 -> new epm($$1, $$0));
   }
}
