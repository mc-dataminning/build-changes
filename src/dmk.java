import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmk extends djm {
   public static final MapCodec<dmk> a = b(dmk::new);
   public static final dxw b = dxn.aT;
   protected static final fbu c = djm.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<dmk> a() {
      return a;
   }

   protected dmk(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$4 == jn.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      dwx $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dmm || $$3.b() instanceof dwp;
   }

   @Override
   public dwx a(dag $$0) {
      return !this.m().a((dgl)$$0.q(), $$0.a()) ? djo.j.m() : super.a($$0);
   }

   @Override
   protected boolean g_(dwx $$0) {
      return true;
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return c;
   }

   @Override
   protected void a(dwx $$0, ard $$1, ji $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dwx $$0, ard $$1, ji $$2, azh $$3) {
      int $$4 = $$0.c(b);
      if (!a((dgl)$$1, $$2) && !$$1.r($$2.d())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.b(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((dfn)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(dgi $$0, dwx $$1, ji $$2, bul $$3, float $$4) {
      if ($$0 instanceof ard $$5
         && $$0.A.i() < $$4 - 0.5F
         && $$3 instanceof bvh
         && ($$3 instanceof cox || $$5.O().b(dge.c))
         && $$3.dq() * $$3.dq() * $$3.dr() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bul $$0, dwx $$1, dgi $$2, ji $$3) {
      dwx $$4 = a($$1, djo.j.m(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(ebt.c, $$3, ebt.a.a($$0, $$4));
   }

   private static boolean a(dfn $$0, ji $$1) {
      return $$0.a_($$1.d()).a(awp.cA);
   }

   private static boolean a(dgl $$0, ji $$1) {
      for (ji $$2 : ji.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(awv.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return false;
   }
}
