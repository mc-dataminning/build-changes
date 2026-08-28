import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwr extends dwm implements dwn {
   public static final MapCodec<dwr> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwn.a.e.fieldOf("weathering_state").forGetter(dwr::q), t()).apply($$0, dwr::new)
   );
   private final dwn.a f;

   @Override
   protected MapCodec<dwr> a() {
      return e;
   }

   protected dwr(dwn.a $$0, eas.d $$1) {
      super($$1);
      this.f = $$0;
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
      return this.f;
   }
}
