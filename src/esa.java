import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esa extends erv {
   public static final MapCodec<esa> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eqh.e.fieldOf("component").forGetter($$0x -> $$0x.b), ery.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, esa::new)
   );
   private final eqg<?> b;
   private final erw c;

   private esa(List<ett> $$0, eqg<?> $$1, erw $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public erx<esa> b() {
      return ery.u;
   }

   @Override
   public cuq a(cuq $$0, eqj $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         this.b.a($$0, $$1x -> this.c.apply($$1x, $$1));
         return $$0;
      }
   }

   @Override
   public void a(eqp $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
