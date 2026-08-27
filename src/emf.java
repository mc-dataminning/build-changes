import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class emf extends emg {
   public static final Codec<emf> a = RecordCodecBuilder.create($$0 -> a($$0).and(ekt.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, emf::new));
   private final ekt b;

   private emf(List<ent> $$0, ekt $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public emi b() {
      return emj.q;
   }

   @Override
   public Set<enc<?>> a() {
      return this.b.a();
   }

   @Override
   public cqk a(cqk $$0, eku $$1) {
      int $$2 = this.b.a($$1, $$0.M());
      $$0.f($$2);
      return $$0;
   }

   public static emg.a<?> a(ekt $$0) {
      return a($$1 -> new emf($$1, $$0));
   }
}
