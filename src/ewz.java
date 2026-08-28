import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ewz extends exe {
   public static final MapCodec<ewz> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(cv.a.fieldOf("item_filter").forGetter($$0x -> $$0x.b), exh.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, ewz::new)
   );
   private final cv b;
   private final exf c;

   private ewz(List<eza> $$0, cv $$1, exf $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public exg<ewz> b() {
      return exh.v;
   }

   @Override
   public cwp a(cwp $$0, evr $$1) {
      return this.b.a($$0) ? this.c.apply($$0, $$1) : $$0;
   }

   @Override
   public void a(evx $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
