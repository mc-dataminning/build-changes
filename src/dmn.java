import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmn extends dko {
   public static final MapCodec<dmn> a = b(dmn::new);
   public static final dyo<dym> b = dyg.ah;

   @Override
   public MapCodec<? extends dmn> a() {
      return a;
   }

   public dmn(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, dym.b));
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      dym $$8 = $$0.c(b);
      if ($$4.o() != jn.a.b || $$8 == dym.b != ($$4 == jn.b) || $$6.a(this) && $$6.c(b) != $$8) {
         return $$8 == dym.b && $$4 == jn.a && !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return dkg.a.m();
      }
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      ji $$1 = $$0.a();
      dgz $$2 = $$0.q();
      return $$1.v() < $$2.ao() && $$2.a_($$1.d()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(dgz $$0, ji $$1, dxq $$2, bvy $$3, cxh $$4) {
      ji $$5 = $$1.d();
      $$0.a($$5, b($$0, $$5, this.m().b(b, dym.a)), 3);
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      if ($$0.c(b) != dym.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dxq $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(b) == dym.b;
      }
   }

   public static void a(dha $$0, dxq $$1, ji $$2, int $$3) {
      ji $$4 = $$2.d();
      $$0.a($$2, b($$0, $$2, $$1.b(b, dym.b)), $$3);
      $$0.a($$4, b($$0, $$4, $$1.b(b, dym.a)), $$3);
   }

   public static dxq b(dhc $$0, ji $$1, dxq $$2) {
      return $$2.b(dyg.I) ? $$2.b(dyg.I, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dxq a(dgz $$0, ji $$1, dxq $$2, cpr $$3) {
      if (!$$0.C) {
         if ($$3.gn()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.eZ());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dgz $$0, cpr $$1, ji $$2, dxq $$3, @Nullable dus $$4, cxh $$5) {
      super.a($$0, $$1, $$2, dkg.a.m(), $$4, $$5);
   }

   protected static void b(dgz $$0, ji $$1, dxq $$2, cpr $$3) {
      dym $$4 = $$2.c(b);
      if ($$4 == dym.a) {
         ji $$5 = $$1.e();
         dxq $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dym.b) {
            dxq $$7 = $$6.y().b(etx.c) ? dkg.J.m() : dkg.a.m();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dke.j($$6));
         }
      }
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dxq $$0, ji $$1) {
      return ayz.b($$1.u(), $$1.c($$0.c(b) == dym.b ? 0 : 1).v(), $$1.w());
   }
}
