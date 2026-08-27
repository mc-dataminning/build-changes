import java.util.function.Function;
import java.util.function.UnaryOperator;

public class cnb extends cnc {
   private final ajc d;
   private final cnb.a e;

   public cnb(il<cnd> $$0, cnb.a $$1, cpl.a $$2) {
      super($$0, cnc.a.e, $$2);
      this.e = $$1;
      this.d = $$1.c.apply($$0.e().orElseThrow().a());
   }

   public ajc b() {
      return this.d;
   }

   public cnb.a c() {
      return this.e;
   }

   public static enum a {
      a($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/entity/horse/armor/horse_armor_" + $$0x + ".png"))),
      b($$0 -> $$0.c("textures/entity/wolf/wolf_armor.png"));

      final Function<ajc, ajc> c;

      private a(Function<ajc, ajc> $$0) {
         this.c = $$0;
      }
   }
}
