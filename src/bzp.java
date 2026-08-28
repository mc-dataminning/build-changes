import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bzp extends bxz<cjx> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<cjx, bsu> e;
   private final cgx f;
   private final float g;
   private final ToDoubleFunction<cjx> h;
   private fby i;
   private final Function<cjx, axe> j;
   private final Function<cjx, axe> k;

   public bzp(Function<cjx, bsu> $$0, cgx $$1, float $$2, ToDoubleFunction<cjx> $$3, Function<cjx, axe> $$4, Function<cjx, axe> $$5) {
      super(ImmutableMap.of(cfk.V, cfl.b, cfk.W, cfl.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = fby.c;
   }

   protected boolean a(ash $$0, cjx $$1) {
      return $$1.ec().a(cfk.W);
   }

   protected boolean a(ash $$0, cjx $$1, long $$2) {
      return $$1.ec().a(cfk.W);
   }

   protected void b(ash $$0, cjx $$1, long $$2) {
      jh $$3 = $$1.dw();
      bxi<?> $$4 = $$1.ec();
      fby $$5 = $$4.c(cfk.W).get();
      this.i = new fby((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(cfk.m, new cfn($$5, this.g, 0));
   }

   protected void c(ash $$0, cjx $$1, long $$2) {
      List<bwg> $$3 = $$0.a(bwg.class, this.f, $$1, $$1.cR());
      bxi<?> $$4 = $$1.ec();
      if (!$$3.isEmpty()) {
         bwg $$5 = $$3.get(0);
         bua $$6 = $$0.aj().c((bwg)$$1);
         if ($$5.a($$0, $$6, (float)$$1.h(bxo.c))) {
            deb.a($$0, (bvk)$$5, $$6);
         }

         int $$7 = $$1.b(bur.a) ? $$1.c(bur.a).e() + 1 : 0;
         int $$8 = $$1.b(bur.b) ? $$1.c(bur.b).e() + 1 : 0;
         float $$9 = 0.25F * (float)($$7 - $$8);
         float $$10 = bae.a($$1.fp() * 1.65F, 0.2F, 3.0F) + $$9;
         float $$11 = $$5.g($$0.aj().b((bwg)$$1)) ? 0.5F : 1.0F;
         $$5.p((double)($$11 * $$10) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), axg.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), axg.g, 1.0F, 1.0F);
         boolean $$12 = $$1.gq();
         if ($$12) {
            $$0.a(null, $$1, this.k.apply($$1), axg.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<cfn> $$13 = $$4.c(cfk.m);
         Optional<fby> $$14 = $$4.c(cfk.W);
         boolean $$15 = $$13.isEmpty() || $$14.isEmpty() || $$13.get().a().a().a($$14.get(), 0.25);
         if ($$15) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(ash $$0, cjx $$1) {
      fby $$2 = $$1.dz().d(1.0, 0.0, 1.0).d();
      jh $$3 = jh.a((ka)$$1.du().e($$2));
      return $$0.a_($$3).a(axu.cp) || $$0.a_($$3.d()).a(axu.cp);
   }

   protected void b(ash $$0, cjx $$1) {
      $$0.a($$1, (byte)59);
      $$1.ec().a(cfk.V, this.e.apply($$1).a($$0.A));
      $$1.ec().b(cfk.W);
   }
}
