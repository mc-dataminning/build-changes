import com.mojang.serialization.MapCodec;

public class efz extends efq {
   public static final MapCodec<efz> b = dsl.b.fieldOf("state").xmap(efz::new, $$0 -> $$0.c);
   private final dsl c;

   protected efz(dsl $$0) {
      this.c = $$0;
   }

   @Override
   protected efr<?> a() {
      return efr.a;
   }

   @Override
   public dsl a(ayo $$0, ja $$1) {
      return this.c;
   }
}
