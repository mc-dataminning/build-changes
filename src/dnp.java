import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnp extends dno {
   public static final MapCodec<dnp> h = b(dnp::new);
   public static final dvi i = dlf.aF;
   public static final dvf j = dno.d;

   @Override
   public MapCodec<dnp> a() {
      return h;
   }

   protected dnp(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(i, jj.c).b(j, Boolean.valueOf(true)));
   }

   @Override
   public String g() {
      return this.q().a();
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return dqm.o($$0);
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      return dqm.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      return $$1.g() == $$0.c(i) && !$$0.a($$3, $$4) ? dhl.a.o() : $$0;
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      duo $$1 = dhl.cq.a($$0);
      return $$1 == null ? null : this.o().b(i, $$1.c(i));
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, azl $$3) {
      if ($$0.c(j)) {
         jj $$4 = $$0.c(i).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(li.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(deg $$0, je $$1, duo $$2) {
      jj $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(duo $$0, ddl $$1, je $$2, jj $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(i, $$1.a($$0.c(i)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(i, j);
   }

   @Nullable
   @Override
   protected erx a(deg $$0, duo $$1) {
      return ert.a($$0, $$1.c(i).g(), jj.b);
   }
}
