import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class exp extends exu {
   public static final MapCodec<exp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(cu.a.fieldOf("item_filter").forGetter($$0x -> $$0x.b), exx.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, exp::new)
   );
   private final cu b;
   private final exv c;

   private exp(List<ezs> $$0, cu $$1, exv $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public exw<exp> b() {
      return exx.v;
   }

   @Override
   public cxk a(cxk $$0, ewh $$1) {
      return this.b.a($$0) ? this.c.apply($$0, $$1) : $$0;
   }

   @Override
   public void a(ewn $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
