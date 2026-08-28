import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dqm extends dly {
   public static final MapCodec<dqm> a = b(dqm::new);
   public static final ebm<jb> b = ebe.S;
   public static final ebf c = ebe.i;
   private final Function<eao, ffr> d;
   private final Map<jb, ffr> e;

   @Override
   public MapCodec<dqm> a() {
      return a;
   }

   public dqm(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.a).b(c, Boolean.valueOf(true)));
      ffr $$1 = dmm.b(12.0, 11.0, 16.0);
      this.d = this.b($$1);
      this.e = ImmutableMap.builderWithExpectedSize(5).putAll(ffo.c(ffo.a($$1, dmm.a(4.0, 8.0, 10.0, 0.0, 4.0)))).put(jb.a, $$1).build();
   }

   private Function<eao, ffr> b(ffr $$0) {
      ffr $$1 = ffo.a(dmm.b(16.0, 10.0, 16.0), dmm.b(8.0, 4.0, 10.0));
      ffr $$2 = ffo.a($$1, $$0, ffb.e);
      Map<jb, ffr> $$3 = ffo.d(dmm.a(4.0, 4.0, 8.0, 0.0, 8.0), new fex(8.0, 6.0, 8.0).c(0.0625));
      return this.a($$2x -> ffo.a($$2, ffo.a($$3.get($$2x.c(b)), ffo.b(), ffb.i)), new ebr[]{c});
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return this.d.apply($$0);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2) {
      return this.e.get($$0.c(b));
   }

   @Override
   public eao a(ddd $$0) {
      jb $$1 = $$0.k().g();
      return this.m().b(b, $$1.o() == jb.a.b ? jb.a : $$1).b(c, Boolean.valueOf(true));
   }

   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dyp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxm> dxn<T> a(djh $$0, eao $$1, dxo<T> $$2) {
      return $$0.C ? null : a($$2, dxo.s, dyp::a);
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, eao $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dyp $$5) {
         $$3.a($$5);
         $$3.a(awx.ad);
      }

      return bug.a;
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, dmm $$3, @Nullable eyd $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(djh $$0, iv $$1, eao $$2) {
      boolean $$3 = !$$0.D($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, boolean $$3) {
      buc.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(eao $$0) {
      return true;
   }

   @Override
   protected int a(eao $$0, djh $$1, iv $$2) {
      return cvc.a($$1.c_($$2));
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, bwi $$3, bxb $$4) {
      dxm $$5 = $$1.c_($$2);
      if ($$5 instanceof dyp) {
         dyp.a($$1, $$2, $$0, $$3, (dyp)$$5);
      }
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }
}
