import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class exi extends exe {
   public static final MapCodec<exi> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(evp.e.fieldOf("component").forGetter($$0x -> $$0x.b), exh.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, exi::new)
   );
   private final evo<?> b;
   private final exf c;

   private exi(List<eza> $$0, evo<?> $$1, exf $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public exg<exi> b() {
      return exh.u;
   }

   @Override
   public cwp a(cwp $$0, evr $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         this.b.a($$0, $$1x -> this.c.apply($$1x, $$1));
         return $$0;
      }
   }

   @Override
   public void a(evx $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
