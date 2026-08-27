import com.mojang.serialization.Codec;

public class emw extends enn {
   public static final Codec<emw> a = lh.e.q().fieldOf("block").xmap(emw::new, $$0 -> $$0.b).codec();
   private final dfc b;

   public emw(dfc $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dtc $$0, ayt $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected eno<?> a() {
      return eno.b;
   }
}
