import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class exg extends exc {
   public static final MapCodec<exg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(evn.e.fieldOf("component").forGetter($$0x -> $$0x.b), exf.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, exg::new)
   );
   private final evm<?> b;
   private final exd c;

   private exg(List<eyy> $$0, evm<?> $$1, exd $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public exe<exg> b() {
      return exf.u;
   }

   @Override
   public cwn a(cwn $$0, evp $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         this.b.a($$0, $$1x -> this.c.apply($$1x, $$1));
         return $$0;
      }
   }

   @Override
   public void a(evv $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
