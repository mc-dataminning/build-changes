import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fae extends faa {
   public static final MapCodec<fae> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eyl.e.fieldOf("component").forGetter($$0x -> $$0x.b), fad.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, fae::new)
   );
   private final eyk<?> b;
   private final fab c;

   private fae(List<fbw> $$0, eyk<?> $$1, fab $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fac<fae> b() {
      return fad.u;
   }

   @Override
   public cys a(cys $$0, eyn $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         this.b.a($$0, $$1x -> this.c.apply($$1x, $$1));
         return $$0;
      }
   }

   @Override
   public void a(eyt $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
