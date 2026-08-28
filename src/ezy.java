import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ezy extends faa {
   public static final MapCodec<ezy> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(eym.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, ezy::new));
   private final eym b;

   private ezy(List<fbw> $$0, eym $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fac<ezy> b() {
      return fad.w;
   }

   @Override
   public Set<bav<?>> a() {
      return this.b.a();
   }

   @Override
   public cys a(cys $$0, eyn $$1) {
      int $$2 = this.b.a($$1, $$0.M());
      $$0.e($$2);
      return $$0;
   }

   public static faa.a<?> a(eym $$0) {
      return a($$1 -> new ezy($$1, $$0));
   }
}
