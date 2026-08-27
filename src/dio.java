import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dio extends dgh implements dij {
   public static final MapCodec<dio> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dij.a.e.fieldOf("weathering_state").forGetter(dag::c), u()).apply($$0, dio::new)
   );
   private final dij.a g;

   @Override
   public MapCodec<dio> a() {
      return f;
   }

   public dio(dij.a $$0, dmd.d $$1) {
      super($$1);
      this.g = $$0;
   }

   @Override
   protected void b(dme $$0, apa $$1, ib $$2, awt $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dme $$0) {
      return dij.c($$0.b()).isPresent();
   }

   public dij.a i() {
      return this.g;
   }
}
