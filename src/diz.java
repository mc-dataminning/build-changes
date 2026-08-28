import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class diz extends djp {
   public static final dyf a = dye.B;
   private final drk.a b;

   public diz(drk.a $$0, dxn.d $$1) {
      super($$1);
      this.b = $$0;
      this.l(this.F.b().b(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends diz> a();

   @Override
   public duq a(jh $$0, dxo $$1) {
      return new dwf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duq> dur<T> a(dgz $$0, dxo $$1, dus<T> $$2) {
      if ($$0.C) {
         boolean $$3 = $$1.a(dkf.hl) || $$1.a(dkf.hm) || $$1.a(dkf.hn) || $$1.a(dkf.ho);
         if ($$3) {
            return a($$2, dus.q, dwf::a);
         }
      }

      return null;
   }

   public drk.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(a);
   }

   @Override
   public dxo a(dax $$0) {
      return this.m().b(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dkd $$3, @Nullable euy $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.b(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
