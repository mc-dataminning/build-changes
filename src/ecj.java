import com.mojang.serialization.Codec;

public class ecj extends eda {
   public static final Codec<ecj> a = kd.e.q().fieldOf("block").xmap(ecj::new, $$0 -> $$0.b).codec();
   private final cwq b;

   public ecj(cwq $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(djh $$0, auv $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected edb<?> a() {
      return edb.b;
   }
}
