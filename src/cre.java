import java.util.function.Function;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class cre extends crf {
   private final akn j;
   @Nullable
   private final akn k;
   private final cre.a l;

   public cre(ix<crg> $$0, cre.a $$1, boolean $$2, ctl.a $$3) {
      super($$0, crf.a.e, $$3);
      this.l = $$1;
      akn $$4 = $$1.c.apply($$0.e().orElseThrow().a());
      this.j = $$4.e(".png");
      if ($$2) {
         this.k = $$4.e("_overlay.png");
      } else {
         this.k = null;
      }
   }

   public akn b() {
      return this.j;
   }

   @Nullable
   public akn c() {
      return this.k;
   }

   public cre.a d() {
      return this.l;
   }

   @Override
   public avh e() {
      return this.l.d;
   }

   public static enum a {
      a($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/entity/horse/armor/horse_armor_" + $$0x)), avi.nB),
      b($$0 -> $$0.c("textures/entity/wolf/wolf_armor"), avi.CE);

      final Function<akn, akn> c;
      final avh d;

      private a(Function<akn, akn> $$0, avh $$1) {
         this.c = $$0;
         this.d = $$1;
      }
   }
}
