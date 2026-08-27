import com.mojang.serialization.Codec;

public class egh extends egy {
   public static final Codec<egh> a = ki.e.q().fieldOf("block").xmap(egh::new, $$0 -> $$0.b).codec();
   private final dac b;

   public egh(dac $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dnb $$0, axd $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected egz<?> a() {
      return egz.b;
   }
}
