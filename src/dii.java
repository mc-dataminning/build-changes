import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dii extends diy {
   public static final dxo a = dxn.B;
   private final dqt.a b;

   public dii(dqt.a $$0, dww.d $$1) {
      super($$1);
      this.b = $$0;
      this.l(this.F.b().b(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dii> a();

   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new dvo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtz> dua<T> a(dgi $$0, dwx $$1, dub<T> $$2) {
      if ($$0.C) {
         boolean $$3 = $$1.a(djo.hl) || $$1.a(djo.hm) || $$1.a(djo.hn) || $$1.a(djo.ho);
         if ($$3) {
            return a($$2, dub.q, dvo::a);
         }
      }

      return null;
   }

   public dqt.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return false;
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(a);
   }

   @Override
   public dwx a(dag $$0) {
      return this.m().b(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, djm $$3, @Nullable euh $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.b(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
