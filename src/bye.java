import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bye extends bwo<cim> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<cim, brj> e;
   private final cfm f;
   private final float g;
   private final ToDoubleFunction<cim> h;
   private ezh i;
   private final Function<cim, awj> j;
   private final Function<cim, awj> k;

   public bye(Function<cim, brj> $$0, cfm $$1, float $$2, ToDoubleFunction<cim> $$3, Function<cim, awj> $$4, Function<cim, awj> $$5) {
      super(ImmutableMap.of(cdz.V, cea.b, cdz.W, cea.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = ezh.c;
   }

   protected boolean a(arm $$0, cim $$1) {
      return $$1.ed().a(cdz.W);
   }

   protected boolean a(arm $$0, cim $$1, long $$2) {
      return $$1.ed().a(cdz.W);
   }

   protected void b(arm $$0, cim $$1, long $$2) {
      jg $$3 = $$1.dx();
      bvx<?> $$4 = $$1.ed();
      ezh $$5 = $$4.c(cdz.W).get();
      this.i = new ezh((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(cdz.m, new cec($$5, this.g, 0));
   }

   protected void c(arm $$0, cim $$1, long $$2) {
      List<buv> $$3 = $$0.a(buv.class, this.f, $$1, $$1.cS());
      bvx<?> $$4 = $$1.ed();
      if (!$$3.isEmpty()) {
         buv $$5 = $$3.get(0);
         bsp $$6 = $$0.ak().c((buv)$$1);
         if ($$5.a($$6, (float)$$1.h(bwd.c))) {
            dbo.a($$0, (btz)$$5, $$6);
         }

         int $$7 = $$1.b(btg.a) ? $$1.c(btg.a).e() + 1 : 0;
         int $$8 = $$1.b(btg.b) ? $$1.c(btg.b).e() + 1 : 0;
         float $$9 = 0.25F * (float)($$7 - $$8);
         float $$10 = azj.a($$1.fr() * 1.65F, 0.2F, 3.0F) + $$9;
         float $$11 = $$5.f($$0.ak().b((buv)$$1)) ? 0.5F : 1.0F;
         $$5.p((double)($$11 * $$10) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), awl.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), awl.g, 1.0F, 1.0F);
         boolean $$12 = $$1.gx();
         if ($$12) {
            $$0.a(null, $$1, this.k.apply($$1), awl.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<cec> $$13 = $$4.c(cdz.m);
         Optional<ezh> $$14 = $$4.c(cdz.W);
         boolean $$15 = $$13.isEmpty() || $$14.isEmpty() || $$13.get().a().a().a($$14.get(), 0.25);
         if ($$15) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(arm $$0, cim $$1) {
      ezh $$2 = $$1.dA().d(1.0, 0.0, 1.0).d();
      jg $$3 = jg.a((jz)$$1.dv().e($$2));
      return $$0.a_($$3).a(awz.co) || $$0.a_($$3.d()).a(awz.co);
   }

   protected void b(arm $$0, cim $$1) {
      $$0.a($$1, (byte)59);
      $$1.ed().a(cdz.V, this.e.apply($$1).a($$0.A));
      $$1.ed().b(cdz.W);
   }
}
