import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwi extends dvh implements dwb {
   public static final MapCodec<dwi> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eaw.a.fieldOf("block_set_type").forGetter(dvh::q), dwb.a.e.fieldOf("weathering_state").forGetter(dwi::r), t()).apply($$0, dwi::new)
   );
   private final dwb.a h;

   @Override
   public MapCodec<dwi> a() {
      return g;
   }

   protected dwi(eaw $$0, dwb.a $$1, eag.d $$2) {
      super($$0, $$2);
      this.h = $$1;
   }

   @Override
   protected void b(eah $$0, arq $$1, iu $$2, azv $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(eah $$0) {
      return dwb.c($$0.b()).isPresent();
   }

   public dwb.a r() {
      return this.h;
   }
}
