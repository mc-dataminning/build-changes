import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class est extends esy {
   public static final MapCodec<est> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(cs.a.fieldOf("item_filter").forGetter($$0x -> $$0x.b), etb.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, est::new)
   );
   private final cs b;
   private final esz c;

   private est(List<euw> $$0, cs $$1, esz $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eta<est> b() {
      return etb.v;
   }

   @Override
   public cuo a(cuo $$0, erl $$1) {
      return this.b.a($$0) ? this.c.apply($$0, $$1) : $$0;
   }

   @Override
   public void a(err $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
