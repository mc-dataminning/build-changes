import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwh extends duj implements dwb {
   public static final MapCodec<dwh> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwb.a.e.fieldOf("weathering_state").forGetter(dni::c), eah.a.fieldOf("base_state").forGetter($$0x -> $$0x.f), t()).apply($$0, dwh::new)
   );
   private final dwb.a h;

   @Override
   public MapCodec<dwh> a() {
      return g;
   }

   public dwh(dwb.a $$0, eah $$1, eag.d $$2) {
      super($$1, $$2);
      this.h = $$0;
   }

   @Override
   protected void b(eah $$0, arq $$1, iu $$2, azv $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(eah $$0) {
      return dwb.c($$0.b()).isPresent();
   }

   public dwb.a q() {
      return this.h;
   }
}
