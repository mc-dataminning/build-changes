import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bvw extends bug<cge> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<cge, bpl> e;
   private final cde f;
   private final float g;
   private final ToDoubleFunction<cge> h;
   private ewu i;
   private final Function<cge, avn> j;
   private final Function<cge, avn> k;

   public bvw(Function<cge, bpl> $$0, cde $$1, float $$2, ToDoubleFunction<cge> $$3, Function<cge, avn> $$4, Function<cge, avn> $$5) {
      super(ImmutableMap.of(cbr.V, cbs.b, cbr.W, cbs.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = ewu.b;
   }

   protected boolean a(aqt $$0, cge $$1) {
      return $$1.dZ().a(cbr.W);
   }

   protected boolean a(aqt $$0, cge $$1, long $$2) {
      return $$1.dZ().a(cbr.W);
   }

   protected void b(aqt $$0, cge $$1, long $$2) {
      ir $$3 = $$1.du();
      btp<?> $$4 = $$1.dZ();
      ewu $$5 = $$4.c(cbr.W).get();
      this.i = new ewu((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(cbr.m, new cbu($$5, this.g, 0));
   }

   protected void c(aqt $$0, cge $$1, long $$2) {
      List<bso> $$3 = $$0.a(bso.class, this.f, $$1, $$1.cP());
      btp<?> $$4 = $$1.dZ();
      if (!$$3.isEmpty()) {
         bso $$5 = $$3.get(0);
         $$5.a($$0.aj().c((bso)$$1), (float)$$1.g(btv.c));
         int $$6 = $$1.b(brj.a) ? $$1.c(brj.a).e() + 1 : 0;
         int $$7 = $$1.b(brj.b) ? $$1.c(brj.b).e() + 1 : 0;
         float $$8 = 0.25F * (float)($$6 - $$7);
         float $$9 = aym.a($$1.fw() * 1.65F, 0.2F, 3.0F) + $$8;
         float $$10 = $$5.f($$0.aj().b((bso)$$1)) ? 0.5F : 1.0F;
         $$5.q((double)($$10 * $$9) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), avq.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), avq.g, 1.0F, 1.0F);
         boolean $$11 = $$1.gF();
         if ($$11) {
            $$0.a(null, $$1, this.k.apply($$1), avq.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<cbu> $$12 = $$4.c(cbr.m);
         Optional<ewu> $$13 = $$4.c(cbr.W);
         boolean $$14 = $$12.isEmpty() || $$13.isEmpty() || $$12.get().a().a().a($$13.get(), 0.25);
         if ($$14) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(aqt $$0, cge $$1) {
      ewu $$2 = $$1.dx().d(1.0, 0.0, 1.0).d();
      ir $$3 = ir.a($$1.ds().e($$2));
      return $$0.a_($$3).a(awe.cp) || $$0.a_($$3.c()).a(awe.cp);
   }

   protected void b(aqt $$0, cge $$1) {
      $$0.a($$1, (byte)59);
      $$1.dZ().a(cbr.V, this.e.apply($$1).a($$0.A));
      $$1.dZ().b(cbr.W);
   }
}
