import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dvn extends dic {
   public static final MapCodec<dvn> a = b(dvn::new);
   public static final dws<jm> b = dvp.a;
   public static final dws<dww> c = dvp.c;

   @Override
   public MapCodec<dvn> a() {
      return a;
   }

   public dvn(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, dww.a));
   }

   @Nullable
   @Override
   public dsy a(jh $$0, dvv $$1) {
      return null;
   }

   public static dsy a(jh $$0, dvv $$1, dvv $$2, jm $$3, boolean $$4, boolean $$5) {
      return new dvr($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dsy> dsz<T> a(dfm $$0, dvv $$1, dta<T> $$2) {
      return a($$2, dta.k, dvr::a);
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dsy $$5 = $$1.c_($$2);
         if ($$5 instanceof dvr) {
            ((dvr)$$5).k();
         }
      }
   }

   @Override
   public void a(dfn $$0, jh $$1, dvv $$2) {
      jh $$3 = $$1.a($$2.c(b).g());
      dvv $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dvo && $$4.c(dvo.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      if (!$$1.C && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bsk.c;
      } else {
         return bsk.e;
      }
   }

   @Override
   protected List<cwm> a(dvv $$0, euq.a $$1) {
      dvr $$2 = this.a($$1.a(), jh.a($$1.a(exj.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return fap.a();
   }

   @Override
   protected fas b(dvv $$0, der $$1, jh $$2, fad $$3) {
      dvr $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : fap.a();
   }

   @Nullable
   private dvr a(der $$0, jh $$1) {
      dsy $$2 = $$0.c_($$1);
      return $$2 instanceof dvr ? (dvr)$$2 : null;
   }

   @Override
   public cwm a(dfp $$0, jh $$1, dvv $$2) {
      return cwm.k;
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }
}
