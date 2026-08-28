import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ewx extends exc {
   public static final MapCodec<ewx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(cv.a.fieldOf("item_filter").forGetter($$0x -> $$0x.b), exf.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, ewx::new)
   );
   private final cv b;
   private final exd c;

   private ewx(List<eyy> $$0, cv $$1, exd $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public exe<ewx> b() {
      return exf.v;
   }

   @Override
   public cwn a(cwn $$0, evp $$1) {
      return this.b.a($$0) ? this.c.apply($$0, $$1) : $$0;
   }

   @Override
   public void a(evv $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
