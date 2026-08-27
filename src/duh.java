import com.mojang.serialization.Codec;

public class duh extends duv {
   public static final Codec<duh> a = bgf.b(0, 256).fieldOf("count").xmap(duh::new, $$0 -> $$0.c).codec();
   private final bgf c;

   private duh(bgf $$0) {
      this.c = $$0;
   }

   public static duh a(bgf $$0) {
      return new duh($$0);
   }

   public static duh a(int $$0) {
      return a(bgc.a($$0));
   }

   @Override
   protected int a(ase $$0, gw $$1) {
      return this.c.a($$0);
   }

   @Override
   public dus<?> b() {
      return dus.f;
   }
}
