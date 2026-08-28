import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bwh extends bur<cgo> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<cgo, bpo> e;
   private final cdp f;
   private final float g;
   private final ToDoubleFunction<cgo> h;
   private evz i;
   private final Function<cgo, ave> j;
   private final Function<cgo, ave> k;

   public bwh(Function<cgo, bpo> $$0, cdp $$1, float $$2, ToDoubleFunction<cgo> $$3, Function<cgo, ave> $$4, Function<cgo, ave> $$5) {
      super(ImmutableMap.of(ccc.V, ccd.b, ccc.W, ccd.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = evz.b;
   }

   protected boolean a(aqk $$0, cgo $$1) {
      return $$1.dT().a(ccc.W);
   }

   protected boolean a(aqk $$0, cgo $$1, long $$2) {
      return $$1.dT().a(ccc.W);
   }

   protected void b(aqk $$0, cgo $$1, long $$2) {
      ja $$3 = $$1.dp();
      bua<?> $$4 = $$1.dT();
      evz $$5 = $$4.c(ccc.W).get();
      this.i = new evz((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(ccc.m, new ccf($$5, this.g, 0));
   }

   protected void c(aqk $$0, cgo $$1, long $$2) {
      List<bsy> $$3 = $$0.a(bsy.class, this.f, $$1, $$1.cK());
      bua<?> $$4 = $$1.dT();
      if (!$$3.isEmpty()) {
         bsy $$5 = $$3.get(0);
         bqw $$6 = $$0.aj().c((bsy)$$1);
         if ($$5.a($$6, (float)$$1.g(bug.c))) {
            czl.a($$0, (bsd)$$5, $$6);
         }

         int $$7 = $$1.b(brn.a) ? $$1.c(brn.a).e() + 1 : 0;
         int $$8 = $$1.b(brn.b) ? $$1.c(brn.b).e() + 1 : 0;
         float $$9 = 0.25F * (float)($$7 - $$8);
         float $$10 = aye.a($$1.fj() * 1.65F, 0.2F, 3.0F) + $$9;
         float $$11 = $$5.f($$0.aj().b((bsy)$$1)) ? 0.5F : 1.0F;
         $$5.q((double)($$11 * $$10) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), avg.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), avg.g, 1.0F, 1.0F);
         boolean $$12 = $$1.gu();
         if ($$12) {
            $$0.a(null, $$1, this.k.apply($$1), avg.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<ccf> $$13 = $$4.c(ccc.m);
         Optional<evz> $$14 = $$4.c(ccc.W);
         boolean $$15 = $$13.isEmpty() || $$14.isEmpty() || $$13.get().a().a().a($$14.get(), 0.25);
         if ($$15) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(aqk $$0, cgo $$1) {
      evz $$2 = $$1.ds().d(1.0, 0.0, 1.0).d();
      ja $$3 = ja.a($$1.dn().e($$2));
      return $$0.a_($$3).a(avu.cm) || $$0.a_($$3.c()).a(avu.cm);
   }

   protected void b(aqk $$0, cgo $$1) {
      $$0.a($$1, (byte)59);
      $$1.dT().a(ccc.V, this.e.apply($$1).a($$0.z));
      $$1.dT().b(ccc.W);
   }
}
