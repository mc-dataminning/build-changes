import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dre extends drd {
   public static final MapCodec<dre> f = b(dre::new);
   public static final dzk<jo> g = dot.e;
   public static final dzd h = drd.b;

   @Override
   public MapCodec<dre> a() {
      return f;
   }

   protected dre(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(g, jo.c).b(h, Boolean.valueOf(true)));
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return due.o($$0);
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      return due.b($$1, $$2, $$0.c(g));
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      return $$4.g() == $$0.c(g) && !$$0.a($$1, $$3) ? dkw.a.m() : $$0;
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      dym $$1 = dkw.cx.a($$0);
      return $$1 == null ? null : this.m().b(g, $$1.c(g));
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, azs $$3) {
      if ($$0.c(h)) {
         jo $$4 = $$0.c(g).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(lq.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(dhp $$0, jj $$1, dym $$2) {
      jo $$3 = $$2.c(g).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dym $$0, dgv $$1, jj $$2, jo $$3) {
      return $$0.c(h) && $$0.c(g) != $$3 ? 15 : 0;
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(g, $$1.a($$0.c(g)));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(g, h);
   }

   @Nullable
   @Override
   protected ewb a(dhp $$0, dym $$1) {
      return evx.a($$0, $$1.c(g).g(), jo.b);
   }
}
