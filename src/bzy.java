import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bzy extends byi<ckj> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<ckj, btb> e;
   private final chg f;
   private final float g;
   private final ToDoubleFunction<ckj> h;
   private fcu i;
   private final Function<ckj, awj> j;
   private final Function<ckj, awj> k;

   public bzy(Function<ckj, btb> $$0, chg $$1, float $$2, ToDoubleFunction<ckj> $$3, Function<ckj, awj> $$4, Function<ckj, awj> $$5) {
      super(ImmutableMap.of(cft.W, cfu.b, cft.X, cfu.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = fcu.c;
   }

   protected boolean a(arn $$0, ckj $$1) {
      return $$1.eb().a(cft.X);
   }

   protected boolean a(arn $$0, ckj $$1, long $$2) {
      return $$1.eb().a(cft.X);
   }

   protected void b(arn $$0, ckj $$1, long $$2) {
      jj $$3 = $$1.dv();
      bxr<?> $$4 = $$1.eb();
      fcu $$5 = $$4.c(cft.X).get();
      this.i = new fcu((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(cft.n, new cfw($$5, this.g, 0));
   }

   protected void c(arn $$0, ckj $$1, long $$2) {
      List<bwr> $$3 = $$0.a(bwr.class, this.f, $$1, $$1.cR());
      bxr<?> $$4 = $$1.eb();
      if (!$$3.isEmpty()) {
         bwr $$5 = $$3.get(0);
         buh $$6 = $$0.al().c((bwr)$$1);
         if ($$5.a($$0, $$6, (float)$$1.h(bxx.c))) {
            dej.a($$0, (bvs)$$5, $$6);
         }

         int $$7 = $$1.b(buy.a) ? $$1.c(buy.a).e() + 1 : 0;
         int $$8 = $$1.b(buy.b) ? $$1.c(buy.b).e() + 1 : 0;
         float $$9 = 0.25F * (float)($$7 - $$8);
         float $$10 = azk.a($$1.fn() * 1.65F, 0.2F, 3.0F) + $$9;
         float $$11 = $$5.i($$0.al().b((bwr)$$1)) ? 0.5F : 1.0F;
         $$5.p((double)($$11 * $$10) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), awl.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), awl.g, 1.0F, 1.0F);
         boolean $$12 = $$1.gs();
         if ($$12) {
            $$0.a(null, $$1, this.k.apply($$1), awl.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<cfw> $$13 = $$4.c(cft.n);
         Optional<fcu> $$14 = $$4.c(cft.X);
         boolean $$15 = $$13.isEmpty() || $$14.isEmpty() || $$13.get().a().a().a($$14.get(), 0.25);
         if ($$15) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(arn $$0, ckj $$1) {
      fcu $$2 = $$1.dy().d(1.0, 0.0, 1.0).d();
      jj $$3 = jj.a((kc)$$1.dt().e($$2));
      return $$0.a_($$3).a(awz.cq) || $$0.a_($$3.d()).a(awz.cq);
   }

   protected void b(arn $$0, ckj $$1) {
      $$0.a($$1, (byte)59);
      $$1.eb().a(cft.W, this.e.apply($$1).a($$0.A));
      $$1.eb().b(cft.X);
   }
}
