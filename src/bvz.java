import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bvz extends buj<cgg> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<cgg, bph> e;
   private final cdh f;
   private final float g;
   private final ToDoubleFunction<cgg> h;
   private eum i;
   private final Function<cgg, avh> j;
   private final Function<cgg, avh> k;

   public bvz(Function<cgg, bph> $$0, cdh $$1, float $$2, ToDoubleFunction<cgg> $$3, Function<cgg, avh> $$4, Function<cgg, avh> $$5) {
      super(ImmutableMap.of(cbu.V, cbv.b, cbu.W, cbv.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = eum.b;
   }

   protected boolean a(aqn $$0, cgg $$1) {
      return $$1.dS().a(cbu.W);
   }

   protected boolean a(aqn $$0, cgg $$1, long $$2) {
      return $$1.dS().a(cbu.W);
   }

   protected void b(aqn $$0, cgg $$1, long $$2) {
      io $$3 = $$1.dp();
      bts<?> $$4 = $$1.dS();
      eum $$5 = $$4.c(cbu.W).get();
      this.i = new eum((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(cbu.m, new cbx($$5, this.g, 0));
   }

   protected void c(aqn $$0, cgg $$1, long $$2) {
      List<bsq> $$3 = $$0.a(bsq.class, this.f, $$1, $$1.cK());
      bts<?> $$4 = $$1.dS();
      if (!$$3.isEmpty()) {
         bsq $$5 = $$3.get(0);
         $$5.a($$0.ai().c((bsq)$$1), (float)$$1.g(bty.c));
         int $$6 = $$1.b(brg.a) ? $$1.c(brg.a).e() + 1 : 0;
         int $$7 = $$1.b(brg.b) ? $$1.c(brg.b).e() + 1 : 0;
         float $$8 = 0.25F * (float)($$6 - $$7);
         float $$9 = ayf.a($$1.fn() * 1.65F, 0.2F, 3.0F) + $$8;
         float $$10 = $$5.f($$0.ai().b((bsq)$$1)) ? 0.5F : 1.0F;
         $$5.q((double)($$10 * $$9) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), avj.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), avj.g, 1.0F, 1.0F);
         boolean $$11 = $$1.gw();
         if ($$11) {
            $$0.a(null, $$1, this.k.apply($$1), avj.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<cbx> $$12 = $$4.c(cbu.m);
         Optional<eum> $$13 = $$4.c(cbu.W);
         boolean $$14 = $$12.isEmpty() || $$13.isEmpty() || $$12.get().a().a().a($$13.get(), 0.25);
         if ($$14) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(aqn $$0, cgg $$1) {
      eum $$2 = $$1.ds().d(1.0, 0.0, 1.0).d();
      io $$3 = io.a($$1.dn().e($$2));
      return $$0.a_($$3).a(avx.cm) || $$0.a_($$3.c()).a(avx.cm);
   }

   protected void b(aqn $$0, cgg $$1) {
      $$0.a($$1, (byte)59);
      $$1.dS().a(cbu.V, this.e.apply($$1).a($$0.z));
      $$1.dS().b(cbu.W);
   }
}
