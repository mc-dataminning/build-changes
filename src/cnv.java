import java.util.function.Function;
import java.util.function.UnaryOperator;

public class cnv extends cnw {
   private final ajh d;
   private final cnv.a e;

   public cnv(il<cnx> $$0, cnv.a $$1, cqf.a $$2) {
      super($$0, cnw.a.e, $$2);
      this.e = $$1;
      this.d = $$1.c.apply($$0.e().orElseThrow().a());
   }

   public ajh b() {
      return this.d;
   }

   public cnv.a c() {
      return this.e;
   }

   public static enum a {
      a($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/entity/horse/armor/horse_armor_" + $$0x + ".png"))),
      b($$0 -> $$0.c("textures/entity/wolf/wolf_armor.png"));

      final Function<ajh, ajh> c;

      private a(Function<ajh, ajh> $$0) {
         this.c = $$0;
      }
   }
}
