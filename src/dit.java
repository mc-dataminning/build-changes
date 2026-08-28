import com.mojang.serialization.MapCodec;

public class dit extends dfa implements dmb {
   public static final MapCodec<dit> a = b(dit::new);
   private static final ewl b = dfa.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);

   public dit(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(dst.C, Boolean.valueOf(false)));
   }

   @Override
   public MapCodec<dit> a() {
      return a;
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(dst.C);
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$0.c(dst.C)) {
         $$3.a($$4, enx.c, enx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected enw b_(dsd $$0) {
      return $$0.c(dst.C) ? enx.c.a(false) : super.b_($$0);
   }

   @Override
   public dsd a(cyb $$0) {
      enw $$1 = $$0.q().b_($$0.a());
      return this.o().a(dst.C, Boolean.valueOf($$1.b(enx.c)));
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return b;
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }
}
