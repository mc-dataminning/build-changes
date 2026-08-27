import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eeb extends eec {
   public static final Codec<eeb> a = RecordCodecBuilder.create($$0 -> a($$0).and(ecp.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, eeb::new));
   private final ecp b;

   private eeb(List<efp> $$0, ecp $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eee b() {
      return eef.q;
   }

   @Override
   public Set<eey<?>> a() {
      return this.b.a();
   }

   @Override
   public cjf a(cjf $$0, ecq $$1) {
      int $$2 = this.b.a($$1, $$0.L());
      $$0.f($$2);
      return $$0;
   }

   public static eec.a<?> a(ecp $$0) {
      return a($$1 -> new eeb($$1, $$0));
   }
}
