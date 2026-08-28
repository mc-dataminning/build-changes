import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dvg extends dhv {
   public static final MapCodec<dvg> a = b(dvg::new);
   public static final dwl<jm> b = dvi.a;
   public static final dwl<dwp> c = dvi.c;

   @Override
   public MapCodec<dvg> a() {
      return a;
   }

   public dvg(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, dwp.a));
   }

   @Nullable
   @Override
   public dsr a(jh $$0, dvo $$1) {
      return null;
   }

   public static dsr a(jh $$0, dvo $$1, dvo $$2, jm $$3, boolean $$4, boolean $$5) {
      return new dvk($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dsr> dss<T> a(dff $$0, dvo $$1, dst<T> $$2) {
      return a($$2, dst.k, dvk::a);
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dsr $$5 = $$1.c_($$2);
         if ($$5 instanceof dvk) {
            ((dvk)$$5).k();
         }
      }
   }

   @Override
   public void a(dfg $$0, jh $$1, dvo $$2) {
      jh $$3 = $$1.a($$2.c(b).g());
      dvo $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dvh && $$4.c(dvh.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      if (!$$1.C && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bsh.c;
      } else {
         return bsh.e;
      }
   }

   @Override
   protected List<cwf> a(dvo $$0, euj.a $$1) {
      dvk $$2 = this.a($$1.a(), jh.a($$1.a(exc.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return fai.a();
   }

   @Override
   protected fal b(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      dvk $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : fai.a();
   }

   @Nullable
   private dvk a(dek $$0, jh $$1) {
      dsr $$2 = $$0.c_($$1);
      return $$2 instanceof dvk ? (dvk)$$2 : null;
   }

   @Override
   public cwf a(dfi $$0, jh $$1, dvo $$2) {
      return cwf.k;
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }
}
