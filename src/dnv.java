import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnv extends djn implements dqt {
   public static final MapCodec<dnv> a = b(dnv::new);
   public static final dxv<jn> b = dnl.aF;
   public static final dxp c = dxo.J;
   protected static final float d = 3.0F;
   protected static final fbv e = djn.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final fbv f = djn.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fbv g = djn.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fbv h = djn.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<dnv> a() {
      return a;
   }

   protected dnv(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      switch ((jn)$$0.c(b)) {
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

   private boolean a(dfo $$0, ji $$1, jn $$2) {
      dwy $$3 = $$0.a_($$1);
      return $$3.c($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      jn $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$4.g() == $$0.c(b) && !$$0.a($$1, $$3)) {
         return djp.a.m();
      } else {
         if ($$0.c(c)) {
            $$2.a($$3, etb.c, etb.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      if (!$$0.c()) {
         dwy $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dwy $$2 = this.m();
      dgm $$3 = $$0.q();
      ji $$4 = $$0.a();
      eta $$5 = $$0.q().b_($$0.a());

      for (jn $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.b(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.b(c, Boolean.valueOf($$5.a() == etb.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected eta b_(dwy $$0) {
      return $$0.c(c) ? etb.c.a(false) : super.b_($$0);
   }
}
