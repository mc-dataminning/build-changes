import java.util.function.Function;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class cpg extends cph {
   private final ajv j;
   @Nullable
   private final ajv k;
   private final cpg.a l;

   public cpg(in<cpi> $$0, cpg.a $$1, boolean $$2, crn.a $$3) {
      super($$0, cph.a.e, $$3);
      this.l = $$1;
      ajv $$4 = $$1.c.apply($$0.e().orElseThrow().a());
      this.j = $$4.e(".png");
      if ($$2) {
         this.k = $$4.e("_overlay.png");
      } else {
         this.k = null;
      }
   }

   public ajv b() {
      return this.j;
   }

   @Nullable
   public ajv c() {
      return this.k;
   }

   public cpg.a d() {
      return this.l;
   }

   @Override
   public aun e() {
      return this.l.d;
   }

   public static enum a {
      a($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/entity/horse/armor/horse_armor_" + $$0x)), auo.nm),
      b($$0 -> $$0.c("textures/entity/wolf/wolf_armor"), auo.Cl);

      final Function<ajv, ajv> c;
      final aun d;

      private a(Function<ajv, ajv> $$0, aun $$1) {
         this.c = $$0;
         this.d = $$1;
      }
   }
}
