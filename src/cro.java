import java.util.function.Function;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class cro extends crp {
   private final akk j;
   @Nullable
   private final akk k;
   private final cro.a l;

   public cro(jj<crq> $$0, cro.a $$1, boolean $$2, ctv.a $$3) {
      super($$0, crp.a.e, $$3);
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

   public cro.a d() {
      return this.l;
   }

   @Override
   public ave e() {
      return this.l.d;
   }

   @Override
   public boolean a(cua $$0) {
      return false;
   }

   public static enum a {
      a($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/entity/horse/armor/horse_armor_" + $$0x)), avf.nB),
      b($$0 -> $$0.c("textures/entity/wolf/wolf_armor"), avf.CH);

      final Function<akk, akk> c;
      final ave d;

      private a(final Function<akk, akk> $$0, final ave $$1) {
         this.c = $$0;
         this.d = $$1;
      }
   }
}
