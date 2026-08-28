import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bwl extends buv<cgs> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<cgs, bps> e;
   private final cdt f;
   private final float g;
   private final ToDoubleFunction<cgs> h;
   private ewh i;
   private final Function<cgs, avg> j;
   private final Function<cgs, avg> k;

   public bwl(Function<cgs, bps> $$0, cdt $$1, float $$2, ToDoubleFunction<cgs> $$3, Function<cgs, avg> $$4, Function<cgs, avg> $$5) {
      super(ImmutableMap.of(ccg.V, cch.b, ccg.W, cch.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = ewh.b;
   }

   protected boolean a(aqm $$0, cgs $$1) {
      return $$1.dV().a(ccg.W);
   }

   protected boolean a(aqm $$0, cgs $$1, long $$2) {
      return $$1.dV().a(ccg.W);
   }

   protected void b(aqm $$0, cgs $$1, long $$2) {
      ja $$3 = $$1.dr();
      bue<?> $$4 = $$1.dV();
      ewh $$5 = $$4.c(ccg.W).get();
      this.i = new ewh((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(ccg.m, new ccj($$5, this.g, 0));
   }

   protected void c(aqm $$0, cgs $$1, long $$2) {
      List<btc> $$3 = $$0.a(btc.class, this.f, $$1, $$1.cM());
      bue<?> $$4 = $$1.dV();
      if (!$$3.isEmpty()) {
         btc $$5 = $$3.get(0);
         bra $$6 = $$0.aj().c((btc)$$1);
         if ($$5.a($$6, (float)$$1.g(buk.c))) {
            czo.a($$0, (bsh)$$5, $$6);
         }

         int $$7 = $$1.b(brr.a) ? $$1.c(brr.a).e() + 1 : 0;
         int $$8 = $$1.b(brr.b) ? $$1.c(brr.b).e() + 1 : 0;
         float $$9 = 0.25F * (float)($$7 - $$8);
         float $$10 = ayg.a($$1.fl() * 1.65F, 0.2F, 3.0F) + $$9;
         float $$11 = $$5.f($$0.aj().b((btc)$$1)) ? 0.5F : 1.0F;
         $$5.q((double)($$11 * $$10) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), avi.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), avi.g, 1.0F, 1.0F);
         boolean $$12 = $$1.gu();
         if ($$12) {
            $$0.a(null, $$1, this.k.apply($$1), avi.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<ccj> $$13 = $$4.c(ccg.m);
         Optional<ewh> $$14 = $$4.c(ccg.W);
         boolean $$15 = $$13.isEmpty() || $$14.isEmpty() || $$13.get().a().a().a($$14.get(), 0.25);
         if ($$15) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(aqm $$0, cgs $$1) {
      ewh $$2 = $$1.du().d(1.0, 0.0, 1.0).d();
      ja $$3 = ja.a($$1.dp().e($$2));
      return $$0.a_($$3).a(avw.cm) || $$0.a_($$3.c()).a(avw.cm);
   }

   protected void b(aqm $$0, cgs $$1) {
      $$0.a($$1, (byte)59);
      $$1.dV().a(ccg.V, this.e.apply($$1).a($$0.z));
      $$1.dV().b(ccg.W);
   }
}
