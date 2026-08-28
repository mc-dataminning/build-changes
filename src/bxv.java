import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bxv extends bwf<cid> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<cid, brd> e;
   private final cfd f;
   private final float g;
   private final ToDoubleFunction<cid> h;
   private eyw i;
   private final Function<cid, awf> j;
   private final Function<cid, awf> k;

   public bxv(Function<cid, brd> $$0, cfd $$1, float $$2, ToDoubleFunction<cid> $$3, Function<cid, awf> $$4, Function<cid, awf> $$5) {
      super(ImmutableMap.of(cdq.V, cdr.b, cdq.W, cdr.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = eyw.c;
   }

   protected boolean a(arj $$0, cid $$1) {
      return $$1.dY().a(cdq.W);
   }

   protected boolean a(arj $$0, cid $$1, long $$2) {
      return $$1.dY().a(cdq.W);
   }

   protected void b(arj $$0, cid $$1, long $$2) {
      jf $$3 = $$1.ds();
      bvo<?> $$4 = $$1.dY();
      eyw $$5 = $$4.c(cdq.W).get();
      this.i = new eyw((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(cdq.m, new cdt($$5, this.g, 0));
   }

   protected void c(arj $$0, cid $$1, long $$2) {
      List<bun> $$3 = $$0.a(bun.class, this.f, $$1, $$1.cO());
      bvo<?> $$4 = $$1.dY();
      if (!$$3.isEmpty()) {
         bun $$5 = $$3.get(0);
         bsj $$6 = $$0.ak().c((bun)$$1);
         if ($$5.a($$6, (float)$$1.h(bvu.c))) {
            dbp.a($$0, (btr)$$5, $$6);
         }

         int $$7 = $$1.b(bta.a) ? $$1.c(bta.a).e() + 1 : 0;
         int $$8 = $$1.b(bta.b) ? $$1.c(bta.b).e() + 1 : 0;
         float $$9 = 0.25F * (float)($$7 - $$8);
         float $$10 = azf.a($$1.fm() * 1.65F, 0.2F, 3.0F) + $$9;
         float $$11 = $$5.f($$0.ak().b((bun)$$1)) ? 0.5F : 1.0F;
         $$5.p((double)($$11 * $$10) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), awh.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), awh.g, 1.0F, 1.0F);
         boolean $$12 = $$1.gq();
         if ($$12) {
            $$0.a(null, $$1, this.k.apply($$1), awh.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<cdt> $$13 = $$4.c(cdq.m);
         Optional<eyw> $$14 = $$4.c(cdq.W);
         boolean $$15 = $$13.isEmpty() || $$14.isEmpty() || $$13.get().a().a().a($$14.get(), 0.25);
         if ($$15) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(arj $$0, cid $$1) {
      eyw $$2 = $$1.dv().d(1.0, 0.0, 1.0).d();
      jf $$3 = jf.a((jy)$$1.dq().e($$2));
      return $$0.a_($$3).a(awv.cn) || $$0.a_($$3.d()).a(awv.cn);
   }

   protected void b(arj $$0, cid $$1) {
      $$0.a($$1, (byte)59);
      $$1.dY().a(cdq.V, this.e.apply($$1).a($$0.z));
      $$1.dY().b(cdq.W);
   }
}
