import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dwq extends diz {
   public static final MapCodec<dwq> a = b(dwq::new);
   public static final dxv<jn> b = dws.a;
   public static final dxv<dxz> c = dws.c;

   @Override
   public MapCodec<dwq> a() {
      return a;
   }

   public dwq(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c).b(c, dxz.a));
   }

   @Nullable
   @Override
   public dua a(ji $$0, dwy $$1) {
      return null;
   }

   public static dua a(ji $$0, dwy $$1, dwy $$2, jn $$3, boolean $$4, boolean $$5) {
      return new dwu($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dua> dub<T> a(dgj $$0, dwy $$1, duc<T> $$2) {
      return a($$2, duc.l, dwu::a);
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dua $$5 = $$1.c_($$2);
         if ($$5 instanceof dwu) {
            ((dwu)$$5).k();
         }
      }
   }

   @Override
   public void a(dgk $$0, ji $$1, dwy $$2) {
      ji $$3 = $$1.a($$2.c(b).g());
      dwy $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dwr && $$4.c(dwr.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      if (!$$1.C && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bsl.c;
      } else {
         return bsl.e;
      }
   }

   @Override
   protected List<cwq> a(dwy $$0, evv.a $$1) {
      dwu $$2 = this.a($$1.a(), ji.a($$1.a(eym.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return fbs.a();
   }

   @Override
   protected fbv b(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      dwu $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : fbs.a();
   }

   @Nullable
   private dwu a(dfo $$0, ji $$1) {
      dua $$2 = $$0.c_($$1);
      return $$2 instanceof dwu ? (dwu)$$2 : null;
   }

   @Override
   protected dpy a_(dwy $$0) {
      return dpy.a;
   }

   @Override
   protected cwq a(dgm $$0, ji $$1, dwy $$2, boolean $$3) {
      return cwq.j;
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }
}
