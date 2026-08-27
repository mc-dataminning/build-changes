import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dei extends ddm implements deb {
   public static final MapCodec<dei> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dhx.a.fieldOf("block_set_type").forGetter(ddm::g), deb.a.e.fieldOf("weathering_state").forGetter(dei::s), u()).apply($$0, dei::new)
   );
   private final deb.a n;

   @Override
   public MapCodec<dei> a() {
      return m;
   }

   protected dei(dhx $$0, deb.a $$1, dhh.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   public void b(dhi $$0, ame $$1, ht $$2, ats $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(dhi $$0) {
      return deb.c($$0.b()).isPresent();
   }

   public deb.a s() {
      return this.n;
   }
}
