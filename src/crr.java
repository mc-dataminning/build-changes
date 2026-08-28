import java.util.function.Function;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class crr extends crs {
   private final akk j;
   @Nullable
   private final akk k;
   private final crr.a l;

   public crr(jj<crt> $$0, crr.a $$1, boolean $$2, ctx.a $$3) {
      super($$0, crs.a.e, $$3);
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

   public crr.a d() {
      return this.l;
   }

   @Override
   public avg e() {
      return this.l.d;
   }

   @Override
   public boolean a(cuc $$0) {
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
