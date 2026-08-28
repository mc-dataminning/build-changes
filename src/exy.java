import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class exy extends exu {
   public static final MapCodec<exy> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(ewf.e.fieldOf("component").forGetter($$0x -> $$0x.b), exx.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, exy::new)
   );
   private final ewe<?> b;
   private final exv c;

   private exy(List<ezs> $$0, ewe<?> $$1, exv $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public exw<exy> b() {
      return exx.u;
   }

   @Override
   public cxk a(cxk $$0, ewh $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         this.b.a($$0, $$1x -> this.c.apply($$1x, $$1));
         return $$0;
      }
   }

   @Override
   public void a(ewn $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
