import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dav extends cwq implements ddq {
   public static final MapCodec<dav> a = b(dav::new);
   public static final dkb b = dal.aE;
   public static final djy c = djx.C;
   protected static final float d = 3.0F;
   protected static final emm e = cwq.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final emm f = cwq.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final emm g = cwq.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final emm h = cwq.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<dav> a() {
      return a;
   }

   protected dav(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      switch ((ic)$$0.c(b)) {
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

   private boolean a(csv $$0, hx $$1, ic $$2) {
      djh $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      ic $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return cws.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, ees.c, ees.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      if (!$$0.c()) {
         djh $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      djh $$2 = this.o();
      cts $$3 = $$0.q();
      hx $$4 = $$0.a();
      eer $$5 = $$0.q().b_($$0.a());

      for (ic $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(c, Boolean.valueOf($$5.a() == ees.c));
            }
         }
      }

      return null;
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b, c);
   }

   @Override
   public eer c_(djh $$0) {
      return $$0.c(c) ? ees.c.a(false) : super.c_($$0);
   }
}
