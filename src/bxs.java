import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bxs extends bwc<cia> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<cia, bra> e;
   private final cfa f;
   private final float g;
   private final ToDoubleFunction<cia> h;
   private eys i;
   private final Function<cia, awd> j;
   private final Function<cia, awd> k;

   public bxs(Function<cia, bra> $$0, cfa $$1, float $$2, ToDoubleFunction<cia> $$3, Function<cia, awd> $$4, Function<cia, awd> $$5) {
      super(ImmutableMap.of(cdn.V, cdo.b, cdn.W, cdo.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = eys.c;
   }

   protected boolean a(arh $$0, cia $$1) {
      return $$1.dX().a(cdn.W);
   }

   protected boolean a(arh $$0, cia $$1, long $$2) {
      return $$1.dX().a(cdn.W);
   }

   protected void b(arh $$0, cia $$1, long $$2) {
      je $$3 = $$1.ds();
      bvl<?> $$4 = $$1.dX();
      eys $$5 = $$4.c(cdn.W).get();
      this.i = new eys((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(cdn.m, new cdq($$5, this.g, 0));
   }

   protected void c(arh $$0, cia $$1, long $$2) {
      List<buk> $$3 = $$0.a(buk.class, this.f, $$1, $$1.cO());
      bvl<?> $$4 = $$1.dX();
      if (!$$3.isEmpty()) {
         buk $$5 = $$3.get(0);
         bsg $$6 = $$0.ak().c((buk)$$1);
         if ($$5.a($$6, (float)$$1.h(bvr.c))) {
            dbm.a($$0, (bto)$$5, $$6);
         }

         int $$7 = $$1.b(bsx.a) ? $$1.c(bsx.a).e() + 1 : 0;
         int $$8 = $$1.b(bsx.b) ? $$1.c(bsx.b).e() + 1 : 0;
         float $$9 = 0.25F * (float)($$7 - $$8);
         float $$10 = azd.a($$1.fm() * 1.65F, 0.2F, 3.0F) + $$9;
         float $$11 = $$5.f($$0.ak().b((buk)$$1)) ? 0.5F : 1.0F;
         $$5.p((double)($$11 * $$10) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), awf.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), awf.g, 1.0F, 1.0F);
         boolean $$12 = $$1.gr();
         if ($$12) {
            $$0.a(null, $$1, this.k.apply($$1), awf.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<cdq> $$13 = $$4.c(cdn.m);
         Optional<eys> $$14 = $$4.c(cdn.W);
         boolean $$15 = $$13.isEmpty() || $$14.isEmpty() || $$13.get().a().a().a($$14.get(), 0.25);
         if ($$15) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(arh $$0, cia $$1) {
      eys $$2 = $$1.dv().d(1.0, 0.0, 1.0).d();
      je $$3 = je.a((jx)$$1.dq().e($$2));
      return $$0.a_($$3).a(awt.cn) || $$0.a_($$3.d()).a(awt.cn);
   }

   protected void b(arh $$0, cia $$1) {
      $$0.a($$1, (byte)59);
      $$1.dX().a(cdn.V, this.e.apply($$1).a($$0.z));
      $$1.dX().b(cdn.W);
   }
}
