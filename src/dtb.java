import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtb extends dqu implements dsw {
   public static final MapCodec<dtb> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsw.a.e.fieldOf("weathering_state").forGetter(dko::c), t()).apply($$0, dtb::new)
   );
   private final dsw.a g;

   @Override
   public MapCodec<dtb> a() {
      return f;
   }

   public dtb(dsw.a $$0, dww.d $$1) {
      super($$1);
      this.g = $$0;
   }

   @Override
   protected void b(dwx $$0, arc $$1, ji $$2, azh $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dwx $$0) {
      return dsw.c($$0.b()).isPresent();
   }

   public dsw.a q() {
      return this.g;
   }
}
