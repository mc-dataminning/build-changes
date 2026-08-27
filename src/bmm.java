import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bmm extends bkx<bwm> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<bwm, bgj> e;
   private final bts f;
   private final float g;
   private final ToDoubleFunction<bwm> h;
   private ehn i;
   private final Function<bwm, apd> j;
   private final Function<bwm, apd> k;

   public bmm(Function<bwm, bgj> $$0, bts $$1, float $$2, ToDoubleFunction<bwm> $$3, Function<bwm, apd> $$4, Function<bwm, apd> $$5) {
      super(ImmutableMap.of(bsh.U, bsi.b, bsh.V, bsi.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = ehn.b;
   }

   protected boolean a(akr $$0, bwm $$1) {
      return $$1.dN().a(bsh.V);
   }

   protected boolean a(akr $$0, bwm $$1, long $$2) {
      return $$1.dN().a(bsh.V);
   }

   protected void b(akr $$0, bwm $$1, long $$2) {
      gw $$3 = $$1.dl();
      bkg<?> $$4 = $$1.dN();
      ehn $$5 = $$4.c(bsh.V).get();
      this.i = new ehn((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(bsh.m, new bsk($$5, this.g, 0));
   }

   protected void c(akr $$0, bwm $$1, long $$2) {
      List<bjg> $$3 = $$0.a(bjg.class, this.f, $$1, $$1.cH());
      bkg<?> $$4 = $$1.dN();
      if (!$$3.isEmpty()) {
         bjg $$5 = $$3.get(0);
         $$5.a($$0.ag().c((bjg)$$1), (float)$$1.b(bkm.f));
         int $$6 = $$1.a(bif.a) ? $$1.b(bif.a).e() + 1 : 0;
         int $$7 = $$1.a(bif.b) ? $$1.b(bif.b).e() + 1 : 0;
         float $$8 = 0.25F * (float)($$6 - $$7);
         float $$9 = arx.a($$1.fe() * 1.65F, 0.2F, 3.0F) + $$8;
         float $$10 = $$5.f($$0.ag().b((bjg)$$1)) ? 0.5F : 1.0F;
         $$5.q((double)($$10 * $$9) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), apf.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), apf.g, 1.0F, 1.0F);
         boolean $$11 = $$1.gk();
         if ($$11) {
            $$0.a(null, $$1, this.k.apply($$1), apf.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<bsk> $$12 = $$4.c(bsh.m);
         Optional<ehn> $$13 = $$4.c(bsh.V);
         boolean $$14 = $$12.isEmpty() || $$13.isEmpty() || $$12.get().a().a().a($$13.get(), 0.25);
         if ($$14) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(akr $$0, bwm $$1) {
      ehn $$2 = $$1.do().d(1.0, 0.0, 1.0).d();
      gw $$3 = gw.a($$1.dj().e($$2));
      return $$0.a_($$3).a(apt.ce) || $$0.a_($$3.c()).a(apt.ce);
   }

   protected void b(akr $$0, bwm $$1) {
      $$0.a($$1, (byte)59);
      $$1.dN().a(bsh.U, this.e.apply($$1).a($$0.z));
      $$1.dN().b(bsh.V);
   }
}
