import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqy extends djk {
   public static final MapCodec<dqy> a = b(dqy::new);
   public static final int b = 8;
   public static final dxu c = dxl.aI;
   protected static final fbs[] d = new fbs[]{
      fbp.a(),
      djk.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      djk.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      djk.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      djk.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      djk.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      djk.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      djk.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      djk.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<dqy> a() {
      return a;
   }

   protected dqy(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      switch ($$1) {
         case a:
            return $$0.c(c) < 5;
         case b:
            return false;
         case c:
            return false;
         default:
            return false;
      }
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected fbs b(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   protected fbs b_(dwv $$0, dfl $$1, ji $$2) {
      return d[$$0.c(c)];
   }

   @Override
   protected fbs c(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean g_(dwv $$0) {
      return true;
   }

   @Override
   protected float c(dwv $$0, dfl $$1, ji $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      dwv $$3 = $$1.a_($$2.e());
      if ($$3.a(awo.cr)) {
         return false;
      } else {
         return $$3.a(awo.cs) ? true : djk.a($$3.g($$1, $$2.e()), jn.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      return !$$0.a($$1, $$3) ? djm.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if ($$1.a(dgp.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(dwv $$0, dae $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.j()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == jn.b : true;
      }
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      dwv $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.b(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(c);
   }
}
