import java.util.function.Function;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class ctb extends ctc {
   private final alb d;
   @Nullable
   private final alb k;
   private final ctb.a l;

   public ctb(jn<ctd> $$0, ctb.a $$1, boolean $$2, cvg.a $$3) {
      super($$0, ctc.a.e, $$3);
      this.l = $$1;
      alb $$4 = $$1.c.apply($$0.e().orElseThrow().a());
      this.d = $$4.g(".png");
      if ($$2) {
         this.k = $$4.g("_overlay.png");
      } else {
         this.k = null;
      }
   }

   public alb b() {
      return this.d;
   }

   @Nullable
   public alb c() {
      return this.k;
   }

   public ctb.a d() {
      return this.l;
   }

   @Override
   public awc e() {
      return this.l.d;
   }

   @Override
   public boolean a(cvl $$0) {
      return false;
   }

   public static enum a {
      a($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/entity/horse/armor/horse_armor_" + $$0x)), awd.nC),
      b($$0 -> $$0.e("textures/entity/wolf/wolf_armor"), awd.CO);

      final Function<alb, alb> c;
      final awc d;

      private a(final Function<alb, alb> $$0, final awc $$1) {
         this.c = $$0;
         this.d = $$1;
      }
   }
}
