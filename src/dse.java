import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dse extends dsd {
   public static final MapCodec<dse> f = b(dse::new);
   public static final eam<ja> g = dpt.e;
   public static final eaf h = dsd.b;

   @Override
   public MapCodec<dse> a() {
      return f;
   }

   protected dse(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(g, ja.c).b(h, Boolean.valueOf(true)));
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return dvg.o($$0);
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      return dvg.b($$1, $$2, $$0.c(g));
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      return $$4.g() == $$0.c(g) && !$$0.a($$1, $$3) ? dlw.a.m() : $$0;
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      dzo $$1 = dlw.cx.a($$0);
      return $$1 == null ? null : this.m().b(g, $$1.c(g));
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, azt $$3) {
      if ($$0.c(h)) {
         ja $$4 = $$0.c(g).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(ls.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(dip $$0, iu $$1, dzo $$2) {
      ja $$3 = $$2.c(g).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dzo $$0, dhv $$1, iu $$2, ja $$3) {
      return $$0.c(h) && $$0.c(g) != $$3 ? 15 : 0;
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(g, $$1.a($$0.c(g)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(g, h);
   }

   @Nullable
   @Override
   protected exd a(dip $$0, dzo $$1) {
      return ewz.a($$0, $$1.c(g).g(), ja.b);
   }
}
