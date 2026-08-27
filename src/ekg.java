import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ekg extends ekh {
   public static final Codec<ekg> a = RecordCodecBuilder.create($$0 -> a($$0).and(eiu.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, ekg::new));
   private final eiu b;

   private ekg(List<elu> $$0, eiu $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ekj b() {
      return ekk.q;
   }

   @Override
   public Set<eld<?>> a() {
      return this.b.a();
   }

   @Override
   public coz a(coz $$0, eiv $$1) {
      int $$2 = this.b.a($$1, $$0.M());
      $$0.f($$2);
      return $$0;
   }

   public static ekh.a<?> a(eiu $$0) {
      return a($$1 -> new ekg($$1, $$0));
   }
}
