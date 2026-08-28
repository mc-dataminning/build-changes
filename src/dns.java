import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dns extends djk implements dqq {
   public static final MapCodec<dns> a = b(dns::new);
   public static final dxs<jn> b = dni.aF;
   public static final dxm c = dxl.J;
   protected static final float d = 3.0F;
   protected static final fbs e = djk.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final fbs f = djk.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fbs g = djk.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fbs h = djk.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<dns> a() {
      return a;
   }

   protected dns(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
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

   private boolean a(dfl $$0, ji $$1, jn $$2) {
      dwv $$3 = $$0.a_($$1);
      return $$3.c($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      jn $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$4.g() == $$0.c(b) && !$$0.a($$1, $$3)) {
         return djm.a.m();
      } else {
         if ($$0.c(c)) {
            $$2.a($$3, esy.c, esy.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      if (!$$0.c()) {
         dwv $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dwv $$2 = this.m();
      dgj $$3 = $$0.q();
      ji $$4 = $$0.a();
      esx $$5 = $$0.q().b_($$0.a());

      for (jn $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.b(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.b(c, Boolean.valueOf($$5.a() == esy.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected esx b_(dwv $$0) {
      return $$0.c(c) ? esy.c.a(false) : super.b_($$0);
   }
}
