import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class exa extends exf {
   public static final MapCodec<exa> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(cv.a.fieldOf("item_filter").forGetter($$0x -> $$0x.b), exi.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, exa::new)
   );
   private final cv b;
   private final exg c;

   private exa(List<ezb> $$0, cv $$1, exg $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public exh<exa> b() {
      return exi.v;
   }

   @Override
   public cwq a(cwq $$0, evs $$1) {
      return this.b.a($$0) ? this.c.apply($$0, $$1) : $$0;
   }

   @Override
   public void a(evy $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
