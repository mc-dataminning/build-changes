import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bmd extends bko<bwd> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<bwd, bfz> e;
   private final btj f;
   private final float g;
   private final ToDoubleFunction<bwd> h;
   private ehf i;
   private final Function<bwd, aot> j;
   private final Function<bwd, aot> k;

   public bmd(Function<bwd, bfz> $$0, btj $$1, float $$2, ToDoubleFunction<bwd> $$3, Function<bwd, aot> $$4, Function<bwd, aot> $$5) {
      super(ImmutableMap.of(bry.U, brz.b, bry.V, brz.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = ehf.b;
   }

   protected boolean a(aki $$0, bwd $$1) {
      return $$1.dM().a(bry.V);
   }

   protected boolean a(aki $$0, bwd $$1, long $$2) {
      return $$1.dM().a(bry.V);
   }

   protected void b(aki $$0, bwd $$1, long $$2) {
      gv $$3 = $$1.dk();
      bjx<?> $$4 = $$1.dM();
      ehf $$5 = $$4.c(bry.V).get();
      this.i = new ehf((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(bry.m, new bsb($$5, this.g, 0));
   }

   protected void c(aki $$0, bwd $$1, long $$2) {
      List<biw> $$3 = $$0.a(biw.class, this.f, $$1, $$1.cG());
      bjx<?> $$4 = $$1.dM();
      if (!$$3.isEmpty()) {
         biw $$5 = $$3.get(0);
         $$5.a($$0.ag().c((biw)$$1), (float)$$1.b(bkd.f));
         int $$6 = $$1.a(bhv.a) ? $$1.b(bhv.a).e() + 1 : 0;
         int $$7 = $$1.a(bhv.b) ? $$1.b(bhv.b).e() + 1 : 0;
         float $$8 = 0.25F * (float)($$6 - $$7);
         float $$9 = aro.a($$1.fd() * 1.65F, 0.2F, 3.0F) + $$8;
         float $$10 = $$5.f($$0.ag().b((biw)$$1)) ? 0.5F : 1.0F;
         $$5.q((double)($$10 * $$9) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), aov.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), aov.g, 1.0F, 1.0F);
         boolean $$11 = $$1.gg();
         if ($$11) {
            $$0.a(null, $$1, this.k.apply($$1), aov.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<bsb> $$12 = $$4.c(bry.m);
         Optional<ehf> $$13 = $$4.c(bry.V);
         boolean $$14 = $$12.isEmpty() || $$13.isEmpty() || $$12.get().a().a().a($$13.get(), 0.25);
         if ($$14) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(aki $$0, bwd $$1) {
      ehf $$2 = $$1.dn().d(1.0, 0.0, 1.0).d();
      gv $$3 = gv.a($$1.di().e($$2));
      return $$0.a_($$3).a(apj.ce) || $$0.a_($$3.c()).a(apj.ce);
   }

   protected void b(aki $$0, bwd $$1) {
      $$0.a($$1, (byte)59);
      $$1.dM().a(bry.U, this.e.apply($$1).a($$0.z));
      $$1.dM().b(bry.V);
   }
}
