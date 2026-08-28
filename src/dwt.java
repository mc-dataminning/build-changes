import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwt extends duv implements dwn {
   public static final MapCodec<dwt> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwn.a.e.fieldOf("weathering_state").forGetter(dnu::c), eat.a.fieldOf("base_state").forGetter($$0x -> $$0x.f), t()).apply($$0, dwt::new)
   );
   private final dwn.a h;

   @Override
   public MapCodec<dwt> a() {
      return g;
   }

   public dwt(dwn.a $$0, eat $$1, eas.d $$2) {
      super($$1, $$2);
      this.h = $$0;
   }

   @Override
   protected void b(eat $$0, arq $$1, iv $$2, azv $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(eat $$0) {
      return dwn.c($$0.b()).isPresent();
   }

   public dwn.a q() {
      return this.h;
   }
}
