import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class boe extends bmp<bye> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<bye, bib> e;
   private final bvk f;
   private final float g;
   private final ToDoubleFunction<bye> h;
   private eji i;
   private final Function<bye, aqm> j;
   private final Function<bye, aqm> k;

   public boe(Function<bye, bib> $$0, bvk $$1, float $$2, ToDoubleFunction<bye> $$3, Function<bye, aqm> $$4, Function<bye, aqm> $$5) {
      super(ImmutableMap.of(btz.U, bua.b, btz.V, bua.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = eji.b;
   }

   protected boolean a(ama $$0, bye $$1) {
      return $$1.dN().a(btz.V);
   }

   protected boolean a(ama $$0, bye $$1, long $$2) {
      return $$1.dN().a(btz.V);
   }

   protected void b(ama $$0, bye $$1, long $$2) {
      ht $$3 = $$1.dl();
      bly<?> $$4 = $$1.dN();
      eji $$5 = $$4.c(btz.V).get();
      this.i = new eji((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(btz.m, new buc($$5, this.g, 0));
   }

   protected void c(ama $$0, bye $$1, long $$2) {
      List<bky> $$3 = $$0.a(bky.class, this.f, $$1, $$1.cG());
      bly<?> $$4 = $$1.dN();
      if (!$$3.isEmpty()) {
         bky $$5 = $$3.get(0);
         $$5.a($$0.ag().c((bky)$$1), (float)$$1.b(bme.c));
         int $$6 = $$1.a(bjx.a) ? $$1.b(bjx.a).e() + 1 : 0;
         int $$7 = $$1.a(bjx.b) ? $$1.b(bjx.b).e() + 1 : 0;
         float $$8 = 0.25F * (float)($$6 - $$7);
         float $$9 = ati.a($$1.fe() * 1.65F, 0.2F, 3.0F) + $$8;
         float $$10 = $$5.f($$0.ag().b((bky)$$1)) ? 0.5F : 1.0F;
         $$5.q((double)($$10 * $$9) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), aqo.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), aqo.g, 1.0F, 1.0F);
         boolean $$11 = $$1.gl();
         if ($$11) {
            $$0.a(null, $$1, this.k.apply($$1), aqo.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<buc> $$12 = $$4.c(btz.m);
         Optional<eji> $$13 = $$4.c(btz.V);
         boolean $$14 = $$12.isEmpty() || $$13.isEmpty() || $$12.get().a().a().a($$13.get(), 0.25);
         if ($$14) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(ama $$0, bye $$1) {
      eji $$2 = $$1.do().d(1.0, 0.0, 1.0).d();
      ht $$3 = ht.a($$1.dj().e($$2));
      return $$0.a_($$3).a(arc.ce) || $$0.a_($$3.c()).a(arc.ce);
   }

   protected void b(ama $$0, bye $$1) {
      $$0.a($$1, (byte)59);
      $$1.dN().a(btz.U, this.e.apply($$1).a($$0.z));
      $$1.dN().b(btz.V);
   }
}
