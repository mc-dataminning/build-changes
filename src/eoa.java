import com.mojang.serialization.MapCodec;

public class eoa extends enr {
   public static final MapCodec<eoa> b = eah.a.fieldOf("state").xmap(eoa::new, $$0 -> $$0.c);
   private final eah c;

   protected eoa(eah $$0) {
      this.c = $$0;
   }

   @Override
   protected ens<?> a() {
      return ens.a;
   }

   @Override
   public eah a(azv $$0, iu $$1) {
      return this.c;
   }
}
