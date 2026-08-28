import com.mojang.serialization.MapCodec;

public class diy extends dff implements dmg {
   public static final MapCodec<diy> a = b(diy::new);
   private static final ews b = dff.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);

   public diy(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(dsx.C, Boolean.valueOf(false)));
   }

   @Override
   public MapCodec<diy> a() {
      return a;
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(dsx.C);
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$0.c(dsx.C)) {
         $$3.a($$4, eoc.c, eoc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eob b_(dsh $$0) {
      return $$0.c(dsx.C) ? eoc.c.a(false) : super.b_($$0);
   }

   @Override
   public dsh a(cxk $$0) {
      eob $$1 = $$0.q().b_($$0.a());
      return this.o().a(dsx.C, Boolean.valueOf($$1.b(eoc.c)));
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return b;
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }
}
