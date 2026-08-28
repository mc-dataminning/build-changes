import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doo extends dvr {
   public static final MapCodec<doo> a = b(doo::new);
   public static final ebf<ebd> b = eax.ah;

   @Override
   public MapCodec<? extends doo> a() {
      return a;
   }

   public doo(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ebd.b));
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      ebd $$8 = $$0.c(b);
      if ($$4.o() != ja.a.b || $$8 == ebd.b != ($$4 == ja.b) || $$6.a(this) && $$6.c(b) != $$8) {
         return $$8 == ebd.b && $$4 == ja.a && !$$0.a($$1, $$3) ? dmh.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return dmh.a.m();
      }
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      iu $$1 = $$0.a();
      dja $$2 = $$0.q();
      return $$1.v() < $$2.ao() && $$2.a_($$1.d()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(dja $$0, iu $$1, eah $$2, bxe $$3, czd $$4) {
      iu $$5 = $$1.d();
      $$0.a($$5, b($$0, $$5, this.m().b(b, ebd.a)), 3);
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      if ($$0.c(b) != ebd.a) {
         return super.a($$0, $$1, $$2);
      } else {
         eah $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(b) == ebd.b;
      }
   }

   public static void a(djb $$0, eah $$1, iu $$2, int $$3) {
      iu $$4 = $$2.d();
      $$0.a($$2, b($$0, $$2, $$1.b(b, ebd.b)), $$3);
      $$0.a($$4, b($$0, $$4, $$1.b(b, ebd.a)), $$3);
   }

   public static eah b(djd $$0, iu $$1, eah $$2) {
      return $$2.b(eax.I) ? $$2.b(eax.I, Boolean.valueOf($$0.A($$1))) : $$2;
   }

   @Override
   public eah a(dja $$0, iu $$1, eah $$2, crc $$3) {
      if (!$$0.C) {
         if ($$3.gl()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.fb());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dja $$0, crc $$1, iu $$2, eah $$3, @Nullable dxf $$4, czd $$5) {
      super.a($$0, $$1, $$2, dmh.a.m(), $$4, $$5);
   }

   protected static void b(dja $$0, iu $$1, eah $$2, crc $$3) {
      ebd $$4 = $$2.c(b);
      if ($$4 == ebd.a) {
         iu $$5 = $$1.e();
         eah $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == ebd.b) {
            eah $$7 = $$6.y().b(ewp.c) ? dmh.J.m() : dmh.a.m();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dmf.j($$6));
         }
      }
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(eah $$0, iu $$1) {
      return azm.b($$1.u(), $$1.c($$0.c(b) == ebd.b ? 0 : 1).v(), $$1.w());
   }
}
