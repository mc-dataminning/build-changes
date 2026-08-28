import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esb extends erw {
   public static final MapCodec<esb> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eqi.e.fieldOf("component").forGetter($$0x -> $$0x.b), erz.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, esb::new)
   );
   private final eqh<?> b;
   private final erx c;

   private esb(List<etu> $$0, eqh<?> $$1, erx $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public ery<esb> b() {
      return erz.u;
   }

   @Override
   public cur a(cur $$0, eqk $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         this.b.a($$0, $$1x -> this.c.apply($$1x, $$1));
         return $$0;
      }
   }

   @Override
   public void a(eqq $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
