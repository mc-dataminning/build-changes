import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkf extends dke {
   public static final MapCodec<dkf> h = b(dkf::new);
   public static final drx i = dhw.aE;
   public static final dru j = dke.d;

   @Override
   public MapCodec<dkf> a() {
      return h;
   }

   protected dkf(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, it.c).a(j, Boolean.valueOf(true)));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return dnc.m($$0);
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      return dnc.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      return $$1.g() == $$0.c(i) && !$$0.a($$3, $$4) ? dec.a.n() : $$0;
   }

   @Nullable
   @Override
   public drd a(cxb $$0) {
      drd $$1 = dec.cq.a($$0);
      return $$1 == null ? null : this.n().a(i, $$1.c(i));
   }

   @Override
   public void a(drd $$0, daz $$1, io $$2, aym $$3) {
      if ($$0.c(j)) {
         it $$4 = $$0.c(i).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(ks.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(daz $$0, io $$1, drd $$2) {
      it $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(drd $$0, daf $$1, io $$2, it $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(i, $$1.a($$0.c(i)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(i, j);
   }
}
