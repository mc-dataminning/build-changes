import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dot extends dkl implements drp {
   public static final MapCodec<dot> a = b(dot::new);
   public static final dyr<jm> b = doj.aF;
   public static final dyl c = dyk.D;
   protected static final float d = 3.0F;
   protected static final fcr e = dkl.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final fcr f = dkl.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fcr g = dkl.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fcr h = dkl.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<dot> a() {
      return a;
   }

   protected dot(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      switch ((jm)$$0.c(b)) {
         case c:
            return h;
         case d:
            return g;
         case e:
            return f;
         case f:
         default:
            return e;
      }
   }

   private boolean a(dgm $$0, jh $$1, jm $$2) {
      dxu $$3 = $$0.a_($$1);
      return $$3.c($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      jm $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$4.g() == $$0.c(b) && !$$0.a($$1, $$3)) {
         return dkn.a.m();
      } else {
         if ($$0.c(c)) {
            $$2.a($$3, etx.c, etx.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Nullable
   @Override
   public dxu a(dbf $$0) {
      if (!$$0.c()) {
         dxu $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dxu $$2 = this.m();
      dhk $$3 = $$0.q();
      jh $$4 = $$0.a();
      etw $$5 = $$0.q().b_($$0.a());

      for (jm $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.b(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.b(c, Boolean.valueOf($$5.a() == etx.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected etw b_(dxu $$0) {
      return $$0.c(c) ? etx.c.a(false) : super.b_($$0);
   }
}
