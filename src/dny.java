import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dny extends dng implements dlv {
   public static final MapCodec<dny> a = b(dny::new);
   public static final dso c = dsn.C;

   @Override
   protected MapCodec<? extends dny> a() {
      return a;
   }

   protected dny(drw.d $$0) {
      super($$0);
      this.k(this.n().a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      enq $$1 = $$0.q().b_($$0.a());
      return super.a($$0).a(c, Boolean.valueOf($$1.b(enr.c)));
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, enr.c, enr.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(c) ? enr.c.a(true) : super.b_($$0);
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(c);
   }
}
