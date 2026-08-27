import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class emh extends emi {
   public static final Codec<emh> a = RecordCodecBuilder.create($$0 -> a($$0).and(ekv.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, emh::new));
   private final ekv b;

   private emh(List<env> $$0, ekv $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public emk b() {
      return eml.q;
   }

   @Override
   public Set<ene<?>> a() {
      return this.b.a();
   }

   @Override
   public cqm a(cqm $$0, ekw $$1) {
      int $$2 = this.b.a($$1, $$0.M());
      $$0.f($$2);
      return $$0;
   }

   public static emi.a<?> a(ekv $$0) {
      return a($$1 -> new emh($$1, $$0));
   }
}
