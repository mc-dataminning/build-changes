import com.mojang.serialization.MapCodec;

public class ehj extends ehx {
   public static final MapCodec<ehj> a = bqb.b(0, 256).fieldOf("count").xmap(ehj::new, $$0 -> $$0.c);
   private final bqb c;

   private ehj(bqb $$0) {
      this.c = $$0;
   }

   public static ehj a(bqb $$0) {
      return new ehj($$0);
   }

   public static ehj a(int $$0) {
      return a(bpy.a($$0));
   }

   @Override
   protected int a(azh $$0, iz $$1) {
      return this.c.a($$0);
   }

   @Override
   public ehu<?> b() {
      return ehu.f;
   }
}
