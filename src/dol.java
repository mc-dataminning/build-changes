import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dol extends dkd implements drj {
   public static final MapCodec<dol> a = b(dol::new);
   public static final dyl<jm> b = dob.aF;
   public static final dyf c = dye.J;
   protected static final float d = 3.0F;
   protected static final fcl e = dkd.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final fcl f = dkd.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fcl g = dkd.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fcl h = dkd.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<dol> a() {
      return a;
   }

   protected dol(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
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

   private boolean a(dge $$0, jh $$1, jm $$2) {
      dxo $$3 = $$0.a_($$1);
      return $$3.c($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      jm $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$4.g() == $$0.c(b) && !$$0.a($$1, $$3)) {
         return dkf.a.m();
      } else {
         if ($$0.c(c)) {
            $$2.a($$3, etr.c, etr.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      if (!$$0.c()) {
         dxo $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dxo $$2 = this.m();
      dhc $$3 = $$0.q();
      jh $$4 = $$0.a();
      etq $$5 = $$0.q().b_($$0.a());

      for (jm $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.b(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.b(c, Boolean.valueOf($$5.a() == etr.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected etq b_(dxo $$0) {
      return $$0.c(c) ? etr.c.a(false) : super.b_($$0);
   }
}
