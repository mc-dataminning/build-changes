import com.mojang.serialization.MapCodec;

public class emg extends emv {
   public static final MapCodec<emg> a = brn.b(0, 256).fieldOf("count").xmap(emg::new, $$0 -> $$0.c);
   private final brn c;

   private emg(brn $$0) {
      this.c = $$0;
   }

   public static emg a(brn $$0) {
      return new emg($$0);
   }

   public static emg a(int $$0) {
      return a(brk.a($$0));
   }

   @Override
   protected int a(azg $$0, ji $$1) {
      return this.c.a($$0);
   }

   @Override
   public ems<?> b() {
      return ems.f;
   }
}
