import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyg extends eyc {
   public static final MapCodec<eyg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(ewn.e.fieldOf("component").forGetter($$0x -> $$0x.b), eyf.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, eyg::new)
   );
   private final ewm<?> b;
   private final eyd c;

   private eyg(List<ezy> $$0, ewm<?> $$1, eyd $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eye<eyg> b() {
      return eyf.u;
   }

   @Override
   public cxp a(cxp $$0, ewp $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         this.b.a($$0, $$1x -> this.c.apply($$1x, $$1));
         return $$0;
      }
   }

   @Override
   public void a(ewv $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
