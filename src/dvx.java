import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvx extends dvs implements dvt {
   public static final MapCodec<dvx> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dvt.a.e.fieldOf("weathering_state").forGetter(dvx::q), t()).apply($$0, dvx::new)
   );
   private final dvt.a f;

   @Override
   protected MapCodec<dvx> a() {
      return e;
   }

   protected dvx(dvt.a $$0, dzy.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dzz $$0, arq $$1, iu $$2, azv $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dzz $$0) {
      return dvt.c($$0.b()).isPresent();
   }

   public dvt.a q() {
      return this.f;
   }
}
