import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class duv extends dhk {
   public static final MapCodec<duv> a = b(duv::new);
   public static final dvx b = dux.a;
   public static final dwb<dwf> c = dux.c;

   @Override
   public MapCodec<duv> a() {
      return a;
   }

   public duv(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jl.c).b(c, dwf.a));
   }

   @Nullable
   @Override
   public dsg a(jg $$0, dvd $$1) {
      return null;
   }

   public static dsg a(jg $$0, dvd $$1, dvd $$2, jl $$3, boolean $$4, boolean $$5) {
      return new duz($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dsg> dsh<T> a(dev $$0, dvd $$1, dsi<T> $$2) {
      return a($$2, dsi.k, duz::a);
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dsg $$5 = $$1.c_($$2);
         if ($$5 instanceof duz) {
            ((duz)$$5).k();
         }
      }
   }

   @Override
   public void a(dew $$0, jg $$1, dvd $$2) {
      jg $$3 = $$1.a($$2.c(b).g());
      dvd $$4 = $$0.a_($$3);
      if ($$4.b() instanceof duw && $$4.c(duw.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      if (!$$1.C && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bry.c;
      } else {
         return bry.e;
      }
   }

   @Override
   protected List<cvx> a(dvd $$0, etz.a $$1) {
      duz $$2 = this.a($$1.a(), jg.a($$1.a(ews.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return ezy.a();
   }

   @Override
   protected fab b(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      duz $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : ezy.a();
   }

   @Nullable
   private duz a(dea $$0, jg $$1) {
      dsg $$2 = $$0.c_($$1);
      return $$2 instanceof duz ? (duz)$$2 : null;
   }

   @Override
   public cvx a(dey $$0, jg $$1, dvd $$2) {
      return cvx.k;
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }
}
