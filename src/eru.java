import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eru extends erp {
   public static final MapCodec<eru> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eqb.e.fieldOf("component").forGetter($$0x -> $$0x.b), ers.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, eru::new)
   );
   private final eqa<?> b;
   private final erq c;

   private eru(List<etn> $$0, eqa<?> $$1, erq $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public err<eru> b() {
      return ers.u;
   }

   @Override
   public cuk a(cuk $$0, eqd $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         this.b.a($$0, $$1x -> this.c.apply($$1x, $$1));
         return $$0;
      }
   }

   @Override
   public void a(eqj $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
