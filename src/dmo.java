import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmo extends dko {
   public static final MapCodec<dmo> a = b(dmo::new);
   public static final dyk<dyi> b = dyd.af;

   @Override
   public MapCodec<? extends dmo> a() {
      return a;
   }

   public dmo(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dyi.b));
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      dyi $$8 = $$0.c(b);
      if ($$4.o() != jm.a.b || $$8 == dyi.b != ($$4 == jm.b) || $$6.a(this) && $$6.c(b) != $$8) {
         return $$8 == dyi.b && $$4 == jm.a && !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return dkg.a.m();
      }
   }

   @Nullable
   @Override
   public dxn a(dbb $$0) {
      jh $$1 = $$0.a();
      dha $$2 = $$0.q();
      return $$1.v() < $$2.am() && $$2.a_($$1.d()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(dha $$0, jh $$1, dxn $$2, bwb $$3, cxk $$4) {
      jh $$5 = $$1.d();
      $$0.a($$5, c($$0, $$5, this.m().b(b, dyi.a)), 3);
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      if ($$0.c(b) != dyi.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dxn $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(b) == dyi.b;
      }
   }

   public static void a(dhb $$0, dxn $$1, jh $$2, int $$3) {
      jh $$4 = $$2.d();
      $$0.a($$2, c($$0, $$2, $$1.b(b, dyi.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.b(b, dyi.a)), $$3);
   }

   public static dxn c(dhd $$0, jh $$1, dxn $$2) {
      return $$2.b(dyd.D) ? $$2.b(dyd.D, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dxn a(dha $$0, jh $$1, dxn $$2, cps $$3) {
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
   public void a(dha $$0, cps $$1, jh $$2, dxn $$3, @Nullable dup $$4, cxk $$5) {
      super.a($$0, $$1, $$2, dkg.a.m(), $$4, $$5);
   }

   protected static void b(dha $$0, jh $$1, dxn $$2, cps $$3) {
      dyi $$4 = $$2.c(b);
      if ($$4 == dyi.a) {
         jh $$5 = $$1.e();
         dxn $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dyi.b) {
            dxn $$7 = $$6.y().b(etq.c) ? dkg.J.m() : dkg.a.m();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dke.j($$6));
         }
      }
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dxn $$0, jh $$1) {
      return bae.b($$1.u(), $$1.c($$0.c(b) == dyi.b ? 0 : 1).v(), $$1.w());
   }
}
