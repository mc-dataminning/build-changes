import com.mojang.serialization.MapCodec;

public class ejk extends ejz {
   public static final MapCodec<ejk> a = bqp.b(0, 256).fieldOf("count").xmap(ejk::new, $$0 -> $$0.c);
   private final bqp c;

   private ejk(bqp $$0) {
      this.c = $$0;
   }

   public static ejk a(bqp $$0) {
      return new ejk($$0);
   }

   public static ejk a(int $$0) {
      return a(bqm.a($$0));
   }

   @Override
   protected int a(azk $$0, je $$1) {
      return this.c.a($$0);
   }

   @Override
   public ejw<?> b() {
      return ejw.f;
   }
}
