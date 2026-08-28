import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class euy extends euu {
   public static final MapCodec<euy> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(etf.e.fieldOf("component").forGetter($$0x -> $$0x.b), eux.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, euy::new)
   );
   private final ete<?> b;
   private final euv c;

   private euy(List<ews> $$0, ete<?> $$1, euv $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public euw<euy> b() {
      return eux.u;
   }

   @Override
   public cvp a(cvp $$0, eth $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         this.b.a($$0, $$1x -> this.c.apply($$1x, $$1));
         return $$0;
      }
   }

   @Override
   public void a(etn $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
