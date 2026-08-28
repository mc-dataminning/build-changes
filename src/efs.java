import com.mojang.serialization.MapCodec;

public class efs extends efj {
   public static final MapCodec<efs> b = dsh.b.fieldOf("state").xmap(efs::new, $$0 -> $$0.c);
   private final dsh c;

   protected efs(dsh $$0) {
      this.c = $$0;
   }

   @Override
   protected efk<?> a() {
      return efk.a;
   }

   @Override
   public dsh a(aym $$0, ja $$1) {
      return this.c;
   }
}
