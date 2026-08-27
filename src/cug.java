import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cug extends cum {
   public static final MapCodec<cug> a = b(cug::new);
   public static final dic b = dhy.P;
   public static final dhz c = dhy.u;

   @Override
   public MapCodec<cug> a() {
      return a;
   }

   public cug(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if ($$1.B) {
         return bix.a;
      } else {
         dfd $$6 = $$1.c_($$2);
         if ($$6 instanceof dew) {
            $$3.a((dew)$$6);
            $$3.a(arb.ar);
            ccl.a($$3, true);
         }

         return bix.b;
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      bit.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      dfd $$4 = $$1.c_($$2);
      if ($$4 instanceof dew) {
         ((dew)$$4).i();
      }
   }

   @Nullable
   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dew($$0, $$1);
   }

   @Override
   public dbf b_(dhi $$0) {
      return dbf.c;
   }

   @Override
   public void a(csa $$0, ht $$1, dhi $$2, @Nullable blg $$3, clj $$4) {
      if ($$4.A()) {
         dfd $$5 = $$0.c_($$1);
         if ($$5 instanceof dew) {
            ((dew)$$5).a($$4.y());
         }
      }
   }

   @Override
   public boolean d_(dhi $$0) {
      return true;
   }

   @Override
   public int a(dhi $$0, csa $$1, ht $$2) {
      return cgm.a($$1.c_($$2));
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dhi a(cnr $$0) {
      return this.o().a(b, $$0.d().g());
   }
}
