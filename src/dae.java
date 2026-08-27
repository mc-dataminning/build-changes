import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dae extends cvz implements dcz {
   public static final MapCodec<dae> a = b(dae::new);
   public static final djj b = czu.aE;
   public static final djg c = djf.C;
   protected static final float d = 3.0F;
   protected static final elu e = cvz.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final elu f = cvz.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final elu g = cvz.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final elu h = cvz.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<dae> a() {
      return a;
   }

   protected dae(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ia.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      switch ((ia)$$0.c(b)) {
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

   private boolean a(cse $$0, hv $$1, ia $$2) {
      dip $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      ia $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return cwb.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, eea.c, eea.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      if (!$$0.c()) {
         dip $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dip $$2 = this.o();
      ctb $$3 = $$0.q();
      hv $$4 = $$0.a();
      edz $$5 = $$0.q().b_($$0.a());

      for (ia $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(c, Boolean.valueOf($$5.a() == eea.c));
            }
         }
      }

      return null;
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b, c);
   }

   @Override
   public edz c_(dip $$0) {
      return $$0.c(c) ? eea.c.a(false) : super.c_($$0);
   }
}
