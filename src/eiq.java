import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eiq extends eir {
   public static final Codec<eiq> a = RecordCodecBuilder.create($$0 -> a($$0).and(ehe.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, eiq::new));
   private final ehe b;

   private eiq(List<eke> $$0, ehe $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eit b() {
      return eiu.q;
   }

   @Override
   public Set<ejn<?>> a() {
      return this.b.a();
   }

   @Override
   public cng a(cng $$0, ehf $$1) {
      int $$2 = this.b.a($$1, $$0.L());
      $$0.f($$2);
      return $$0;
   }

   public static eir.a<?> a(ehe $$0) {
      return a($$1 -> new eiq($$1, $$0));
   }
}
