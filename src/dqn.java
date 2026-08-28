import com.mojang.serialization.MapCodec;

public class dqn extends dsi implements dtb {
   public static final MapCodec<dqn> b = b(dqn::new);
   public static final eaf c = eae.I;
   public static final eaf d = eae.A;
   private static final int f = 8;
   public static final int e = 128;
   private static final int g = 200;

   @Override
   public MapCodec<dqn> a() {
      return b;
   }

   public dqn(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(a, ja.b).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dzo a(dcl $$0) {
      evv $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == evw.c;
      return this.m().b(a, $$0.k()).b(c, Boolean.valueOf($$2));
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, evw.c, evw.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected evv b_(dzo $$0) {
      return $$0.c(c) ? evw.c.a(false) : super.b_($$0);
   }

   @Override
   protected int a(dzo $$0, dhv $$1, iu $$2, ja $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(dzo $$0, dhv $$1, iu $$2, ja $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(dzo $$0, dip $$1, iu $$2) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(dzo $$0, dip $$1, iu $$2) {
      ja $$3 = $$0.c(a).g();
      $$1.a($$2.a($$3), this, ewz.a($$1, $$3, null));
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, azt $$3) {
      if ($$1.ag() && (long)$$1.A.a(200) <= $$1.ae() % 200L && $$2.v() == $$1.a(efn.a.b, $$2.u(), $$2.w()) - 1) {
         azo.a($$0.c(a).o(), $$1, $$2, 0.125, lx.aW, btj.a(1, 2));
      }
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, boolean $$3) {
      if ($$0.c(d)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dzo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean f_(dzo $$0) {
      return true;
   }
}
