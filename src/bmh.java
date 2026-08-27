import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bmh extends bks<bwh> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<bwh, bge> e;
   private final btn f;
   private final float g;
   private final ToDoubleFunction<bwh> h;
   private ehi i;
   private final Function<bwh, aoy> j;
   private final Function<bwh, aoy> k;

   public bmh(Function<bwh, bge> $$0, btn $$1, float $$2, ToDoubleFunction<bwh> $$3, Function<bwh, aoy> $$4, Function<bwh, aoy> $$5) {
      super(ImmutableMap.of(bsc.U, bsd.b, bsc.V, bsd.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = ehi.b;
   }

   protected boolean a(akn $$0, bwh $$1) {
      return $$1.dM().a(bsc.V);
   }

   protected boolean a(akn $$0, bwh $$1, long $$2) {
      return $$1.dM().a(bsc.V);
   }

   protected void b(akn $$0, bwh $$1, long $$2) {
      gw $$3 = $$1.dk();
      bkb<?> $$4 = $$1.dM();
      ehi $$5 = $$4.c(bsc.V).get();
      this.i = new ehi((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(bsc.m, new bsf($$5, this.g, 0));
   }

   protected void c(akn $$0, bwh $$1, long $$2) {
      List<bjb> $$3 = $$0.a(bjb.class, this.f, $$1, $$1.cG());
      bkb<?> $$4 = $$1.dM();
      if (!$$3.isEmpty()) {
         bjb $$5 = $$3.get(0);
         $$5.a($$0.ag().c((bjb)$$1), (float)$$1.b(bkh.f));
         int $$6 = $$1.a(bia.a) ? $$1.b(bia.a).e() + 1 : 0;
         int $$7 = $$1.a(bia.b) ? $$1.b(bia.b).e() + 1 : 0;
         float $$8 = 0.25F * (float)($$6 - $$7);
         float $$9 = ars.a($$1.fd() * 1.65F, 0.2F, 3.0F) + $$8;
         float $$10 = $$5.f($$0.ag().b((bjb)$$1)) ? 0.5F : 1.0F;
         $$5.q((double)($$10 * $$9) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), apa.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), apa.g, 1.0F, 1.0F);
         boolean $$11 = $$1.gh();
         if ($$11) {
            $$0.a(null, $$1, this.k.apply($$1), apa.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<bsf> $$12 = $$4.c(bsc.m);
         Optional<ehi> $$13 = $$4.c(bsc.V);
         boolean $$14 = $$12.isEmpty() || $$13.isEmpty() || $$12.get().a().a().a($$13.get(), 0.25);
         if ($$14) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(akn $$0, bwh $$1) {
      ehi $$2 = $$1.dn().d(1.0, 0.0, 1.0).d();
      gw $$3 = gw.a($$1.di().e($$2));
      return $$0.a_($$3).a(apo.ce) || $$0.a_($$3.c()).a(apo.ce);
   }

   protected void b(akn $$0, bwh $$1) {
      $$0.a($$1, (byte)59);
      $$1.dM().a(bsc.U, this.e.apply($$1).a($$0.z));
      $$1.dM().b(bsc.V);
   }
}
