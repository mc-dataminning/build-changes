import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dje extends dnb {
   public static final MapCodec<dje> a = b(dje::new);
   public static final dyo<jn> b = dod.e;
   private static final Map<jn.a, fcr> c = fco.a(
      fco.a(dke.b(12.0, 0.0, 4.0), dke.a(8.0, 10.0, 4.0, 5.0), dke.a(4.0, 8.0, 5.0, 10.0), dke.a(10.0, 16.0, 10.0, 16.0))
   );
   private static final wp d = wp.c("container.repair");
   private static final float e = 2.0F;
   private static final int f = 40;

   @Override
   public MapCodec<dje> a() {
      return a;
   }

   public dje(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jn.c));
   }

   @Override
   public dxq a(dax $$0) {
      return this.m().b(b, $$0.g().h());
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awk.aC);
      }

      return bsy.a;
   }

   @Nullable
   @Override
   protected bta b(dxq $$0, dgz $$1, ji $$2) {
      return new btg(($$2x, $$3, $$4) -> new csz($$2x, $$3, ctj.a($$1, $$2)), d);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return c.get($$0.c(b).o());
   }

   @Override
   protected void a(clv $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(dgz $$0, ji $$1, dxq $$2, dxq $$3, clv $$4) {
      if (!$$4.bb()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(dgz $$0, ji $$1, clv $$2) {
      if (!$$2.bb()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public btp a(bva $$0) {
      return $$0.dV().b($$0);
   }

   @Nullable
   public static dxq e(dxq $$0) {
      if ($$0.a(dkg.hp)) {
         return dkg.hq.m().b(b, $$0.c(b));
      } else {
         return $$0.a(dkg.hq) ? dkg.hr.m().b(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }

   @Override
   public int b(dxq $$0, dgf $$1, ji $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
