import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcn extends dcm {
   public static final MapCodec<dcn> h = b(dcn::new);
   public static final dju i = dae.aE;
   public static final djr j = dcm.d;

   @Override
   public MapCodec<dcn> a() {
      return h;
   }

   protected dcn(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, ic.c).a(j, Boolean.valueOf(true)));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return dfj.h($$0);
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      return cwl.cq.a($$0, $$1, $$2);
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      return cwl.cq.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dja a(cpa $$0) {
      dja $$1 = cwl.cq.a($$0);
      return $$1 == null ? null : this.o().a(i, $$1.c(i));
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, aup $$3) {
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
   protected boolean a(cti $$0, hx $$1, dja $$2) {
      ic $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   public int a(dja $$0, cso $$1, hx $$2, ic $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return cwl.cq.a($$0, $$1);
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return cwl.cq.a($$0, $$1);
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(i, j);
   }
}
