import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dor extends djy {
   public static final MapCodec<dor> a = b(dor::new);
   public static final dym b = dyl.n;

   @Override
   public MapCodec<dor> a() {
      return a;
   }

   protected dor(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dhi $$0, jh $$1, dxv $$2, @Nullable bwg $$3, cxp $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      czy $$5 = $$4.a(ku.Y, czy.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.b(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dwb $$5) {
         $$5.t();
         return btj.a;
      } else {
         return btj.e;
      }
   }

   @Override
   protected btj a(cxp $$0, dxv $$1, dhi $$2, jh $$3, cpx $$4, bti $$5, fbu $$6) {
      if ($$1.c(b)) {
         return btj.f;
      } else {
         cxp $$7 = $$4.b($$5);
         btj $$8 = cxu.a($$2, $$3, $$7, $$4);
         return (btj)(!$$8.a() ? btj.f : $$8);
      }
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dwb $$5) {
            $$5.t();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dux a(jh $$0, dxv $$1) {
      return new dwb($$0, $$1);
   }

   @Override
   public boolean f_(dxv $$0) {
      return true;
   }

   @Override
   public int a(dxv $$0, dgn $$1, jh $$2, jm $$3) {
      if ($$1.c_($$2) instanceof dwb $$4 && $$4.j().a()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(dxv $$0) {
      return true;
   }

   @Override
   protected int a(dxv $$0, dhi $$1, jh $$2) {
      return $$1.c_($$2) instanceof dwb $$3 ? $$3.u() : 0;
   }

   @Override
   protected dqv a_(dxv $$0) {
      return dqv.c;
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dux> duy<T> a(dhi $$0, dxv $$1, duz<T> $$2) {
      return $$1.c(b) ? a($$2, duz.e, dwb::a) : null;
   }
}
