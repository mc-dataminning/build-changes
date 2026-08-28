import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class caj extends byt<ckz> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<ckz, btm> e;
   private final chr f;
   private final float g;
   private final ToDoubleFunction<ckz> h;
   private fei i;
   private final Function<ckz, awm> j;
   private final Function<ckz, awm> k;

   public caj(Function<ckz, btm> $$0, chr $$1, float $$2, ToDoubleFunction<ckz> $$3, Function<ckz, awm> $$4, Function<ckz, awm> $$5) {
      super(ImmutableMap.of(cge.W, cgf.b, cge.X, cgf.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = fei.c;
   }

   protected boolean a(arq $$0, ckz $$1) {
      return $$1.eb().a(cge.X);
   }

   protected boolean a(arq $$0, ckz $$1, long $$2) {
      return $$1.eb().a(cge.X);
   }

   protected void b(arq $$0, ckz $$1, long $$2) {
      iu $$3 = $$1.dv();
      byc<?> $$4 = $$1.eb();
      fei $$5 = $$4.c(cge.X).get();
      this.i = new fei((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(cge.n, new cgh($$5, this.g, 0));
   }

   protected void c(arq $$0, ckz $$1, long $$2) {
      List<bxc> $$3 = $$0.a(bxc.class, this.f, $$1, $$1.cR());
      byc<?> $$4 = $$1.eb();
      if (!$$3.isEmpty()) {
         bxc $$5 = $$3.get(0);
         bus $$6 = $$0.al().c((bxc)$$1);
         float $$7 = (float)$$1.h(byi.c);
         if ($$5.a($$0, $$6, $$7)) {
            dfn.a($$0, (bwd)$$5, $$6);
         }

         int $$8 = $$1.b(bvj.a) ? $$1.c(bvj.a).e() + 1 : 0;
         int $$9 = $$1.b(bvj.b) ? $$1.c(bvj.b).e() + 1 : 0;
         float $$10 = 0.25F * (float)($$8 - $$9);
         float $$11 = azm.a($$1.fn() * 1.65F, 0.2F, 3.0F) + $$10;
         bus $$12 = $$0.al().b((bxc)$$1);
         float $$13 = $$5.b($$0, $$12, $$7);
         float $$14 = $$13 > 0.0F ? 0.5F : 1.0F;
         $$5.p((double)($$14 * $$11) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), awo.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), awo.g, 1.0F, 1.0F);
         boolean $$15 = $$1.gs();
         if ($$15) {
            $$0.a(null, $$1, this.k.apply($$1), awo.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<cgh> $$16 = $$4.c(cge.n);
         Optional<fei> $$17 = $$4.c(cge.X);
         boolean $$18 = $$16.isEmpty() || $$17.isEmpty() || $$16.get().a().a().a($$17.get(), 0.25);
         if ($$18) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(arq $$0, ckz $$1) {
      fei $$2 = $$1.dy().d(1.0, 0.0, 1.0).d();
      iu $$3 = iu.a((jo)$$1.dt().e($$2));
      return $$0.a_($$3).a(axc.cq) || $$0.a_($$3.d()).a(axc.cq);
   }

   protected void b(arq $$0, ckz $$1) {
      $$0.a($$1, (byte)59);
      $$1.eb().a(cge.W, this.e.apply($$1).a($$0.A));
      $$1.eb().b(cge.X);
   }
}
