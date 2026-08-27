import com.mojang.serialization.Codec;

public class ecq extends eci {
   public static final Codec<ecq> a = asg.a(kc.f).fieldOf("tag").xmap(ecq::new, $$0 -> $$0.b).codec();
   private final asg<cvz> b;

   public ecq(asg<cvz> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dip $$0, auf $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected ecj<?> a() {
      return ecj.d;
   }
}
