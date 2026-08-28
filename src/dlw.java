import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlw extends djx {
   public static final MapCodec<dlw> a = b(dlw::new);
   public static final dxv<dxt> b = dxo.ah;

   @Override
   public MapCodec<? extends dlw> a() {
      return a;
   }

   public dlw(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dxt.b));
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      dxt $$8 = $$0.c(b);
      if ($$4.o() != jn.a.b || $$8 == dxt.b != ($$4 == jn.b) || $$6.a(this) && $$6.c(b) != $$8) {
         return $$8 == dxt.b && $$4 == jn.a && !$$0.a($$1, $$3) ? djp.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return djp.a.m();
      }
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      ji $$1 = $$0.a();
      dgj $$2 = $$0.q();
      return $$1.v() < $$2.an() && $$2.a_($$1.d()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(dgj $$0, ji $$1, dwy $$2, bvi $$3, cwq $$4) {
      ji $$5 = $$1.d();
      $$0.a($$5, b($$0, $$5, this.m().b(b, dxt.a)), 3);
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      if ($$0.c(b) != dxt.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dwy $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(b) == dxt.b;
      }
   }

   public static void a(dgk $$0, dwy $$1, ji $$2, int $$3) {
      ji $$4 = $$2.d();
      $$0.a($$2, b($$0, $$2, $$1.b(b, dxt.b)), $$3);
      $$0.a($$4, b($$0, $$4, $$1.b(b, dxt.a)), $$3);
   }

   public static dwy b(dgm $$0, ji $$1, dwy $$2) {
      return $$2.b(dxo.J) ? $$2.b(dxo.J, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dwy a(dgj $$0, ji $$1, dwy $$2, coy $$3) {
      if (!$$0.C) {
         if ($$3.b()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.eZ());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dgj $$0, coy $$1, ji $$2, dwy $$3, @Nullable dua $$4, cwq $$5) {
      super.a($$0, $$1, $$2, djp.a.m(), $$4, $$5);
   }

   protected static void b(dgj $$0, ji $$1, dwy $$2, coy $$3) {
      dxt $$4 = $$2.c(b);
      if ($$4 == dxt.a) {
         ji $$5 = $$1.e();
         dwy $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dxt.b) {
            dwy $$7 = $$6.y().b(etb.c) ? djp.J.m() : djp.a.m();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, djn.j($$6));
         }
      }
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dwy $$0, ji $$1) {
      return ayz.b($$1.u(), $$1.c($$0.c(b) == dxt.b ? 0 : 1).v(), $$1.w());
   }
}
