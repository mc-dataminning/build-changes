import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class btw extends bsg<ceb> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<ceb, bnl> e;
   private final cbe f;
   private final float g;
   private final ToDoubleFunction<ceb> h;
   private esa i;
   private final Function<ceb, aul> j;
   private final Function<ceb, aul> k;

   public btw(Function<ceb, bnl> $$0, cbe $$1, float $$2, ToDoubleFunction<ceb> $$3, Function<ceb, aul> $$4, Function<ceb, aul> $$5) {
      super(ImmutableMap.of(bzr.V, bzs.b, bzr.W, bzs.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = esa.b;
   }

   protected boolean a(aps $$0, ceb $$1) {
      return $$1.dP().a(bzr.W);
   }

   protected boolean a(aps $$0, ceb $$1, long $$2) {
      return $$1.dP().a(bzr.W);
   }

   protected void b(aps $$0, ceb $$1, long $$2) {
      ib $$3 = $$1.dm();
      brp<?> $$4 = $$1.dP();
      esa $$5 = $$4.c(bzr.W).get();
      this.i = new esa((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(bzr.m, new bzu($$5, this.g, 0));
   }

   protected void c(aps $$0, ceb $$1, long $$2) {
      List<bqo> $$3 = $$0.a(bqo.class, this.f, $$1, $$1.cH());
      brp<?> $$4 = $$1.dP();
      if (!$$3.isEmpty()) {
         bqo $$5 = $$3.get(0);
         $$5.a($$0.ai().c((bqo)$$1), (float)$$1.g(brv.c));
         int $$6 = $$1.b(bpj.a) ? $$1.c(bpj.a).d() + 1 : 0;
         int $$7 = $$1.b(bpj.b) ? $$1.c(bpj.b).d() + 1 : 0;
         float $$8 = 0.25F * (float)($$6 - $$7);
         float $$9 = axk.a($$1.fk() * 1.65F, 0.2F, 3.0F) + $$8;
         float $$10 = $$5.f($$0.ai().b((bqo)$$1)) ? 0.5F : 1.0F;
         $$5.q((double)($$10 * $$9) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), aun.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), aun.g, 1.0F, 1.0F);
         boolean $$11 = $$1.gu();
         if ($$11) {
            $$0.a(null, $$1, this.k.apply($$1), aun.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<bzu> $$12 = $$4.c(bzr.m);
         Optional<esa> $$13 = $$4.c(bzr.W);
         boolean $$14 = $$12.isEmpty() || $$13.isEmpty() || $$12.get().a().a().a($$13.get(), 0.25);
         if ($$14) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(aps $$0, ceb $$1) {
      esa $$2 = $$1.dp().d(1.0, 0.0, 1.0).d();
      ib $$3 = ib.a($$1.dk().e($$2));
      return $$0.a_($$3).a(avc.cg) || $$0.a_($$3.c()).a(avc.cg);
   }

   protected void b(aps $$0, ceb $$1) {
      $$0.a($$1, (byte)59);
      $$1.dP().a(bzr.V, this.e.apply($$1).a($$0.z));
      $$1.dP().b(bzr.W);
   }
}
