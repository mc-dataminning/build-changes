import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class eaf extends dly {
   public static final MapCodec<eaf> a = b(eaf::new);
   public static final ebm<jb> b = eah.a;
   public static final ebm<ebq> c = eah.c;

   @Override
   public MapCodec<eaf> a() {
      return a;
   }

   public eaf(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c).b(c, ebq.a));
   }

   @Nullable
   @Override
   public dxm a(iv $$0, eao $$1) {
      return null;
   }

   public static dxm a(iv $$0, eao $$1, eao $$2, jb $$3, boolean $$4, boolean $$5) {
      return new eaj($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dxm> dxn<T> a(djh $$0, eao $$1, dxo<T> $$2) {
      return a($$2, dxo.l, eaj::a);
   }

   @Override
   public void a(dji $$0, iv $$1, eao $$2) {
      iv $$3 = $$1.a($$2.c(b).g());
      eao $$4 = $$0.a_($$3);
      if ($$4.b() instanceof eag && $$4.c(eag.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if (!$$1.C && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bug.c;
      } else {
         return bug.e;
      }
   }

   @Override
   protected List<czk> a(eao $$0, ezr.a $$1) {
      eaj $$2 = this.a($$1.a(), iv.a($$1.a(fci.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return ffo.a();
   }

   @Override
   protected ffr b(eao $$0, din $$1, iv $$2, ffc $$3) {
      eaj $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : ffo.a();
   }

   @Nullable
   private eaj a(din $$0, iv $$1) {
      dxm $$2 = $$0.c_($$1);
      return $$2 instanceof eaj ? (eaj)$$2 : null;
   }

   @Override
   protected dsz a_(eao $$0) {
      return dsz.a;
   }

   @Override
   protected czk a(djk $$0, iv $$1, eao $$2, boolean $$3) {
      return czk.k;
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
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }
}
