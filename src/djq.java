import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djq extends deu implements dlv {
   public static final MapCodec<djq> a = b(djq::new);
   public static final dso b = dsn.C;

   @Override
   public MapCodec<djq> a() {
      return a;
   }

   protected djq(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(drx $$0, drx $$1, je $$2) {
      return $$1.a(dew.ac) && $$2.o() == je.a.b;
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      enq $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == enr.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, enr.c, enr.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(b) ? enr.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b);
   }
}
