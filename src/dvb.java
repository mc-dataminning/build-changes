import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dvb extends dhq {
   public static final MapCodec<dvb> a = b(dvb::new);
   public static final dwd b = dvd.a;
   public static final dwh<dwl> c = dvd.c;

   @Override
   public MapCodec<dvb> a() {
      return a;
   }

   public dvb(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, dwl.a));
   }

   @Nullable
   @Override
   public dsm a(jh $$0, dvj $$1) {
      return null;
   }

   public static dsm a(jh $$0, dvj $$1, dvj $$2, jm $$3, boolean $$4, boolean $$5) {
      return new dvf($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dsm> dsn<T> a(dfb $$0, dvj $$1, dso<T> $$2) {
      return a($$2, dso.k, dvf::a);
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dsm $$5 = $$1.c_($$2);
         if ($$5 instanceof dvf) {
            ((dvf)$$5).k();
         }
      }
   }

   @Override
   public void a(dfc $$0, jh $$1, dvj $$2) {
      jh $$3 = $$1.a($$2.c(b).g());
      dvj $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dvc && $$4.c(dvc.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      if (!$$1.C && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bsd.c;
      } else {
         return bsd.e;
      }
   }

   @Override
   protected List<cwb> a(dvj $$0, euf.a $$1) {
      dvf $$2 = this.a($$1.a(), jh.a($$1.a(ewy.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return fae.a();
   }

   @Override
   protected fah b(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      dvf $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : fae.a();
   }

   @Nullable
   private dvf a(deg $$0, jh $$1) {
      dsm $$2 = $$0.c_($$1);
      return $$2 instanceof dvf ? (dvf)$$2 : null;
   }

   @Override
   public cwb a(dfe $$0, jh $$1, dvj $$2) {
      return cwb.k;
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }
}
