import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dfr extends dgh implements cun {
   public static final dur a = duq.w;
   private final dny.a b;

   public dfr(dny.a $$0, dtz.d $$1) {
      super($$1);
      this.b = $$0;
      this.l(this.E.b().b(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dfr> a();

   @Override
   public dre a(je $$0, dua $$1) {
      return new dss($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dre> drf<T> a(dds $$0, dua $$1, drg<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(dgx.gO) || $$1.a(dgx.gP) || $$1.a(dgx.gQ) || $$1.a(dgx.gR);
         if ($$3) {
            return a($$2, drg.p, dss::a);
         }
      }

      return null;
   }

   public dny.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }

   @Override
   public btr m() {
      return btr.f;
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(a);
   }

   @Override
   public dua a(cyw $$0) {
      return this.o().b(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dgv $$3, @Nullable erj $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.b(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
