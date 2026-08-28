import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class erk extends erp {
   public static final MapCodec<erk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(cp.a.fieldOf("item_filter").forGetter($$0x -> $$0x.b), ers.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, erk::new)
   );
   private final cp b;
   private final erq c;

   private erk(List<etn> $$0, cp $$1, erq $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public err<erk> b() {
      return ers.v;
   }

   @Override
   public cuk a(cuk $$0, eqd $$1) {
      return this.b.a($$0) ? this.c.apply($$0, $$1) : $$0;
   }

   @Override
   public void a(eqj $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
