import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnt extends djl implements dqr {
   public static final MapCodec<dnt> a = b(dnt::new);
   public static final dxt<jn> b = dnj.aF;
   public static final dxn c = dxm.J;
   protected static final float d = 3.0F;
   protected static final fbt e = djl.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final fbt f = djl.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fbt g = djl.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fbt h = djl.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<dnt> a() {
      return a;
   }

   protected dnt(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
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

   private boolean a(dfm $$0, ji $$1, jn $$2) {
      dww $$3 = $$0.a_($$1);
      return $$3.c($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      jn $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$4.g() == $$0.c(b) && !$$0.a($$1, $$3)) {
         return djn.a.m();
      } else {
         if ($$0.c(c)) {
            $$2.a($$3, esz.c, esz.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Nullable
   @Override
   public dww a(daf $$0) {
      if (!$$0.c()) {
         dww $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dww $$2 = this.m();
      dgk $$3 = $$0.q();
      ji $$4 = $$0.a();
      esy $$5 = $$0.q().b_($$0.a());

      for (jn $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.b(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.b(c, Boolean.valueOf($$5.a() == esz.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected esy b_(dww $$0) {
      return $$0.c(c) ? esz.c.a(false) : super.b_($$0);
   }
}
