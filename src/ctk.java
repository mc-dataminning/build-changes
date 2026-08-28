import java.util.function.Function;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class ctk extends ctl {
   private final ale d;
   @Nullable
   private final ale k;
   private final ctk.a l;

   public ctk(jo<ctm> $$0, ctk.a $$1, boolean $$2, cvn.a $$3) {
      super($$0, ctl.a.e, $$3);
      this.l = $$1;
      ale $$4 = $$1.c.apply($$0.e().orElseThrow().a());
      this.d = $$4.g(".png");
      if ($$2) {
         this.k = $$4.g("_overlay.png");
      } else {
         this.k = null;
      }
   }

   public ale b() {
      return this.d;
   }

   @Nullable
   public ale c() {
      return this.k;
   }

   public ctk.a d() {
      return this.l;
   }

   @Override
   public awf e() {
      return this.l.d;
   }

   public static enum a {
      a($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/entity/horse/armor/horse_armor_" + $$0x)), awg.nC),
      b($$0 -> $$0.e("textures/entity/wolf/wolf_armor"), awg.CO);

      final Function<ale, ale> c;
      final awf d;

      private a(final Function<ale, ale> $$0, final awf $$1) {
         this.c = $$0;
         this.d = $$1;
      }
   }
}
