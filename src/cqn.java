import java.util.function.Function;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class cqn extends cqo {
   private final akh j;
   @Nullable
   private final akh k;
   private final cqn.a l;

   public cqn(iw<cqp> $$0, cqn.a $$1, boolean $$2, csu.a $$3) {
      super($$0, cqo.a.e, $$3);
      this.l = $$1;
      akh $$4 = $$1.c.apply($$0.e().orElseThrow().a());
      this.j = $$4.e(".png");
      if ($$2) {
         this.k = $$4.e("_overlay.png");
      } else {
         this.k = null;
      }
   }

   public akh b() {
      return this.j;
   }

   @Nullable
   public akh c() {
      return this.k;
   }

   public cqn.a d() {
      return this.l;
   }

   @Override
   public avb e() {
      return this.l.d;
   }

   public static enum a {
      a($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/entity/horse/armor/horse_armor_" + $$0x)), avc.nr),
      b($$0 -> $$0.c("textures/entity/wolf/wolf_armor"), avc.Ct);

      final Function<akh, akh> c;
      final avb d;

      private a(Function<akh, akh> $$0, avb $$1) {
         this.c = $$0;
         this.d = $$1;
      }
   }
}
