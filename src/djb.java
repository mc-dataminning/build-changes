import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djb extends deu implements dlv {
   public static final MapCodec<djb> a = b(djb::new);
   public static final dso b = dsn.j;
   public static final dso c = dsn.C;
   protected static final ewf d = ewc.a(deu.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), deu.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final ewf e = ewc.a(deu.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), deu.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<djb> a() {
      return a;
   }

   public djb(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      enq $$1 = $$0.q().b_($$0.a());

      for (je $$2 : $$0.f()) {
         if ($$2.o() == je.a.b) {
            drx $$3 = this.n().a(b, Boolean.valueOf($$2 == je.b));
            if ($$3.a((dbw)$$0.q(), $$0.a())) {
               return $$3.a(c, Boolean.valueOf($$1.a() == enr.c));
            }
         }
      }

      return null;
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      je $$3 = m($$0).g();
      return deu.a($$1, $$2.a($$3), $$3.g());
   }

   protected static je m(drx $$0) {
      return $$0.c(b) ? je.a : je.b;
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, enr.c, enr.c.a($$3));
      }

      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dew.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(c) ? enr.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }
}
