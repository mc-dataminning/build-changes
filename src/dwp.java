import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dwp extends diy {
   public static final MapCodec<dwp> a = b(dwp::new);
   public static final dxu<jn> b = dwr.a;
   public static final dxu<dxy> c = dwr.c;

   @Override
   public MapCodec<dwp> a() {
      return a;
   }

   public dwp(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c).b(c, dxy.a));
   }

   @Nullable
   @Override
   public dtz a(ji $$0, dwx $$1) {
      return null;
   }

   public static dtz a(ji $$0, dwx $$1, dwx $$2, jn $$3, boolean $$4, boolean $$5) {
      return new dwt($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dtz> dua<T> a(dgi $$0, dwx $$1, dub<T> $$2) {
      return a($$2, dub.l, dwt::a);
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dtz $$5 = $$1.c_($$2);
         if ($$5 instanceof dwt) {
            ((dwt)$$5).k();
         }
      }
   }

   @Override
   public void a(dgj $$0, ji $$1, dwx $$2) {
      ji $$3 = $$1.a($$2.c(b).g());
      dwx $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dwq && $$4.c(dwq.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bsk a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      if (!$$1.C && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bsk.c;
      } else {
         return bsk.e;
      }
   }

   @Override
   protected List<cwp> a(dwx $$0, evu.a $$1) {
      dwt $$2 = this.a($$1.a(), ji.a($$1.a(eyl.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return fbr.a();
   }

   @Override
   protected fbu b(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      dwt $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : fbr.a();
   }

   @Nullable
   private dwt a(dfn $$0, ji $$1) {
      dtz $$2 = $$0.c_($$1);
      return $$2 instanceof dwt ? (dwt)$$2 : null;
   }

   @Override
   protected dpx a_(dwx $$0) {
      return dpx.a;
   }

   @Override
   protected cwp a(dgl $$0, ji $$1, dwx $$2, boolean $$3) {
      return cwp.j;
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return false;
   }
}
