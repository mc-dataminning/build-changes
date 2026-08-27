import com.mojang.serialization.Codec;

public class eak extends ebb {
   public static final Codec<eak> a = jy.f.q().fieldOf("block").xmap(eak::new, $$0 -> $$0.b).codec();
   private final cva b;

   public eak(cva $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dhi $$0, ats $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected ebc<?> a() {
      return ebc.b;
   }
}
