import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bmo extends bkz<bwo> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<bwo, bgl> e;
   private final btu f;
   private final float g;
   private final ToDoubleFunction<bwo> h;
   private ehp i;
   private final Function<bwo, ape> j;
   private final Function<bwo, ape> k;

   public bmo(Function<bwo, bgl> $$0, btu $$1, float $$2, ToDoubleFunction<bwo> $$3, Function<bwo, ape> $$4, Function<bwo, ape> $$5) {
      super(ImmutableMap.of(bsj.U, bsk.b, bsj.V, bsk.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = ehp.b;
   }

   protected boolean a(aks $$0, bwo $$1) {
      return $$1.dN().a(bsj.V);
   }

   protected boolean a(aks $$0, bwo $$1, long $$2) {
      return $$1.dN().a(bsj.V);
   }

   protected void b(aks $$0, bwo $$1, long $$2) {
      gw $$3 = $$1.dl();
      bki<?> $$4 = $$1.dN();
      ehp $$5 = $$4.c(bsj.V).get();
      this.i = new ehp((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(bsj.m, new bsm($$5, this.g, 0));
   }

   protected void c(aks $$0, bwo $$1, long $$2) {
      List<bji> $$3 = $$0.a(bji.class, this.f, $$1, $$1.cG());
      bki<?> $$4 = $$1.dN();
      if (!$$3.isEmpty()) {
         bji $$5 = $$3.get(0);
         $$5.a($$0.ag().c((bji)$$1), (float)$$1.b(bko.f));
         int $$6 = $$1.a(bih.a) ? $$1.b(bih.a).e() + 1 : 0;
         int $$7 = $$1.a(bih.b) ? $$1.b(bih.b).e() + 1 : 0;
         float $$8 = 0.25F * (float)($$6 - $$7);
         float $$9 = ary.a($$1.fe() * 1.65F, 0.2F, 3.0F) + $$8;
         float $$10 = $$5.f($$0.ag().b((bji)$$1)) ? 0.5F : 1.0F;
         $$5.q((double)($$10 * $$9) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), apg.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), apg.g, 1.0F, 1.0F);
         boolean $$11 = $$1.gk();
         if ($$11) {
            $$0.a(null, $$1, this.k.apply($$1), apg.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<bsm> $$12 = $$4.c(bsj.m);
         Optional<ehp> $$13 = $$4.c(bsj.V);
         boolean $$14 = $$12.isEmpty() || $$13.isEmpty() || $$12.get().a().a().a($$13.get(), 0.25);
         if ($$14) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(aks $$0, bwo $$1) {
      ehp $$2 = $$1.do().d(1.0, 0.0, 1.0).d();
      gw $$3 = gw.a($$1.dj().e($$2));
      return $$0.a_($$3).a(apu.ce) || $$0.a_($$3.c()).a(apu.ce);
   }

   protected void b(aks $$0, bwo $$1) {
      $$0.a($$1, (byte)59);
      $$1.dN().a(bsj.U, this.e.apply($$1).a($$0.z));
      $$1.dN().b(bsj.V);
   }
}
