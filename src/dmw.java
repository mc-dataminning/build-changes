import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmw extends dkw {
   public static final MapCodec<dmw> a = b(dmw::new);
   public static final dys<dyq> b = dyl.af;

   @Override
   public MapCodec<? extends dmw> a() {
      return a;
   }

   public dmw(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dyq.b));
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      dyq $$8 = $$0.c(b);
      if ($$4.o() != jm.a.b || $$8 == dyq.b != ($$4 == jm.b) || $$6.a(this) && $$6.c(b) != $$8) {
         return $$8 == dyq.b && $$4 == jm.a && !$$0.a($$1, $$3) ? dko.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return dko.a.m();
      }
   }

   @Nullable
   @Override
   public dxv a(dbg $$0) {
      jh $$1 = $$0.a();
      dhi $$2 = $$0.q();
      return $$1.v() < $$2.am() && $$2.a_($$1.d()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(dhi $$0, jh $$1, dxv $$2, bwg $$3, cxp $$4) {
      jh $$5 = $$1.d();
      $$0.a($$5, c($$0, $$5, this.m().b(b, dyq.a)), 3);
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      if ($$0.c(b) != dyq.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dxv $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(b) == dyq.b;
      }
   }

   public static void a(dhj $$0, dxv $$1, jh $$2, int $$3) {
      jh $$4 = $$2.d();
      $$0.a($$2, c($$0, $$2, $$1.b(b, dyq.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.b(b, dyq.a)), $$3);
   }

   public static dxv c(dhl $$0, jh $$1, dxv $$2) {
      return $$2.b(dyl.D) ? $$2.b(dyl.D, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dxv a(dhi $$0, jh $$1, dxv $$2, cpx $$3) {
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
   public void a(dhi $$0, cpx $$1, jh $$2, dxv $$3, @Nullable dux $$4, cxp $$5) {
      super.a($$0, $$1, $$2, dko.a.m(), $$4, $$5);
   }

   protected static void b(dhi $$0, jh $$1, dxv $$2, cpx $$3) {
      dyq $$4 = $$2.c(b);
      if ($$4 == dyq.a) {
         jh $$5 = $$1.e();
         dxv $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dyq.b) {
            dxv $$7 = $$6.y().b(ety.c) ? dko.J.m() : dko.a.m();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dkm.j($$6));
         }
      }
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dxv $$0, jh $$1) {
      return bae.b($$1.u(), $$1.c($$0.c(b) == dyq.b ? 0 : 1).v(), $$1.w());
   }
}
