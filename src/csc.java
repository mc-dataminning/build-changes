import java.util.function.Function;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class csc extends csd {
   private final akq j;
   @Nullable
   private final akq k;
   private final csc.a l;

   public csc(jm<cse> $$0, csc.a $$1, boolean $$2, cuj.a $$3) {
      super($$0, csd.a.e, $$3);
      this.l = $$1;
      akq $$4 = $$1.c.apply($$0.e().orElseThrow().a());
      this.j = $$4.g(".png");
      if ($$2) {
         this.k = $$4.g("_overlay.png");
      } else {
         this.k = null;
      }
   }

   public akq b() {
      return this.j;
   }

   @Nullable
   public akq c() {
      return this.k;
   }

   public csc.a d() {
      return this.l;
   }

   @Override
   public avn e() {
      return this.l.d;
   }

   @Override
   public boolean a(cuo $$0) {
      return false;
   }

   public static enum a {
      a($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/entity/horse/armor/horse_armor_" + $$0x)), avo.nB),
      b($$0 -> $$0.e("textures/entity/wolf/wolf_armor"), avo.CI);

      final Function<akq, akq> c;
      final avn d;

      private a(final Function<akq, akq> $$0, final avn $$1) {
         this.c = $$0;
         this.d = $$1;
      }
   }
}
