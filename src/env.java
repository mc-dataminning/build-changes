import com.mojang.serialization.MapCodec;

public class env extends enn {
   public static final MapCodec<env> a = awu.a(lu.f).fieldOf("tag").xmap(env::new, $$0 -> $$0.b);
   private final awu<dfy> b;

   public env(awu<dfy> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dtc $$0, ayw $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected eno<?> a() {
      return eno.d;
   }
}
