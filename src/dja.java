import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dja extends deu implements dlv {
   public static final MapCodec<dja> a = b(dja::new);
   public static final dsr b = diq.aE;
   public static final dso c = dsn.C;
   protected static final float d = 3.0F;
   protected static final ewf e = deu.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final ewf f = deu.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewf g = deu.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ewf h = deu.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<dja> a() {
      return a;
   }

   protected dja(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      switch ((je)$$0.c(b)) {
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

   private boolean a(daz $$0, iz $$1, je $$2) {
      drx $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      je $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return dew.a.n();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, enr.c, enr.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      if (!$$0.c()) {
         drx $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      drx $$2 = this.n();
      dbw $$3 = $$0.q();
      iz $$4 = $$0.a();
      enq $$5 = $$0.q().b_($$0.a());

      for (je $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(c, Boolean.valueOf($$5.a() == enr.c));
            }
         }
      }

      return null;
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(c) ? enr.c.a(false) : super.b_($$0);
   }
}
