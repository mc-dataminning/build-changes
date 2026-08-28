import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class exj extends exf {
   public static final MapCodec<exj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(evq.e.fieldOf("component").forGetter($$0x -> $$0x.b), exi.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, exj::new)
   );
   private final evp<?> b;
   private final exg c;

   private exj(List<ezb> $$0, evp<?> $$1, exg $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public exh<exj> b() {
      return exi.u;
   }

   @Override
   public cwq a(cwq $$0, evs $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         this.b.a($$0, $$1x -> this.c.apply($$1x, $$1));
         return $$0;
      }
   }

   @Override
   public void a(evy $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
