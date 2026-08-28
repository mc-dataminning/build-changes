import com.mojang.serialization.MapCodec;

public class ens extends enj {
   public static final MapCodec<ens> b = dzz.a.fieldOf("state").xmap(ens::new, $$0 -> $$0.c);
   private final dzz c;

   protected ens(dzz $$0) {
      this.c = $$0;
   }

   @Override
   protected enk<?> a() {
      return enk.a;
   }

   @Override
   public dzz a(azv $$0, iu $$1) {
      return this.c;
   }
}
