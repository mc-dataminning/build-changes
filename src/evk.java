import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class evk extends evp {
   public static final MapCodec<evk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(cu.a.fieldOf("item_filter").forGetter($$0x -> $$0x.b), evs.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, evk::new)
   );
   private final cu b;
   private final evq c;

   private evk(List<exn> $$0, cu $$1, evq $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public evr<evk> b() {
      return evs.v;
   }

   @Override
   public cwb a(cwb $$0, euc $$1) {
      return this.b.a($$0) ? this.c.apply($$0, $$1) : $$0;
   }

   @Override
   public void a(eui $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
