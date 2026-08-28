import java.util.function.Function;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class crs extends crt {
   private final akk j;
   @Nullable
   private final akk k;
   private final crs.a l;

   public crs(jj<cru> $$0, crs.a $$1, boolean $$2, cty.a $$3) {
      super($$0, crt.a.e, $$3);
      this.l = $$1;
      akk $$4 = $$1.c.apply($$0.e().orElseThrow().a());
      this.j = $$4.e(".png");
      if ($$2) {
         this.k = $$4.e("_overlay.png");
      } else {
         this.k = null;
      }
   }

   public akk b() {
      return this.j;
   }

   @Nullable
   public akk c() {
      return this.k;
   }

   public crs.a d() {
      return this.l;
   }

   @Override
   public avg e() {
      return this.l.d;
   }

   @Override
   public boolean a(cud $$0) {
      return false;
   }

   public static enum a {
      a($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/entity/horse/armor/horse_armor_" + $$0x)), avh.nB),
      b($$0 -> $$0.c("textures/entity/wolf/wolf_armor"), avh.CH);

      final Function<akk, akk> c;
      final avg d;

      private a(final Function<akk, akk> $$0, final avg $$1) {
         this.c = $$0;
         this.d = $$1;
      }
   }
}
