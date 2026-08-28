import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dkw extends dlm {
   public static final eaq a = eap.A;
   private final dtk.a b;

   public dkw(dtk.a $$0, dzy.d $$1) {
      super($$1);
      this.b = $$0;
      this.l(this.B.b().b(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dkw> a();

   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dyn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwx> dwy<T> a(div $$0, dzz $$1, dwz<T> $$2) {
      if ($$0.C) {
         boolean $$3 = $$1.a(dmc.hm) || $$1.a(dmc.hn) || $$1.a(dmc.ho) || $$1.a(dmc.hp);
         if ($$3) {
            return a($$2, dwz.q, dyn::a);
         }
      }

      return null;
   }

   public dtk.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(a);
   }

   @Override
   public dzz a(dcr $$0) {
      return this.m().b(a, Boolean.valueOf($$0.q().D($$0.a())));
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dma $$3, @Nullable exo $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.D($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.b(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
