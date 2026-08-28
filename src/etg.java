import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etg extends etc {
   public static final MapCodec<etg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(ern.e.fieldOf("component").forGetter($$0x -> $$0x.b), etf.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, etg::new)
   );
   private final erm<?> b;
   private final etd c;

   private etg(List<eva> $$0, erm<?> $$1, etd $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public ete<etg> b() {
      return etf.u;
   }

   @Override
   public cuq a(cuq $$0, erp $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         this.b.a($$0, $$1x -> this.c.apply($$1x, $$1));
         return $$0;
      }
   }

   @Override
   public void a(erv $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
