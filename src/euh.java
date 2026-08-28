import com.mojang.serialization.MapCodec;

public class euh extends eux {
   public static final MapCodec<euh> a = eah.a.fieldOf("block_state").xmap(euh::new, $$0 -> $$0.b);
   private final eah b;

   public euh(eah $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(eah $$0, azv $$1) {
      return $$0 == this.b;
   }

   @Override
   protected euy<?> a() {
      return euy.c;
   }
}
