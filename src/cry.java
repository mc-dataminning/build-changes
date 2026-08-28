import java.util.function.Function;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class cry extends crz {
   private final alb j;
   @Nullable
   private final alb k;
   private final cry.a l;

   public cry(ji<csa> $$0, cry.a $$1, boolean $$2, cuf.a $$3) {
      super($$0, crz.a.e, $$3);
      this.l = $$1;
      alb $$4 = $$1.c.apply($$0.e().orElseThrow().a());
      this.j = $$4.e(".png");
      if ($$2) {
         this.k = $$4.e("_overlay.png");
      } else {
         this.k = null;
      }
   }

   public alb b() {
      return this.j;
   }

   @Nullable
   public alb c() {
      return this.k;
   }

   public cry.a d() {
      return this.l;
   }

   @Override
   public avv e() {
      return this.l.d;
   }

   public static enum a {
      a($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/entity/horse/armor/horse_armor_" + $$0x)), avw.nB),
      b($$0 -> $$0.c("textures/entity/wolf/wolf_armor"), avw.CE);

      final Function<alb, alb> c;
      final avv d;

      private a(final Function<alb, alb> $$0, final avv $$1) {
         this.c = $$0;
         this.d = $$1;
      }
   }
}
