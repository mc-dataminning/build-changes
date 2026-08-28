import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class evv extends ewa {
   public static final MapCodec<evv> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(cu.a.fieldOf("item_filter").forGetter($$0x -> $$0x.b), ewd.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, evv::new)
   );
   private final cu b;
   private final ewb c;

   private evv(List<exy> $$0, cu $$1, ewb $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public ewc<evv> b() {
      return ewd.v;
   }

   @Override
   public cwm a(cwm $$0, eun $$1) {
      return this.b.a($$0) ? this.c.apply($$0, $$1) : $$0;
   }

   @Override
   public void a(eut $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
