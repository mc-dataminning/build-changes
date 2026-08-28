import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dwc extends dtw {
   public static final MapCodec<dwc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ecc.a.fieldOf("wood_type").forGetter(dtw::d), t()).apply($$0, dwc::new));
   public static final ebm<jb> b = dqn.e;
   private static final Map<jb.a, ffr> c = ffo.a(dmm.a(16.0, 4.0, 14.0, 16.0));
   private static final Map<jb.a, ffr> e = ffo.a(ffo.a(c.get(jb.a.c), dmm.a(14.0, 2.0, 0.0, 10.0)));

   @Override
   public MapCodec<dwc> a() {
      return a;
   }

   public dwc(ecc $$0, ean.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.C.b().b(b, jb.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected bug a(czk $$0, eao $$1, djh $$2, iv $$3, crj $$4, buf $$5, fet $$6) {
      if ($$2.c_($$3) instanceof dza $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bug.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(eao $$0, crj $$1, fet $$2, dza $$3, czk $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.h() instanceof cyz && !this.a($$2, $$0);
   }

   private boolean a(fet $$0, eao $$1) {
      return $$0.c().o() == $$1.c(b).o();
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return e.get($$0.c(b).o());
   }

   @Override
   protected ffr b_(eao $$0, din $$1, iv $$2) {
      return this.a($$0, $$1, $$2, ffc.a());
   }

   @Override
   protected ffr b(eao $$0, din $$1, iv $$2, ffc $$3) {
      return c.get($$0.c(b).o());
   }

   public boolean b(eao $$0, djk $$1, iv $$2) {
      jb $$3 = $$0.c(b).h();
      jb $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(djk $$0, eao $$1, iv $$2, jb $$3) {
      eao $$4 = $$0.a_($$2);
      return $$4.a(axc.aC) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dux.a);
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      eao $$1 = this.m();
      ewv $$2 = $$0.q().b_($$0.a());
      djk $$3 = $$0.q();
      iv $$4 = $$0.a();

      for (jb $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            jb $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.b(d, Boolean.valueOf($$2.a() == eww.c));
            }
         }
      }

      return null;
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      return $$4.o() == $$0.c(b).h().o() && !$$0.a($$1, $$3) ? dmo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(eao $$0) {
      return $$0.c(b).p();
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
      $$0.a(b, d);
   }

   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dyn($$0, $$1);
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dxm> dxn<T> a(djh $$0, eao $$1, dxo<T> $$2) {
      return a($$2, dxo.i, dza::a);
   }
}
