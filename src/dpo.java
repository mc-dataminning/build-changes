import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpo extends dkr implements dim, dpk {
   public static final MapCodec<dpo> c = b(dpo::new);
   private static final dwf g = dwe.C;
   public static final dwl<jm> d = dwe.R;
   protected static final float e = 6.0F;
   protected static final fal f = dij.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dpo> a() {
      return c;
   }

   public dpo(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dwj.b).b(g, Boolean.valueOf(false)).b(d, jm.c));
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return f;
   }

   @Override
   protected boolean b(dvo $$0, dek $$1, jh $$2) {
      return $$0.a(axd.by) || $$1.b_($$2.d()).a(erp.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dvo a(czw $$0) {
      dvo $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.b(d, $$0.g().g())) : null;
   }

   @Override
   public void a(dff $$0, jh $$1, dvo $$2, bve $$3, cwf $$4) {
      if (!$$0.y_()) {
         jh $$5 = $$1.d();
         dvo $$6 = dkr.c($$0, $$5, this.m().b(b, dwj.a).b(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected ero b_(dvo $$0) {
      return $$0.c(g) ? erp.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      if ($$0.c(b) == dwj.a) {
         return super.a($$0, $$1, $$2);
      } else {
         jh $$3 = $$2.e();
         dvo $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$0.c(g)) {
         $$2.a($$3, erp.c, erp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(dfi $$0, jh $$1, dvo $$2) {
      return true;
   }

   @Override
   public boolean a(dff $$0, azv $$1, jh $$2, dvo $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, jh $$2, dvo $$3) {
      if ($$3.c(dkr.b) == dwj.b) {
         jh $$4 = $$2.d();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         dig.a($$0, $$1, $$2, $$3.c(d));
      } else {
         jh $$5 = $$2.e();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float au_() {
      return 0.1F;
   }
}
