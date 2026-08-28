import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class erp extends eru {
   public static final MapCodec<erp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(cp.a.fieldOf("item_filter").forGetter($$0x -> $$0x.b), erx.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, erp::new)
   );
   private final cp b;
   private final erv c;

   private erp(List<ets> $$0, cp $$1, erv $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public erw<erp> b() {
      return erx.v;
   }

   @Override
   public cup a(cup $$0, eqi $$1) {
      return this.b.a($$0) ? this.c.apply($$0, $$1) : $$0;
   }

   @Override
   public void a(eqo $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
