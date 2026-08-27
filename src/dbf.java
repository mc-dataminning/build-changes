import com.mojang.serialization.MapCodec;

public class dbf extends ctl implements ctf {
   public static final MapCodec<dbf> a = b(dbf::new);
   protected static final float b = 6.0F;
   protected static final eia c = ctc.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dbf> a() {
      return a;
   }

   protected dbf(dfc.d $$0) {
      super($$0);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return c;
   }

   @Override
   public boolean b(cqe $$0, gw $$1, dfd $$2) {
      return true;
   }

   @Override
   public boolean a(cqb $$0, ash $$1, gw $$2, dfd $$3) {
      return true;
   }

   @Override
   public void a(akt $$0, ash $$1, gw $$2, dfd $$3) {
      cvi $$4 = (cvi)($$3.a(cte.bu) ? cte.iI : cte.iH);
      if ($$4.o().a($$0, $$2) && $$0.t($$2.c())) {
         cvi.a($$0, $$4.o(), $$2, 2);
      }
   }
}
