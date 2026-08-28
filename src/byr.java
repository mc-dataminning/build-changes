import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class byr extends bxb<ciz> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<ciz, brw> e;
   private final cfz f;
   private final float g;
   private final ToDoubleFunction<ciz> h;
   private fbb i;
   private final Function<ciz, avz> j;
   private final Function<ciz, avz> k;

   public byr(Function<ciz, brw> $$0, cfz $$1, float $$2, ToDoubleFunction<ciz> $$3, Function<ciz, avz> $$4, Function<ciz, avz> $$5) {
      super(ImmutableMap.of(cem.V, cen.b, cem.W, cen.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = fbb.c;
   }

   protected boolean a(ard $$0, ciz $$1) {
      return $$1.eb().a(cem.W);
   }

   protected boolean a(ard $$0, ciz $$1, long $$2) {
      return $$1.eb().a(cem.W);
   }

   protected void b(ard $$0, ciz $$1, long $$2) {
      ji $$3 = $$1.dv();
      bwk<?> $$4 = $$1.eb();
      fbb $$5 = $$4.c(cem.W).get();
      this.i = new fbb((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(cem.m, new cep($$5, this.g, 0));
   }

   protected void c(ard $$0, ciz $$1, long $$2) {
      List<bvi> $$3 = $$0.a(bvi.class, this.f, $$1, $$1.cR());
      bwk<?> $$4 = $$1.eb();
      if (!$$3.isEmpty()) {
         bvi $$5 = $$3.get(0);
         btc $$6 = $$0.ak().c((bvi)$$1);
         if ($$5.a($$0, $$6, (float)$$1.h(bwq.c))) {
            ddc.a($$0, (bum)$$5, $$6);
         }

         int $$7 = $$1.b(btt.a) ? $$1.c(btt.a).e() + 1 : 0;
         int $$8 = $$1.b(btt.b) ? $$1.c(btt.b).e() + 1 : 0;
         float $$9 = 0.25F * (float)($$7 - $$8);
         float $$10 = ayz.a($$1.fp() * 1.65F, 0.2F, 3.0F) + $$9;
         float $$11 = $$5.i($$0.ak().b((bvi)$$1)) ? 0.5F : 1.0F;
         $$5.p((double)($$11 * $$10) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), awb.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), awb.g, 1.0F, 1.0F);
         boolean $$12 = $$1.gu();
         if ($$12) {
            $$0.a(null, $$1, this.k.apply($$1), awb.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<cep> $$13 = $$4.c(cem.m);
         Optional<fbb> $$14 = $$4.c(cem.W);
         boolean $$15 = $$13.isEmpty() || $$14.isEmpty() || $$13.get().a().a().a($$14.get(), 0.25);
         if ($$15) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(ard $$0, ciz $$1) {
      fbb $$2 = $$1.dy().d(1.0, 0.0, 1.0).d();
      ji $$3 = ji.a((kb)$$1.dt().e($$2));
      return $$0.a_($$3).a(awp.cp) || $$0.a_($$3.d()).a(awp.cp);
   }

   protected void b(ard $$0, ciz $$1) {
      $$0.a($$1, (byte)59);
      $$1.eb().a(cem.V, this.e.apply($$1).a($$0.A));
      $$1.eb().b(cem.W);
   }
}
