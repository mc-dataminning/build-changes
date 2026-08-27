import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bpr extends bob<bzs> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<bzs, bjl> e;
   private final bwy f;
   private final float g;
   private final ToDoubleFunction<bzs> h;
   private els i;
   private final Function<bzs, arq> j;
   private final Function<bzs, arq> k;

   public bpr(Function<bzs, bjl> $$0, bwy $$1, float $$2, ToDoubleFunction<bzs> $$3, Function<bzs, arq> $$4, Function<bzs, arq> $$5) {
      super(ImmutableMap.of(bvm.U, bvn.b, bvm.V, bvn.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = els.b;
   }

   protected boolean a(and $$0, bzs $$1) {
      return $$1.dO().a(bvm.V);
   }

   protected boolean a(and $$0, bzs $$1, long $$2) {
      return $$1.dO().a(bvm.V);
   }

   protected void b(and $$0, bzs $$1, long $$2) {
      hx $$3 = $$1.dm();
      bnk<?> $$4 = $$1.dO();
      els $$5 = $$4.c(bvm.V).get();
      this.i = new els((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(bvm.m, new bvp($$5, this.g, 0));
   }

   protected void c(and $$0, bzs $$1, long $$2) {
      List<bmk> $$3 = $$0.a(bmk.class, this.f, $$1, $$1.cH());
      bnk<?> $$4 = $$1.dO();
      if (!$$3.isEmpty()) {
         bmk $$5 = $$3.get(0);
         $$5.a($$0.ai().c((bmk)$$1), (float)$$1.b(bnq.c));
         int $$6 = $$1.a(blj.a) ? $$1.b(blj.a).e() + 1 : 0;
         int $$7 = $$1.a(blj.b) ? $$1.b(blj.b).e() + 1 : 0;
         float $$8 = 0.25F * (float)($$6 - $$7);
         float $$9 = aun.a($$1.ff() * 1.65F, 0.2F, 3.0F) + $$8;
         float $$10 = $$5.f($$0.ai().b((bmk)$$1)) ? 0.5F : 1.0F;
         $$5.q((double)($$10 * $$9) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), ars.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), ars.g, 1.0F, 1.0F);
         boolean $$11 = $$1.gl();
         if ($$11) {
            $$0.a(null, $$1, this.k.apply($$1), ars.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<bvp> $$12 = $$4.c(bvm.m);
         Optional<els> $$13 = $$4.c(bvm.V);
         boolean $$14 = $$12.isEmpty() || $$13.isEmpty() || $$12.get().a().a().a($$13.get(), 0.25);
         if ($$14) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(and $$0, bzs $$1) {
      els $$2 = $$1.dp().d(1.0, 0.0, 1.0).d();
      hx $$3 = hx.a($$1.dk().e($$2));
      return $$0.a_($$3).a(asg.ce) || $$0.a_($$3.c()).a(asg.ce);
   }

   protected void b(and $$0, bzs $$1) {
      $$0.a($$1, (byte)59);
      $$1.dO().a(bvm.U, this.e.apply($$1).a($$0.z));
      $$1.dO().b(bvm.V);
   }
}
