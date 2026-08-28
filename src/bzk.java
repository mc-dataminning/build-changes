import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bzk extends bxu<cjs> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<cjs, bsp> e;
   private final cgs f;
   private final float g;
   private final ToDoubleFunction<cjs> h;
   private fbs i;
   private final Function<cjs, axe> j;
   private final Function<cjs, axe> k;

   public bzk(Function<cjs, bsp> $$0, cgs $$1, float $$2, ToDoubleFunction<cjs> $$3, Function<cjs, axe> $$4, Function<cjs, axe> $$5) {
      super(ImmutableMap.of(cff.V, cfg.b, cff.W, cfg.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = fbs.c;
   }

   protected boolean a(ash $$0, cjs $$1) {
      return $$1.eb().a(cff.W);
   }

   protected boolean a(ash $$0, cjs $$1, long $$2) {
      return $$1.eb().a(cff.W);
   }

   protected void b(ash $$0, cjs $$1, long $$2) {
      jh $$3 = $$1.dv();
      bxd<?> $$4 = $$1.eb();
      fbs $$5 = $$4.c(cff.W).get();
      this.i = new fbs((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(cff.m, new cfi($$5, this.g, 0));
   }

   protected void c(ash $$0, cjs $$1, long $$2) {
      List<bwb> $$3 = $$0.a(bwb.class, this.f, $$1, $$1.cR());
      bxd<?> $$4 = $$1.eb();
      if (!$$3.isEmpty()) {
         bwb $$5 = $$3.get(0);
         btv $$6 = $$0.aj().c((bwb)$$1);
         if ($$5.a($$0, $$6, (float)$$1.h(bxj.c))) {
            ddt.a($$0, (bvf)$$5, $$6);
         }

         int $$7 = $$1.b(bum.a) ? $$1.c(bum.a).e() + 1 : 0;
         int $$8 = $$1.b(bum.b) ? $$1.c(bum.b).e() + 1 : 0;
         float $$9 = 0.25F * (float)($$7 - $$8);
         float $$10 = bae.a($$1.fn() * 1.65F, 0.2F, 3.0F) + $$9;
         float $$11 = $$5.g($$0.aj().b((bwb)$$1)) ? 0.5F : 1.0F;
         $$5.p((double)($$11 * $$10) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), axg.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), axg.g, 1.0F, 1.0F);
         boolean $$12 = $$1.go();
         if ($$12) {
            $$0.a(null, $$1, this.k.apply($$1), axg.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<cfi> $$13 = $$4.c(cff.m);
         Optional<fbs> $$14 = $$4.c(cff.W);
         boolean $$15 = $$13.isEmpty() || $$14.isEmpty() || $$13.get().a().a().a($$14.get(), 0.25);
         if ($$15) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(ash $$0, cjs $$1) {
      fbs $$2 = $$1.dy().d(1.0, 0.0, 1.0).d();
      jh $$3 = jh.a((ka)$$1.dt().e($$2));
      return $$0.a_($$3).a(axu.cp) || $$0.a_($$3.d()).a(axu.cp);
   }

   protected void b(ash $$0, cjs $$1) {
      $$0.a($$1, (byte)59);
      $$1.eb().a(cff.V, this.e.apply($$1).a($$0.A));
      $$1.eb().b(cff.W);
   }
}
