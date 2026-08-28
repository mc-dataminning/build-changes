import com.mojang.serialization.MapCodec;

public class dlc extends dhj implements dol {
   public static final MapCodec<dlc> a = b(dlc::new);
   private static final ezm c = dhj.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   public static final dvf b = dve.C;

   public dlc(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public MapCodec<dlc> a() {
      return a;
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b);
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eqq.c, eqq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(b) ? eqq.c.a(false) : super.b_($$0);
   }

   @Override
   public duo a(czk $$0) {
      eqp $$1 = $$0.q().b_($$0.a());
      return this.o().b(b, Boolean.valueOf($$1.b(eqq.c)));
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return c;
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }
}
