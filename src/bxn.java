import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bxn extends bvx<chv> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<chv, bqv> e;
   private final cev f;
   private final float g;
   private final ToDoubleFunction<chv> h;
   private eye i;
   private final Function<chv, awc> j;
   private final Function<chv, awc> k;

   public bxn(Function<chv, bqv> $$0, cev $$1, float $$2, ToDoubleFunction<chv> $$3, Function<chv, awc> $$4, Function<chv, awc> $$5) {
      super(ImmutableMap.of(cdi.V, cdj.b, cdi.W, cdj.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = eye.c;
   }

   protected boolean a(arg $$0, chv $$1) {
      return $$1.dX().a(cdi.W);
   }

   protected boolean a(arg $$0, chv $$1, long $$2) {
      return $$1.dX().a(cdi.W);
   }

   protected void b(arg $$0, chv $$1, long $$2) {
      je $$3 = $$1.ds();
      bvg<?> $$4 = $$1.dX();
      eye $$5 = $$4.c(cdi.W).get();
      this.i = new eye((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(cdi.m, new cdl($$5, this.g, 0));
   }

   protected void c(arg $$0, chv $$1, long $$2) {
      List<buf> $$3 = $$0.a(buf.class, this.f, $$1, $$1.cO());
      bvg<?> $$4 = $$1.dX();
      if (!$$3.isEmpty()) {
         buf $$5 = $$3.get(0);
         bsb $$6 = $$0.ak().c((buf)$$1);
         if ($$5.a($$6, (float)$$1.h(bvm.c))) {
            day.a($$0, (btj)$$5, $$6);
         }

         int $$7 = $$1.b(bss.a) ? $$1.c(bss.a).e() + 1 : 0;
         int $$8 = $$1.b(bss.b) ? $$1.c(bss.b).e() + 1 : 0;
         float $$9 = 0.25F * (float)($$7 - $$8);
         float $$10 = azc.a($$1.fm() * 1.65F, 0.2F, 3.0F) + $$9;
         float $$11 = $$5.f($$0.ak().b((buf)$$1)) ? 0.5F : 1.0F;
         $$5.p((double)($$11 * $$10) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), awe.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), awe.g, 1.0F, 1.0F);
         boolean $$12 = $$1.gq();
         if ($$12) {
            $$0.a(null, $$1, this.k.apply($$1), awe.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<cdl> $$13 = $$4.c(cdi.m);
         Optional<eye> $$14 = $$4.c(cdi.W);
         boolean $$15 = $$13.isEmpty() || $$14.isEmpty() || $$13.get().a().a().a($$14.get(), 0.25);
         if ($$15) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(arg $$0, chv $$1) {
      eye $$2 = $$1.dv().d(1.0, 0.0, 1.0).d();
      je $$3 = je.a((jx)$$1.dq().e($$2));
      return $$0.a_($$3).a(aws.cn) || $$0.a_($$3.d()).a(aws.cn);
   }

   protected void b(arg $$0, chv $$1) {
      $$0.a($$1, (byte)59);
      $$1.dX().a(cdi.V, this.e.apply($$1).a($$0.z));
      $$1.dX().b(cdi.W);
   }
}
