import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class edr extends eds {
   public static final Codec<edr> a = RecordCodecBuilder.create($$0 -> a($$0).and(ecf.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, edr::new));
   private final ecf b;

   private edr(List<eff> $$0, ecf $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public edu b() {
      return edv.q;
   }

   @Override
   public Set<eeo<?>> a() {
      return this.b.a();
   }

   @Override
   public cix a(cix $$0, ecg $$1) {
      int $$2 = this.b.a($$1, $$0.L());
      $$0.f($$2);
      return $$0;
   }

   public static eds.a<?> a(ecf $$0) {
      return a($$1 -> new edr($$1, $$0));
   }
}
