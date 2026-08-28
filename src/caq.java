import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class caq extends bza<cle> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<cle, btr> e;
   private final chy f;
   private final float g;
   private final ToDoubleFunction<cle> h;
   private ffc i;
   private final Function<cle, awm> j;
   private final Function<cle, awm> k;

   public caq(Function<cle, btr> $$0, chy $$1, float $$2, ToDoubleFunction<cle> $$3, Function<cle, awm> $$4, Function<cle, awm> $$5) {
      super(ImmutableMap.of(cgl.W, cgm.b, cgl.X, cgm.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = ffc.c;
   }

   protected boolean a(arq $$0, cle $$1) {
      return $$1.eb().a(cgl.X);
   }

   protected boolean a(arq $$0, cle $$1, long $$2) {
      return $$1.eb().a(cgl.X);
   }

   protected void b(arq $$0, cle $$1, long $$2) {
      iv $$3 = $$1.du();
      byj<?> $$4 = $$1.eb();
      ffc $$5 = $$4.c(cgl.X).get();
      this.i = new ffc((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(cgl.n, new cgo($$5, this.g, 0));
   }

   protected void c(arq $$0, cle $$1, long $$2) {
      List<bxj> $$3 = $$0.a(bxj.class, this.f, $$1, $$1.cQ());
      byj<?> $$4 = $$1.eb();
      if (!$$3.isEmpty()) {
         bxj $$5 = $$3.get(0);
         bux $$6 = $$0.al().c((bxj)$$1);
         float $$7 = (float)$$1.h(byp.c);
         if ($$5.a($$0, $$6, $$7)) {
            dgc.a($$0, (bwi)$$5, $$6);
         }

         int $$8 = $$1.b(bvo.a) ? $$1.c(bvo.a).e() + 1 : 0;
         int $$9 = $$1.b(bvo.b) ? $$1.c(bvo.b).e() + 1 : 0;
         float $$10 = 0.25F * (float)($$8 - $$9);
         float $$11 = azm.a($$1.fn() * 1.65F, 0.2F, 3.0F) + $$10;
         bux $$12 = $$0.al().b((bxj)$$1);
         float $$13 = $$5.b($$0, $$12, $$7);
         float $$14 = $$13 > 0.0F ? 0.5F : 1.0F;
         $$5.p((double)($$14 * $$11) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), awo.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), awo.g, 1.0F, 1.0F);
         boolean $$15 = $$1.gv();
         if ($$15) {
            $$0.a(null, $$1, this.k.apply($$1), awo.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<cgo> $$16 = $$4.c(cgl.n);
         Optional<ffc> $$17 = $$4.c(cgl.X);
         boolean $$18 = $$16.isEmpty() || $$17.isEmpty() || $$16.get().a().a().a($$17.get(), 0.25);
         if ($$18) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(arq $$0, cle $$1) {
      ffc $$2 = $$1.dx().d(1.0, 0.0, 1.0).d();
      iv $$3 = iv.a((jp)$$1.ds().e($$2));
      return $$0.a_($$3).a(axc.cs) || $$0.a_($$3.d()).a(axc.cs);
   }

   protected void b(arq $$0, cle $$1) {
      $$0.a($$1, (byte)59);
      $$1.eb().a(cgl.W, this.e.apply($$1).a($$0.A));
      $$1.eb().b(cgl.X);
   }
}
