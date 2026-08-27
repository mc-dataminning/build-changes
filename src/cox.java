import java.util.function.Function;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class cox extends coy {
   private final ajt j;
   @Nullable
   private final ajt k;
   private final cox.a l;

   public cox(il<coz> $$0, cox.a $$1, boolean $$2, cre.a $$3) {
      super($$0, coy.a.e, $$3);
      this.l = $$1;
      ajt $$4 = $$1.c.apply($$0.e().orElseThrow().a());
      this.j = $$4.e(".png");
      if ($$2) {
         this.k = $$4.e("_overlay.png");
      } else {
         this.k = null;
      }
   }

   public ajt b() {
      return this.j;
   }

   @Nullable
   public ajt c() {
      return this.k;
   }

   public cox.a d() {
      return this.l;
   }

   @Override
   public aul e() {
      return this.l.d;
   }

   public static enum a {
      a($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/entity/horse/armor/horse_armor_" + $$0x)), aum.nm),
      b($$0 -> $$0.c("textures/entity/wolf/wolf_armor"), aum.Cl);

      final Function<ajt, ajt> c;
      final aul d;

      private a(Function<ajt, ajt> $$0, aul $$1) {
         this.c = $$0;
         this.d = $$1;
      }
   }
}
