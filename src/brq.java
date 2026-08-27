import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class brq extends bqa<cbv> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<cbv, blh> e;
   private final byy f;
   private final float g;
   private final ToDoubleFunction<cbv> h;
   private enz i;
   private final Function<cbv, atk> j;
   private final Function<cbv, atk> k;

   public brq(Function<cbv, blh> $$0, byy $$1, float $$2, ToDoubleFunction<cbv> $$3, Function<cbv, atk> $$4, Function<cbv, atk> $$5) {
      super(ImmutableMap.of(bxl.V, bxm.b, bxl.W, bxm.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = enz.b;
   }

   protected boolean a(aow $$0, cbv $$1) {
      return $$1.dO().a(bxl.W);
   }

   protected boolean a(aow $$0, cbv $$1, long $$2) {
      return $$1.dO().a(bxl.W);
   }

   protected void b(aow $$0, cbv $$1, long $$2) {
      hz $$3 = $$1.dm();
      bpj<?> $$4 = $$1.dO();
      enz $$5 = $$4.c(bxl.W).get();
      this.i = new enz((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(bxl.m, new bxo($$5, this.g, 0));
   }

   protected void c(aow $$0, cbv $$1, long $$2) {
      List<boi> $$3 = $$0.a(boi.class, this.f, $$1, $$1.cH());
      bpj<?> $$4 = $$1.dO();
      if (!$$3.isEmpty()) {
         boi $$5 = $$3.get(0);
         $$5.a($$0.ah().c((boi)$$1), (float)$$1.g(bpp.c));
         int $$6 = $$1.a(bnf.a) ? $$1.c(bnf.a).d() + 1 : 0;
         int $$7 = $$1.a(bnf.b) ? $$1.c(bnf.b).d() + 1 : 0;
         float $$8 = 0.25F * (float)($$6 - $$7);
         float $$9 = awi.a($$1.ff() * 1.65F, 0.2F, 3.0F) + $$8;
         float $$10 = $$5.f($$0.ah().b((boi)$$1)) ? 0.5F : 1.0F;
         $$5.q((double)($$10 * $$9) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), atm.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), atm.g, 1.0F, 1.0F);
         boolean $$11 = $$1.gn();
         if ($$11) {
            $$0.a(null, $$1, this.k.apply($$1), atm.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<bxo> $$12 = $$4.c(bxl.m);
         Optional<enz> $$13 = $$4.c(bxl.W);
         boolean $$14 = $$12.isEmpty() || $$13.isEmpty() || $$12.get().a().a().a($$13.get(), 0.25);
         if ($$14) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(aow $$0, cbv $$1) {
      enz $$2 = $$1.dp().d(1.0, 0.0, 1.0).d();
      hz $$3 = hz.a($$1.dk().e($$2));
      return $$0.a_($$3).a(aua.cf) || $$0.a_($$3.c()).a(aua.cf);
   }

   protected void b(aow $$0, cbv $$1) {
      $$0.a($$1, (byte)59);
      $$1.dO().a(bxl.V, this.e.apply($$1).a($$0.z));
      $$1.dO().b(bxl.W);
   }
}
