import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqh extends dhy {
   public static final MapCodec<dqh> a = b(dqh::new);
   public static final dvu b = dvt.B;

   @Override
   public MapCodec<dqh> a() {
      return a;
   }

   public dqh(dvc.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dhy $$3, @Nullable esm $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dvd a(dev $$0, jg $$1, dvd $$2, coh $$3) {
      if (!$$0.y_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(arm $$0, jg $$1, den $$2) {
      ckr $$3 = new ckr($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b());
      int $$4 = $$3.o();
      $$3.b((short)($$0.A.a($$4 / 4) + $$4 / 8));
      $$0.b($$3);
   }

   public static void a(dev $$0, jg $$1) {
      a($$0, $$1, null);
   }

   private static void a(dev $$0, jg $$1, @Nullable buv $$2) {
      if (!$$0.C) {
         ckr $$3 = new ckr($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dC(), $$3.dE(), $$3.dI(), awk.zC, awl.e, 1.0F, 1.0F);
         $$0.a($$2, eaa.I, $$1);
      }
   }

   @Override
   protected bry a(cvx $$0, dvd $$1, dev $$2, jg $$3, coh $$4, brx $$5, ezd $$6) {
      if (!$$0.a(cwb.ot) && !$$0.a(cwb.tY)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dia.a.m(), 11);
         cvt $$7 = $$0.h();
         if ($$0.a(cwb.ot)) {
            $$0.a(1, $$4, buv.d($$5));
         } else {
            $$0.a(1, $$4);
         }

         $$4.b(awu.c.b($$7));
         return bry.a;
      }
   }

   @Override
   protected void a(dev $$0, dvd $$1, ezd $$2, cpb $$3) {
      if (!$$0.C) {
         jg $$4 = $$2.b();
         btz $$5 = $$3.s();
         if ($$3.bZ() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof buv ? (buv)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(den $$0) {
      return false;
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b);
   }
}
