import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bwv extends bvf<chc> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<chc, bqb> e;
   private final ced f;
   private final float g;
   private final ToDoubleFunction<chc> h;
   private eww i;
   private final Function<chc, avn> j;
   private final Function<chc, avn> k;

   public bwv(Function<chc, bqb> $$0, ced $$1, float $$2, ToDoubleFunction<chc> $$3, Function<chc, avn> $$4, Function<chc, avn> $$5) {
      super(ImmutableMap.of(ccq.V, ccr.b, ccq.W, ccr.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = eww.b;
   }

   protected boolean a(aqt $$0, chc $$1) {
      return $$1.dU().a(ccq.W);
   }

   protected boolean a(aqt $$0, chc $$1, long $$2) {
      return $$1.dU().a(ccq.W);
   }

   protected void b(aqt $$0, chc $$1, long $$2) {
      jd $$3 = $$1.dq();
      buo<?> $$4 = $$1.dU();
      eww $$5 = $$4.c(ccq.W).get();
      this.i = new eww((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(ccq.m, new cct($$5, this.g, 0));
   }

   protected void c(aqt $$0, chc $$1, long $$2) {
      List<btl> $$3 = $$0.a(btl.class, this.f, $$1, $$1.cL());
      buo<?> $$4 = $$1.dU();
      if (!$$3.isEmpty()) {
         btl $$5 = $$3.get(0);
         brj $$6 = $$0.aj().c((btl)$$1);
         if ($$5.a($$6, (float)$$1.g(buu.c))) {
            dac.a($$0, (bsq)$$5, $$6);
         }

         int $$7 = $$1.b(bsa.a) ? $$1.c(bsa.a).e() + 1 : 0;
         int $$8 = $$1.b(bsa.b) ? $$1.c(bsa.b).e() + 1 : 0;
         float $$9 = 0.25F * (float)($$7 - $$8);
         float $$10 = ayn.a($$1.fk() * 1.65F, 0.2F, 3.0F) + $$9;
         float $$11 = $$5.f($$0.aj().b((btl)$$1)) ? 0.5F : 1.0F;
         $$5.p((double)($$11 * $$10) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), avp.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), avp.g, 1.0F, 1.0F);
         boolean $$12 = $$1.go();
         if ($$12) {
            $$0.a(null, $$1, this.k.apply($$1), avp.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<cct> $$13 = $$4.c(ccq.m);
         Optional<eww> $$14 = $$4.c(ccq.W);
         boolean $$15 = $$13.isEmpty() || $$14.isEmpty() || $$13.get().a().a().a($$14.get(), 0.25);
         if ($$15) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(aqt $$0, chc $$1) {
      eww $$2 = $$1.dt().d(1.0, 0.0, 1.0).d();
      jd $$3 = jd.a((jw)$$1.do().e($$2));
      return $$0.a_($$3).a(awd.cm) || $$0.a_($$3.c()).a(awd.cm);
   }

   protected void b(aqt $$0, chc $$1) {
      $$0.a($$1, (byte)59);
      $$1.dU().a(ccq.V, this.e.apply($$1).a($$0.z));
      $$1.dU().b(ccq.W);
   }
}
