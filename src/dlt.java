import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlt extends dju {
   public static final MapCodec<dlt> a = b(dlt::new);
   public static final dxs<dxq> b = dxl.ah;

   @Override
   public MapCodec<? extends dlt> a() {
      return a;
   }

   public dlt(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dxq.b));
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      dxq $$8 = $$0.c(b);
      if ($$4.o() != jn.a.b || $$8 == dxq.b != ($$4 == jn.b) || $$6.a(this) && $$6.c(b) != $$8) {
         return $$8 == dxq.b && $$4 == jn.a && !$$0.a($$1, $$3) ? djm.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return djm.a.m();
      }
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      ji $$1 = $$0.a();
      dgg $$2 = $$0.q();
      return $$1.v() < $$2.an() && $$2.a_($$1.d()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(dgg $$0, ji $$1, dwv $$2, bvf $$3, cwn $$4) {
      ji $$5 = $$1.d();
      $$0.a($$5, b($$0, $$5, this.m().b(b, dxq.a)), 3);
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      if ($$0.c(b) != dxq.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dwv $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(b) == dxq.b;
      }
   }

   public static void a(dgh $$0, dwv $$1, ji $$2, int $$3) {
      ji $$4 = $$2.d();
      $$0.a($$2, b($$0, $$2, $$1.b(b, dxq.b)), $$3);
      $$0.a($$4, b($$0, $$4, $$1.b(b, dxq.a)), $$3);
   }

   public static dwv b(dgj $$0, ji $$1, dwv $$2) {
      return $$2.b(dxl.J) ? $$2.b(dxl.J, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dwv a(dgg $$0, ji $$1, dwv $$2, cov $$3) {
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
   public void a(dgg $$0, cov $$1, ji $$2, dwv $$3, @Nullable dtx $$4, cwn $$5) {
      super.a($$0, $$1, $$2, djm.a.m(), $$4, $$5);
   }

   protected static void b(dgg $$0, ji $$1, dwv $$2, cov $$3) {
      dxq $$4 = $$2.c(b);
      if ($$4 == dxq.a) {
         ji $$5 = $$1.e();
         dwv $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dxq.b) {
            dwv $$7 = $$6.y().b(esy.c) ? djm.J.m() : djm.a.m();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, djk.j($$6));
         }
      }
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dwv $$0, ji $$1) {
      return ayy.b($$1.u(), $$1.c($$0.c(b) == dxq.b ? 0 : 1).v(), $$1.w());
   }
}
