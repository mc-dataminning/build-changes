import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dbd extends dbt implements cqu {
   public static final dpz a = dpy.w;
   private final dji.a b;

   public dbd(dji.a $$0, dph.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.E.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dbd> a();

   @Override
   public dmo a(id $$0, dpi $$1) {
      return new doa($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmo> dmp<T> a(czg $$0, dpi $$1, dmq<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(dcj.gO) || $$1.a(dcj.gP) || $$1.a(dcj.gQ) || $$1.a(dcj.gR);
         if ($$3) {
            return a($$2, dmq.p, doa::a);
         }
      }

      return null;
   }

   public dji.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }

   @Override
   public bqh k() {
      return bqh.f;
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(a);
   }

   @Override
   public dpi a(cux $$0) {
      return this.n().a(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dch $$3, id $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
