import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ezv extends faa {
   public static final MapCodec<ezv> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(cl.a.fieldOf("item_filter").forGetter($$0x -> $$0x.b), fad.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, ezv::new)
   );
   private final cl b;
   private final fab c;

   private ezv(List<fbw> $$0, cl $$1, fab $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fac<ezv> b() {
      return fad.v;
   }

   @Override
   public cys a(cys $$0, eyn $$1) {
      return this.b.a($$0) ? this.c.apply($$0, $$1) : $$0;
   }

   @Override
   public void a(eyt $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
