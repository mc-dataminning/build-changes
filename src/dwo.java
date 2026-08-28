import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dwo extends dix {
   public static final MapCodec<dwo> a = b(dwo::new);
   public static final dxt<jn> b = dwq.a;
   public static final dxt<dxx> c = dwq.c;

   @Override
   public MapCodec<dwo> a() {
      return a;
   }

   public dwo(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c).b(c, dxx.a));
   }

   @Nullable
   @Override
   public dty a(ji $$0, dww $$1) {
      return null;
   }

   public static dty a(ji $$0, dww $$1, dww $$2, jn $$3, boolean $$4, boolean $$5) {
      return new dws($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dty> dtz<T> a(dgh $$0, dww $$1, dua<T> $$2) {
      return a($$2, dua.l, dws::a);
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dty $$5 = $$1.c_($$2);
         if ($$5 instanceof dws) {
            ((dws)$$5).k();
         }
      }
   }

   @Override
   public void a(dgi $$0, ji $$1, dww $$2) {
      ji $$3 = $$1.a($$2.c(b).g());
      dww $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dwp && $$4.c(dwp.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      if (!$$1.C && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bsj.c;
      } else {
         return bsj.e;
      }
   }

   @Override
   protected List<cwo> a(dww $$0, evt.a $$1) {
      dws $$2 = this.a($$1.a(), ji.a($$1.a(eyk.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return fbq.a();
   }

   @Override
   protected fbt b(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      dws $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : fbq.a();
   }

   @Nullable
   private dws a(dfm $$0, ji $$1) {
      dty $$2 = $$0.c_($$1);
      return $$2 instanceof dws ? (dws)$$2 : null;
   }

   @Override
   protected dpw a_(dww $$0) {
      return dpw.a;
   }

   @Override
   protected cwo a(dgk $$0, ji $$1, dww $$2, boolean $$3) {
      return cwo.j;
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }
}
