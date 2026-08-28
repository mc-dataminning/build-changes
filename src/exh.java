import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class exh extends exd {
   public static final MapCodec<exh> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(evo.e.fieldOf("component").forGetter($$0x -> $$0x.b), exg.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, exh::new)
   );
   private final evn<?> b;
   private final exe c;

   private exh(List<eyz> $$0, evn<?> $$1, exe $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public exf<exh> b() {
      return exg.u;
   }

   @Override
   public cwo a(cwo $$0, evq $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         this.b.a($$0, $$1x -> this.c.apply($$1x, $$1));
         return $$0;
      }
   }

   @Override
   public void a(evw $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
