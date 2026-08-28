import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dee extends deu implements dlv {
   public static final dso d = dsn.C;
   private static final ewf a = deu.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected dee(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends dee> a();

   protected void a(drx $$0, dbu $$1, iz $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.E_().a(40));
      }
   }

   protected static boolean e(drx $$0, daz $$1, iz $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (je $$3 : je.values()) {
            if ($$1.b_($$2.a($$3)).a(awr.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      enq $$1 = $$0.q().b_($$0.a());
      return this.n().a(d, Boolean.valueOf($$1.a(awr.a) && $$1.e() == 8));
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return a;
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, enr.c, enr.c.a($$3));
      }

      return $$1 == je.a && !this.a($$0, (dbw)$$3, $$4) ? dew.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      iz $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, je.b);
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(d);
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(d) ? enr.c.a(false) : super.b_($$0);
   }
}
