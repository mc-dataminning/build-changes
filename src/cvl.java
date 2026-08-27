import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cvl extends cwb implements cly {
   public static final djx a = djw.w;
   private final ddq.a b;

   public cvl(ddq.a $$0, djf.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.E.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends cvl> a();

   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dif($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgu> dgv<T> a(cto $$0, djg $$1, dgw<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(cwr.gO) || $$1.a(cwr.gP) || $$1.a(cwr.gQ) || $$1.a(cwr.gR);
         if ($$3) {
            return a($$2, dgw.p, dif::a);
         }
      }

      return null;
   }

   public ddq.a b() {
      return this.b;
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }

   @Override
   public blz g() {
      return blz.f;
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(a);
   }

   @Override
   public djg a(cpg $$0) {
      return this.o().a(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, cwp $$3, hx $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
