import java.util.function.Function;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class csb extends csc {
   private final ale j;
   @Nullable
   private final ale k;
   private final csb.a l;

   public csb(ji<csd> $$0, csb.a $$1, boolean $$2, cui.a $$3) {
      super($$0, csc.a.e, $$3);
      this.l = $$1;
      ale $$4 = $$1.c.apply($$0.e().orElseThrow().a());
      this.j = $$4.e(".png");
      if ($$2) {
         this.k = $$4.e("_overlay.png");
      } else {
         this.k = null;
      }
   }

   public ale b() {
      return this.j;
   }

   @Nullable
   public ale c() {
      return this.k;
   }

   public csb.a d() {
      return this.l;
   }

   @Override
   public avy e() {
      return this.l.d;
   }

   @Override
   public boolean a(cun $$0) {
      return false;
   }

   public static enum a {
      a($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/entity/horse/armor/horse_armor_" + $$0x)), avz.nB),
      b($$0 -> $$0.c("textures/entity/wolf/wolf_armor"), avz.CE);

      final Function<ale, ale> c;
      final avy d;

      private a(final Function<ale, ale> $$0, final avy $$1) {
         this.c = $$0;
         this.d = $$1;
      }
   }
}
