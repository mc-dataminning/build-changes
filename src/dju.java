import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dju extends dnr {
   public static final MapCodec<dju> a = b(dju::new);
   public static final dzk<jo> b = dot.e;
   private static final Map<jo.a, fdo> c = fdl.a(
      fdl.a(dku.b(12.0, 0.0, 4.0), dku.a(8.0, 10.0, 4.0, 5.0), dku.a(4.0, 8.0, 5.0, 10.0), dku.a(10.0, 16.0, 10.0, 16.0))
   );
   private static final wv d = wv.c("container.repair");
   private static final float e = 2.0F;
   private static final int f = 40;

   @Override
   public MapCodec<dju> a() {
      return a;
   }

   public dju(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jo.c));
   }

   @Override
   public dym a(dbn $$0) {
      return this.m().b(b, $$0.g().h());
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awu.aC);
      }

      return btq.a;
   }

   @Nullable
   @Override
   protected bts b(dym $$0, dhp $$1, jj $$2) {
      return new bty(($$2x, $$3, $$4) -> new ctq($$2x, $$3, cua.a($$1, $$2)), d);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return c.get($$0.c(b).o());
   }

   @Override
   protected void a(cmm $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(dhp $$0, jj $$1, dym $$2, dym $$3, cmm $$4) {
      if (!$$4.bb()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(dhp $$0, jj $$1, cmm $$2) {
      if (!$$2.bb()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public buh a(bvs $$0) {
      return $$0.dW().b($$0);
   }

   @Nullable
   public static dym e(dym $$0) {
      if ($$0.a(dkw.hp)) {
         return dkw.hq.m().b(b, $$0.c(b));
      } else {
         return $$0.a(dkw.hq) ? dkw.hr.m().b(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }

   @Override
   public int b(dym $$0, dgv $$1, jj $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
