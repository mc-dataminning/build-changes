import java.util.function.Function;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class cth extends cti {
   private final alc d;
   @Nullable
   private final alc k;
   private final cth.a l;

   public cth(jn<ctj> $$0, cth.a $$1, boolean $$2, cvk.a $$3) {
      super($$0, cti.a.e, $$3);
      this.l = $$1;
      alc $$4 = $$1.c.apply($$0.e().orElseThrow().a());
      this.d = $$4.g(".png");
      if ($$2) {
         this.k = $$4.g("_overlay.png");
      } else {
         this.k = null;
      }
   }

   public alc b() {
      return this.d;
   }

   @Nullable
   public alc c() {
      return this.k;
   }

   public cth.a d() {
      return this.l;
   }

   @Override
   public awd e() {
      return this.l.d;
   }

   public static enum a {
      a($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/entity/horse/armor/horse_armor_" + $$0x)), awe.nC),
      b($$0 -> $$0.e("textures/entity/wolf/wolf_armor"), awe.CO);

      final Function<alc, alc> c;
      final awd d;

      private a(final Function<alc, alc> $$0, final awd $$1) {
         this.c = $$0;
         this.d = $$1;
      }
   }
}
