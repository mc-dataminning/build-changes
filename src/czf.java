import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czf extends cva implements dca {
   public static final MapCodec<czf> a = b(czf::new);
   public static final dic b = cyv.aE;
   public static final dhz c = dhy.C;
   protected static final float d = 3.0F;
   protected static final ekn e = cva.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final ekn f = cva.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ekn g = cva.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ekn h = cva.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<czf> a() {
      return a;
   }

   protected czf(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      switch ((hx)$$0.c(b)) {
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

   private boolean a(crg $$0, ht $$1, hx $$2) {
      dhi $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      hx $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return cvc.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, ect.c, ect.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      if (!$$0.c()) {
         dhi $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dhi $$2 = this.o();
      csd $$3 = $$0.q();
      ht $$4 = $$0.a();
      ecs $$5 = $$0.q().b_($$0.a());

      for (hx $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(c, Boolean.valueOf($$5.a() == ect.c));
            }
         }
      }

      return null;
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
   public ecs c_(dhi $$0) {
      return $$0.c(c) ? ect.c.a(false) : super.c_($$0);
   }
}
