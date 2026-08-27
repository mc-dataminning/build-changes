import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bvi extends bts<cfp> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<cfp, box> e;
   private final ccq f;
   private final float g;
   private final ToDoubleFunction<cfp> h;
   private etp i;
   private final Function<cfp, avb> j;
   private final Function<cfp, avb> k;

   public bvi(Function<cfp, box> $$0, ccq $$1, float $$2, ToDoubleFunction<cfp> $$3, Function<cfp, avb> $$4, Function<cfp, avb> $$5) {
      super(ImmutableMap.of(cbd.V, cbe.b, cbd.W, cbe.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = etp.b;
   }

   protected boolean a(aqh $$0, cfp $$1) {
      return $$1.dQ().a(cbd.W);
   }

   protected boolean a(aqh $$0, cfp $$1, long $$2) {
      return $$1.dQ().a(cbd.W);
   }

   protected void b(aqh $$0, cfp $$1, long $$2) {
      in $$3 = $$1.dn();
      btb<?> $$4 = $$1.dQ();
      etp $$5 = $$4.c(cbd.W).get();
      this.i = new etp((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(cbd.m, new cbg($$5, this.g, 0));
   }

   protected void c(aqh $$0, cfp $$1, long $$2) {
      List<bsa> $$3 = $$0.a(bsa.class, this.f, $$1, $$1.cI());
      btb<?> $$4 = $$1.dQ();
      if (!$$3.isEmpty()) {
         bsa $$5 = $$3.get(0);
         $$5.a($$0.ai().c((bsa)$$1), (float)$$1.g(bth.c));
         int $$6 = $$1.b(bqv.a) ? $$1.c(bqv.a).e() + 1 : 0;
         int $$7 = $$1.b(bqv.b) ? $$1.c(bqv.b).e() + 1 : 0;
         float $$8 = 0.25F * (float)($$6 - $$7);
         float $$9 = axz.a($$1.fl() * 1.65F, 0.2F, 3.0F) + $$8;
         float $$10 = $$5.f($$0.ai().b((bsa)$$1)) ? 0.5F : 1.0F;
         $$5.q((double)($$10 * $$9) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), avd.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), avd.g, 1.0F, 1.0F);
         boolean $$11 = $$1.gw();
         if ($$11) {
            $$0.a(null, $$1, this.k.apply($$1), avd.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<cbg> $$12 = $$4.c(cbd.m);
         Optional<etp> $$13 = $$4.c(cbd.W);
         boolean $$14 = $$12.isEmpty() || $$13.isEmpty() || $$12.get().a().a().a($$13.get(), 0.25);
         if ($$14) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(aqh $$0, cfp $$1) {
      etp $$2 = $$1.dq().d(1.0, 0.0, 1.0).d();
      in $$3 = in.a($$1.dl().e($$2));
      return $$0.a_($$3).a(avr.cm) || $$0.a_($$3.c()).a(avr.cm);
   }

   protected void b(aqh $$0, cfp $$1) {
      $$0.a($$1, (byte)59);
      $$1.dQ().a(cbd.V, this.e.apply($$1).a($$0.z));
      $$1.dQ().b(cbd.W);
   }
}
