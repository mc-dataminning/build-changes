import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cxk extends cya implements coa {
   public static final dlw a = dlv.w;
   private final dfp.a b;

   public cxk(dfp.a $$0, dle.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.E.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends cxk> a();

   @Override
   public dit a(hz $$0, dlf $$1) {
      return new dke($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dit> diu<T> a(cvn $$0, dlf $$1, div<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(cyq.gO) || $$1.a(cyq.gP) || $$1.a(cyq.gQ) || $$1.a(cyq.gR);
         if ($$3) {
            return a($$2, div.p, dke::a);
         }
      }

      return null;
   }

   public dfp.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }

   @Override
   public bnv g() {
      return bnv.f;
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(a);
   }

   @Override
   public dlf a(crg $$0) {
      return this.o().a(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, cyo $$3, hz $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
