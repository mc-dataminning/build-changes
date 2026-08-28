import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bwk extends buu<cgr> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<cgr, bpr> e;
   private final cds f;
   private final float g;
   private final ToDoubleFunction<cgr> h;
   private ewf i;
   private final Function<cgr, avg> j;
   private final Function<cgr, avg> k;

   public bwk(Function<cgr, bpr> $$0, cds $$1, float $$2, ToDoubleFunction<cgr> $$3, Function<cgr, avg> $$4, Function<cgr, avg> $$5) {
      super(ImmutableMap.of(ccf.V, ccg.b, ccf.W, ccg.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = ewf.b;
   }

   protected boolean a(aqm $$0, cgr $$1) {
      return $$1.dU().a(ccf.W);
   }

   protected boolean a(aqm $$0, cgr $$1, long $$2) {
      return $$1.dU().a(ccf.W);
   }

   protected void b(aqm $$0, cgr $$1, long $$2) {
      ja $$3 = $$1.dq();
      bud<?> $$4 = $$1.dU();
      ewf $$5 = $$4.c(ccf.W).get();
      this.i = new ewf((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(ccf.m, new cci($$5, this.g, 0));
   }

   protected void c(aqm $$0, cgr $$1, long $$2) {
      List<btb> $$3 = $$0.a(btb.class, this.f, $$1, $$1.cL());
      bud<?> $$4 = $$1.dU();
      if (!$$3.isEmpty()) {
         btb $$5 = $$3.get(0);
         bqz $$6 = $$0.aj().c((btb)$$1);
         if ($$5.a($$6, (float)$$1.g(buj.c))) {
            czn.a($$0, (bsg)$$5, $$6);
         }

         int $$7 = $$1.b(brq.a) ? $$1.c(brq.a).e() + 1 : 0;
         int $$8 = $$1.b(brq.b) ? $$1.c(brq.b).e() + 1 : 0;
         float $$9 = 0.25F * (float)($$7 - $$8);
         float $$10 = ayg.a($$1.fk() * 1.65F, 0.2F, 3.0F) + $$9;
         float $$11 = $$5.f($$0.aj().b((btb)$$1)) ? 0.5F : 1.0F;
         $$5.q((double)($$11 * $$10) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), avi.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), avi.g, 1.0F, 1.0F);
         boolean $$12 = $$1.gv();
         if ($$12) {
            $$0.a(null, $$1, this.k.apply($$1), avi.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<cci> $$13 = $$4.c(ccf.m);
         Optional<ewf> $$14 = $$4.c(ccf.W);
         boolean $$15 = $$13.isEmpty() || $$14.isEmpty() || $$13.get().a().a().a($$14.get(), 0.25);
         if ($$15) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(aqm $$0, cgr $$1) {
      ewf $$2 = $$1.dt().d(1.0, 0.0, 1.0).d();
      ja $$3 = ja.a($$1.do().e($$2));
      return $$0.a_($$3).a(avw.cm) || $$0.a_($$3.c()).a(avw.cm);
   }

   protected void b(aqm $$0, cgr $$1) {
      $$0.a($$1, (byte)59);
      $$1.dU().a(ccf.V, this.e.apply($$1).a($$0.z));
      $$1.dU().b(ccf.W);
   }
}
