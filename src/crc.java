import java.util.function.Function;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class crc extends crd {
   private final akm j;
   @Nullable
   private final akm k;
   private final crc.a l;

   public crc(ix<cre> $$0, crc.a $$1, boolean $$2, ctj.a $$3) {
      super($$0, crd.a.e, $$3);
      this.l = $$1;
      akm $$4 = $$1.c.apply($$0.e().orElseThrow().a());
      this.j = $$4.e(".png");
      if ($$2) {
         this.k = $$4.e("_overlay.png");
      } else {
         this.k = null;
      }
   }

   public akm b() {
      return this.j;
   }

   @Nullable
   public akm c() {
      return this.k;
   }

   public crc.a d() {
      return this.l;
   }

   @Override
   public avg e() {
      return this.l.d;
   }

   public static enum a {
      a($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/entity/horse/armor/horse_armor_" + $$0x)), avh.nB),
      b($$0 -> $$0.c("textures/entity/wolf/wolf_armor"), avh.CE);

      final Function<akm, akm> c;
      final avg d;

      private a(Function<akm, akm> $$0, avg $$1) {
         this.c = $$0;
         this.d = $$1;
      }
   }
}
