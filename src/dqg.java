import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqg extends dnz implements dqb {
   public static final MapCodec<dqg> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dqb.a.e.fieldOf("weathering_state").forGetter(dhw::c), u()).apply($$0, dqg::new)
   );
   private final dqb.a g;

   @Override
   public MapCodec<dqg> a() {
      return f;
   }

   public dqg(dqb.a $$0, dtz.d $$1) {
      super($$1);
      this.g = $$0;
   }

   @Override
   protected void b(dua $$0, arg $$1, je $$2, azk $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dua $$0) {
      return dqb.c($$0.b()).isPresent();
   }

   public dqb.a m() {
      return this.g;
   }
}
