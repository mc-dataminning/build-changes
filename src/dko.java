import com.mojang.serialization.MapCodec;

public class dko extends dgv implements dnx {
   public static final MapCodec<dko> a = b(dko::new);
   private static final eyx c = dgv.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   public static final dur b = duq.C;

   public dko(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public MapCodec<dko> a() {
      return a;
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b);
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(b) ? eqc.c.a(false) : super.b_($$0);
   }

   @Override
   public dua a(cyw $$0) {
      eqb $$1 = $$0.q().b_($$0.a());
      return this.o().b(b, Boolean.valueOf($$1.b(eqc.c)));
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return c;
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }
}
