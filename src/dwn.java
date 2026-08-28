import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dwn extends diw {
   public static final MapCodec<dwn> a = b(dwn::new);
   public static final dxs<jn> b = dwp.a;
   public static final dxs<dxw> c = dwp.c;

   @Override
   public MapCodec<dwn> a() {
      return a;
   }

   public dwn(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c).b(c, dxw.a));
   }

   @Nullable
   @Override
   public dtx a(ji $$0, dwv $$1) {
      return null;
   }

   public static dtx a(ji $$0, dwv $$1, dwv $$2, jn $$3, boolean $$4, boolean $$5) {
      return new dwr($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dtx> dty<T> a(dgg $$0, dwv $$1, dtz<T> $$2) {
      return a($$2, dtz.l, dwr::a);
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dtx $$5 = $$1.c_($$2);
         if ($$5 instanceof dwr) {
            ((dwr)$$5).k();
         }
      }
   }

   @Override
   public void a(dgh $$0, ji $$1, dwv $$2) {
      ji $$3 = $$1.a($$2.c(b).g());
      dwv $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dwo && $$4.c(dwo.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      if (!$$1.C && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bsi.c;
      } else {
         return bsi.e;
      }
   }

   @Override
   protected List<cwn> a(dwv $$0, evs.a $$1) {
      dwr $$2 = this.a($$1.a(), ji.a($$1.a(eyj.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return fbp.a();
   }

   @Override
   protected fbs b(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      dwr $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : fbp.a();
   }

   @Nullable
   private dwr a(dfl $$0, ji $$1) {
      dtx $$2 = $$0.c_($$1);
      return $$2 instanceof dwr ? (dwr)$$2 : null;
   }

   @Override
   protected dpv a_(dwv $$0) {
      return dpv.a;
   }

   @Override
   protected cwn a(dgj $$0, ji $$1, dwv $$2, boolean $$3) {
      return cwn.j;
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }
}
