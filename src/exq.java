import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class exq extends exv {
   public static final MapCodec<exq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(cu.a.fieldOf("item_filter").forGetter($$0x -> $$0x.b), exy.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, exq::new)
   );
   private final cu b;
   private final exw c;

   private exq(List<ezr> $$0, cu $$1, exw $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public exx<exq> b() {
      return exy.v;
   }

   @Override
   public cxg a(cxg $$0, ewi $$1) {
      return this.b.a($$0) ? this.c.apply($$0, $$1) : $$0;
   }

   @Override
   public void a(ewo $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
