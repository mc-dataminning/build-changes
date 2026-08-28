import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dhm extends dic {
   public static final dwm a = dwl.w;
   private final dps.a b;

   public dhm(dps.a $$0, dvu.d $$1) {
      super($$1);
      this.b = $$0;
      this.l(this.F.b().b(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dhm> a();

   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new dum($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsy> dsz<T> a(dfm $$0, dvv $$1, dta<T> $$2) {
      if ($$0.C) {
         boolean $$3 = $$1.a(dis.gO) || $$1.a(dis.gP) || $$1.a(dis.gQ) || $$1.a(dis.gR);
         if ($$3) {
            return a($$2, dta.p, dum::a);
         }
      }

      return null;
   }

   public dps.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(a);
   }

   @Override
   public dvv a(dad $$0) {
      return this.m().b(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, diq $$3, @Nullable etd $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.b(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
