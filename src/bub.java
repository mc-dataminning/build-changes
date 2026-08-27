import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bub extends bsl<cei> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<cei, bnq> e;
   private final cbj f;
   private final float g;
   private final ToDoubleFunction<cei> h;
   private esj i;
   private final Function<cei, aun> j;
   private final Function<cei, aun> k;

   public bub(Function<cei, bnq> $$0, cbj $$1, float $$2, ToDoubleFunction<cei> $$3, Function<cei, aun> $$4, Function<cei, aun> $$5) {
      super(ImmutableMap.of(bzw.V, bzx.b, bzw.W, bzx.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = esj.b;
   }

   protected boolean a(apu $$0, cei $$1) {
      return $$1.dP().a(bzw.W);
   }

   protected boolean a(apu $$0, cei $$1, long $$2) {
      return $$1.dP().a(bzw.W);
   }

   protected void b(apu $$0, cei $$1, long $$2) {
      id $$3 = $$1.dm();
      bru<?> $$4 = $$1.dP();
      esj $$5 = $$4.c(bzw.W).get();
      this.i = new esj((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(bzw.m, new bzz($$5, this.g, 0));
   }

   protected void c(apu $$0, cei $$1, long $$2) {
      List<bqt> $$3 = $$0.a(bqt.class, this.f, $$1, $$1.cH());
      bru<?> $$4 = $$1.dP();
      if (!$$3.isEmpty()) {
         bqt $$5 = $$3.get(0);
         $$5.a($$0.ai().c((bqt)$$1), (float)$$1.g(bsa.c));
         int $$6 = $$1.b(bpo.a) ? $$1.c(bpo.a).d() + 1 : 0;
         int $$7 = $$1.b(bpo.b) ? $$1.c(bpo.b).d() + 1 : 0;
         float $$8 = 0.25F * (float)($$6 - $$7);
         float $$9 = axm.a($$1.fk() * 1.65F, 0.2F, 3.0F) + $$8;
         float $$10 = $$5.f($$0.ai().b((bqt)$$1)) ? 0.5F : 1.0F;
         $$5.q((double)($$10 * $$9) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), aup.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), aup.g, 1.0F, 1.0F);
         boolean $$11 = $$1.gu();
         if ($$11) {
            $$0.a(null, $$1, this.k.apply($$1), aup.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<bzz> $$12 = $$4.c(bzw.m);
         Optional<esj> $$13 = $$4.c(bzw.W);
         boolean $$14 = $$12.isEmpty() || $$13.isEmpty() || $$12.get().a().a().a($$13.get(), 0.25);
         if ($$14) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(apu $$0, cei $$1) {
      esj $$2 = $$1.dp().d(1.0, 0.0, 1.0).d();
      id $$3 = id.a($$1.dk().e($$2));
      return $$0.a_($$3).a(ave.cg) || $$0.a_($$3.c()).a(ave.cg);
   }

   protected void b(apu $$0, cei $$1) {
      $$0.a($$1, (byte)59);
      $$1.dP().a(bzw.V, this.e.apply($$1).a($$0.z));
      $$1.dP().b(bzw.W);
   }
}
