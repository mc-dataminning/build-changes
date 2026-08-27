import java.util.function.Function;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class crs extends crt {
   private final akt j;
   @Nullable
   private final akt k;
   private final crs.a l;

   public crs(ja<cru> $$0, crs.a $$1, boolean $$2, cuc.a $$3) {
      super($$0, crt.a.e, $$3);
      this.l = $$1;
      akt $$4 = $$1.c.apply($$0.e().orElseThrow().a());
      this.j = $$4.e(".png");
      if ($$2) {
         this.k = $$4.e("_overlay.png");
      } else {
         this.k = null;
      }
   }

   public akt b() {
      return this.j;
   }

   @Nullable
   public akt c() {
      return this.k;
   }

   public crs.a d() {
      return this.l;
   }

   @Override
   public avn e() {
      return this.l.d;
   }

   public static enum a {
      a($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/entity/horse/armor/horse_armor_" + $$0x)), avo.nR),
      b($$0 -> $$0.c("textures/entity/wolf/wolf_armor"), avo.Dc);

      final Function<akt, akt> c;
      final avn d;

      private a(Function<akt, akt> $$0, avn $$1) {
         this.c = $$0;
         this.d = $$1;
      }
   }
}
