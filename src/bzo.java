import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bzo extends bxy<cjw> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<cjw, bst> e;
   private final cgw f;
   private final float g;
   private final ToDoubleFunction<cjw> h;
   private fbx i;
   private final Function<cjw, axe> j;
   private final Function<cjw, axe> k;

   public bzo(Function<cjw, bst> $$0, cgw $$1, float $$2, ToDoubleFunction<cjw> $$3, Function<cjw, axe> $$4, Function<cjw, axe> $$5) {
      super(ImmutableMap.of(cfj.V, cfk.b, cfj.W, cfk.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = fbx.c;
   }

   protected boolean a(ash $$0, cjw $$1) {
      return $$1.eb().a(cfj.W);
   }

   protected boolean a(ash $$0, cjw $$1, long $$2) {
      return $$1.eb().a(cfj.W);
   }

   protected void b(ash $$0, cjw $$1, long $$2) {
      jh $$3 = $$1.dv();
      bxh<?> $$4 = $$1.eb();
      fbx $$5 = $$4.c(cfj.W).get();
      this.i = new fbx((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(cfj.m, new cfm($$5, this.g, 0));
   }

   protected void c(ash $$0, cjw $$1, long $$2) {
      List<bwf> $$3 = $$0.a(bwf.class, this.f, $$1, $$1.cR());
      bxh<?> $$4 = $$1.eb();
      if (!$$3.isEmpty()) {
         bwf $$5 = $$3.get(0);
         btz $$6 = $$0.aj().c((bwf)$$1);
         if ($$5.a($$0, $$6, (float)$$1.h(bxn.c))) {
            dea.a($$0, (bvj)$$5, $$6);
         }

         int $$7 = $$1.b(buq.a) ? $$1.c(buq.a).e() + 1 : 0;
         int $$8 = $$1.b(buq.b) ? $$1.c(buq.b).e() + 1 : 0;
         float $$9 = 0.25F * (float)($$7 - $$8);
         float $$10 = bae.a($$1.fn() * 1.65F, 0.2F, 3.0F) + $$9;
         float $$11 = $$5.g($$0.aj().b((bwf)$$1)) ? 0.5F : 1.0F;
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
         Optional<cfm> $$13 = $$4.c(cfj.m);
         Optional<fbx> $$14 = $$4.c(cfj.W);
         boolean $$15 = $$13.isEmpty() || $$14.isEmpty() || $$13.get().a().a().a($$14.get(), 0.25);
         if ($$15) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(ash $$0, cjw $$1) {
      fbx $$2 = $$1.dy().d(1.0, 0.0, 1.0).d();
      jh $$3 = jh.a((ka)$$1.dt().e($$2));
      return $$0.a_($$3).a(axu.cp) || $$0.a_($$3.d()).a(axu.cp);
   }

   protected void b(ash $$0, cjw $$1) {
      $$0.a($$1, (byte)59);
      $$1.eb().a(cfj.V, this.e.apply($$1).a($$0.A));
      $$1.eb().b(cfj.W);
   }
}
