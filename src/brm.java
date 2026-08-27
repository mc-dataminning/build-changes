import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class brm extends bpw<cbr> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<cbr, blf> e;
   private final byu f;
   private final float g;
   private final ToDoubleFunction<cbr> h;
   private ens i;
   private final Function<cbr, atj> j;
   private final Function<cbr, atj> k;

   public brm(Function<cbr, blf> $$0, byu $$1, float $$2, ToDoubleFunction<cbr> $$3, Function<cbr, atj> $$4, Function<cbr, atj> $$5) {
      super(ImmutableMap.of(bxh.V, bxi.b, bxh.W, bxi.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = ens.b;
   }

   protected boolean a(aov $$0, cbr $$1) {
      return $$1.dO().a(bxh.W);
   }

   protected boolean a(aov $$0, cbr $$1, long $$2) {
      return $$1.dO().a(bxh.W);
   }

   protected void b(aov $$0, cbr $$1, long $$2) {
      hz $$3 = $$1.dm();
      bpf<?> $$4 = $$1.dO();
      ens $$5 = $$4.c(bxh.W).get();
      this.i = new ens((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(bxh.m, new bxk($$5, this.g, 0));
   }

   protected void c(aov $$0, cbr $$1, long $$2) {
      List<bog> $$3 = $$0.a(bog.class, this.f, $$1, $$1.cH());
      bpf<?> $$4 = $$1.dO();
      if (!$$3.isEmpty()) {
         bog $$5 = $$3.get(0);
         $$5.a($$0.ai().c((bog)$$1), (float)$$1.g(bpl.c));
         int $$6 = $$1.a(bnd.a) ? $$1.c(bnd.a).d() + 1 : 0;
         int $$7 = $$1.a(bnd.b) ? $$1.c(bnd.b).d() + 1 : 0;
         float $$8 = 0.25F * (float)($$6 - $$7);
         float $$9 = awh.a($$1.ff() * 1.65F, 0.2F, 3.0F) + $$8;
         float $$10 = $$5.f($$0.ai().b((bog)$$1)) ? 0.5F : 1.0F;
         $$5.q((double)($$10 * $$9) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), atl.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), atl.g, 1.0F, 1.0F);
         boolean $$11 = $$1.gn();
         if ($$11) {
            $$0.a(null, $$1, this.k.apply($$1), atl.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<bxk> $$12 = $$4.c(bxh.m);
         Optional<ens> $$13 = $$4.c(bxh.W);
         boolean $$14 = $$12.isEmpty() || $$13.isEmpty() || $$12.get().a().a().a($$13.get(), 0.25);
         if ($$14) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(aov $$0, cbr $$1) {
      ens $$2 = $$1.dp().d(1.0, 0.0, 1.0).d();
      hz $$3 = hz.a($$1.dk().e($$2));
      return $$0.a_($$3).a(atz.cf) || $$0.a_($$3.c()).a(atz.cf);
   }

   protected void b(aov $$0, cbr $$1) {
      $$0.a($$1, (byte)59);
      $$1.dO().a(bxh.V, this.e.apply($$1).a($$0.z));
      $$1.dO().b(bxh.W);
   }
}
