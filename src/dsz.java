import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsz extends dqs implements dsu {
   public static final MapCodec<dsz> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsu.a.e.fieldOf("weathering_state").forGetter(dkm::c), t()).apply($$0, dsz::new)
   );
   private final dsu.a g;

   @Override
   public MapCodec<dsz> a() {
      return f;
   }

   public dsz(dsu.a $$0, dwu.d $$1) {
      super($$1);
      this.g = $$0;
   }

   @Override
   protected void b(dwv $$0, arc $$1, ji $$2, azg $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dwv $$0) {
      return dsu.c($$0.b()).isPresent();
   }

   public dsu.a q() {
      return this.g;
   }
}
