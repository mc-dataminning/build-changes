import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class byp extends bwz<cix> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<cix, bru> e;
   private final cfx f;
   private final float g;
   private final ToDoubleFunction<cix> h;
   private faz i;
   private final Function<cix, avz> j;
   private final Function<cix, avz> k;

   public byp(Function<cix, bru> $$0, cfx $$1, float $$2, ToDoubleFunction<cix> $$3, Function<cix, avz> $$4, Function<cix, avz> $$5) {
      super(ImmutableMap.of(cek.V, cel.b, cek.W, cel.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = faz.c;
   }

   protected boolean a(ard $$0, cix $$1) {
      return $$1.eb().a(cek.W);
   }

   protected boolean a(ard $$0, cix $$1, long $$2) {
      return $$1.eb().a(cek.W);
   }

   protected void b(ard $$0, cix $$1, long $$2) {
      ji $$3 = $$1.dv();
      bwi<?> $$4 = $$1.eb();
      faz $$5 = $$4.c(cek.W).get();
      this.i = new faz((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(cek.m, new cen($$5, this.g, 0));
   }

   protected void c(ard $$0, cix $$1, long $$2) {
      List<bvg> $$3 = $$0.a(bvg.class, this.f, $$1, $$1.cR());
      bwi<?> $$4 = $$1.eb();
      if (!$$3.isEmpty()) {
         bvg $$5 = $$3.get(0);
         bta $$6 = $$0.ak().c((bvg)$$1);
         if ($$5.a($$0, $$6, (float)$$1.h(bwo.c))) {
            dda.a($$0, (buk)$$5, $$6);
         }

         int $$7 = $$1.b(btr.a) ? $$1.c(btr.a).e() + 1 : 0;
         int $$8 = $$1.b(btr.b) ? $$1.c(btr.b).e() + 1 : 0;
         float $$9 = 0.25F * (float)($$7 - $$8);
         float $$10 = ayz.a($$1.fp() * 1.65F, 0.2F, 3.0F) + $$9;
         float $$11 = $$5.i($$0.ak().b((bvg)$$1)) ? 0.5F : 1.0F;
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
         Optional<cen> $$13 = $$4.c(cek.m);
         Optional<faz> $$14 = $$4.c(cek.W);
         boolean $$15 = $$13.isEmpty() || $$14.isEmpty() || $$13.get().a().a().a($$14.get(), 0.25);
         if ($$15) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(ard $$0, cix $$1) {
      faz $$2 = $$1.dy().d(1.0, 0.0, 1.0).d();
      ji $$3 = ji.a((kb)$$1.dt().e($$2));
      return $$0.a_($$3).a(awp.cp) || $$0.a_($$3.d()).a(awp.cp);
   }

   protected void b(ard $$0, cix $$1) {
      $$0.a($$1, (byte)59);
      $$1.eb().a(cek.V, this.e.apply($$1).a($$0.A));
      $$1.eb().b(cek.W);
   }
}
