import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class egi extends egj {
   public static final Codec<egi> a = RecordCodecBuilder.create($$0 -> a($$0).and(eew.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, egi::new));
   private final eew b;

   private egi(List<ehw> $$0, eew $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public egl b() {
      return egm.q;
   }

   @Override
   public Set<ehf<?>> a() {
      return this.b.a();
   }

   @Override
   public clj a(clj $$0, eex $$1) {
      int $$2 = this.b.a($$1, $$0.L());
      $$0.f($$2);
      return $$0;
   }

   public static egj.a<?> a(eew $$0) {
      return a($$1 -> new egi($$1, $$0));
   }
}
