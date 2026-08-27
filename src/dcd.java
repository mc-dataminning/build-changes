import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcd extends dcc {
   public static final MapCodec<dcd> h = b(dcd::new);
   public static final djj i = czu.aE;
   public static final djg j = dcc.d;

   @Override
   public MapCodec<dcd> a() {
      return h;
   }

   protected dcd(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, ia.c).a(j, Boolean.valueOf(true)));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return dez.h($$0);
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      return cwb.cq.a($$0, $$1, $$2);
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      return cwb.cq.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      dip $$1 = cwb.cq.a($$0);
      return $$1 == null ? null : this.o().a(i, $$1.c(i));
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, auf $$3) {
      if ($$0.c(j)) {
         ia $$4 = $$0.c(i).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(jp.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(csy $$0, hv $$1, dip $$2) {
      ia $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   public int a(dip $$0, cse $$1, hv $$2, ia $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return cwb.cq.a($$0, $$1);
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return cwb.cq.a($$0, $$1);
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(i, j);
   }
}
