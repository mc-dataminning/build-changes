import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ewy extends exd {
   public static final MapCodec<ewy> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(cv.a.fieldOf("item_filter").forGetter($$0x -> $$0x.b), exg.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, ewy::new)
   );
   private final cv b;
   private final exe c;

   private ewy(List<eyz> $$0, cv $$1, exe $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public exf<ewy> b() {
      return exg.v;
   }

   @Override
   public cwo a(cwo $$0, evq $$1) {
      return this.b.a($$0) ? this.c.apply($$0, $$1) : $$0;
   }

   @Override
   public void a(evw $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
