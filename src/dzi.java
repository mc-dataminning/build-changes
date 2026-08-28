import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dzi extends dny {
   public static final MapCodec<dzi> b = b(dzi::new);
   public static final eam<eaq> c = eae.bj;
   public static final eaf d = eae.B;
   public static final int e = 4;
   private static final feq f = dlu.c(16.0, 0.0, 4.0);
   private static final Map<ja, feq> g = fen.d(fen.a(f, dlu.c(4.0, 4.0, 16.0)));
   private static final Map<ja, feq> h = fen.d(fen.a(f, dlu.c(4.0, 4.0, 20.0)));

   @Override
   protected MapCodec<dzi> a() {
      return b;
   }

   public dzi(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(a, ja.c).b(c, eaq.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dzo $$0) {
      return true;
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return ($$0.c(d) ? g : h).get($$0.c(a));
   }

   private boolean a(dzo $$0, dzo $$1) {
      dlu $$2 = $$0.c(c) == eaq.a ? dlw.bF : dlw.by;
      return $$1.a($$2) && $$1.c(dzh.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dzo a(dip $$0, iu $$1, dzo $$2, cqs $$3) {
      if (!$$0.C && $$3.gk()) {
         iu $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, boolean $$3) {
      iu $$4 = $$2.a($$0.c(a).g());
      if (this.a($$0, $$1.a_($$4))) {
         $$1.b($$4, true);
      }
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      return $$4.g() == $$0.c(a) && !$$0.a($$1, $$3) ? dlw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      dzo $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dlw.bX) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dlu $$3, @Nullable exd $$4, boolean $$5) {
      if ($$0.a((dis)$$1, $$2)) {
         $$1.b($$2.a($$0.c(a).g()), $$3, ewz.a($$4, $$0.c(a).g()));
      }
   }

   @Override
   protected cys a(dis $$0, iu $$1, dzo $$2, boolean $$3) {
      return new cys($$2.c(c) == eaq.b ? dlw.by : dlw.bF);
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }
}
