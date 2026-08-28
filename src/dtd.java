import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtd extends dse implements dsw {
   public static final MapCodec<dtd> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxm.a.fieldOf("block_set_type").forGetter(dse::q), dsw.a.e.fieldOf("weathering_state").forGetter(dtd::r), t()).apply($$0, dtd::new)
   );
   private final dsw.a n;

   @Override
   public MapCodec<dtd> a() {
      return m;
   }

   protected dtd(dxm $$0, dsw.a $$1, dww.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(dwx $$0, arc $$1, ji $$2, azh $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dwx $$0) {
      return dsw.c($$0.b()).isPresent();
   }

   public dsw.a r() {
      return this.n;
   }
}
