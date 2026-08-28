import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dte extends dsf implements dsx {
   public static final MapCodec<dte> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxn.a.fieldOf("block_set_type").forGetter(dsf::q), dsx.a.e.fieldOf("weathering_state").forGetter(dte::r), t()).apply($$0, dte::new)
   );
   private final dsx.a n;

   @Override
   public MapCodec<dte> a() {
      return m;
   }

   protected dte(dxn $$0, dsx.a $$1, dwx.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(dwy $$0, ard $$1, ji $$2, azh $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dwy $$0) {
      return dsx.c($$0.b()).isPresent();
   }

   public dsx.a r() {
      return this.n;
   }
}
