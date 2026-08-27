import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ddv extends dbv implements ddt {
   public static final MapCodec<ddv> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ddt.a.e.fieldOf("weathering_state").forGetter(cvu::c), t()).apply($$0, ddv::new)
   );
   private final ddt.a g;

   @Override
   public MapCodec<ddv> a() {
      return f;
   }

   public ddv(ddt.a $$0, dgv.d $$1) {
      super($$1);
      this.g = $$0;
   }

   @Override
   public void b(dgw $$0, ama $$1, ht $$2, ato $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(dgw $$0) {
      return ddt.c($$0.b()).isPresent();
   }

   public ddt.a g() {
      return this.g;
   }
}
