import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlp extends dhj implements dol {
   public static final MapCodec<dlp> a = b(dlp::new);
   public static final dvi b = dlf.aF;
   public static final dvf c = dve.C;
   protected static final float d = 3.0F;
   protected static final ezm e = dhj.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final ezm f = dhj.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ezm g = dhj.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ezm h = dhj.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<dlp> a() {
      return a;
   }

   protected dlp(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jj.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
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

   private boolean a(ddl $$0, je $$1, jj $$2) {
      duo $$3 = $$0.a_($$1);
      return $$3.c($$0, $$1, $$2);
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      jj $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return dhl.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, eqq.c, eqq.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      if (!$$0.c()) {
         duo $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      duo $$2 = this.o();
      dej $$3 = $$0.q();
      je $$4 = $$0.a();
      eqp $$5 = $$0.q().b_($$0.a());

      for (jj $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.b(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.b(c, Boolean.valueOf($$5.a() == eqq.c));
            }
         }
      }

      return null;
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(c) ? eqq.c.a(false) : super.b_($$0);
   }
}
