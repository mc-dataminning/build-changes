import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class exz extends exv {
   public static final MapCodec<exz> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(ewg.e.fieldOf("component").forGetter($$0x -> $$0x.b), exy.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, exz::new)
   );
   private final ewf<?> b;
   private final exw c;

   private exz(List<ezr> $$0, ewf<?> $$1, exw $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public exx<exz> b() {
      return exy.u;
   }

   @Override
   public cxg a(cxg $$0, ewi $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         this.b.a($$0, $$1x -> this.c.apply($$1x, $$1));
         return $$0;
      }
   }

   @Override
   public void a(ewo $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
