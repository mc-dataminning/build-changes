import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class byj extends bwt<cir> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<cir, bro> e;
   private final cfr f;
   private final float g;
   private final ToDoubleFunction<cir> h;
   private ezn i;
   private final Function<cir, awk> j;
   private final Function<cir, awk> k;

   public byj(Function<cir, bro> $$0, cfr $$1, float $$2, ToDoubleFunction<cir> $$3, Function<cir, awk> $$4, Function<cir, awk> $$5) {
      super(ImmutableMap.of(cee.V, cef.b, cee.W, cef.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = ezn.c;
   }

   protected boolean a(arn $$0, cir $$1) {
      return $$1.ed().a(cee.W);
   }

   protected boolean a(arn $$0, cir $$1, long $$2) {
      return $$1.ed().a(cee.W);
   }

   protected void b(arn $$0, cir $$1, long $$2) {
      jh $$3 = $$1.dx();
      bwc<?> $$4 = $$1.ed();
      ezn $$5 = $$4.c(cee.W).get();
      this.i = new ezn((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(cee.m, new ceh($$5, this.g, 0));
   }

   protected void c(arn $$0, cir $$1, long $$2) {
      List<bva> $$3 = $$0.a(bva.class, this.f, $$1, $$1.cS());
      bwc<?> $$4 = $$1.ed();
      if (!$$3.isEmpty()) {
         bva $$5 = $$3.get(0);
         bsu $$6 = $$0.ai().c((bva)$$1);
         if ($$5.a($$6, (float)$$1.h(bwi.c))) {
            dbu.a($$0, (bue)$$5, $$6);
         }

         int $$7 = $$1.b(btl.a) ? $$1.c(btl.a).e() + 1 : 0;
         int $$8 = $$1.b(btl.b) ? $$1.c(btl.b).e() + 1 : 0;
         float $$9 = 0.25F * (float)($$7 - $$8);
         float $$10 = azk.a($$1.fr() * 1.65F, 0.2F, 3.0F) + $$9;
         float $$11 = $$5.f($$0.ai().b((bva)$$1)) ? 0.5F : 1.0F;
         $$5.p((double)($$11 * $$10) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), awm.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), awm.g, 1.0F, 1.0F);
         boolean $$12 = $$1.gw();
         if ($$12) {
            $$0.a(null, $$1, this.k.apply($$1), awm.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<ceh> $$13 = $$4.c(cee.m);
         Optional<ezn> $$14 = $$4.c(cee.W);
         boolean $$15 = $$13.isEmpty() || $$14.isEmpty() || $$13.get().a().a().a($$14.get(), 0.25);
         if ($$15) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(arn $$0, cir $$1) {
      ezn $$2 = $$1.dA().d(1.0, 0.0, 1.0).d();
      jh $$3 = jh.a((ka)$$1.dv().e($$2));
      return $$0.a_($$3).a(axa.co) || $$0.a_($$3.d()).a(axa.co);
   }

   protected void b(arn $$0, cir $$1) {
      $$0.a($$1, (byte)59);
      $$1.ed().a(cee.V, this.e.apply($$1).a($$0.A));
      $$1.ed().b(cee.W);
   }
}
