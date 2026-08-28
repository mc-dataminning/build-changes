import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmv extends diq implements dpr {
   public static final MapCodec<dmv> a = b(dmv::new);
   public static final dws<jm> b = dml.aF;
   public static final dwm c = dwl.C;
   protected static final float d = 3.0F;
   protected static final fas e = diq.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final fas f = diq.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fas g = diq.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fas h = diq.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<dmv> a() {
      return a;
   }

   protected dmv(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
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

   private boolean a(der $$0, jh $$1, jm $$2) {
      dvv $$3 = $$0.a_($$1);
      return $$3.c($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      jm $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$4.g() == $$0.c(b) && !$$0.a($$1, $$3)) {
         return dis.a.m();
      } else {
         if ($$0.c(c)) {
            $$2.a($$3, erw.c, erw.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      if (!$$0.c()) {
         dvv $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dvv $$2 = this.m();
      dfp $$3 = $$0.q();
      jh $$4 = $$0.a();
      erv $$5 = $$0.q().b_($$0.a());

      for (jm $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.b(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.b(c, Boolean.valueOf($$5.a() == erw.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected erv b_(dvv $$0) {
      return $$0.c(c) ? erw.c.a(false) : super.b_($$0);
   }
}
