import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etc extends esy {
   public static final MapCodec<etc> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(erj.e.fieldOf("component").forGetter($$0x -> $$0x.b), etb.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, etc::new)
   );
   private final eri<?> b;
   private final esz c;

   private etc(List<euw> $$0, eri<?> $$1, esz $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eta<etc> b() {
      return etb.u;
   }

   @Override
   public cuo a(cuo $$0, erl $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         this.b.a($$0, $$1x -> this.c.apply($$1x, $$1));
         return $$0;
      }
   }

   @Override
   public void a(err $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
