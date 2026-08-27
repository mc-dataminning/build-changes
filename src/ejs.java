import com.mojang.serialization.Codec;

public class ejs extends ekj {
   public static final Codec<ejs> a = ld.e.q().fieldOf("block").xmap(ejs::new, $$0 -> $$0.b).codec();
   private final dde b;

   public ejs(dde $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dqh $$0, ayg $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected ekk<?> a() {
      return ekk.b;
   }
}
