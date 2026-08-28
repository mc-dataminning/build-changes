import com.mojang.serialization.MapCodec;

public class euf extends eux {
   public static final MapCodec<euf> a = mf.e.q().fieldOf("block").xmap(euf::new, $$0 -> $$0.b);
   private final dmf b;

   public euf(dmf $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(eah $$0, azv $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected euy<?> a() {
      return euy.b;
   }
}
