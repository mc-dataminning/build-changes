import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dln extends den implements dll {
   public static final MapCodec<dln> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dpx.a.fieldOf("block_set_type").forGetter(den::b), dll.a.e.fieldOf("weathering_state").forGetter(dln::k), u()).apply($$0, dln::new)
   );
   private final dll.a m;

   @Override
   public MapCodec<dln> a() {
      return l;
   }

   protected dln(dpx $$0, dll.a $$1, dph.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(dpi $$0, apu $$1, id $$2, axt $$3) {
      if ($$0.c(den.f) == dqe.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean e_(dpi $$0) {
      return dll.c($$0.b()).isPresent();
   }

   public dll.a k() {
      return this.m;
   }
}
