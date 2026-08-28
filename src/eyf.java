import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyf extends eyb {
   public static final MapCodec<eyf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(ewm.e.fieldOf("component").forGetter($$0x -> $$0x.b), eye.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, eyf::new)
   );
   private final ewl<?> b;
   private final eyc c;

   private eyf(List<ezx> $$0, ewl<?> $$1, eyc $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eyd<eyf> b() {
      return eye.u;
   }

   @Override
   public cxo a(cxo $$0, ewo $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         this.b.a($$0, $$1x -> this.c.apply($$1x, $$1));
         return $$0;
      }
   }

   @Override
   public void a(ewu $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
