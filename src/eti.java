import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eti extends ete {
   public static final MapCodec<eti> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(erp.e.fieldOf("component").forGetter($$0x -> $$0x.b), eth.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, eti::new)
   );
   private final ero<?> b;
   private final etf c;

   private eti(List<evc> $$0, ero<?> $$1, etf $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public etg<eti> b() {
      return eth.u;
   }

   @Override
   public cuq a(cuq $$0, err $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         this.b.a($$0, $$1x -> this.c.apply($$1x, $$1));
         return $$0;
      }
   }

   @Override
   public void a(erx $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
