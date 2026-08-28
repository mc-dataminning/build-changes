import java.util.function.Function;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class cse extends csf {
   private final alf j;
   @Nullable
   private final alf k;
   private final cse.a l;

   public cse(ji<csg> $$0, cse.a $$1, boolean $$2, cul.a $$3) {
      super($$0, csf.a.e, $$3);
      this.l = $$1;
      alf $$4 = $$1.c.apply($$0.e().orElseThrow().a());
      this.j = $$4.e(".png");
      if ($$2) {
         this.k = $$4.e("_overlay.png");
      } else {
         this.k = null;
      }
   }

   public alf b() {
      return this.j;
   }

   @Nullable
   public alf c() {
      return this.k;
   }

   public cse.a d() {
      return this.l;
   }

   @Override
   public avz e() {
      return this.l.d;
   }

   @Override
   public boolean a(cuq $$0) {
      return false;
   }

   public static enum a {
      a($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/entity/horse/armor/horse_armor_" + $$0x)), awa.nB),
      b($$0 -> $$0.c("textures/entity/wolf/wolf_armor"), awa.CE);

      final Function<alf, alf> c;
      final avz d;

      private a(final Function<alf, alf> $$0, final avz $$1) {
         this.c = $$0;
         this.d = $$1;
      }
   }
}
