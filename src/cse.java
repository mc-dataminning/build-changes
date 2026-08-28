import java.util.function.Function;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class cse extends csf {
   private final akr j;
   @Nullable
   private final akr k;
   private final cse.a l;

   public cse(jm<csg> $$0, cse.a $$1, boolean $$2, cul.a $$3) {
      super($$0, csf.a.e, $$3);
      this.l = $$1;
      akr $$4 = $$1.c.apply($$0.e().orElseThrow().a());
      this.j = $$4.g(".png");
      if ($$2) {
         this.k = $$4.g("_overlay.png");
      } else {
         this.k = null;
      }
   }

   public akr b() {
      return this.j;
   }

   @Nullable
   public akr c() {
      return this.k;
   }

   public cse.a d() {
      return this.l;
   }

   @Override
   public avo e() {
      return this.l.d;
   }

   @Override
   public boolean a(cuq $$0) {
      return false;
   }

   public static enum a {
      a($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/entity/horse/armor/horse_armor_" + $$0x)), avp.nB),
      b($$0 -> $$0.e("textures/entity/wolf/wolf_armor"), avp.CI);

      final Function<akr, akr> c;
      final avo d;

      private a(final Function<akr, akr> $$0, final avo $$1) {
         this.c = $$0;
         this.d = $$1;
      }
   }
}
