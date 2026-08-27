import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bsx extends brh<cdc> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<cdc, bmo> e;
   private final caf f;
   private final float g;
   private final ToDoubleFunction<cdc> h;
   private ept i;
   private final Function<cdc, atx> j;
   private final Function<cdc, atx> k;

   public bsx(Function<cdc, bmo> $$0, caf $$1, float $$2, ToDoubleFunction<cdc> $$3, Function<cdc, atx> $$4, Function<cdc, atx> $$5) {
      super(ImmutableMap.of(bys.V, byt.b, bys.W, byt.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = ept.b;
   }

   protected boolean a(apf $$0, cdc $$1) {
      return $$1.dP().a(bys.W);
   }

   protected boolean a(apf $$0, cdc $$1, long $$2) {
      return $$1.dP().a(bys.W);
   }

   protected void b(apf $$0, cdc $$1, long $$2) {
      ib $$3 = $$1.dm();
      bqq<?> $$4 = $$1.dP();
      ept $$5 = $$4.c(bys.W).get();
      this.i = new ept((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(bys.m, new byv($$5, this.g, 0));
   }

   protected void c(apf $$0, cdc $$1, long $$2) {
      List<bpp> $$3 = $$0.a(bpp.class, this.f, $$1, $$1.cH());
      bqq<?> $$4 = $$1.dP();
      if (!$$3.isEmpty()) {
         bpp $$5 = $$3.get(0);
         $$5.a($$0.ah().c((bpp)$$1), (float)$$1.g(bqw.c));
         int $$6 = $$1.a(bom.a) ? $$1.c(bom.a).d() + 1 : 0;
         int $$7 = $$1.a(bom.b) ? $$1.c(bom.b).d() + 1 : 0;
         float $$8 = 0.25F * (float)($$6 - $$7);
         float $$9 = aww.a($$1.fk() * 1.65F, 0.2F, 3.0F) + $$8;
         float $$10 = $$5.f($$0.ah().b((bpp)$$1)) ? 0.5F : 1.0F;
         $$5.q((double)($$10 * $$9) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), atz.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), atz.g, 1.0F, 1.0F);
         boolean $$11 = $$1.gu();
         if ($$11) {
            $$0.a(null, $$1, this.k.apply($$1), atz.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<byv> $$12 = $$4.c(bys.m);
         Optional<ept> $$13 = $$4.c(bys.W);
         boolean $$14 = $$12.isEmpty() || $$13.isEmpty() || $$12.get().a().a().a($$13.get(), 0.25);
         if ($$14) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(apf $$0, cdc $$1) {
      ept $$2 = $$1.dp().d(1.0, 0.0, 1.0).d();
      ib $$3 = ib.a($$1.dk().e($$2));
      return $$0.a_($$3).a(aun.cg) || $$0.a_($$3.c()).a(aun.cg);
   }

   protected void b(apf $$0, cdc $$1) {
      $$0.a($$1, (byte)59);
      $$1.dP().a(bys.V, this.e.apply($$1).a($$0.z));
      $$1.dP().b(bys.W);
   }
}
