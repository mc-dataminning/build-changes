import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class erx extends ers {
   public static final MapCodec<erx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eqe.e.fieldOf("component").forGetter($$0x -> $$0x.b), erv.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, erx::new)
   );
   private final eqd<?> b;
   private final ert c;

   private erx(List<etq> $$0, eqd<?> $$1, ert $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eru<erx> b() {
      return erv.u;
   }

   @Override
   public cun a(cun $$0, eqg $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         this.b.a($$0, $$1x -> this.c.apply($$1x, $$1));
         return $$0;
      }
   }

   @Override
   public void a(eqm $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
