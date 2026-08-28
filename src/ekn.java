import com.mojang.serialization.MapCodec;

public class ekn extends elc {
   public static final MapCodec<ekn> a = brd.b(0, 256).fieldOf("count").xmap(ekn::new, $$0 -> $$0.c);
   private final brd c;

   private ekn(brd $$0) {
      this.c = $$0;
   }

   public static ekn a(brd $$0) {
      return new ekn($$0);
   }

   public static ekn a(int $$0) {
      return a(bra.a($$0));
   }

   @Override
   protected int a(azr $$0, jg $$1) {
      return this.c.a($$0);
   }

   @Override
   public ekz<?> b() {
      return ekz.f;
   }
}
