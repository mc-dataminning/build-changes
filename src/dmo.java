import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmo extends dij implements dpk {
   public static final MapCodec<dmo> a = b(dmo::new);
   public static final dwl<jm> b = dme.aF;
   public static final dwf c = dwe.C;
   protected static final float d = 3.0F;
   protected static final fal e = dij.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final fal f = dij.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fal g = dij.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fal h = dij.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<dmo> a() {
      return a;
   }

   protected dmo(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
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

   private boolean a(dek $$0, jh $$1, jm $$2) {
      dvo $$3 = $$0.a_($$1);
      return $$3.c($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      jm $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$4.g() == $$0.c(b) && !$$0.a($$1, $$3)) {
         return dil.a.m();
      } else {
         if ($$0.c(c)) {
            $$2.a($$3, erp.c, erp.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Nullable
   @Override
   public dvo a(czw $$0) {
      if (!$$0.c()) {
         dvo $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dvo $$2 = this.m();
      dfi $$3 = $$0.q();
      jh $$4 = $$0.a();
      ero $$5 = $$0.q().b_($$0.a());

      for (jm $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.b(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.b(c, Boolean.valueOf($$5.a() == erp.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected ero b_(dvo $$0) {
      return $$0.c(c) ? erp.c.a(false) : super.b_($$0);
   }
}
