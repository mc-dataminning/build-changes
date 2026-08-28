import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmv extends dkv {
   public static final MapCodec<dmv> a = b(dmv::new);
   public static final dyr<dyp> b = dyk.af;

   @Override
   public MapCodec<? extends dmv> a() {
      return a;
   }

   public dmv(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dyp.b));
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      dyp $$8 = $$0.c(b);
      if ($$4.o() != jm.a.b || $$8 == dyp.b != ($$4 == jm.b) || $$6.a(this) && $$6.c(b) != $$8) {
         return $$8 == dyp.b && $$4 == jm.a && !$$0.a($$1, $$3) ? dkn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return dkn.a.m();
      }
   }

   @Nullable
   @Override
   public dxu a(dbf $$0) {
      jh $$1 = $$0.a();
      dhh $$2 = $$0.q();
      return $$1.v() < $$2.am() && $$2.a_($$1.d()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(dhh $$0, jh $$1, dxu $$2, bwf $$3, cxo $$4) {
      jh $$5 = $$1.d();
      $$0.a($$5, c($$0, $$5, this.m().b(b, dyp.a)), 3);
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      if ($$0.c(b) != dyp.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dxu $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(b) == dyp.b;
      }
   }

   public static void a(dhi $$0, dxu $$1, jh $$2, int $$3) {
      jh $$4 = $$2.d();
      $$0.a($$2, c($$0, $$2, $$1.b(b, dyp.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.b(b, dyp.a)), $$3);
   }

   public static dxu c(dhk $$0, jh $$1, dxu $$2) {
      return $$2.b(dyk.D) ? $$2.b(dyk.D, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dxu a(dhh $$0, jh $$1, dxu $$2, cpw $$3) {
      if (!$$0.C) {
         if ($$3.b()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.eX());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dhh $$0, cpw $$1, jh $$2, dxu $$3, @Nullable duw $$4, cxo $$5) {
      super.a($$0, $$1, $$2, dkn.a.m(), $$4, $$5);
   }

   protected static void b(dhh $$0, jh $$1, dxu $$2, cpw $$3) {
      dyp $$4 = $$2.c(b);
      if ($$4 == dyp.a) {
         jh $$5 = $$1.e();
         dxu $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dyp.b) {
            dxu $$7 = $$6.y().b(etx.c) ? dkn.J.m() : dkn.a.m();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dkl.j($$6));
         }
      }
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dxu $$0, jh $$1) {
      return bae.b($$1.u(), $$1.c($$0.c(b) == dyp.b ? 0 : 1).v(), $$1.w());
   }
}
