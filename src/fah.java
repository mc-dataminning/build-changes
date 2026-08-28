import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fah extends fam {
   public static final MapCodec<fah> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(cl.a.fieldOf("item_filter").forGetter($$0x -> $$0x.b), fap.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, fah::new)
   );
   private final cl b;
   private final fan c;

   private fah(List<fci> $$0, cl $$1, fan $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fao<fah> b() {
      return fap.v;
   }

   @Override
   public cyy a(cyy $$0, eyz $$1) {
      return this.b.a($$0) ? this.c.apply($$0, $$1) : $$0;
   }

   @Override
   public void a(ezf $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
