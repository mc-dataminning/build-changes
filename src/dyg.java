import com.mojang.serialization.Codec;

public class dyg extends dyx {
   public static final Codec<dyg> a = jd.f.q().fieldOf("block").xmap(dyg::new, $$0 -> $$0.b).codec();
   private final csx b;

   public dyg(csx $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dfl $$0, ase $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected dyy<?> a() {
      return dyy.b;
   }
}
