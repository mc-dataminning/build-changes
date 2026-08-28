import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esx extends etc {
   public static final MapCodec<esx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(cs.a.fieldOf("item_filter").forGetter($$0x -> $$0x.b), etf.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, esx::new)
   );
   private final cs b;
   private final etd c;

   private esx(List<eva> $$0, cs $$1, etd $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public ete<esx> b() {
      return etf.v;
   }

   @Override
   public cuq a(cuq $$0, erp $$1) {
      return this.b.a($$0) ? this.c.apply($$0, $$1) : $$0;
   }

   @Override
   public void a(erv $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
