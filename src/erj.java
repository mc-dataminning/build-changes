import com.mojang.serialization.MapCodec;

public class erj extends ery {
   public static final MapCodec<erj> a = buh.b(0, 256).fieldOf("count").xmap(erj::new, $$0 -> $$0.c);
   private final buh c;

   private erj(buh $$0) {
      this.c = $$0;
   }

   public static erj a(buh $$0) {
      return new erj($$0);
   }

   public static erj a(int $$0) {
      return a(bue.a($$0));
   }

   @Override
   protected int a(bai $$0, iw $$1) {
      return this.c.a($$0);
   }

   @Override
   public erv<?> b() {
      return erv.f;
   }
}
