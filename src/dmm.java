import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmm extends dkn {
   public static final MapCodec<dmm> a = b(dmm::new);
   public static final dyl<dyj> b = dye.ah;

   @Override
   public MapCodec<? extends dmm> a() {
      return a;
   }

   public dmm(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dyj.b));
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      dyj $$8 = $$0.c(b);
      if ($$4.o() != jm.a.b || $$8 == dyj.b != ($$4 == jm.b) || $$6.a(this) && $$6.c(b) != $$8) {
         return $$8 == dyj.b && $$4 == jm.a && !$$0.a($$1, $$3) ? dkf.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return dkf.a.m();
      }
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      jh $$1 = $$0.a();
      dgz $$2 = $$0.q();
      return $$1.v() < $$2.an() && $$2.a_($$1.d()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(dgz $$0, jh $$1, dxo $$2, bvx $$3, cxg $$4) {
      jh $$5 = $$1.d();
      $$0.a($$5, c($$0, $$5, this.m().b(b, dyj.a)), 3);
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      if ($$0.c(b) != dyj.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dxo $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(b) == dyj.b;
      }
   }

   public static void a(dha $$0, dxo $$1, jh $$2, int $$3) {
      jh $$4 = $$2.d();
      $$0.a($$2, c($$0, $$2, $$1.b(b, dyj.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.b(b, dyj.a)), $$3);
   }

   public static dxo c(dhc $$0, jh $$1, dxo $$2) {
      return $$2.b(dye.J) ? $$2.b(dye.J, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dxo a(dgz $$0, jh $$1, dxo $$2, cpo $$3) {
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
   public void a(dgz $$0, cpo $$1, jh $$2, dxo $$3, @Nullable duq $$4, cxg $$5) {
      super.a($$0, $$1, $$2, dkf.a.m(), $$4, $$5);
   }

   protected static void b(dgz $$0, jh $$1, dxo $$2, cpo $$3) {
      dyj $$4 = $$2.c(b);
      if ($$4 == dyj.a) {
         jh $$5 = $$1.e();
         dxo $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dyj.b) {
            dxo $$7 = $$6.y().b(etr.c) ? dkf.J.m() : dkf.a.m();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dkd.j($$6));
         }
      }
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dxo $$0, jh $$1) {
      return azu.b($$1.u(), $$1.c($$0.c(b) == dyj.b ? 0 : 1).v(), $$1.w());
   }
}
