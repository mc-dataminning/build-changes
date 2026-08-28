import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlu extends djv {
   public static final MapCodec<dlu> a = b(dlu::new);
   public static final dxt<dxr> b = dxm.ah;

   @Override
   public MapCodec<? extends dlu> a() {
      return a;
   }

   public dlu(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dxr.b));
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      dxr $$8 = $$0.c(b);
      if ($$4.o() != jn.a.b || $$8 == dxr.b != ($$4 == jn.b) || $$6.a(this) && $$6.c(b) != $$8) {
         return $$8 == dxr.b && $$4 == jn.a && !$$0.a($$1, $$3) ? djn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return djn.a.m();
      }
   }

   @Nullable
   @Override
   public dww a(daf $$0) {
      ji $$1 = $$0.a();
      dgh $$2 = $$0.q();
      return $$1.v() < $$2.an() && $$2.a_($$1.d()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(dgh $$0, ji $$1, dww $$2, bvg $$3, cwo $$4) {
      ji $$5 = $$1.d();
      $$0.a($$5, b($$0, $$5, this.m().b(b, dxr.a)), 3);
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      if ($$0.c(b) != dxr.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dww $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(b) == dxr.b;
      }
   }

   public static void a(dgi $$0, dww $$1, ji $$2, int $$3) {
      ji $$4 = $$2.d();
      $$0.a($$2, b($$0, $$2, $$1.b(b, dxr.b)), $$3);
      $$0.a($$4, b($$0, $$4, $$1.b(b, dxr.a)), $$3);
   }

   public static dww b(dgk $$0, ji $$1, dww $$2) {
      return $$2.b(dxm.J) ? $$2.b(dxm.J, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dww a(dgh $$0, ji $$1, dww $$2, cow $$3) {
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
   public void a(dgh $$0, cow $$1, ji $$2, dww $$3, @Nullable dty $$4, cwo $$5) {
      super.a($$0, $$1, $$2, djn.a.m(), $$4, $$5);
   }

   protected static void b(dgh $$0, ji $$1, dww $$2, cow $$3) {
      dxr $$4 = $$2.c(b);
      if ($$4 == dxr.a) {
         ji $$5 = $$1.e();
         dww $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dxr.b) {
            dww $$7 = $$6.y().b(esz.c) ? djn.J.m() : djn.a.m();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, djl.j($$6));
         }
      }
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dww $$0, ji $$1) {
      return ayz.b($$1.u(), $$1.c($$0.c(b) == dxr.b ? 0 : 1).v(), $$1.w());
   }
}
