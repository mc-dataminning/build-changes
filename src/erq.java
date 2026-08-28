import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class erq extends erv {
   public static final MapCodec<erq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(cp.a.fieldOf("item_filter").forGetter($$0x -> $$0x.b), ery.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, erq::new)
   );
   private final cp b;
   private final erw c;

   private erq(List<ett> $$0, cp $$1, erw $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public erx<erq> b() {
      return ery.v;
   }

   @Override
   public cuq a(cuq $$0, eqj $$1) {
      return this.b.a($$0) ? this.c.apply($$0, $$1) : $$0;
   }

   @Override
   public void a(eqp $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
