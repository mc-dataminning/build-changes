import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlv extends djw {
   public static final MapCodec<dlv> a = b(dlv::new);
   public static final dxu<dxs> b = dxn.ah;

   @Override
   public MapCodec<? extends dlv> a() {
      return a;
   }

   public dlv(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dxs.b));
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      dxs $$8 = $$0.c(b);
      if ($$4.o() != jn.a.b || $$8 == dxs.b != ($$4 == jn.b) || $$6.a(this) && $$6.c(b) != $$8) {
         return $$8 == dxs.b && $$4 == jn.a && !$$0.a($$1, $$3) ? djo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return djo.a.m();
      }
   }

   @Nullable
   @Override
   public dwx a(dag $$0) {
      ji $$1 = $$0.a();
      dgi $$2 = $$0.q();
      return $$1.v() < $$2.an() && $$2.a_($$1.d()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(dgi $$0, ji $$1, dwx $$2, bvg $$3, cwp $$4) {
      ji $$5 = $$1.d();
      $$0.a($$5, b($$0, $$5, this.m().b(b, dxs.a)), 3);
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      if ($$0.c(b) != dxs.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dwx $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(b) == dxs.b;
      }
   }

   public static void a(dgj $$0, dwx $$1, ji $$2, int $$3) {
      ji $$4 = $$2.d();
      $$0.a($$2, b($$0, $$2, $$1.b(b, dxs.b)), $$3);
      $$0.a($$4, b($$0, $$4, $$1.b(b, dxs.a)), $$3);
   }

   public static dwx b(dgl $$0, ji $$1, dwx $$2) {
      return $$2.b(dxn.J) ? $$2.b(dxn.J, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dwx a(dgi $$0, ji $$1, dwx $$2, cox $$3) {
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
   public void a(dgi $$0, cox $$1, ji $$2, dwx $$3, @Nullable dtz $$4, cwp $$5) {
      super.a($$0, $$1, $$2, djo.a.m(), $$4, $$5);
   }

   protected static void b(dgi $$0, ji $$1, dwx $$2, cox $$3) {
      dxs $$4 = $$2.c(b);
      if ($$4 == dxs.a) {
         ji $$5 = $$1.e();
         dwx $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dxs.b) {
            dwx $$7 = $$6.y().b(eta.c) ? djo.J.m() : djo.a.m();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, djm.j($$6));
         }
      }
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dwx $$0, ji $$1) {
      return ayz.b($$1.u(), $$1.c($$0.c(b) == dxs.b ? 0 : 1).v(), $$1.w());
   }
}
