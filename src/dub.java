import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dub extends dtc implements dtu {
   public static final MapCodec<dub> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyk.a.fieldOf("block_set_type").forGetter(dtc::q), dtu.a.e.fieldOf("weathering_state").forGetter(dub::r), t()).apply($$0, dub::new)
   );
   private final dtu.a n;

   @Override
   public MapCodec<dub> a() {
      return m;
   }

   protected dub(dyk $$0, dtu.a $$1, dxu.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(dxv $$0, ash $$1, jh $$2, bam $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dxv $$0) {
      return dtu.c($$0.b()).isPresent();
   }

   public dtu.a r() {
      return this.n;
   }
}
