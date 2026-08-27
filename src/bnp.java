import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bnp extends bma<bxp> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<bxp, bhm> e;
   private final buv f;
   private final float g;
   private final ToDoubleFunction<bxp> h;
   private eif i;
   private final Function<bxp, aqc> j;
   private final Function<bxp, aqc> k;

   public bnp(Function<bxp, bhm> $$0, buv $$1, float $$2, ToDoubleFunction<bxp> $$3, Function<bxp, aqc> $$4, Function<bxp, aqc> $$5) {
      super(ImmutableMap.of(btk.U, btl.b, btk.V, btl.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = eif.b;
   }

   protected boolean a(alq $$0, bxp $$1) {
      return $$1.dN().a(btk.V);
   }

   protected boolean a(alq $$0, bxp $$1, long $$2) {
      return $$1.dN().a(btk.V);
   }

   protected void b(alq $$0, bxp $$1, long $$2) {
      ht $$3 = $$1.dl();
      blj<?> $$4 = $$1.dN();
      eif $$5 = $$4.c(btk.V).get();
      this.i = new eif((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(btk.m, new btn($$5, this.g, 0));
   }

   protected void c(alq $$0, bxp $$1, long $$2) {
      List<bkj> $$3 = $$0.a(bkj.class, this.f, $$1, $$1.cG());
      blj<?> $$4 = $$1.dN();
      if (!$$3.isEmpty()) {
         bkj $$5 = $$3.get(0);
         $$5.a($$0.ag().c((bkj)$$1), (float)$$1.b(blp.c));
         int $$6 = $$1.a(bji.a) ? $$1.b(bji.a).e() + 1 : 0;
         int $$7 = $$1.a(bji.b) ? $$1.b(bji.b).e() + 1 : 0;
         float $$8 = 0.25F * (float)($$6 - $$7);
         float $$9 = asy.a($$1.fe() * 1.65F, 0.2F, 3.0F) + $$8;
         float $$10 = $$5.f($$0.ag().b((bkj)$$1)) ? 0.5F : 1.0F;
         $$5.q((double)($$10 * $$9) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), aqe.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), aqe.g, 1.0F, 1.0F);
         boolean $$11 = $$1.gl();
         if ($$11) {
            $$0.a(null, $$1, this.k.apply($$1), aqe.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<btn> $$12 = $$4.c(btk.m);
         Optional<eif> $$13 = $$4.c(btk.V);
         boolean $$14 = $$12.isEmpty() || $$13.isEmpty() || $$12.get().a().a().a($$13.get(), 0.25);
         if ($$14) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(alq $$0, bxp $$1) {
      eif $$2 = $$1.do().d(1.0, 0.0, 1.0).d();
      ht $$3 = ht.a($$1.dj().e($$2));
      return $$0.a_($$3).a(aqs.ce) || $$0.a_($$3.c()).a(aqs.ce);
   }

   protected void b(alq $$0, bxp $$1) {
      $$0.a($$1, (byte)59);
      $$1.dN().a(btk.U, this.e.apply($$1).a($$0.z));
      $$1.dN().b(btk.V);
   }
}
