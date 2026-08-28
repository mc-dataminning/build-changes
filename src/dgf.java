import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dgf extends dgv implements cus {
   public static final dvf a = dve.w;
   private final dom.a b;

   public dgf(dom.a $$0, dun.d $$1) {
      super($$1);
      this.b = $$0;
      this.l(this.F.b().b(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dgf> a();

   @Override
   public drs a(je $$0, duo $$1) {
      return new dtg($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drs> drt<T> a(deg $$0, duo $$1, dru<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(dhl.gO) || $$1.a(dhl.gP) || $$1.a(dhl.gQ) || $$1.a(dhl.gR);
         if ($$3) {
            return a($$2, dru.p, dtg::a);
         }
      }

      return null;
   }

   public dom.a b() {
      return this.b;
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }

   @Override
   public btw l() {
      return btw.f;
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(a);
   }

   @Override
   public duo a(czk $$0) {
      return this.o().b(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, dhj $$3, @Nullable erx $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.b(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
