import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsx extends djk implements dsu {
   public static final MapCodec<dsx> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsu.a.e.fieldOf("weathering_state").forGetter(dkm::c), t()).apply($$0, dsx::new)
   );
   private final dsu.a e;

   @Override
   public MapCodec<dsx> a() {
      return d;
   }

   public dsx(dsu.a $$0, dwu.d $$1) {
      super($$1);
      this.e = $$0;
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
      return this.e;
   }
}
