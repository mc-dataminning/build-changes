import com.mojang.serialization.MapCodec;

public class din extends deu implements dlv {
   public static final MapCodec<din> a = b(din::new);
   private static final ewf b = deu.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);

   public din(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(dsn.C, Boolean.valueOf(false)));
   }

   @Override
   public MapCodec<din> a() {
      return a;
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(dsn.C);
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$0.c(dsn.C)) {
         $$3.a($$4, enr.c, enr.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(dsn.C) ? enr.c.a(false) : super.b_($$0);
   }

   @Override
   public drx a(cxv $$0) {
      enq $$1 = $$0.q().b_($$0.a());
      return this.n().a(dsn.C, Boolean.valueOf($$1.b(enr.c)));
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return b;
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }
}
