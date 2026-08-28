import com.mojang.serialization.MapCodec;

public class ejd extends eiu {
   public static final MapCodec<ejd> b = dvo.a.fieldOf("state").xmap(ejd::new, $$0 -> $$0.c);
   private final dvo c;

   protected ejd(dvo $$0) {
      this.c = $$0;
   }

   @Override
   protected eiv<?> a() {
      return eiv.a;
   }

   @Override
   public dvo a(azv $$0, jh $$1) {
      return this.c;
   }
}
