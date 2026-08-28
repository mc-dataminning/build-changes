import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnu extends djm implements dqs {
   public static final MapCodec<dnu> a = b(dnu::new);
   public static final dxu<jn> b = dnk.aF;
   public static final dxo c = dxn.J;
   protected static final float d = 3.0F;
   protected static final fbu e = djm.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final fbu f = djm.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fbu g = djm.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fbu h = djm.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<dnu> a() {
      return a;
   }

   protected dnu(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
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

   private boolean a(dfn $$0, ji $$1, jn $$2) {
      dwx $$3 = $$0.a_($$1);
      return $$3.c($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      jn $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$4.g() == $$0.c(b) && !$$0.a($$1, $$3)) {
         return djo.a.m();
      } else {
         if ($$0.c(c)) {
            $$2.a($$3, eta.c, eta.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Nullable
   @Override
   public dwx a(dag $$0) {
      if (!$$0.c()) {
         dwx $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dwx $$2 = this.m();
      dgl $$3 = $$0.q();
      ji $$4 = $$0.a();
      esz $$5 = $$0.q().b_($$0.a());

      for (jn $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.b(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.b(c, Boolean.valueOf($$5.a() == eta.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected esz b_(dwx $$0) {
      return $$0.c(c) ? eta.c.a(false) : super.b_($$0);
   }
}
