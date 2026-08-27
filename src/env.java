import com.mojang.serialization.Codec;

public class env extends enn {
   public static final Codec<env> a = awt.a(li.f).fieldOf("tag").xmap(env::new, $$0 -> $$0.b).codec();
   private final awt<dfc> b;

   public env(awt<dfc> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dtc $$0, ayt $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected eno<?> a() {
      return eno.d;
   }
}
