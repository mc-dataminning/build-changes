import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dom extends dke implements dri {
   public static final MapCodec<dom> a = b(dom::new);
   public static final dyk<jm> b = doc.aF;
   public static final dye c = dyd.D;
   protected static final float d = 3.0F;
   protected static final fcm e = dke.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final fcm f = dke.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fcm g = dke.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fcm h = dke.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<dom> a() {
      return a;
   }

   protected dom(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
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

   private boolean a(dgf $$0, jh $$1, jm $$2) {
      dxn $$3 = $$0.a_($$1);
      return $$3.c($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      jm $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$4.g() == $$0.c(b) && !$$0.a($$1, $$3)) {
         return dkg.a.m();
      } else {
         if ($$0.c(c)) {
            $$2.a($$3, etq.c, etq.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Nullable
   @Override
   public dxn a(dbb $$0) {
      if (!$$0.c()) {
         dxn $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dxn $$2 = this.m();
      dhd $$3 = $$0.q();
      jh $$4 = $$0.a();
      etp $$5 = $$0.q().b_($$0.a());

      for (jm $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.b(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.b(c, Boolean.valueOf($$5.a() == etq.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected etp b_(dxn $$0) {
      return $$0.c(c) ? etq.c.a(false) : super.b_($$0);
   }
}
