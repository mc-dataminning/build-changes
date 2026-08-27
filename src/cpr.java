import java.util.function.Function;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class cpr extends cps {
   private final akf j;
   @Nullable
   private final akf k;
   private final cpr.a l;

   public cpr(iv<cpt> $$0, cpr.a $$1, boolean $$2, cry.a $$3) {
      super($$0, cps.a.e, $$3);
      this.l = $$1;
      akf $$4 = $$1.c.apply($$0.e().orElseThrow().a());
      this.j = $$4.e(".png");
      if ($$2) {
         this.k = $$4.e("_overlay.png");
      } else {
         this.k = null;
      }
   }

   public akf b() {
      return this.j;
   }

   @Nullable
   public akf c() {
      return this.k;
   }

   public cpr.a d() {
      return this.l;
   }

   @Override
   public auy e() {
      return this.l.d;
   }

   public static enum a {
      a($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/entity/horse/armor/horse_armor_" + $$0x)), auz.nr),
      b($$0 -> $$0.c("textures/entity/wolf/wolf_armor"), auz.Cs);

      final Function<akf, akf> c;
      final auy d;

      private a(Function<akf, akf> $$0, auy $$1) {
         this.c = $$0;
         this.d = $$1;
      }
   }
}
