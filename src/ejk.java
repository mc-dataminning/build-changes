import com.mojang.serialization.MapCodec;

public class ejk extends ejb {
   public static final MapCodec<ejk> b = dvv.a.fieldOf("state").xmap(ejk::new, $$0 -> $$0.c);
   private final dvv c;

   protected ejk(dvv $$0) {
      this.c = $$0;
   }

   @Override
   protected ejc<?> a() {
      return ejc.a;
   }

   @Override
   public dvv a(azu $$0, jh $$1) {
      return this.c;
   }
}
