import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bwx extends bvh<che> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<che, bqc> e;
   private final cef f;
   private final float g;
   private final ToDoubleFunction<che> h;
   private exc i;
   private final Function<che, avo> j;
   private final Function<che, avo> k;

   public bwx(Function<che, bqc> $$0, cef $$1, float $$2, ToDoubleFunction<che> $$3, Function<che, avo> $$4, Function<che, avo> $$5) {
      super(ImmutableMap.of(ccs.V, cct.b, ccs.W, cct.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = exc.b;
   }

   protected boolean a(aqu $$0, che $$1) {
      return $$1.dT().a(ccs.W);
   }

   protected boolean a(aqu $$0, che $$1, long $$2) {
      return $$1.dT().a(ccs.W);
   }

   protected void b(aqu $$0, che $$1, long $$2) {
      jd $$3 = $$1.do();
      buq<?> $$4 = $$1.dT();
      exc $$5 = $$4.c(ccs.W).get();
      this.i = new exc((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(ccs.m, new ccv($$5, this.g, 0));
   }

   protected void c(aqu $$0, che $$1, long $$2) {
      List<btn> $$3 = $$0.a(btn.class, this.f, $$1, $$1.cK());
      buq<?> $$4 = $$1.dT();
      if (!$$3.isEmpty()) {
         btn $$5 = $$3.get(0);
         brk $$6 = $$0.aj().c((btn)$$1);
         if ($$5.a($$6, (float)$$1.g(buw.c))) {
            dae.a($$0, (bsr)$$5, $$6);
         }

         int $$7 = $$1.b(bsb.a) ? $$1.c(bsb.a).e() + 1 : 0;
         int $$8 = $$1.b(bsb.b) ? $$1.c(bsb.b).e() + 1 : 0;
         float $$9 = 0.25F * (float)($$7 - $$8);
         float $$10 = ayo.a($$1.fj() * 1.65F, 0.2F, 3.0F) + $$9;
         float $$11 = $$5.f($$0.aj().b((btn)$$1)) ? 0.5F : 1.0F;
         $$5.p((double)($$11 * $$10) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), avq.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), avq.g, 1.0F, 1.0F);
         boolean $$12 = $$1.gm();
         if ($$12) {
            $$0.a(null, $$1, this.k.apply($$1), avq.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<ccv> $$13 = $$4.c(ccs.m);
         Optional<exc> $$14 = $$4.c(ccs.W);
         boolean $$15 = $$13.isEmpty() || $$14.isEmpty() || $$13.get().a().a().a($$14.get(), 0.25);
         if ($$15) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(aqu $$0, che $$1) {
      exc $$2 = $$1.dr().d(1.0, 0.0, 1.0).d();
      jd $$3 = jd.a((jw)$$1.dm().e($$2));
      return $$0.a_($$3).a(awe.cn) || $$0.a_($$3.d()).a(awe.cn);
   }

   protected void b(aqu $$0, che $$1) {
      $$0.a($$1, (byte)59);
      $$1.dT().a(ccs.V, this.e.apply($$1).a($$0.z));
      $$1.dT().b(ccs.W);
   }
}
