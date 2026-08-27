import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnm extends dmn implements dnf {
   public static final MapCodec<dnm> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drs.a.fieldOf("block_set_type").forGetter(dmn::m), dnf.a.e.fieldOf("weathering_state").forGetter(dnm::s), u()).apply($$0, dnm::new)
   );
   private final dnf.a n;

   @Override
   public MapCodec<dnm> a() {
      return m;
   }

   protected dnm(drs $$0, dnf.a $$1, drc.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(drd $$0, aqn $$1, io $$2, aym $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(drd $$0) {
      return dnf.c($$0.b()).isPresent();
   }

   public dnf.a s() {
      return this.n;
   }
}
