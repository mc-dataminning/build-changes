import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class byn extends bwx<civ> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<civ, brs> e;
   private final cfv f;
   private final float g;
   private final ToDoubleFunction<civ> h;
   private ezr i;
   private final Function<civ, awn> j;
   private final Function<civ, awn> k;

   public byn(Function<civ, brs> $$0, cfv $$1, float $$2, ToDoubleFunction<civ> $$3, Function<civ, awn> $$4, Function<civ, awn> $$5) {
      super(ImmutableMap.of(cei.V, cej.b, cei.W, cej.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = ezr.c;
   }

   protected boolean a(arq $$0, civ $$1) {
      return $$1.ee().a(cei.W);
   }

   protected boolean a(arq $$0, civ $$1, long $$2) {
      return $$1.ee().a(cei.W);
   }

   protected void b(arq $$0, civ $$1, long $$2) {
      jh $$3 = $$1.dy();
      bwg<?> $$4 = $$1.ee();
      ezr $$5 = $$4.c(cei.W).get();
      this.i = new ezr((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(cei.m, new cel($$5, this.g, 0));
   }

   protected void c(arq $$0, civ $$1, long $$2) {
      List<bve> $$3 = $$0.a(bve.class, this.f, $$1, $$1.cT());
      bwg<?> $$4 = $$1.ee();
      if (!$$3.isEmpty()) {
         bve $$5 = $$3.get(0);
         bsy $$6 = $$0.ai().c((bve)$$1);
         if ($$5.a($$6, (float)$$1.h(bwm.c))) {
            dby.a($$0, (bui)$$5, $$6);
         }

         int $$7 = $$1.b(btp.a) ? $$1.c(btp.a).e() + 1 : 0;
         int $$8 = $$1.b(btp.b) ? $$1.c(btp.b).e() + 1 : 0;
         float $$9 = 0.25F * (float)($$7 - $$8);
         float $$10 = azn.a($$1.fs() * 1.65F, 0.2F, 3.0F) + $$9;
         float $$11 = $$5.f($$0.ai().b((bve)$$1)) ? 0.5F : 1.0F;
         $$5.p((double)($$11 * $$10) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), awp.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), awp.g, 1.0F, 1.0F);
         boolean $$12 = $$1.gx();
         if ($$12) {
            $$0.a(null, $$1, this.k.apply($$1), awp.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<cel> $$13 = $$4.c(cei.m);
         Optional<ezr> $$14 = $$4.c(cei.W);
         boolean $$15 = $$13.isEmpty() || $$14.isEmpty() || $$13.get().a().a().a($$14.get(), 0.25);
         if ($$15) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(arq $$0, civ $$1) {
      ezr $$2 = $$1.dB().d(1.0, 0.0, 1.0).d();
      jh $$3 = jh.a((ka)$$1.dw().e($$2));
      return $$0.a_($$3).a(axd.co) || $$0.a_($$3.d()).a(axd.co);
   }

   protected void b(arq $$0, civ $$1) {
      $$0.a($$1, (byte)59);
      $$1.ee().a(cei.V, this.e.apply($$1).a($$0.A));
      $$1.ee().b(cei.W);
   }
}
