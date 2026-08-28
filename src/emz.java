import com.mojang.serialization.MapCodec;

public class emz extends eno {
   public static final MapCodec<emz> a = bsf.b(0, 256).fieldOf("count").xmap(emz::new, $$0 -> $$0.c);
   private final bsf c;

   private emz(bsf $$0) {
      this.c = $$0;
   }

   public static emz a(bsf $$0) {
      return new emz($$0);
   }

   public static emz a(int $$0) {
      return a(bsc.a($$0));
   }

   @Override
   protected int a(bac $$0, jh $$1) {
      return this.c.a($$0);
   }

   @Override
   public enl<?> b() {
      return enl.f;
   }
}
