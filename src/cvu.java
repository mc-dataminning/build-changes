import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cvu extends cwk implements cmi {
   public static final dkg a = dkf.w;
   private final ddz.a b;

   public cvu(ddz.a $$0, djo.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.E.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends cvu> a();

   @Override
   public dhd a(hx $$0, djp $$1) {
      return new dio($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dhd> dhe<T> a(ctx $$0, djp $$1, dhf<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(cxa.gO) || $$1.a(cxa.gP) || $$1.a(cxa.gQ) || $$1.a(cxa.gR);
         if ($$3) {
            return a($$2, dhf.p, dio::a);
         }
      }

      return null;
   }

   public ddz.a b() {
      return this.b;
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }

   @Override
   public bmd g() {
      return bmd.f;
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(a);
   }

   @Override
   public djp a(cpp $$0) {
      return this.o().a(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, cwy $$3, hx $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
