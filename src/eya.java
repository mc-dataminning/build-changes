import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eya extends eyc {
   public static final MapCodec<eya> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(ewo.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, eya::new));
   private final ewo b;

   private eya(List<ezy> $$0, ewo $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eye<eya> b() {
      return eyf.w;
   }

   @Override
   public Set<bbn<?>> a() {
      return this.b.a();
   }

   @Override
   public cxp a(cxp $$0, ewp $$1) {
      int $$2 = this.b.a($$1, $$0.L());
      $$0.e($$2);
      return $$0;
   }

   public static eyc.a<?> a(ewo $$0) {
      return a($$1 -> new eya($$1, $$0));
   }
}
