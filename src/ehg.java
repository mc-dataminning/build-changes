import com.mojang.serialization.Codec;

public class ehg extends egy {
   public static final Codec<ehg> a = avd.a(kj.f).fieldOf("tag").xmap(ehg::new, $$0 -> $$0.b).codec();
   private final avd<dac> b;

   public ehg(avd<dac> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dnb $$0, axd $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected egz<?> a() {
      return egz.d;
   }
}
