import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class des extends dfi implements ctq {
   public static final dtr a = dtq.w;
   private final dmz.a b;

   public des(dmz.a $$0, dsz.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.E.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends des> a();

   @Override
   public dqf a(jd $$0, dta $$1) {
      return new drs($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqf> dqg<T> a(dcu $$0, dta $$1, dqh<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(dfy.gO) || $$1.a(dfy.gP) || $$1.a(dfy.gQ) || $$1.a(dfy.gR);
         if ($$3) {
            return a($$2, dqh.p, drs::a);
         }
      }

      return null;
   }

   public dmz.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }

   @Override
   public bsx m() {
      return bsx.f;
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(a);
   }

   @Override
   public dta a(cyb $$0) {
      return this.o().a(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dfw $$3, jd $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
