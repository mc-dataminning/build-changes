import com.mojang.serialization.Codec;

public class egf extends egw {
   public static final Codec<egf> a = ki.e.q().fieldOf("block").xmap(egf::new, $$0 -> $$0.b).codec();
   private final daa b;

   public egf(daa $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dmz $$0, axd $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected egx<?> a() {
      return egx.b;
   }
}
