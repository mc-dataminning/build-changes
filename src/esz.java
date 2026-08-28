import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esz extends ete {
   public static final MapCodec<esz> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(cs.a.fieldOf("item_filter").forGetter($$0x -> $$0x.b), eth.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, esz::new)
   );
   private final cs b;
   private final etf c;

   private esz(List<evc> $$0, cs $$1, etf $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public etg<esz> b() {
      return eth.v;
   }

   @Override
   public cuq a(cuq $$0, err $$1) {
      return this.b.a($$0) ? this.c.apply($$0, $$1) : $$0;
   }

   @Override
   public void a(erx $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
