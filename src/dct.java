import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dct extends dcs {
   public static final MapCodec<dct> h = b(dct::new);
   public static final dka i = dak.aE;
   public static final djx j = dcs.d;

   @Override
   public MapCodec<dct> a() {
      return h;
   }

   protected dct(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, ic.c).a(j, Boolean.valueOf(true)));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return dfp.h($$0);
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      return cwr.cq.a($$0, $$1, $$2);
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      return cwr.cq.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public djg a(cpg $$0) {
      djg $$1 = cwr.cq.a($$0);
      return $$1 == null ? null : this.o().a(i, $$1.c(i));
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, auu $$3) {
      if ($$0.c(j)) {
         ic $$4 = $$0.c(i).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(jr.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(cto $$0, hx $$1, djg $$2) {
      ic $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   public int a(djg $$0, csu $$1, hx $$2, ic $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return cwr.cq.a($$0, $$1);
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return cwr.cq.a($$0, $$1);
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(i, j);
   }
}
