import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlb extends dgv implements dnx {
   public static final MapCodec<dlb> a = b(dlb::new);
   public static final duu b = dkr.aE;
   public static final dur c = duq.C;
   protected static final float d = 3.0F;
   protected static final eyx e = dgv.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final eyx f = dgv.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eyx g = dgv.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eyx h = dgv.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<dlb> a() {
      return a;
   }

   protected dlb(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, jj.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      switch ((jj)$$0.c(b)) {
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

   private boolean a(dcx $$0, je $$1, jj $$2) {
      dua $$3 = $$0.a_($$1);
      return $$3.c($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      jj $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return dgx.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, eqc.c, eqc.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      if (!$$0.c()) {
         dua $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dua $$2 = this.o();
      ddv $$3 = $$0.q();
      je $$4 = $$0.a();
      eqb $$5 = $$0.q().b_($$0.a());

      for (jj $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.b(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.b(c, Boolean.valueOf($$5.a() == eqc.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(c) ? eqc.c.a(false) : super.b_($$0);
   }
}
