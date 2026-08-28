import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class eak extends dmd {
   public static final MapCodec<eak> a = b(eak::new);
   public static final ebr<jb> b = eam.a;
   public static final ebr<ebv> c = eam.c;

   @Override
   public MapCodec<eak> a() {
      return a;
   }

   public eak(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c).b(c, ebv.a));
   }

   @Nullable
   @Override
   public dxr a(iv $$0, eat $$1) {
      return null;
   }

   public static dxr a(iv $$0, eat $$1, eat $$2, jb $$3, boolean $$4, boolean $$5) {
      return new eao($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dxr> dxs<T> a(djm $$0, eat $$1, dxt<T> $$2) {
      return a($$2, dxt.l, eao::a);
   }

   @Override
   public void a(djn $$0, iv $$1, eat $$2) {
      iv $$3 = $$1.a($$2.c(b).g());
      eat $$4 = $$0.a_($$3);
      if ($$4.b() instanceof eal && $$4.c(eal.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if (!$$1.C && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bug.c;
      } else {
         return bug.e;
      }
   }

   @Override
   protected List<czn> a(eat $$0, ezw.a $$1) {
      eao $$2 = this.a($$1.a(), iv.a($$1.a(fcn.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return fft.a();
   }

   @Override
   protected ffw b(eat $$0, diq $$1, iv $$2, ffh $$3) {
      eao $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : fft.a();
   }

   @Nullable
   private eao a(diq $$0, iv $$1) {
      dxr $$2 = $$0.c_($$1);
      return $$2 instanceof eao ? (eao)$$2 : null;
   }

   @Override
   protected dte a_(eat $$0) {
      return dte.a;
   }

   @Override
   protected czn a(djp $$0, iv $$1, eat $$2, boolean $$3) {
      return czn.k;
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }
}
