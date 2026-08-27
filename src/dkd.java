import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkd extends dkc {
   public static final MapCodec<dkd> h = b(dkd::new);
   public static final drv i = dhu.aE;
   public static final drs j = dkc.d;

   @Override
   public MapCodec<dkd> a() {
      return h;
   }

   protected dkd(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, it.c).a(j, Boolean.valueOf(true)));
   }

   @Override
   public String g() {
      return this.q().a();
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return dna.m($$0);
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      return dna.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      return $$1.g() == $$0.c(i) && !$$0.a($$3, $$4) ? dea.a.n() : $$0;
   }

   @Nullable
   @Override
   public drb a(cwz $$0) {
      drb $$1 = dea.cq.a($$0);
      return $$1 == null ? null : this.n().a(i, $$1.c(i));
   }

   @Override
   public void a(drb $$0, dax $$1, io $$2, ayk $$3) {
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
   protected boolean a(dax $$0, io $$1, drb $$2) {
      it $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(drb $$0, dad $$1, io $$2, it $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return $$0.a(i, $$1.a($$0.c(i)));
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(i, j);
   }
}
