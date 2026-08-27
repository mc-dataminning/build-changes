import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bpv extends bof<caa> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<caa, bjn> e;
   private final bxd f;
   private final float g;
   private final ToDoubleFunction<caa> h;
   private emc i;
   private final Function<caa, ars> j;
   private final Function<caa, ars> k;

   public bpv(Function<caa, bjn> $$0, bxd $$1, float $$2, ToDoubleFunction<caa> $$3, Function<caa, ars> $$4, Function<caa, ars> $$5) {
      super(ImmutableMap.of(bvq.V, bvr.b, bvq.W, bvr.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = emc.b;
   }

   protected boolean a(ane $$0, caa $$1) {
      return $$1.dN().a(bvq.W);
   }

   protected boolean a(ane $$0, caa $$1, long $$2) {
      return $$1.dN().a(bvq.W);
   }

   protected void b(ane $$0, caa $$1, long $$2) {
      hx $$3 = $$1.dl();
      bno<?> $$4 = $$1.dN();
      emc $$5 = $$4.c(bvq.W).get();
      this.i = new emc((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(bvq.m, new bvt($$5, this.g, 0));
   }

   protected void c(ane $$0, caa $$1, long $$2) {
      List<bmo> $$3 = $$0.a(bmo.class, this.f, $$1, $$1.cH());
      bno<?> $$4 = $$1.dN();
      if (!$$3.isEmpty()) {
         bmo $$5 = $$3.get(0);
         $$5.a($$0.ai().c((bmo)$$1), (float)$$1.g(bnu.c));
         int $$6 = $$1.a(bll.a) ? $$1.c(bll.a).d() + 1 : 0;
         int $$7 = $$1.a(bll.b) ? $$1.c(bll.b).d() + 1 : 0;
         float $$8 = 0.25F * (float)($$6 - $$7);
         float $$9 = aup.a($$1.ff() * 1.65F, 0.2F, 3.0F) + $$8;
         float $$10 = $$5.f($$0.ai().b((bmo)$$1)) ? 0.5F : 1.0F;
         $$5.q((double)($$10 * $$9) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), aru.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), aru.g, 1.0F, 1.0F);
         boolean $$11 = $$1.gm();
         if ($$11) {
            $$0.a(null, $$1, this.k.apply($$1), aru.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<bvt> $$12 = $$4.c(bvq.m);
         Optional<emc> $$13 = $$4.c(bvq.W);
         boolean $$14 = $$12.isEmpty() || $$13.isEmpty() || $$12.get().a().a().a($$13.get(), 0.25);
         if ($$14) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(ane $$0, caa $$1) {
      emc $$2 = $$1.do().d(1.0, 0.0, 1.0).d();
      hx $$3 = hx.a($$1.dj().e($$2));
      return $$0.a_($$3).a(asi.ce) || $$0.a_($$3.c()).a(asi.ce);
   }

   protected void b(ane $$0, caa $$1) {
      $$0.a($$1, (byte)59);
      $$1.dN().a(bvq.V, this.e.apply($$1).a($$0.z));
      $$1.dN().b(bvq.W);
   }
}
