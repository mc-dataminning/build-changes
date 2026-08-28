import com.mojang.serialization.MapCodec;

public class eqz extends ero {
   public static final MapCodec<eqz> a = bty.b(0, 256).fieldOf("count").xmap(eqz::new, $$0 -> $$0.c);
   private final bty c;

   private eqz(bty $$0) {
      this.c = $$0;
   }

   public static eqz a(bty $$0) {
      return new eqz($$0);
   }

   public static eqz a(int $$0) {
      return a(btv.a($$0));
   }

   @Override
   protected int a(azz $$0, iw $$1) {
      return this.c.a($$0);
   }

   @Override
   public erl<?> b() {
      return erl.f;
   }
}
