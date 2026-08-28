import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dme extends dqc {
   public static final MapCodec<dme> a = b(dme::new);
   public static final ece<jc> b = drf.e;
   private static final Map<jc.a, fgm> c = fgj.a(
      fgj.a(dne.b(12.0, 0.0, 4.0), dne.a(8.0, 10.0, 4.0, 5.0), dne.a(4.0, 8.0, 5.0, 10.0), dne.a(10.0, 16.0, 10.0, 16.0))
   );
   private static final xc d = xc.c("container.repair");
   private static final float e = 2.0F;
   private static final int f = 40;

   @Override
   public MapCodec<dme> a() {
      return a;
   }

   public dme(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jc.c));
   }

   @Override
   public ebg a(ddt $$0) {
      return this.m().b(b, $$0.g().h());
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(axb.aC);
      }

      return but.a;
   }

   @Nullable
   @Override
   protected buv b(ebg $$0, djz $$1, iw $$2) {
      return new bvb(($$2x, $$3, $$4) -> new cvv($$2x, $$3, cwf.a($$1, $$2)), d);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return c.get($$0.c(b).o());
   }

   @Override
   protected void a(cod $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(djz $$0, iw $$1, ebg $$2, ebg $$3, cod $$4) {
      if (!$$4.ba()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(djz $$0, iw $$1, cod $$2) {
      if (!$$2.ba()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bvk a(bwv $$0) {
      return $$0.dW().b($$0);
   }

   @Nullable
   public static ebg e(ebg $$0) {
      if ($$0.a(dng.ht)) {
         return dng.hu.m().b(b, $$0.c(b));
      } else {
         return $$0.a(dng.hu) ? dng.hv.m().b(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }

   @Override
   public int b(ebg $$0, djd $$1, iw $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
