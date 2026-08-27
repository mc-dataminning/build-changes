import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bvx extends buh<cge> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<cge, bpf> e;
   private final cdf f;
   private final float g;
   private final ToDoubleFunction<cge> h;
   private euk i;
   private final Function<cge, avg> j;
   private final Function<cge, avg> k;

   public bvx(Function<cge, bpf> $$0, cdf $$1, float $$2, ToDoubleFunction<cge> $$3, Function<cge, avg> $$4, Function<cge, avg> $$5) {
      super(ImmutableMap.of(cbs.V, cbt.b, cbs.W, cbt.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = euk.b;
   }

   protected boolean a(aqm $$0, cge $$1) {
      return $$1.dS().a(cbs.W);
   }

   protected boolean a(aqm $$0, cge $$1, long $$2) {
      return $$1.dS().a(cbs.W);
   }

   protected void b(aqm $$0, cge $$1, long $$2) {
      io $$3 = $$1.dp();
      btq<?> $$4 = $$1.dS();
      euk $$5 = $$4.c(cbs.W).get();
      this.i = new euk((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(cbs.m, new cbv($$5, this.g, 0));
   }

   protected void c(aqm $$0, cge $$1, long $$2) {
      List<bso> $$3 = $$0.a(bso.class, this.f, $$1, $$1.cK());
      btq<?> $$4 = $$1.dS();
      if (!$$3.isEmpty()) {
         bso $$5 = $$3.get(0);
         $$5.a($$0.ai().c((bso)$$1), (float)$$1.g(btw.c));
         int $$6 = $$1.b(bre.a) ? $$1.c(bre.a).e() + 1 : 0;
         int $$7 = $$1.b(bre.b) ? $$1.c(bre.b).e() + 1 : 0;
         float $$8 = 0.25F * (float)($$6 - $$7);
         float $$9 = ayd.a($$1.fn() * 1.65F, 0.2F, 3.0F) + $$8;
         float $$10 = $$5.f($$0.ai().b((bso)$$1)) ? 0.5F : 1.0F;
         $$5.q((double)($$10 * $$9) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), avi.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), avi.g, 1.0F, 1.0F);
         boolean $$11 = $$1.gw();
         if ($$11) {
            $$0.a(null, $$1, this.k.apply($$1), avi.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<cbv> $$12 = $$4.c(cbs.m);
         Optional<euk> $$13 = $$4.c(cbs.W);
         boolean $$14 = $$12.isEmpty() || $$13.isEmpty() || $$12.get().a().a().a($$13.get(), 0.25);
         if ($$14) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(aqm $$0, cge $$1) {
      euk $$2 = $$1.ds().d(1.0, 0.0, 1.0).d();
      io $$3 = io.a($$1.dn().e($$2));
      return $$0.a_($$3).a(avw.cm) || $$0.a_($$3.c()).a(avw.cm);
   }

   protected void b(aqm $$0, cge $$1) {
      $$0.a($$1, (byte)59);
      $$1.dS().a(cbs.V, this.e.apply($$1).a($$0.z));
      $$1.dS().b(cbs.W);
   }
}
