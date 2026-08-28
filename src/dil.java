import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dil extends deu implements dlv {
   public static final MapCodec<dil> a = b(dil::new);
   private static final dso c = dsn.C;
   protected static final ewf b = deu.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dil> a() {
      return a;
   }

   protected dil(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(c);
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(c) ? enr.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      drx $$1 = super.a($$0);
      if ($$1 != null) {
         enq $$2 = $$0.q().b_($$0.a());
         return $$1.a(c, Boolean.valueOf($$2.a() == enr.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      iz $$3 = $$2.c();
      drx $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, je.a);
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return b;
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$1 == je.b && !this.a($$0, $$3, $$4)) {
         return dew.a.n();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, enr.c, enr.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
