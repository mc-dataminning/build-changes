import com.mojang.serialization.MapCodec;

public class dlg extends doz {
   public static final MapCodec<dlg> b = b(dlg::new);

   @Override
   public MapCodec<dlg> a() {
      return b;
   }

   protected dlg(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jm.b));
   }

   @Override
   public dvv a(dad $$0) {
      jm $$1 = $$0.k();
      dvv $$2 = $$0.q().a_($$0.a().a($$1.g()));
      return $$2.a(this) && $$2.c(a) == $$1 ? this.m().b(a, $$1.g()) : this.m().b(a, $$1);
   }

   @Override
   public void a(dvv $$0, dfm $$1, jh $$2, azu $$3) {
      jm $$4 = $$0.c(a);
      double $$5 = (double)$$2.u() + 0.55 - (double)($$3.i() * 0.1F);
      double $$6 = (double)$$2.v() + 0.55 - (double)($$3.i() * 0.1F);
      double $$7 = (double)$$2.w() + 0.55 - (double)($$3.i() * 0.1F);
      double $$8 = (double)(0.4F - ($$3.i() + $$3.i()) * 0.4F);
      if ($$3.a(5) == 0) {
         $$1.a(ls.t, $$5 + (double)$$4.j() * $$8, $$6 + (double)$$4.k() * $$8, $$7 + (double)$$4.l() * $$8, $$3.k() * 0.005, $$3.k() * 0.005, $$3.k() * 0.005);
      }
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(a);
   }
}
