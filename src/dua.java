import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dua extends dtb implements dtt {
   public static final MapCodec<dua> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyj.a.fieldOf("block_set_type").forGetter(dtb::q), dtt.a.e.fieldOf("weathering_state").forGetter(dua::r), t()).apply($$0, dua::new)
   );
   private final dtt.a n;

   @Override
   public MapCodec<dua> a() {
      return m;
   }

   protected dua(dyj $$0, dtt.a $$1, dxt.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(dxu $$0, ash $$1, jh $$2, bam $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dxu $$0) {
      return dtt.c($$0.b()).isPresent();
   }

   public dtt.a r() {
      return this.n;
   }
}
